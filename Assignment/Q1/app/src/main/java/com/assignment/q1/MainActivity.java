package com.assignment.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ab,wm,bt,t;
    Button Submit,Clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ab=findViewById(R.id.au);
        wm=findViewById(R.id.wm);
        bt=findViewById(R.id.bt);
        t=findViewById(R.id.total);
        Submit=findViewById(R.id.submit);
        Clr=findViewById(R.id.clear);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(ab.getText().toString());
                int n2=Integer.parseInt(wm.getText().toString());
                int n3=Integer.parseInt(bt.getText().toString());
                int total=(n1*500)+(n2*250)+(n3*150);
                t.setText(String.valueOf(total));
            }
        });
        Clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ab.setText("0");
                wm.setText("0");
                bt.setText("0");
                t.setText("0");
            }
        });
    }
}