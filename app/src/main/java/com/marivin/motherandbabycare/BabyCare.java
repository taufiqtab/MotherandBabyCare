package com.marivin.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BabyCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_care);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Baby Care");

        Button btnArtikel1 = (Button) findViewById(R.id.btnBabyCare1);
        btnArtikel1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("baby_care_1.html");
            }
        });

        Button btnArtikel2 = (Button) findViewById(R.id.btnBabyCare2);
        btnArtikel2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("baby_care_2.html");
            }
        });

        Button btnArtikel3 = (Button) findViewById(R.id.btnBabyCare3);
        btnArtikel3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("baby_care_3.html");
            }
        });

        Button btnArtikel4 = (Button) findViewById(R.id.btnBabyCare4);
        btnArtikel4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("baby_care_4.html");
            }
        });

        Button btnArtikel5 = (Button) findViewById(R.id.btnBabyCare5);
        btnArtikel5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("baby_care_5.html");
            }
        });

        Button btnArtikel6 = (Button) findViewById(R.id.btnBabyCare6);
        btnArtikel6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("baby_care_6.html");
            }
        });
    }

    public void openArticle(String pages){
        Intent artikel = new Intent(BabyCare.this, ContohArtikel.class);
        artikel.putExtra("PAGES", pages);
        startActivity(artikel);
    }
}
