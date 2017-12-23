package com.example.anchitchawla.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int ca = 0;
    int ica = 0;
    int score = 0;
    boolean ch1,ch2,ch3,ch4,ch5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean ques1() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.q11);
        if (radioGroup.getCheckedRadioButtonId() == R.id.q1b) {
            return true;
        }
        return false;
    }
    public boolean ques2()
    {
        RadioGroup radioGroup=(RadioGroup) findViewById(R.id.q22);
        if(radioGroup.getCheckedRadioButtonId()==R.id.q2c)
        {
            return true;
        }
        return  false;
    }
    public boolean ques3(){
        EditText editText=(EditText) findViewById(R.id.et);
        if(editText.getText().toString().equalsIgnoreCase("united states"))
            return true;
        return false;
    }
    public boolean ques4()
    {
        RadioGroup radioGroup=(RadioGroup) findViewById(R.id.q44);
        if(radioGroup.getCheckedRadioButtonId()==R.id.q4d)
            return true;
        return false;
    }
    public boolean ques5()
    {
        CheckBox x=(CheckBox) findViewById(R.id.c1);
        CheckBox y=(CheckBox) findViewById(R.id.c2);
        CheckBox z=(CheckBox) findViewById(R.id.c3);
        CheckBox a=(CheckBox) findViewById(R.id.c4);
        CheckBox b=(CheckBox) findViewById(R.id.c5);
        if(!x.isChecked() && !y.isChecked() && z.isChecked() && a.isChecked() && b.isChecked())
            return true;
        return false;
    }
     void res(View view) {
        if (ques1()) {
            ca++;
            score++;
        } else {
            ica++;
        }
        if (ques2()) {
            ca++;
            score++;
        }
        else
            ica++;
        if (ques3())
        {
            ca++;
            score=score+1;
        }
        else
            ica++;
        if (ques4())
        {
            ca++;
            score++;
        }
        else
            ica++;
        if (ques5())
        {
            ca=ca++;
            score++;
        }
        else
        {
            ica++;
        }
         String res="Correct Answers"+" "+ca+ "               "+"Wrong Answers"+" "+ica+"                 " +"Your Total Score is"+" "+score;
         Toast.makeText(this,res,Toast.LENGTH_LONG).show();
         ica=0;
         ca=0;
         score=0;
    }
}