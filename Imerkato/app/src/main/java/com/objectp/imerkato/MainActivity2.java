package com.objectp.imerkato;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String url = "http://imerkato.com";
        WebView view = (WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }

}
