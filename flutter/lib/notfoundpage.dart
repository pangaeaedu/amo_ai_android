import 'package:appfactory/api.dart' as apf;
import 'package:appfactory_core/appfactory_core.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class APFNotFoundPage extends StatelessWidget {
  final APFRouteOption option;

  const APFNotFoundPage(this.option, {Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Demo',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        home: _NotFound(option));
  }
}

class _NotFound extends StatefulWidget {
  final APFRouteOption option;

  _NotFound(this.option);

  @override
  State<StatefulWidget> createState() => _NotFoundState(option);
}

class _NotFoundState extends State<_NotFound> {
  final APFRouteOption option;
  _NotFoundState(this.option);

  bool isDebug = false;

  Widget _buildList() {
    Uri url = Uri(
        host: option.package,
        path: option.path,
        queryParameters: option.params);

    apf.system.isFlutterDebug().then((value) {
      setState(() {
        isDebug = value;
      });
    });
    return Container(
      padding: const EdgeInsets.all(30),
      color: Colors.white,
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.center,
        children: [
          const Image(
              image: AssetImage(
                  'assets/com.nd.sdp.component.flutter-runtime/page_not_found.png'),
              width: 200,
              height: 200,
              alignment: Alignment.center),
          const SizedBox(height: 15),//保留间距10
          getTextWidget(true, "页面不存在"),
          const SizedBox(height: 10),//保留间距10
          getTextWidget(isDebug, '无效页面：$url'),
          const SizedBox(height: 15),//保留间距10
          ElevatedButton(
              onPressed: () {
                apf.pages.finishCurrentPage();
              },
              style: ButtonStyle(

                minimumSize: MaterialStateProperty.all(const Size(90, 40)),
              ),
              child: const Text("返回"))
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return _buildList();
  }
}

Widget getTextWidget(bool show, String url) {
  return Visibility(
    visible: show,
    child: Text(url,
        style: const TextStyle(
            color: Colors.grey, fontSize: 15, decoration: TextDecoration.none, fontWeight: FontWeight.normal)),
  );
}
