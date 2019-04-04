package com.example.sayem.resturantdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity1 extends AppCompatActivity implements View.OnClickListener{

    private EditText editText1,editText2;
    private Button orderButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order1);

        editText1 = (EditText) findViewById(R.id.discountId);
        editText2 = (EditText)findViewById(R.id.quantityId);
        orderButton = (Button) findViewById(R.id.orderButtonId);
        resultTextView = (TextView)findViewById(R.id.textViewId);

        orderButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try{

            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if(v.getId()==R.id.orderButtonId){


                Toast.makeText(OrderActivity1.this,"Order confirmed",Toast.LENGTH_LONG).show();
                double sum = 170 * num1;
                double bill = sum - num2;
                resultTextView.setText("Total Bill : "+bill);


            }

        }catch (Exception e){


            Toast.makeText(OrderActivity1.this,"Please Enter Valid Value",Toast.LENGTH_SHORT).show();


        }


    }
}
