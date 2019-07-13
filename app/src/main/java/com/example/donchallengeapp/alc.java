package com.example.donchallengeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class alc extends AppCompatActivity {

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc);

        WebView webView = (WebView)findViewById(R.id.mWebView1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://andela.com/alc/");
        setContentView(R.layout.activity_alc);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
