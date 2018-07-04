package com.example.dave.foodcrush;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
    }

    public void view(View view) {
        Intent xyz = new Intent(TipsActivity.this,ShowTipActivity.class);
        startActivity(xyz);
    }

    public void add(View view) {
        Intent abc = new Intent(TipsActivity.this,SaveTipActivity.class);
        startActivity(abc);
    }
}
