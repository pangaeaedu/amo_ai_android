require 'json'

@flutter_artifacts_mode = :Release

def set_flutter_mode(mode)
  if [:Debug, :Release, :Profile].include?(mode) then
    @flutter_artifacts_mode = mode
  else
    @flutter_artifacts_mode = :Release
  end
end

def spec_values_with_key(spec, key)
  root_values = [*spec.attributes_hash[key]]
  ios_platform_attributes_hash = spec.attributes_hash['ios']
  unless ios_platform_attributes_hash.nil?
    ios_platform_values = ios_platform_attributes_hash[key]
    root_values.concat [*ios_platform_values] unless ios_platform_values.nil?
  end
  root_values.flatten!
  root_values.compact!
  root_values
end

def apf_install_all_flutter_pods(flutter_application_path)

  artifacts_path = File.join(flutter_application_path, 'build', 'ios', 'framework', @flutter_artifacts_mode.to_s)
  copied_podspec_path = File.expand_path('Flutter.podspec', artifacts_path)

  vendored_frameworks = []
  exclude_vendored_frameworks = []

  flutter_plugins_json_file = File.join(flutter_application_path, '.flutter-plugins-dependencies')
  json_str = File.open(flutter_plugins_json_file).read
  plugins = JSON.parse(json_str)['plugins']['ios']

  plugins.each do |plugin|
    name = plugin['name']
    path = plugin['path']
    ios_path = File.join(path, 'ios')
    if !File.exist?(ios_path)
      ios_path = File.join(path, 'darwin')
    end
    podspec_path = File.join(ios_path, "#{name}.podspec")
    spec = ::Pod::Specification.from_file(podspec_path)
    unless spec.subspec_by_name("#{name}/Inner", false).nil? then
      pod "#{name}/Inner", :path => ios_path
      exclude_vendored_frameworks.append("#{name}.xcframework")
    end
    (spec_values_with_key(spec, 'vendored_frameworks') || []).each do |framework|
      src_framework_path = File.join(ios_path, framework)
      FileUtils.cp_r(Dir.glob(src_framework_path), artifacts_path)
      vendored_frameworks.append(framework)
    end
  end

  require 'find'
  Find.find(artifacts_path) do |path|
    next if path == artifacts_path

    if FileTest.directory?(path)
      basename = File.basename(path)
      if basename.end_with?('.framework', '.xcframework') && !exclude_vendored_frameworks.include?(basename)
        vendored_frameworks.append(basename)
      end
      Find.prune
    end
    next
  end

  File.open(copied_podspec_path, 'w') do |podspec|
    content = <<~PODSPEC
      #
      # NOTE: This podspec is NOT to be published. It is only used as a local source!
      #       This is a generated file; do not edit or check into version control.
      #

      Pod::Spec.new do |s|
        s.name             = 'Flutter'
        s.version          = '1.0.0'
        s.summary          = 'A UI toolkit for beautiful and fast apps.'
        s.homepage         = 'https://flutter.dev'
        s.license          = { :type => 'BSD' }
        s.author           = { 'Flutter Dev Team' => 'flutter-dev@googlegroups.com' }
        s.source           = { :git => 'https://github.com/flutter/engine', :tag => s.version.to_s }
        s.platform         = :ios, '11.0'
        # Framework linking is handled by Flutter tooling, not CocoaPods.
        s.vendored_frameworks = {{vendored_frameworks}}
      end
    PODSPEC
    vendored_frameworks_str = vendored_frameworks.map { |str| "\"#{str}\"" }.join(', ')
    content = content.gsub('{{vendored_frameworks}}', "#{vendored_frameworks_str}")
    podspec.write(content)
  end
  pod 'Flutter', :path => artifacts_path

end
