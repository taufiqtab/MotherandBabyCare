package com.marivin.motherandbabycare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FaktaMitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakta_mitos);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Fakta & Mitos");

        Button bottonFaktaMitos1 = (Button) findViewById(R.id.buttonFaktaMitos1);
        bottonFaktaMitos1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle();
            }
        });
    }

    public void openArticle(){
        Intent artikel = new Intent(FaktaMitos.this, ContohArtikel.class);
        startActivity(artikel);
    }
}
