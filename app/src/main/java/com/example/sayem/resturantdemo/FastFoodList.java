package com.example.sayem.resturantdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FastFoodList extends AppCompatActivity implements View.OnClickListener{

    private Button BurgerButton,PizzaButton,SubwayButton,PastaButton,FriedChickenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food_list);


        BurgerButton = (Button) findViewById(R.id.burger_btn);
        PizzaButton = (Button) findViewById(R.id.pizza_btn);
        SubwayButton = (Button) findViewById(R.id.subway_btn);
        PastaButton = (Button) findViewById(R.id.pasta_btn);
        FriedChickenButton= (Button) findViewById(R.id.friedchicken_btn);

        BurgerButton.setOnClickListener(this);
        PizzaButton.setOnClickListener(this);
        SubwayButton.setOnClickListener(this);
        FriedChickenButton.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.burger_btn)
        {
            Intent intent = new Intent(FastFoodList.this,BurgerActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.pizza_btn)
        {
            Intent intent = new Intent(FastFoodList.this,PizzaActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.subway_btn)
        {
            Intent intent = new Intent(FastFoodList.this,SubwayActivity.class);
            startActivity(intent);
        }







    }
}
