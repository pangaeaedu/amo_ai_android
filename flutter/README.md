## 简介

本工程为应用构建所使用的 flutter module 模板工程。



## 模板工程初始化说明

模板文件目录结构如下：

```

.
├── .gitignore
├── .metadata
├── README.md
├── analysis_options.yaml
├── lib
│   └── main.dart
├── projectName.iml.tmpl
├── projectName_android.iml.tmpl
├── pubspec.yaml.tmpl
└── test
    └── widget_test.dart
```

其中 `.tmpl` 后缀的四个文件  `projectName.iml.tmpl`、`projectName_android.iml.tmpl`、`pubspec.yaml.tmpl` 和 `test/projectName_test.dart.tmpl` 需要初始化时进行修改，修改如下：

1. 将 `pubspec.yaml.tmpl` 文件内容中的变量占位符进行替换，如 `{{projectName}}` => `apf_flutter_comp1` 。

2. 将文件名中的 `{{projectName}}` 字符串替换成创建的组件名且去掉 `.tmpl` 后缀，如 `projectName.iml.tmpl` => `apf_flutter_comp1.iml`。

需要替换的变量

- `{{projectName}}`: 应用工程名称
- `{{dartSdkVersionBounds}}`: SDK 版本
- `{{androidIdentifier}}`: Android 包名
- `{{iosIdentifier}}`: iOS bundleID


**注意事项：**

- `projectName` 中不允许包含 `-` (中划线)，初始化时需要将中划线替换成 `_`（下划线）。

