package com.assignment.q4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    int x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        x=i.getIntExtra("A",0);
        y=i.getIntExtra("B", 0);
        z=x+y;
        final EditText e1=findViewById(R.id.editText3);
        e1.setText(String.valueOf(z));
        final Button b1=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reply=new Intent();
                reply.putExtra("result",z);
                setResult(RESULT_OK,reply);
                finish();
            }
        });

    }
}