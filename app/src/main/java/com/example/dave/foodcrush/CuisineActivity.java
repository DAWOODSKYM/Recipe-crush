package com.example.dave.foodcrush;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CuisineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "World Cuisines!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void data(View view) {
        Intent American = new Intent(CuisineActivity.this,American_cuisineActivity.class);
        startActivity(American);
    }

    public void Africancuisine(View view) {
        Intent African = new Intent(CuisineActivity.this,African_CuisineActivity.class);
        startActivity(African);
    }

    public void data2(View view) {
        Intent AF = new Intent(CuisineActivity.this,African_CuisineActivity.class);
        startActivity(AF);
    }
}
