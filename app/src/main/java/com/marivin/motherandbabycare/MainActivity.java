package com.marivin.motherandbabycare;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Menu Utama");

        Button buttonMotherCare = (Button) findViewById(R.id.buttonMotherCare);
        buttonMotherCare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openMotherCare();
            }
        });

        Button buttonBabyCare = (Button) findViewById(R.id.buttonBabyCare);
        buttonBabyCare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openBabyCare();
            }
        });

        Button buttonConsult = (Button) findViewById(R.id.buttonConsult);
        buttonConsult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openConsult();
            }
        });

        Button buttonMitosFakta = (Button) findViewById(R.id.tombolMitosFakta);
        buttonMitosFakta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openFaktaMitos();
            }
        });
    }

    public void openMotherCare(){
        Intent act = new Intent(MainActivity.this, MotherCare.class);
        startActivity(act);
    }

    public void openBabyCare(){
        Intent act = new Intent(MainActivity.this, BabyCare.class);
        startActivity(act);
    }

    public void openConsult(){
        Intent act = new Intent(MainActivity.this, Consult.class);
        startActivity(act);
    }

    public void openFaktaMitos(){
        Intent act = new Intent(MainActivity.this, FaktaMitos.class);
        startActivity(act);
    }

}
