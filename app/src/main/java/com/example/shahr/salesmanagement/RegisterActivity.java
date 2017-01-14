package com.example.shahr.salesmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void getRegister(View view) {
        Intent myIntent = new Intent(this, WelcomeActivity.class);
        startActivity(myIntent);
    }
}
