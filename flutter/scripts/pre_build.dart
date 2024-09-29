// Repo:             http://git.sdp.nd/app-factory/template/flutter-module-template-project
// Desc:             应用工厂 Flutter Module 工程构建前预处理脚本
// Version:          1.0.7
// Updated Date:     2024.01.31

// ignore_for_file: avoid_print

import 'dart:convert';
import 'dart:io';
import 'package:path/path.dart' as path;
import 'package:args/args.dart';

import 'build_l10n.dart';

const templateArbFileName = 'app_zh.arb';
String flutterCommand = 'flutter';

// 从 rootUri 解析出 lib 目录
Directory getLibDirectoryFromRootUri(String rootUri, String basePath) {
  var uri = Uri.tryParse(rootUri);
  // 文件 URL (file:// 协议)
  if (uri != null && uri.isAbsolute && uri.scheme == 'file') {
    return Directory(uri.toFilePath());
  }
  // 绝对路径
  if (uri != null && path.isAbsolute(rootUri)) {
    return Directory(rootUri);
  }
  // 相对路径
  return Directory(path.join(basePath, rootUri)).absolute;
}

// 为单个 package 生成 ${name}_localizations.dart 文件
bool generateL10nFilesForPackage(
  String name,
  String arbDirPath,
  Map<String, dynamic> info,
  String basePath,
) {
  var templateArbFile = File(path.join(arbDirPath, templateArbFileName));
  if (!templateArbFile.existsSync()) {
    print('[INFO]: 未找到 ${templateArbFile.path} 文件，忽略组件 $name 的语言包');
    return false;
  }

  // 获取组件源码目录
  String rootUri = info['rootUri'];
  Directory libDir = getLibDirectoryFromRootUri(rootUri, basePath);
  if (!libDir.existsSync()) {
    print('[ERROR]: $libDir 不存在');
    return false;
  }

  var originLocalizationFile = File(path.join(
    libDir.path,
    'lib',
    'l10n',
    "${name}_localizations.dart",
  ));
  if (!originLocalizationFile.existsSync()) {
    print('[WARN]: ${originLocalizationFile.path} 文件不存在，忽略组件 $name 的语言包');
    return false;
  }

  print('[INFO]: 生成组件 $name 的语言包...');

  // 执行 flutter gen-l10n 指令生成语言文件
  execFlutterCommand([
    'gen-l10n',
    '--arb-dir',
    arbDirPath,
    '--template-arb-file',
    templateArbFileName,
    '--output-localization-file',
    '${name}_localizations.dart',
  ]);

  return true;
}

// 修改 ${name}_localizations.dart 文件和所有的 ${name}_localizations_*.dart 文件
void fixGeneratedLocalizationsDartFiles(String name, String genDirPath) {
  String importPackageLine =
      "import 'package:$name/l10n/${name}_localizations.dart';";
  File currentLocalizationFile = File(path.join(
    genDirPath,
    '${name}_localizations.dart',
  ));

  var lines = currentLocalizationFile.readAsLinesSync();
  // 在所有 import 行之后，添加 import 'package:$name/l10n/$name_localizations.dart';
  var lastImportLineIndex =
      lines.lastIndexWhere((line) => line.startsWith('import'));
  lines.insert(lastImportLineIndex + 1, '');
  lines.insert(lastImportLineIndex + 2, importPackageLine);

  var delegateClassLineIndex = lines
      .indexWhere((line) => line.startsWith('class _AppLocalizationsDelegate'));
  // 移除掉 abstract class AppLocalizations 定义（会从组件源码中导入）。
  lines.replaceRange(lastImportLineIndex + 3, delegateClassLineIndex, ['']);

  var content = lines.join('\n');
  // 将 _AppLocalizationsDelegate 重命名为 AppLocalizationsDelegate。
  content = content.replaceAll(
      '_AppLocalizationsDelegate', 'AppLocalizationsDelegate');
  currentLocalizationFile.writeAsStringSync(content);

  // 遍历所有 ${name}_localizations_*.dart 文件，修改头部的 import 的类
  var genDir = Directory(genDirPath);
  genDir.listSync().forEach((file) {
    if (file is File) {
      var fileName = path.basename(file.path);
      if (!fileName.startsWith('${name}_localizations_')) {
        return;
      }
      var lines = file.readAsLinesSync();
      lines.replaceRange(0, 1, [importPackageLine]);
      file.writeAsStringSync(lines.join('\n'));
    }
  });
}

// 生成 lib/localizations.dart 文件
void generateLocalizationsLoaderFile(
  List<String> localizedComponentNames,
  String rootPath,
) {
  print('[INFO]: 生成 lib/localizations.dart 文件...');

  String projectPath;
  if (rootPath.toString().contains('/target/')) {
    projectPath = path.join(rootPath, '../../');
  } else {
    projectPath = path.join(rootPath, '../');
  }

  Map<String, dynamic> config;
  File appJsonFile =
      File(path.join(projectPath, 'app/assets/app_factory/app/app.json'));
  if (appJsonFile.existsSync()) {
    final content = appJsonFile.readAsStringSync();
    config = jsonDecode(content) as Map<String, dynamic>;
  } else {
    File file1 = File(path.join(projectPath, 'target/build_config.json'));
    File file2 =
        File(path.join(projectPath, 'app/assets/app_factory/app/config.json'));
    final content1 = file1.readAsStringSync();
    var config1 = jsonDecode(content1) as Map<String, dynamic>;
    final content2 = file2.readAsStringSync();
    var config2 = jsonDecode(content2) as Map<String, dynamic>;
    config = {
      "language_resolutions": config1["language_resolutions"],
      "language_enable": config2["language_enable"],
      "language_default": config2["language_default"],
    };
  }

  LocalizationsDartGenerator().generate(
    config,
    localizedComponentNames,
    File(path.join(rootPath, 'lib', 'localizations.dart')),
  );

  // 修改 pubspec.yaml 文件，将 generate: true 改为 generate: false
  var configChanged = false;
  var pubspecFile = File(path.join(rootPath, 'pubspec.yaml'));
  var lines = pubspecFile.readAsLinesSync();
  var generateLineIndex =
      lines.indexWhere((line) => line.contains('generate:'));
  if (generateLineIndex != -1) {
    var originLine = lines[generateLineIndex];
    lines[generateLineIndex] =
        lines[generateLineIndex].replaceAll('true', 'false');
    if (!originLine.contains('true') && !originLine.contains('false')) {
      print('[ERROR]: generate: 行格式不正确，无法修改 pubspec.yaml 文件');
    } else {
      var originValue = originLine.contains('true') ? true : false;
      var destionValue = localizedComponentNames.isNotEmpty;
      if (originValue != destionValue) {
        print('[INFO]: generate: $originValue -> $destionValue');
        lines[generateLineIndex] = originLine.replaceAll(
            originValue.toString(), destionValue.toString());
        configChanged = true;
      }
    }
  } else {
    print('[ERROR]: 未找到 generate: true 行，请检查 pubspec.yaml 文件 !');
  }

  if (configChanged) {
    print('[INFO]: pubspec.yaml 文件发生改动，重新执行 pub get !');
    pubspecFile.writeAsStringSync(lines.join('\n'));
    // 修改 pubspec.yaml 后需要重新 pub get 否则下面的 build_runner 指令会报错
    execFlutterCommand([
      'pub',
      'get',
    ]);
  }
}

// 遍历所有组件，为每个组件生成语言文件。
void generateL10nFiles() {
  print('[INFO]: 生成语言文件...');
  var rootPath = Directory.current.path;
  var dartToolDirPath = path.join(rootPath, '.dart_tool');
  var genDirPath = path.join(dartToolDirPath, 'flutter_gen', 'gen_l10n');
  // 解析 package_config.json 文件
  var packageConfigFile =
      File(path.join(dartToolDirPath, 'package_config.json')).absolute;
  var packageConfigContent = packageConfigFile.readAsStringSync();
  var packageConfig = json.decode(packageConfigContent).cast<String, dynamic>();
  var packages = packageConfig['packages'] as List<dynamic>;

  List<String> localizedComponentNames = [];
  Directory l10nDir = Directory(path.join(rootPath, 'l10n'));
  if (l10nDir.existsSync()) {
    l10nDir.listSync().forEach((dir) {
      if (dir is! Directory) {
        return;
      }

      var name = path.basename(dir.path); // 获取组件名
      var info =
          packages.firstWhere((e) => e['name'] == name, orElse: () => null);
      if (info == null) {
        print('[WARN]: 存在 $name 组件存在语言包，但 package 未被工程依赖。');
        return;
      }

      print('[INFO]: 处理语言包资源...');

      bool result = generateL10nFilesForPackage(
        name,
        dir.path,
        info as Map<String, dynamic>,
        // 配置中 rootUri 的值如果是相对路径，则它是相对于 package_config.json 文件所在目录。
        packageConfigFile.parent.path,
      );
      if (!result) {
        return;
      }

      fixGeneratedLocalizationsDartFiles(name, genDirPath);
      // 记录下需要国际化的组件名
      localizedComponentNames.add(name);
    });
  } else {
    print('[WARN]: 未找到 l10n/ 目录，忽略语言包资源处理 !');
  }

  generateLocalizationsLoaderFile(localizedComponentNames, rootPath);
  print('[INFO]: 语言包资源处理完成。');
}

void execFlutterCommand(List<String> arguments) {
  Process.runSync(
    flutterCommand,
    arguments,
    runInShell: true,
  );
}

void execBuildRunner() {
  print('[INFO]: 执行 build_runner 指令...');
  execFlutterCommand([
    'pub',
    'run',
    'build_runner',
    'clean',
  ]);
  execFlutterCommand([
    'pub',
    'run',
    'build_runner',
    'build',
    '--delete-conflicting-outputs',
  ]);
}

void fixIosProjectSettings() {
  print('[INFO]: 修改 iOS 工程配置');
  // 将 platform :ios, '11.0' 替换为 '12.3'
  var podfile = File('.ios/Podfile');
  var lines = podfile.readAsLinesSync();
  var index = lines.indexWhere((line) => line.contains('platform :ios,'));
  lines[index] = "platform :ios, '12.3'";
  podfile.writeAsStringSync(lines.join('\n'));
}

void main(List<String> arguments) {
  final parser = ArgParser()
    ..addOption('flutter-command', abbr: 'f', help: '指定 flutter 指令路径')
    ..addFlag('help', abbr: 'h', help: '打印帮助信息。', negatable: false);

  var args = parser.parse(arguments);

  if (args['help']) {
    print("""
Common commands:
  dart pre_build.dart [options]

Options:
-h, --help                  打印帮助信息。
-f, --flutter-command       指定 flutter 指令路径。
    """);
    exit(0);
  }

  if (args['flutter-command'] != null) {
    flutterCommand = args['flutter-command'];
  }

  generateL10nFiles();
  execBuildRunner();
  fixIosProjectSettings();
}
