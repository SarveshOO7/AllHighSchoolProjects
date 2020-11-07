package com.sarveshtandon.www.ishanicounter;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    int myNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        SharedPreferences preferences = context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE);
        myNumber = preferences.getInt("myNumber",250);
        final SharedPreferences.Editor editor = preferences.edit();


        Button increase = findViewById(R.id.increasingButton);
        Button decrease = findViewById(R.id.decresingButton);
        final TextView score = findViewById(R.id.textView);
        score.setText(String.valueOf(myNumber));
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myNumber++;
                score.setText(myNumber +"");
                editor.putInt("myNumber", myNumber);
                editor.commit();

            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myNumber--;
                score.setText(myNumber +"");
                editor.putInt("myNumber", myNumber);
                editor.commit();
            }
        });


        editor.putInt("myNumber", myNumber);
        editor.commit();

    }
}
