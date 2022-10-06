import 'package:flutter/material.dart';

class MyRow extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return DefaultTextStyle(
      style: const TextStyle(color: Colors.black),
      child: Container(
          color: Colors.white,
          alignment: Alignment.centerLeft,
          child: Container(
            color: Colors.grey,
            width: 300,
            child: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              crossAxisAlignment: CrossAxisAlignment.center,
              children: [
                Container(
                  width: 50,
                  height: 50,
                  color: Colors.blue,
                ),
                const SizedBox(width: 20),
                const Expanded(
                  child: Text("Hola"),
                )
              ],
            ),
          )),
    );
  }
}
