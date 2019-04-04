package com.example.sayem.resturantdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BurgerActivity extends AppCompatActivity implements View.OnClickListener{

    private Button OrderButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger); OrderButton = (Button)findViewById(R.id.orderButtonId); OrderButton.setOnClickListener(this);
               }@Override
    public void onClick(View v) {
        if(v.getId()==R.id.orderButtonId)
        { Toast.makeText(BurgerActivity.this,"Order is Clicked",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(BurgerActivity.this,OrderActivity.class);
            startActivity(intent);
        }
    }
}









