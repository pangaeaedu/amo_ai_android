import 'package:flutter/material.dart';
import 'package:appfactory_core/appfactory_core.dart';
import 'notfoundpage.dart';
import 'main.internal.dart';
import 'localizations.dart';

final router = _RouteRoot();

@pragma('vm:entry-point')
void main(List<String> args) async {
  if (args.length < 3) {
    runApp(const _ArgsErrorPage());
    return;
  }
  WidgetsFlutterBinding.ensureInitialized();
  LifecycleBindingImpl.setInstance();
  await LifecycleBinding.instance.trigger(LifecycleEvents.onBeforeRunApp, args);
  loadLocalizations();
  final package = args[0];
  final path = args[1];
  final queryString = args[2];
  final params = Uri.splitQueryString(Uri.encodeFull(queryString));
  final options = APFRouteOption(package, path, params);
  final result = router.getPage(options);

  if (result.state != APFRouterResultState.found) {
    runApp(APFNotFoundPage(options));
    return;
  }
  runApp(AppfactoryApp(child: result.widget));
}

@APFRouteRoot()
class _RouteRoot {
  APFRouterInternal internal = APFRouterInternalImpl();

  APFRouterResult getPage(APFRouteOption option) {
    // 第一个 option 用于获取页面，数据结构固定，组件开发者无感知。
    // 第二个 option 用于初始化 Widget，属性可扩展。
    return internal.getPage(option, option);
  }
}

class _ArgsErrorPage extends StatelessWidget {
  const _ArgsErrorPage({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Demo',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        home: const Text('参数错误！'));
  }
}
