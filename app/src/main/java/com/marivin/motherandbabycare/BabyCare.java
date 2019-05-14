package com.marivin.motherandbabycare;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BabyCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_care);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Baby Care");
    }
}
