import 'package:flutter/material.dart';

class MyContainer extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.white,
      alignment: Alignment.center,
      child: DefaultTextStyle(
        style: TextStyle(),
        child: Container(
          color: Colors.red,
          margin: EdgeInsets.symmetric(
            horizontal: 10,
            vertical: 50,
          ),
          padding: EdgeInsets.symmetric(
            horizontal: 30,
            vertical: 10,
          ),
          child: Text(
            "NicoSuel",
            style: TextStyle(
              color: Colors.black,
            ),
          ),
        ),
      ),
    );
  }
}
