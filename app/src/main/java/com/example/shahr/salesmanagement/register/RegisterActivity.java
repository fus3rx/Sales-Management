package com.example.shahr.salesmanagement.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.shahr.salesmanagement.R;
import com.example.shahr.salesmanagement.login.WelcomeActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText rName, rUser, rPass, rEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        rName = (EditText) findViewById(R.id.fNameET);
        rUser = (EditText) findViewById(R.id.userNameET);
        rPass = (EditText) findViewById(R.id.passET);
        rEmail = (EditText) findViewById(R.id.emailET);
        //da
    }

    public void getRegister(View view) {
        Intent myIntent = new Intent(this, WelcomeActivity.class);
        startActivity(myIntent);
    }


}
