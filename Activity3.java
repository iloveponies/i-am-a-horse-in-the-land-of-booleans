package com.example.dell.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{
    private Button thirdButton;
    private String parameter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Bundle extras = getIntent().getExtras();
        String data = extras.getString("parameter1");
        TextView textData = (TextView) findViewById(R.id.parameterView1);
        textData.setText(data);
        this.parameter2=extras.getString("parameter2");
        init();
    }

    public void init(){
        thirdButton= (Button) findViewById(R.id.third_button);
        thirdButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.third_button:
                Intent intent = new Intent(this,Activity4.class);
                intent.putExtra("parameter2",this.parameter2);
                startActivity(intent);
                finish();
                break;
        }
    }


}
