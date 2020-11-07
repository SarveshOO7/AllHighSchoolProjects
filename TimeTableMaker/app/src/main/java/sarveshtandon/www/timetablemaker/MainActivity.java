package sarveshtandon.www.timetablemaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button addSubject,addClass;
    public TextView ClassName;
    public classroom classes[]= new classroom[100];
    public int currentClass=0;
    public CheckBox English, Mathematics,Physics,Geography,Biology,Chemistry,ComputerScience,IP,PhysicalEducation,Psychology,History,Economics,PoliticalScience,FashionTechnology,BussinessStudies,Accounts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addSubject = findViewById(R.id.addSubject);
        ClassName = findViewById(R.id.className);
        addClass = findViewById(R.id.add);
        English = findViewById(R.id.English);
        Mathematics = findViewById(R.id.Mathematics);
        Physics = findViewById(R.id.Physics);
        Geography = findViewById(R.id.Geography);
        Biology = findViewById(R.id.Biology );
        Chemistry = findViewById(R.id.Chemistry);
        ComputerScience = findViewById(R.id.ComputerScience);
        IP = findViewById(R.id.IP);
        PhysicalEducation = findViewById(R.id.PhysicalEducation);
        Psychology = findViewById(R.id.Psychology);
        History = findViewById(R.id.History);
        Economics = findViewById(R.id.Economics);
        PoliticalScience = findViewById(R.id.PoliticalScience);
        FashionTechnology= findViewById(R.id.FashionTechnology);
        BussinessStudies= findViewById(R.id.BusinessStudies);
        Accounts= findViewById(R.id.Accounts);

        addSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int row=classes[currentClass].row;
                if(English.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "English";
                    classes[currentClass].col++;
                }
                if(Mathematics.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Mathematics";
                    classes[currentClass].col++;
                }
                if(Physics.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Physics";
                    classes[currentClass].col++;
                }
                if(Geography.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Geography";
                    classes[currentClass].col++;
                }
                if(Biology.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Biology";
                    classes[currentClass].col++;
                }
                if(Chemistry.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Chemistry";
                    classes[currentClass].col++;
                }
                if(ComputerScience.isChecked()) {
                    classes[currentClass].subjects[row][classes[currentClass].col] = "ComputerScience";
                    classes[currentClass].col++;
                }
                if(IP.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "IP";
                    classes[currentClass].col++;
                }
                if(PhysicalEducation.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "PhysicalEducation";
                    classes[currentClass].col++;
                }
                if(Psychology.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Psychology";
                    classes[currentClass].col++;
                }
                if(History.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "History";
                    classes[currentClass].col++;
                }
                if(Economics.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Economics";
                    classes[currentClass].col++;
                }
                if(PoliticalScience.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "PoliticalScience";
                    classes[currentClass].col++;
                }
                if(FashionTechnology.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "FashionTechnology";
                    classes[currentClass].col++;
                }
                if(BussinessStudies.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "BussinessStudies";
                    classes[currentClass].col++;
                }
                if(Accounts.isChecked()) {
                    classes[currentClass].subjects[classes[currentClass].row][classes[currentClass].col] = "Accounts";
                    classes[currentClass].col++;
                }

                classes[currentClass].name=ClassName.getText().toString();
                String newText=addSubject.getText().toString()+" "+Integer.toString(++classes[currentClass].row);
                addSubject.setText(newText);
            }
        });
        addClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentClass<99)
                    currentClass++;
            }
        });


    }
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.English: break;
            case R.id.Mathematics:break;
            case R.id.Physics:break;
            case R.id.Geography:break;
            case R.id.Biology:break;
            case R.id.Chemistry:break;
            case R.id.ComputerScience:break;
            case R.id.IP:break;
            case R.id.PhysicalEducation:break;
            case R.id.Psychology:break;
            case R.id.History:break;
            case R.id.Economics:break;
            case R.id.PoliticalScience:break;
            case R.id.FashionTechnology:break;
            case R.id.BusinessStudies:break;
            case R.id.Accounts:break;

        }
    }




}
