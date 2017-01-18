package com.example.shahr.salesmanagement.customer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.shahr.salesmanagement.R;

public class CustomerActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] mCustomers = {"Rafi", "Tusher", "Ishayat", "Shohag", "Armaan"};
    ListView mCustomerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        //bind the listview id to this class
        mCustomerList = (ListView) findViewById(R.id.customersLV);
        //to create adapter and pass context,built-in simple list item &
        // array data to the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mCustomers);
        //adapter needed to attached to the listview
        //to set the listview data to a simple view
        mCustomerList.setAdapter(adapter);
        //set for listening to the clicks on the row
        //need to implement OnItemClickListner
        mCustomerList.setOnItemClickListener(this);
    }

    //onItemClick implementation overrides this onItemClick method as
    //interfaces rules are to override them
    //AdapterView is the ListView,View is the row,position is
    // the position of textview and id is id of textview

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//        holding the clicked row data of the list
        TextView holder = (TextView) view;
    }
}
