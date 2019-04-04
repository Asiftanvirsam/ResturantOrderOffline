package com.example.sayem.resturantdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    private CardView fastFoodCardView,launchCardView,drinksCardView,fnFCardView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fastFoodCardView = (CardView) findViewById(R.id.fastFoodCardViewId);
        launchCardView = (CardView) findViewById(R.id.launchCardViewId);
        drinksCardView = (CardView) findViewById(R.id.drinksCardViewId);
        fnFCardView = (CardView) findViewById(R.id.fnfCardViewId);

        fastFoodCardView.setOnClickListener(this);
        launchCardView.setOnClickListener(this);
        drinksCardView.setOnClickListener(this);
        fnFCardView.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.fastFoodCardViewId)
        {
            Intent intent = new Intent(MainActivity.this,FastFoodList.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.launchCardViewId)
        {
            Intent intent = new Intent(MainActivity.this,LaunchList.class);
            startActivity(intent);
        }

        else if(v.getId()==R.id.drinksCardViewId)
        {
            Intent intent = new Intent(MainActivity.this,DrinksActivity.class);
            startActivity(intent);
        }

        else if(v.getId()==R.id.fnfCardViewId)
        {
            Intent intent = new Intent(MainActivity.this,FnfList.class);
            startActivity(intent);
        }




    }


    }

