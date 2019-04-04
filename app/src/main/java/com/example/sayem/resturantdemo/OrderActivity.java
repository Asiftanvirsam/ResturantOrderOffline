package com.example.sayem.resturantdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText1,editText2;
    private Button confirmButton;
    private TextView resultTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        editText1 = (EditText) findViewById(R.id.discountId);
        editText2 = (EditText)findViewById(R.id.quantityId);
        confirmButton = (Button) findViewById(R.id.confirmButton);
        resultTextView = (TextView)findViewById(R.id.textViewId);

        confirmButton.setOnClickListener(this);



        }

    @Override
    public void onClick(View v) {

        try{

            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if(v.getId()==R.id.confirmButton){


                Toast.makeText(OrderActivity.this,"Order confirmed",Toast.LENGTH_LONG).show();
                double sum = 250 * num1;
                double bill = sum - num2;
                resultTextView.setText("Total Bill : "+bill);


            }

        }catch (Exception e){


            Toast.makeText(OrderActivity.this,"Please Enter Valid Value",Toast.LENGTH_SHORT).show();


        }







    }
}
