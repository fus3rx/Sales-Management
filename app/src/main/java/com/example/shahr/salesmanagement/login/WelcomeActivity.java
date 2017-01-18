package com.example.shahr.salesmanagement.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.shahr.salesmanagement.customer.CustomerActivity;
import com.example.shahr.salesmanagement.R;
import com.example.shahr.salesmanagement.products.ProductsActivity;
import com.example.shahr.salesmanagement.sales.SalesActivity;
import com.example.shahr.salesmanagement.statistics.StatisticsActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void logoutClick(View view) {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }

    public void warehouseClick(View view) {
        Intent myIntent = new Intent(this, ProductsActivity.class);
        startActivity(myIntent);
    }

    public void customerClick(View view) {
        Intent myIntent = new Intent(this, CustomerActivity.class);
        startActivity(myIntent);
    }

    public void statClick(View view) {
        Intent myIntent = new Intent(this, StatisticsActivity.class);
        startActivity(myIntent);
    }

    public void salesClick(View view) {
        Intent myIntent = new Intent(this, SalesActivity.class);
        startActivity(myIntent);
    }
}
