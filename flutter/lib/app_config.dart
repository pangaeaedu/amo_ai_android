import 'dart:convert';

class AppConfig {
  final List<String> languageEnable;
  final LanguageDefault languageDefault;
  final List<LanguageResolution> languageResolutions;

  AppConfig({
    required this.languageEnable,
    required this.languageDefault,
    required this.languageResolutions,
  });

  factory AppConfig.fromRawJson(String str) =>
      AppConfig.fromJson(json.decode(str));

  String toRawJson() => json.encode(toJson());

  factory AppConfig.fromJson(Map<String, dynamic> json) => AppConfig(
        languageEnable:
            List<String>.from(json["language_enable"].map((x) => x)),
        languageDefault: LanguageDefault.fromJson(json["language_default"]),
        languageResolutions: List<LanguageResolution>.from(
            json["language_resolutions"]
                .map((x) => LanguageResolution.fromJson(x))),
      );

  Map<String, dynamic> toJson() => {
        "language_enable": List<dynamic>.from(languageEnable.map((x) => x)),
        "language_default": languageDefault.toJson(),
        "language_resolutions":
            List<dynamic>.from(languageResolutions.map((x) => x.toJson())),
      };
}

class LanguageDefault {
  final String languageDefaultDefault;

  LanguageDefault({
    required this.languageDefaultDefault,
  });

  factory LanguageDefault.fromRawJson(String str) =>
      LanguageDefault.fromJson(json.decode(str));

  String toRawJson() => json.encode(toJson());

  factory LanguageDefault.fromJson(Map<String, dynamic> json) =>
      LanguageDefault(
        languageDefaultDefault: json["default"],
      );

  Map<String, dynamic> toJson() => {
        "default": languageDefaultDefault,
      };
}

class LanguageResolution {
  final String language;
  final List<String> supportedLanguages;

  LanguageResolution({
    required this.language,
    required this.supportedLanguages,
  });

  factory LanguageResolution.fromRawJson(String str) =>
      LanguageResolution.fromJson(json.decode(str));

  String toRawJson() => json.encode(toJson());

  factory LanguageResolution.fromJson(Map<String, dynamic> json) =>
      LanguageResolution(
        language: json["language"],
        supportedLanguages:
            List<String>.from(json["supported_languages"].map((x) => x)),
      );

  Map<String, dynamic> toJson() => {
        "language": language,
        "supported_languages":
            List<dynamic>.from(supportedLanguages.map((x) => x)),
      };
}
