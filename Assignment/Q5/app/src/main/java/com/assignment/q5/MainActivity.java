package com.assignment.q5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button buttonSubmit;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                String yourVote = selectedRadioButton.getText().toString();

                String checkBoxChoices = "\n Reviews Given is \n ";

                if (cb1.isChecked()) {
                    checkBoxChoices += cb1.getText().toString() + "\n";
                }

                if (cb2.isChecked()) {
                    checkBoxChoices += cb2.getText().toString() + "\n";
                }

                if (cb3.isChecked()) {
                    checkBoxChoices += cb3.getText().toString() + "\n";
                }

                if (cb4.isChecked()) {
                    checkBoxChoices += cb4.getText().toString() + "\n";
                }
                if (!cb1.isChecked() && !cb2.isChecked() && !cb3.isChecked() && !cb4.isChecked()) {
                    checkBoxChoices = "\nNo Reviews Given\n";
                }

                Toast.makeText(MainActivity.this, "Rating Given is: " + yourVote + checkBoxChoices, Toast.LENGTH_LONG).show();

            }
        });
    }
}