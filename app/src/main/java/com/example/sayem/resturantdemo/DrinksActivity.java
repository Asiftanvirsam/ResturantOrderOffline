package com.example.sayem.resturantdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinksActivity extends AppCompatActivity implements View.OnClickListener{

    private Button ColdCoffeeButton,LemonadeButton,MangoJuiceButton,MilkShakeButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        ColdCoffeeButton = (Button) findViewById(R.id.coldCoffee_btn);
        LemonadeButton = (Button) findViewById(R.id.lemonade_btn);
        MangoJuiceButton = (Button) findViewById(R.id.mangoJuice_btn);
        MilkShakeButton = (Button) findViewById(R.id.milkshake_btn);


        ColdCoffeeButton.setOnClickListener(this);
        LemonadeButton.setOnClickListener(this);
        MangoJuiceButton.setOnClickListener(this);
        MilkShakeButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.coldCoffee_btn)
        {
            Intent intent = new Intent(DrinksActivity.this,CofeeActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.lemonade_btn)
        {
            Intent intent = new Intent(DrinksActivity.this,LemonadeActivity.class);
            startActivity(intent);
        }




    }
}
