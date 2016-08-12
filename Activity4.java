package com.example.dell.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Bundle extras = getIntent().getExtras();
        String data = extras.getString("parameter2");
        TextView textData = (TextView) findViewById(R.id.parameterView2);
        textData.setText(data);
    }


}
