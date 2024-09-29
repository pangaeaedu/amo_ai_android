const localizationsTmpl = '''
import 'dart:ui';

import './app_config.dart';
import 'package:appfactory_intl/appfactory_intl.dart';
import 'package:appfactory/api.dart' as apf;

{{#comps}}
import 'package:flutter_gen/gen_l10n/{{comp}}_localizations.dart' as {{alias}};
{{/comps}}

final appConfig = AppConfig.fromJson({
  "language_enable": [
    {{#language_enable}}
      "{{.}}",
    {{/language_enable}}
  ],
  "language_default": {
    {{#language_default}}
    {{#default}}"default": "{{.}}"{{/default}}
    {{/language_default}}
  },
  "language_resolutions": [
    {{#language_resolutions}}
    {
      "language": "{{language}}",
      "supported_languages": [{{#supported_languages}}"{{.}}",{{/supported_languages}}]
    },
    {{/language_resolutions}}
  ]
});

class ResolvableLocalizationsDelegateImp
    extends ResolvableLocalizationsDelegate {
  ResolvableLocalizationsDelegateImp(super.delegate);

  @override
  Map<String, List<String>> get languageResolutions {
    return {
      for (var e in appConfig.languageResolutions)
        e.language: e.supportedLanguages
    };
  }

  @override
  List<String> get supportedLanguages {
    return appConfig.languageEnable.map(
      (e) {
        if (e == 'zh-HK') {
          return 'zh-Hant-HK';
        }
        if (e == 'zh-TW') {
          return 'zh-Hant-TW';
        }
        return e;
      },
    ).toList();
  }

  @override
  String get defaultLanguage =>
      appConfig.languageDefault.languageDefaultDefault;

  @override
  Future<Locale?> getLocaleFromPlatform(Locale locale) {
    return apf.system
        .getPlatformLanguage()
        .then((value) => value != null ? localeFromLanguageTag(value) : locale);
  }
}

loadLocalizations() {
  AppfactoryLocalizations.addDelegateWrapper(
      (delegate) => ResolvableLocalizationsDelegateImp(delegate));
  {{#comps}}
  AppfactoryLocalizations.register(const {{alias}}.AppLocalizationsDelegate());
  {{/comps}}
}
''';
