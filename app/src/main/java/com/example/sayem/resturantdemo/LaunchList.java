package com.example.sayem.resturantdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LaunchList extends AppCompatActivity implements View.OnClickListener{

    private ImageView F1Image,F2Image,F3Image,F4Image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_list);

        F1Image = (ImageView)findViewById(R.id.f1Id);
        F2Image = (ImageView)findViewById(R.id.f2Id);
        F3Image = (ImageView)findViewById(R.id.f3Id);
        F4Image = (ImageView)findViewById(R.id.f4Id);

        F1Image.setOnClickListener(this);
        F2Image.setOnClickListener(this);
        F3Image.setOnClickListener(this);
        F4Image.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.f1Id)
        {
            Intent intent = new Intent(LaunchList.this,OrderActivity1.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.f2Id)
        {
            Intent intent = new Intent(LaunchList.this,OrderActivity1.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.f3Id)
        {
            Intent intent = new Intent(LaunchList.this,OrderActivity1.class);
            startActivity(intent);
        }



    }
}
