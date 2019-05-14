package com.marivin.motherandbabycare;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ContohArtikel extends AppCompatActivity {

    WebView article;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_artikel);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Artikel");
        article = (WebView)findViewById(R.id.webviewartikel);
        article.getSettings().setBuiltInZoomControls(true);
        article.getSettings().setDisplayZoomControls(false);
        article.loadUrl("file:///android_asset/artikel1.html");
    }
}
