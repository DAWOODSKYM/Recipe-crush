package com.example.dave.foodcrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AFdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afdetails);

        WebView browser2 = findViewById(R.id.webView2);
        int data2 = getIntent().getIntExtra("data2",0);

        if (data2==0){
            browser2.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine1.html");
        }
        else if (data2==1){
            browser2.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine2.html");
        }
        else if (data2==2){
            browser2.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine3.html");
        }
        else if (data2==3){
            browser2.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine4.html");
        }
        else if (data2==4){
            browser2.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine5.html");
        }
    }
}
