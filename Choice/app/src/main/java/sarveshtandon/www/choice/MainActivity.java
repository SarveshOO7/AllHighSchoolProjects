package sarveshtandon.www.choice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.Choice);
        b = (Button) findViewById(R.id.againButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doItAgain();
            }
        });
        doItAgain();
    }
    void doItAgain(){
        Random r = new Random(System.currentTimeMillis());

        switch(r.nextInt(7)) {
            case 0:
                t.setText("Sarvesh");
                break;
            case 1:
                t.setText("Mom");
                break;
            case 2:
                t.setText("Dad");
                break;
            case 3:
                t.setText("Ishani");
                break;
            case 4:
                t.setText("Dadu");
                break;
            case 5:
                t.setText("Dadi");
                break;
            default:
                t.setText("Sarvesh");
        }

    }



}
