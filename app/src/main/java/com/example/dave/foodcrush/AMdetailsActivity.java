package com.example.dave.foodcrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AMdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amdetails);

        WebView browser = findViewById(R.id.webView);
        int data = getIntent().getIntExtra("data",0);

        if (data==0){
            browser.loadUrl("file:///android_asset/Food_Crus_data/AmericanCuisine.html");
        }
        else if (data==1){
            browser.loadUrl("file:///android_asset/Food_Crus_data/AmericanCuisine2.html");
        }
        else if (data==2){
            browser.loadUrl("file:///android_asset/Food_Crus_data/AmericanCuisine3.html");
        }
        else if (data==3){
            browser.loadUrl("file:///android_asset/Food_Crus_data/AmericanCuisine4.html");
        }





    }
}
