package com.example.sqltry2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class showdata extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);
        t1 = findViewById(R.id.textView);

        String text= getIntent().getStringExtra("name");
        if (text!=null)
        {
            t1.setText(text);
        }

    }
}