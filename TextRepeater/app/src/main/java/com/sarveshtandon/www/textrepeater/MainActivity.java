package com.sarveshtandon.www.textrepeater;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    TextView text = findViewById(R.id.editText), times = findViewById(R.id.editText2);
  //  Button copy = findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.editText), times = findViewById(R.id.editText2);
        Button copy = findViewById(R.id.button);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output="";
                int x= Integer.parseInt(times.getText()+"");
                for(int i =0;i<x;i++)
                    output+=text.getText();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Message", output);
                clipboard.setPrimaryClip(clip);
            }
        });

    }
}
