package com.example.recomendacaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class submarino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submarino);

        WebView webview = findViewById(R.id.webview);

        webview.setWebViewClient(new WebViewClient());

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("https://www.submarino.com.br");
    }
    public void voltarInicio1 (View view){
        Intent intent6 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent6);
    }
}
