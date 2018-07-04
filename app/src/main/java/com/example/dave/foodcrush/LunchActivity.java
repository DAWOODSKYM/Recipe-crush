package com.example.dave.foodcrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LunchActivity extends AppCompatActivity {
ListView List4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        List4 = findViewById(R.id.listView4);

        List4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Af = new Intent(LunchActivity.this,LNdetailsActivity.class);
                Af.putExtra("data4",i);
                startActivity(Af);
            }
        });
    }
}
