package com.example.dell.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText firstText;
    private EditText secondText;
    private Button firstButton;
    private Button secondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        firstText = (EditText) findViewById(R.id.first_text);
        secondText = (EditText) findViewById(R.id.second_text);
        firstButton=(Button) findViewById(R.id.first_button);
        secondButton=(Button) findViewById(R.id.second_button);
        firstButton.setOnClickListener(this);
        secondButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.first_button:
                Intent intent1 = new Intent(this,Activity2.class);

                startActivity(intent1);
                finish();
                break;

            case R.id.second_button:
                Intent intent2 = new Intent(this,Activity3.class);
                String text1 = firstText.getText().toString();
                String text2 = secondText.getText().toString();
                intent2.putExtra("parameter1",text1);
                intent2.putExtra("parameter2",text2);
                startActivity(intent2);

                break;
        }

    }
}
