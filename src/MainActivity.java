package com.example.dell.exercise5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    private String[] web = {
            "Google",
            "Facebook",
            "Microsoft",
            "Twitter",
            "Java",
            "Valve",
            "Company",
            "World",
            "One More",
            "Quantum Physics"
    };

    private Integer[] imageId={
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1,
            R.mipmap.image1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
