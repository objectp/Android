package com.objectp.imerkato;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by ethiotech on 4/20/2015.
 */
class ImMainPage extends ActionBarActivity{
    Button browsButton,searchButton,registerButton,logInButton;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.im_main_page);

        setValueForButtons();

        browsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://imerkato.com";
                //WebView view = (WebView) findViewById(R.id.webView);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);
            }
        });
    }


    private void setValueForButtons() {
        browsButton = (Button) findViewById(R.id.browsButton);
        searchButton = (Button) findViewById(R.id.searchButton);
        registerButton = (Button) findViewById(R.id.registerButton);
        logInButton = (Button) findViewById(R.id.logInButton);
        webView = (WebView) findViewById(R.id.webView);
    }



}
