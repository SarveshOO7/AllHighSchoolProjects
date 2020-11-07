import 'package:flutter/material.dart';

class answerButton extends StatelessWidget {
  final bool _answer;
  final VoidCallback _onTap;

  answerButton(this._answer, this._onTap);

  @override
  Widget build(BuildContext context) {
    return new Expanded(
      child: new Material(
        color: _answer?Colors.greenAccent:Colors.redAccent,
        child: new InkWell(
          onTap: _onTap,
          child: new Center(
              child: new Container(
                  child: new Text(
                      _answer==true?"True":"False",
                      style: TextStyle(fontSize: 72.0),
                  )
              )
          ),
        ),
      ),
    );
  }


}