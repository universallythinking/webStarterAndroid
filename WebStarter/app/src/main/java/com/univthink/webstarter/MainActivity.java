package com.univthink.webstarter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WebView wv = (WebView) findViewById(R.id.webView);
        final String urlStart = "file:///android_asset/webAssets/index.html";
        final String urlWebStart = "https://www.google.com/";
        wv.loadUrl(urlWebStart);
    }
}
