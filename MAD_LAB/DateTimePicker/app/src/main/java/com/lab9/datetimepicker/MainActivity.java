package com.lab9.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    Button b1,b2,b3,sub;
    TimePicker timePicker;
    private String format = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.event1);
        e2 = findViewById(R.id.event2);
        e3 = findViewById(R.id.event3);
        b1 = findViewById(R.id.eb1);
        b2 = findViewById(R.id.eb2);
        b3 = findViewById(R.id.eb3);
        timePicker = findViewById(R.id.clock);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = timePicker.getCurrentHour();
                int min = timePicker.getCurrentMinute();
                showTime(hour,min,e1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = timePicker.getCurrentHour();
                int min = timePicker.getCurrentMinute();

                showTime(hour,min,e2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = timePicker.getCurrentHour();
                int min = timePicker.getCurrentMinute();
                showTime(hour,min,e3);
            }
        });
    }

    public void showTime(int hour, int min, EditText e) {
        if (hour == 0) {
            hour += 12;
            format = "AM";
        } else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }
        e.setText(new StringBuilder().append(hour).append(" : ").append(min)
                .append(" ").append(format));
    }


}