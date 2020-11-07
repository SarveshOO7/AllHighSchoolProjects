import 'package:flutter/material.dart';
import 'package:my_vote/utils/answer_button.dart';

class QuizPage extends StatefulWidget{
  @override
  State createState() => new QuizPageState();
}
class QuizPageState extends State<QuizPage>{
  @override
  Widget build(BuildContext context) {
    return new  Stack(
      children: <Widget>[
        new Column(
          children: <Widget>[
            new answerButton(true,(){print("You answered true!");}),
            new answerButton(false,(){print("You answered false!");})
          ],
        )
      ],
    );
  }
}