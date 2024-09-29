library appfactory_intl;

import 'package:flutter/widgets.dart';
import 'package:flutter_localizations/flutter_localizations.dart';
import 'package:intl/intl.dart' as intl;

typedef LocalizationsDelegateWrapper = LocalizationsDelegate Function(
    LocalizationsDelegate delegate);

abstract class AppfactoryLocalizations {
  AppfactoryLocalizations(String locale)
      : localeName = intl.Intl.canonicalizedLocale(locale.toString());

  final String localeName;

  static T? of<T>(BuildContext context) {
    return Localizations.of<T>(context, T);
  }

  static final List<LocalizationsDelegateWrapper> delegateWrappers = [];

  static addDelegateWrapper(LocalizationsDelegateWrapper wrapper) {
    delegateWrappers.add(wrapper);
  }

  static final delegates = <Type, LocalizationsDelegate>{};

  static void register(LocalizationsDelegate delegate) {
    for (var wrapper in delegateWrappers) {
      delegate = wrapper(delegate);
    }
    delegates[delegate.type] = delegate;
  }

  static List<LocalizationsDelegate<dynamic>> get localizationsDelegates {
    return [
      ...delegates.values,
      GlobalMaterialLocalizations.delegate,
      GlobalCupertinoLocalizations.delegate,
      GlobalWidgetsLocalizations.delegate,
    ];
  }

  static List<Locale> get supportedLocales {
    final delegate = localizationsDelegates.first;
    return const [
      Locale('ar'),
      Locale('bo'),
      Locale('de'),
      Locale('en'),
      Locale('es'),
      Locale('fr'),
      Locale('id'),
      Locale('ms'),
      Locale('pt'),
      Locale('ru'),
      Locale('th'),
      Locale('tr'),
      Locale('ja'),
      Locale.fromSubtags(
          languageCode: 'zh',
          scriptCode: 'Hans',
          countryCode: 'CN'), // 'zh_Hans_CN'
      Locale.fromSubtags(
          languageCode: 'zh',
          scriptCode: 'Hant',
          countryCode: 'HK'), // 'zh_Hant_HK'
      Locale.fromSubtags(
          languageCode: 'zh',
          scriptCode: 'Hant',
          countryCode: 'TW'), // 'zh_Hant_TW'
      Locale.fromSubtags(
          languageCode: 'zh',
          scriptCode: 'Hant',
          countryCode: 'MO'), // 'zh_Hant_MO'
      Locale.fromSubtags(
          languageCode: 'zh',
          scriptCode: 'Hans'), // generic simplified Chinese 'zh_Hans'
      Locale.fromSubtags(languageCode: 'zh'), // generic Chinese 'zh'
    ].where((locale) => delegate.isSupported(locale)).toList();
  }
}

abstract class ResolvableLocalizationsDelegate
    implements LocalizationsDelegate {
  ResolvableLocalizationsDelegate(this.delegate);

  final LocalizationsDelegate delegate;

  Map<String, List<String>> get languageResolutions {
    throw UnimplementedError();
  }

  List<String> get supportedLanguages {
    throw UnimplementedError();
  }

  String get defaultLanguage {
    throw UnimplementedError();
  }

  Locale _mostPreferredLocale(
    List<String> availableLanguages,
    List<String> preferredLanguages,
  ) {
    return basicLocaleListResolution(
      preferredLanguages.map(localeFromLanguageTag).toList(),
      availableLanguages.map(localeFromLanguageTag),
    );
  }

  Locale localeFromLanguageTag(String languageTag) {
    var subtags = languageTag.split('-');
    if (subtags.isEmpty || subtags.length > 3) {
      throw FlutterError('Invalid language tag: $languageTag');
    }
    String languageCode = subtags[0];
    String? scriptCode;
    String? countryCode;
    if (subtags.length == 2) {
      if (subtags[1].length == 2) {
        // 通常长度为 2 的是区域代码
        countryCode = subtags[1];
      } else {
        scriptCode = subtags[1];
      }
    } else if (subtags.length == 3) {
      scriptCode = subtags[1];
      countryCode = subtags[2];
    }

    return Locale.fromSubtags(
      languageCode: languageCode,
      scriptCode: scriptCode,
      countryCode: countryCode,
    );
  }

  Locale _resoveLocale(Locale locale) {
    if (supportedLanguages.contains(locale.toLanguageTag())) {
      return locale;
    }
    final acceptableLanguages = languageResolutions[locale.toLanguageTag()];
    if (acceptableLanguages != null) {
      return _mostPreferredLocale(supportedLanguages, acceptableLanguages);
    }
    return _mostPreferredLocale(supportedLanguages, [locale.toLanguageTag()]);
  }

  @override
  bool isSupported(Locale locale) {
    for (var lang in supportedLanguages) {
      if (localeFromLanguageTag(lang).languageCode == locale.languageCode) {
        return true;
      }
    }
    for (var lang in languageResolutions.keys) {
      if (localeFromLanguageTag(lang).languageCode == locale.languageCode) {
        return true;
      }
    }
    return false;
  }

  @override
  Future load(Locale locale) async {
    final determinedLocale = await getLocaleFromPlatform(locale) ?? locale;
    return delegate.load(_resoveLocale(determinedLocale));
  }

  @override
  bool shouldReload(covariant LocalizationsDelegate old) {
    if (old is ResolvableLocalizationsDelegate) {
      return delegate.shouldReload(old.delegate);
    }
    return delegate.shouldReload(old);
  }

  @override
  Type get type => delegate.type;

  Future<Locale?> getLocaleFromPlatform(Locale locale) async {
    return null;
  }
}
