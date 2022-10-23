import 'package:flutter/material.dart';
import 'package:widgets/widgets/row.dart';
import 'widgets/column.dart';
import 'widgets/row.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return  MaterialApp(
      home: MyRow(),
    );
  }
}
