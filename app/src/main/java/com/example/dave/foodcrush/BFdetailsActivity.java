package com.example.dave.foodcrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BFdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfdetails);


        WebView browser5 = findViewById(R.id.webView44);
        int data5= getIntent().getIntExtra("data5",0);

        if (data5==0){
            browser5.loadUrl("file:///android_asset/Food_Crus_data/AmericanCuisine.html");
        }
        else if (data5==1){
            browser5.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine1.html");
        }
        else if (data5==2){
            browser5.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine2.html");
        }
    }
}
