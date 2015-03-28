package com.example.webviewexample;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class MainActivity extends Activity {
	WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        //webView.loadUrl("http://www.google.com");
        webView.loadUrl("file:///android_asset/index.html");
        
    }


    
}
