package com.lab4.playcards;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

    static int n1,n2,n3,n4,n5;
    EditText e1,e2,e3,e4,e5;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=findViewById(R.id.nm1);
        e2=findViewById(R.id.nm2);
        e3=findViewById(R.id.nm3);
        e4=findViewById(R.id.nm4);
        e5=findViewById(R.id.nm5);
        b1=findViewById(R.id.reply);
        Intent i = getIntent();
        n1 = i.getIntExtra("num1",0);
        n2 = i.getIntExtra("num2",0);
        n3 = i.getIntExtra("num3",0);
        n4 = i.getIntExtra("num4",0);
        n5 = i.getIntExtra("num5",0);
        int [] array = new int [] {n1,n2,n3,n4,n5};
        Arrays.sort(array);
        e1.setText(String.valueOf(array[0]));
        e2.setText(String.valueOf(array[1]));
        e3.setText(String.valueOf(array[2]));
        e4.setText(String.valueOf(array[3]));
        e5.setText(String.valueOf(array[4]));
        int x=n1+n2+n3+n4+n5;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("res",x);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}