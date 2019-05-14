package com.marivin.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotherCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_care);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Mother Care");

        Button btnArtikel1 = (Button) findViewById(R.id.btnMotherCare1);
        btnArtikel1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("mother_care_1.html");
            }
        });

        Button btnArtikel2 = (Button) findViewById(R.id.btnMotherCare2);
        btnArtikel2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("mother_care_2.html");
            }
        });

        Button btnArtikel3 = (Button) findViewById(R.id.btnMotherCare3);
        btnArtikel3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("mother_care_3.html");
            }
        });

        Button btnArtikel4 = (Button) findViewById(R.id.btnMotherCare4);
        btnArtikel4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("mother_care_4.html");
            }
        });

        Button btnArtikel5 = (Button) findViewById(R.id.btnMotherCare5);
        btnArtikel5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("mother_care_5.html");
            }
        });

        Button btnArtikel6 = (Button) findViewById(R.id.btnMotherCare6);
        btnArtikel6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle("mother_care_6.html");
            }
        });
    }

    public void openArticle(String pages){
        Intent artikel = new Intent(MotherCare.this, ContohArtikel.class);
        artikel.putExtra("PAGES", pages);
        startActivity(artikel);
    }
}
