package com.example.dave.foodcrush;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Enjoy your Meals!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void Main(View view) {
        Intent xyz = new Intent(CategoriesActivity.this,LunchActivity.class);
        startActivity(xyz);
    }

    public void breakfast(View view) {
        Intent abc = new Intent(CategoriesActivity.this,BreakfastActivity.class);
        startActivity(abc);
    }

    public void Appeizer(View view) {
        Intent qrt = new Intent(CategoriesActivity.this,AppetizerActivity.class);
        startActivity(qrt);
    }
}
