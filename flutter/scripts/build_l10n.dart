import 'dart:io';
import 'package:mustache_template/mustache_template.dart';
import 'templates/localizations.tmpl.dart' show localizationsTmpl;

class LocalizationsDartGenerator {
  LocalizationsDartGenerator();

  void generate(
      Map<String, dynamic> appJson, List<String> components, File outputFile) {
    final comps = [];
    for (var i = 0; i < components.length; i++) {
      comps.add({'comp': components[i], 'alias': "comp$i"});
    }
    appJson['comps'] = comps;

    final output = Template(localizationsTmpl, htmlEscapeValues: false)
        .renderString(appJson);
    outputFile.writeAsStringSync(output);
  }
}
