package com.example.apexhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class weber extends AppCompatActivity implements View.OnClickListener {

     private WebView web;
   public String  Url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weber);


        web = (WebView)findViewById(R.id.webView);
        WebSettings ws = web.getSettings();
        ws.setJavaScriptEnabled(true);
        web.loadUrl(Url);
        web.setWebViewClient(new WebViewClient());

        Button searching = (Button) findViewById(R.id.search);
        searching.setOnClickListener(this);
        Button searching2 = (Button) findViewById(R.id.steam);
        searching2.setOnClickListener(this);
        Button searching3 = (Button) findViewById(R.id.button3);
        searching3.setOnClickListener(this);


    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack()) web.goBack();
        else
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.search:


             Url = "https://www.reddit.com/r/apexlegends/";
                web.loadUrl(Url);
               break;

        }

        switch (v.getId()) {
            case R.id.steam:

                Url = "https://steamcommunity.com/groups/crackeresFox" ;
                web.loadUrl(Url);
                break;
        }

        switch (v.getId()) {
            case R.id.button3:


                Url = "https://www.twitch.tv/directory/game/Apex%20Legends";
                web.loadUrl(Url);
                break;

        }

    }
}
