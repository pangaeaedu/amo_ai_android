#!/bin/sh

# Repo:             http://git.sdp.nd/app-factory/template/flutter-module-template-project
# Desc:             应用工厂 Flutter Module 工程构建前预处理脚本
# Version:          1.0.6
# Updated Date:     2024.01.29

set -e
set -u

flutter_command="flutter"

help_text="
Options:
    --flutter-command COMMAND             Flutter命令

Example:
    ./scripts/pre_build.sh \\
        --flutter-command \"1.0.0\"
"


# 命令行参数解析
while (( "$#" )); do
    case "${1}" in

    --help )
        echo "${help_text}" && exit 0
        ;;

    --flutter-command* )
        flutter_command="${2}"
        shift
        shift
        ;;

    *)
        echo "Invalid option ${1} will be ignored."
        shift
        ;;
    esac
done

main () {
    echo '[WARN]: pre_build.sh 已经废弃，请使用 `dart scripts/pre_build.dart` 替代 !'
    # which flutter and replace last flutter to dart
    flutter_command=$(which $flutter_command)
    dart_command=${flutter_command%flutter}dart
    $dart_command scripts/pre_build.dart --flutter-command ${flutter_command}
}

main
