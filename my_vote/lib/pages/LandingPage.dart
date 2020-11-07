import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';

class LandingPage extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return  new Material(
      color: Colors.greenAccent,
      child: new InkWell(
        onTap: ()=> print("Screen Tapped"),
        child: new Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            new Text("Let's Vote", style: new TextStyle(
                  fontSize: 50.0,
                  color: Colors.white,
                  fontWeight: FontWeight.bold
              )
            ),
            new Text("Tap to start!", style: new TextStyle(
                fontSize: 20.0,
                color: Colors.white,
                fontWeight: FontWeight.bold
            ))
          ],
        )
      ),
    );
  }
}