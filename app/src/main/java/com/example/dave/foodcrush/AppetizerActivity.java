package com.example.dave.foodcrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AppetizerActivity extends AppCompatActivity {
ListView List6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer);

        List6 = findViewById(R.id.listView45);

        List6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Af = new Intent(AppetizerActivity.this,APdeatailsActivity.class);
                Af.putExtra("data6",i);
                startActivity(Af);
            }
        });
    }
}
