package com.assignment.q7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    FloatingActionButton f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    int i=0,x=0,y=0,z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = findViewById(R.id.floatingActionButton1);
        f2 = findViewById(R.id.floatingActionButton2);
        f3 = findViewById(R.id.floatingActionButton3);
        f4 = findViewById(R.id.floatingActionButton4);
        f5 = findViewById(R.id.floatingActionButton5);
        f6 = findViewById(R.id.floatingActionButton6);
        f7 = findViewById(R.id.floatingActionButton7);
        f8 = findViewById(R.id.floatingActionButton8);
        f9 = findViewById(R.id.floatingActionButton9);
        f10 = findViewById(R.id.floatingActionButton10);

        f2.setVisibility(View.INVISIBLE);
        f3.setVisibility(View.INVISIBLE);
        f4.setVisibility(View.INVISIBLE);
        f5.setVisibility(View.INVISIBLE);
        f6.setVisibility(View.INVISIBLE);
        f7.setVisibility(View.INVISIBLE);
        f8.setVisibility(View.INVISIBLE);
        f9.setVisibility(View.INVISIBLE);
        f10.setVisibility(View.INVISIBLE);

        f1.setOnClickListener((v -> {
            if(i==0){
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.VISIBLE);
                i=1;
            }
            else{
                f2.setVisibility(View.INVISIBLE);
                f3.setVisibility(View.INVISIBLE);
                f4.setVisibility(View.INVISIBLE);
                f5.setVisibility(View.INVISIBLE);
                f6.setVisibility(View.INVISIBLE);
                f7.setVisibility(View.INVISIBLE);
                f8.setVisibility(View.INVISIBLE);
                f9.setVisibility(View.INVISIBLE);
                f10.setVisibility(View.INVISIBLE);
                i=x=y=z=0;
            }
        }));
        f2.setOnClickListener((v -> {
            if(x==0){
                f5.setVisibility(View.VISIBLE);
                f8.setVisibility(View.VISIBLE);
                x=1;
            }
            else{
                f5.setVisibility(View.INVISIBLE);
                f8.setVisibility(View.INVISIBLE);
                x=0;
            }
        }));
        f3.setOnClickListener((v -> {
            if(y==0){
                f6.setVisibility(View.VISIBLE);
                f9.setVisibility(View.VISIBLE);
                y=1;
            }
            else{
                f6.setVisibility(View.INVISIBLE);
                f9.setVisibility(View.INVISIBLE);
                y=0;
            }
        }));
        f4.setOnClickListener((v -> {
            if(z==0){
                f7.setVisibility(View.VISIBLE);
                f10.setVisibility(View.VISIBLE);
                z=1;
            }
            else{
                f7.setVisibility(View.INVISIBLE);
                f10.setVisibility(View.INVISIBLE);
                z=0;
            }
        }));
    }
}
