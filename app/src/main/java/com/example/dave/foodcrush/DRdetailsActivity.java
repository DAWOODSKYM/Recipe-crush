package com.example.dave.foodcrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DRdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drdetails);

        WebView browser3 = findViewById(R.id.webView3);
        int data3 = getIntent().getIntExtra("data3",0);

        if (data3==0){
            browser3.loadUrl("file:///android_asset/Food_Crus_data/Drinks.html");
        }
        else if (data3==1){
            browser3.loadUrl("file:///android_asset/Food_Crus_data/Lemonade.html");
        }
        else if (data3==2){
            browser3.loadUrl("file:///android_asset/Food_Crus_data/MilkshakeDrinks.html");
        }
        else if (data3==3){
            browser3.loadUrl("file:///android_asset/Food_Crus_data/MimosaDrinks.html");
        }
        else if (data3==4){
            browser3.loadUrl("file:///android_asset/Food_Crus_data/PacheChampagne.html");
        }
    }
}
