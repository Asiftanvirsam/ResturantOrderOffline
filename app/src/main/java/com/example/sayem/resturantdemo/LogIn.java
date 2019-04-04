package com.example.sayem.resturantdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    private EditText usenameEditText,passwordEditText;
    private Button loginButton;
    private TextView textView;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        usenameEditText = (EditText)findViewById(R.id.usernameId);
        passwordEditText = (EditText)findViewById(R.id.passId);
        loginButton = (Button)findViewById(R.id.logInButton);
        textView = (TextView)findViewById(R.id.textViewId);
        textView.setText("Number of chance remaining : 3");



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = usenameEditText.getText().toString();
                String password = passwordEditText.getText().toString();


                if(username.equals("admin")&& password.equals("6995")){

                    Intent intent = new Intent(LogIn.this,SplashScreen.class);
                    startActivity(intent);


                }
                else{
                    Toast.makeText(LogIn.this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();

                    counter--;
                    textView.setText("Number of chance remaining : "+counter);
                    if(counter==0)
                    {
                        loginButton.setEnabled(false);
                    }

                }





            }
        });




    }
}
