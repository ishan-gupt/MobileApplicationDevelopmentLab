package com.lab4.temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup r1, r2;
    RadioButton rb1,rb2,rb3,rb4;
    Button b1;
    EditText e1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.rgf);
        r2 = findViewById(R.id.rgt);
        rb1 = findViewById(R.id.ff);
        rb2 = findViewById(R.id.fc);
        rb3 = findViewById(R.id.tf);
        rb4 = findViewById(R.id.tc);
        b1 = findViewById(R.id.convert);
        e1 = findViewById(R.id.number);
        t1 = findViewById(R.id.result);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int fId = r1.getCheckedRadioButtonId();
                int tId = r2.getCheckedRadioButtonId();
                // find which radioButton is checked by id
                if(fId == rb1.getId() && tId == rb3.getId()) {
                    t1.setText(e1.getText().toString());
                } else if(fId == rb2.getId() && tId == rb4.getId()) {
                    t1.setText(e1.getText().toString());
                } else if(fId == rb1.getId() && tId == rb4.getId()) {
                    long num= Long.parseLong(e1.getText().toString());
                    double r=((num-32)*(5/9));
                    t1.setText(String.valueOf(r));
                }
                else if(fId == rb2.getId() && tId == rb3.getId()) {
                    long num= Long.parseLong(e1.getText().toString());
                    double r=((num*9/5)+32);
                    t1.setText(String.valueOf(r));
                }
            }
        });
    }
}