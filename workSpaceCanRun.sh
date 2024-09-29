# !/bin/sh

chmod 777 ./scripte_tools_testV1.0.3.jar
chmod 777 ./app

echo  begin modify workspace

# 方法一：绝对路径
#java -jar ./scripte_tools_testV1.0.3.jar run -mw /Users/macos/ws/ndsdp/tool-make/test-copy

# 方法二： 相对路径
# java -jar ./scripte_tools_testV1.0.3.jar run -mw ./

# 方法三：绝对路径，不需要写死
java -jar ./scripte_tools_testV1.0.3.jar run -mw $PWD
echo end modify workspace
