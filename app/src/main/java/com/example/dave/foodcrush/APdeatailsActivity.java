package com.example.dave.foodcrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class APdeatailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apdeatails);

        WebView browser6 = findViewById(R.id.webView45);
        int data6= getIntent().getIntExtra("data6",0);

        if (data6==0){
            browser6.loadUrl("file:///android_asset/Food_Crus_data/AmericanCuisine2.html");
        }
        else if (data6==1){
            browser6.loadUrl("file:///android_asset/Food_Crus_data/AfricanCuisine5.html");
        }
    }
}
