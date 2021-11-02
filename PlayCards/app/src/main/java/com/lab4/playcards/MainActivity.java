package com.lab4.playcards;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button b1,b2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.n1);
        e2=findViewById(R.id.n2);
        e3=findViewById(R.id.n3);
        e4=findViewById(R.id.n4);
        e5=findViewById(R.id.n5);
        e6=findViewById(R.id.n6);
        b1=findViewById(R.id.sc);
        b2=findViewById(R.id.sort);
        t1=findViewById(R.id.sum);
        Random rand = new Random();
        int maxRange=13;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(String.valueOf(rand.nextInt(maxRange)));
                e2.setText(String.valueOf(rand.nextInt(maxRange)));
                e3.setText(String.valueOf(rand.nextInt(maxRange)));
                e4.setText(String.valueOf(rand.nextInt(maxRange)));
                e5.setText(String.valueOf(rand.nextInt(maxRange)));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("num1",Integer.parseInt(e1.getText().toString()));
                intent.putExtra("num2",Integer.parseInt(e2.getText().toString()));
                intent.putExtra("num3",Integer.parseInt(e3.getText().toString()));
                intent.putExtra("num4",Integer.parseInt(e4.getText().toString()));
                intent.putExtra("num5",Integer.parseInt(e5.getText().toString()));
                startActivityForResult(intent,0);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0)
        {
            if(resultCode == RESULT_OK)
            {
                assert data != null;
                int result = data.getIntExtra("res",0);
                e6.setText(String.valueOf(result));
            }
        }
    }
}