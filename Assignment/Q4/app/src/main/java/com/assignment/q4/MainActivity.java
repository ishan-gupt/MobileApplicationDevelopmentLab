package com.assignment.q4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("A",Integer.parseInt(e1.getText().toString()));
                i.putExtra("B",Integer.parseInt(e2.getText().toString()));
                startActivityForResult(i,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==1)
        {
            if(resultCode == RESULT_OK)
            {
                int result=data.getIntExtra("result",0);
                t1.setText(String.valueOf(result));
                Toast.makeText(getApplicationContext(),"Reply"+String.valueOf(result),Toast.LENGTH_LONG).show();
            }
        }
    }
}