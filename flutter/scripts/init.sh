#!/bin/bash

# Repo:             http://git.sdp.nd/app-factory/template/flutter-module-template-project
# Desc:             应用工厂 Flutter Module 工程初始化脚本
# Version:          1.0.3
# Updated Date:     2024.02.02

set -e
set -u

project_name=""
dart_sdk_version_bounds=">=2.17.6 <3.0.0"
android_identifier=""
ios_bundle_identifier=""
builder_version="1.0.4"

help_text="Usage: ./build.sh

Required:
    --project-name NAME           工程名称

Options:
    --sdk VERSIONS                Dart SDK 版本范围，默认为 ${dart_sdk_version_bounds}
    --android-identifier ID       安卓包名，默认为 com.example.{project_name}
    --ios-identifier ID           iOS BundleId，默认为 com.example.{project_name}
    --builder-version VERSION     appfactory_builder 版本

Example:
    ./scripts/init.sh \\
        --project-name {{projectName}} \\
        --sdk \">=2.17.6 <3.0.0\" \\
        --android-identifier com.example.{{projectName}} \\
        --ios-identifier com.example.{{projectName}} \\
        --builder-version \"1.0.0\"
"

# 命令行参数解析
while (( "$#" )); do
    case "${1}" in

    --help )
        echo "${help_text}" && exit 0
        ;;

    --project-name* )
        project_name="${2}"
        shift
        shift
        ;;

    --sdk* )
        dart_sdk_version_bounds="${2}"
        shift
        shift
        ;;

    --android-identifier* )
        android_identifier="${2}"
        shift
        shift
        ;;

    --ios-identifier* )
        ios_bundle_identifier="${2}"
        shift
        shift
        ;;

    --builder-version* )
        builder_version="${2}"
        shift
        shift
        ;;

    *)
        echo "Invalid option ${1} will be ignored."
        shift
        ;;
    esac
done

validate() {
  if [[ -z $project_name ]]; then
    echo "[ERROR]: --project-name 参数不能为空\n" && echo "${help_text}" && exit 1
  fi
  if [[ -z $dart_sdk_version_bounds ]]; then
    echo "[ERROR]: --sdk 参数不能为空\n" && echo "${help_text}" && exit 1
  fi
  if [[ -z $android_identifier ]]; then
    android_identifier="com.example.${project_name}"
  fi
  if [[ -z $ios_bundle_identifier ]]; then
    ios_bundle_identifier="com.example.${project_name}"
  fi

  replacements=(
    "projectName:$project_name"
    "dartSdkVersionBounds:$dart_sdk_version_bounds"
    "androidIdentifier:$android_identifier"
    "iosIdentifier:$ios_bundle_identifier"
    "builderVersion:$builder_version"
  )
}

init_project() {
  for file in $(find . -type f -name "*.tmpl")
  do
    new_file_name=''
    for item in "${replacements[@]}"
    do
      key="${item%%:*}"
      value="${item##*:}"
      if sed --version 1>/dev/null 2>/dev/null; then
        # GNU sed (linux)
        sed --in-place='' "s/{{$key}}/$value/g" "$file"
      else
        # BSD sed (macos)
        sed -i '' "s/{{$key}}/$value/g" "$file"
      fi
      if [ "$key" = 'projectName' ]; then
        new_file_name=$(echo "$file" | sed -e "s/projectName/${value}/")
      fi
    done
    new_file_name="${new_file_name%%.tmpl}"
    mv "$file" "$new_file_name"
  done
}

main () {
    validate
    init_project
}

main
