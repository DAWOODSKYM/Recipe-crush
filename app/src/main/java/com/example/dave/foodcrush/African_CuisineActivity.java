package com.example.dave.foodcrush;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class African_CuisineActivity extends AppCompatActivity {
    ListView List2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_african__cuisine);

        List2 = findViewById(R.id.listView2);

       List2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent Af = new Intent(African_CuisineActivity.this,AFdetailsActivity.class);
               Af.putExtra("data2",i);
               startActivity(Af);
           }
       });
    }
}
