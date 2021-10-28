package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    static double result;
    static char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            final EditText e = (EditText) findViewById(R.id.et);
            Button b1 = (Button) findViewById(R.id.b1);
            Button b2 = (Button) findViewById(R.id.b2);
            Button b3 = (Button) findViewById(R.id.b3);
            Button b4 = (Button) findViewById(R.id.b4);
            Button b5 = (Button) findViewById(R.id.b5);
            Button b6 = (Button) findViewById(R.id.b6);
            Button b7 = (Button) findViewById(R.id.b7);
            Button b8 = (Button) findViewById(R.id.b8);
            Button b9 = (Button) findViewById(R.id.b9);
            Button b0 = (Button) findViewById(R.id.b0);
            Button be = (Button) findViewById(R.id.be);
            Button bp = (Button) findViewById(R.id.bp);
            Button bs = (Button) findViewById(R.id.bs);
            Button bm = (Button) findViewById(R.id.bm);
            Button bd = (Button) findViewById(R.id.bd);
            Button bc = (Button) findViewById(R.id.bc);

            b0.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "0");
                }
            });

            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "1");
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "2");
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "3");
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "4");
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "5");
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "6");
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "7");
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "8");
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText(e.getText() + "9");
                }
            });
            bc.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    e.setText("");
                }
            });
            bp.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    op = '+';
                    result = Double.parseDouble(e.getText().toString());
                    e.setText("");
                }
            });
            bs.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    op = '-';
                    result = Double.parseDouble(e.getText().toString());
                    e.setText(String.valueOf(""));
                }
            });
            bm.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    op = '*';
                    result = Double.parseDouble(e.getText().toString());
                    e.setText(String.valueOf(""));
                }
            });
            bd.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    op = '/';
                    result = Double.parseDouble(e.getText().toString());
                    e.setText(String.valueOf(""));
                }
            });
            be.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (op == '+') {
                        double n = Double.parseDouble(e.getText().toString());
                        e.setText(String.valueOf(result + n));
                    } else if (op == '-') {
                        double n = Double.parseDouble(e.getText().toString());
                        e.setText(String.valueOf(result - n));
                    } else if (op == '*') {
                        double n = Double.parseDouble(e.getText().toString());
                        e.setText(String.valueOf(result * n));
                    } else {
                        double n = Double.parseDouble(e.getText().toString());
                        e.setText(String.valueOf(result / n));
                    }
                }
            });
        }
    }

}
