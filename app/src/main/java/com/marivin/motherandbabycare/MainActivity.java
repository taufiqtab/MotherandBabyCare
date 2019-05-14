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
        actionBar.setTitle("Mother & Baby Care");

        Button buttonArtikel = (Button) findViewById(R.id.tombolMitosFakta);
        buttonArtikel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openArticle();
            }
        });
    }

    public void openArticle(){
        Intent artikel = new Intent(MainActivity.this, ContohArtikel.class);
        startActivity(artikel);
    }
}
