package com.example.dave.foodcrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LNdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lndetails);

        WebView browser4 = findViewById(R.id.webView4);
        int data4= getIntent().getIntExtra("data4",0);

        if (data4==0){
            browser4.loadUrl("file:///android_asset/Food_Crus_data/AmericanCuisine3.html");
        }
        else if (data4==1){
            browser4.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine4.html");
        }
        else if (data4==2){
            browser4.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine5.html");
        }
    }
}
