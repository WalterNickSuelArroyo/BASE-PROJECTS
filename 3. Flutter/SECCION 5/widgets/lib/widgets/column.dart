import 'package:flutter/material.dart';

class MyColumn extends StatelessWidget {
  const MyColumn({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return DefaultTextStyle(
        style: const TextStyle(color: Colors.black),
        child: Container(
          color: Colors.white,
          padding: const EdgeInsets.symmetric(
            vertical: 55,
          ),
          child: Center(
            child: Container(
              color: Colors.grey,
              child: Column(
                children: [
                  Expanded(
                    flex: 3,
                    child: Container(
                      color: Colors.red,
                    ),
                  ),

                  Expanded(
                    flex: 3,
                    child: Container(
                      color: Colors.blue,
                    ),
                  ),
                  Expanded(
                    flex: 1,
                    child: Container(
                      color: Colors.yellow,
                    ),
                  ),
                  //const SizedBox(height: 100),
                ],
              ),
            ),
          ),
        ));
  }
}
