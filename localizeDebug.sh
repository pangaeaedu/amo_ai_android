# !/bin/sh

echo 初始化工程本地调试 开始
cp ContainerApplication_native.java app/src/main/java/com/nd/smartcan/appfactory/demo

cd app
mv build.gradle build_service.gradle
mv build_winCanRun.gradle build.gradle

cd src/main/java/com/nd/smartcan/appfactory/demo
rm ContainerApplication.java
mv ContainerApplication_native.java ContainerApplication.java
echo 初始化工程本地调试 结束
