package com.example.shahr.salesmanagement.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shahr.salesmanagement.R;
import com.example.shahr.salesmanagement.register.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText password;
    Button loginBT, registerBT;
    String checkUser = "admin";
    String checkPass = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (EditText) findViewById(R.id.nameET);
        password = (EditText) findViewById(R.id.passwordET);
        loginBT = (Button) findViewById(R.id.loginBTN);
        registerBT = (Button) findViewById(R.id.registerBTN);
    }

    public void loginClick(View view) {
        String userTemp = login.getText().toString();
        String passTemp = password.getText().toString();
        Intent myIntent = new Intent(this, WelcomeActivity.class);


        if (userTemp.equals(checkUser)) {
            if (passTemp.equals(checkPass)) {
                startActivity(myIntent);
            } else {
                Toast.makeText(this, login.getText() + " not found!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "user not found!", Toast.LENGTH_SHORT).show();
        }
    }

    public void registerClick(View view) {
        Intent myIntent = new Intent(this, RegisterActivity.class);
        startActivity(myIntent);
    }
}
