package com.marivin.motherandbabycare;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MotherCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_care);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Mother Care");
    }
}
