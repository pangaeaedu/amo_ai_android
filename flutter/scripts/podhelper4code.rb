require 'json'

def apf_install_all_flutter_pods(flutter_application_path)
  script_path = File.join(flutter_application_path, '.ios', 'Flutter', 'podhelper.rb')
  load script_path if File.exist?(script_path)
  raise 'The podhelper.rb file is not loaded!' unless defined?(install_all_flutter_pods)

  install_all_flutter_pods(flutter_application_path)

  flutter_plugins_json_file = File.join(flutter_application_path, '.flutter-plugins-dependencies')
  json_str = open(flutter_plugins_json_file).read
  plugins = JSON.parse(json_str)['plugins']['ios']
  plugins.each do |plugin|
    name = plugin['name']
    path = plugin['path']
    ios_path = "#{flutter_application_path}/.ios/.symlinks/plugins/#{name}/ios"
    if !File.exist?(ios_path)
      ios_path = "#{flutter_application_path}/.ios/.symlinks/plugins/#{name}/darwin"
    end
    next unless File.exist?(ios_path)
    podspec_path = File.join(ios_path, "#{name}.podspec")
    spec = ::Pod::Specification.from_file(podspec_path)
    unless spec.subspec_by_name("#{name}/Inner", false).nil? then
      pod "#{name}/Inner", :path => ios_path
    end
  end
end
