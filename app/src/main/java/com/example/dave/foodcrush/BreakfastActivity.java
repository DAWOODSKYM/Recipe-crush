package com.example.dave.foodcrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BreakfastActivity extends AppCompatActivity {
ListView List5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        List5 = findViewById(R.id.listView5);

        List5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Af = new Intent(BreakfastActivity.this,BFdetailsActivity.class);
                Af.putExtra("data5",i);
                startActivity(Af);
            }
        });
    }
}
