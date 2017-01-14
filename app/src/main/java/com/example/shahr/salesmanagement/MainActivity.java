package com.example.shahr.salesmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginClick(View view) {
        Intent myIntent = new Intent(this, WelcomeActivity.class);
        startActivity(myIntent);
    }

    public void registerClick(View view) {
        Intent myIntent = new Intent(this, RegisterActivity.class);
        startActivity(myIntent);
    }
}
