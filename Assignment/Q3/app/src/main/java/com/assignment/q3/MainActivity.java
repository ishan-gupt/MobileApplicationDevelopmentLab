package com.assignment.q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                final EditText e1 =(EditText)findViewById(R.id.editText2);
                final TextView t1 =(TextView)findViewById(R.id.textView2);
                final RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup);
                final int i=rg.getCheckedRadioButtonId();
                final RadioButton rd=(RadioButton)findViewById(i);
                int ab =Integer.parseInt(e1.getText().toString());
                if(rd.getText().equals("USD"))
                {
                    t1.setText(String.valueOf(ab*0.014));
                }
                else if (rd.getText().equals("EURO"))
                {
                    t1.setText(String.valueOf(ab*0.214));
                }
                else if (rd.getText().equals("YEN"))
                {
                    t1.setText(String.valueOf(ab*1.014));
                }
            }
        });


    }
}