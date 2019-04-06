package com.example.sampleandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    private Button loginButton;
    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        loginButton = (Button) findViewById(R.id.loginButton);
        usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  startActivity(new Intent(login_activity.this,newcontact_activity.class));
                if(usernameEditText.getText().toString().equals("admin") &&
                        passwordEditText.getText().toString().equals("password"))
                {
                    startActivity(new Intent(login_activity.this,newcontact_activity.class));

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"You have entered an invalid username or password.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
