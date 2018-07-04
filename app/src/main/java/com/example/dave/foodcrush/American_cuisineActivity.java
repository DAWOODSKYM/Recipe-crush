package com.example.dave.foodcrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class American_cuisineActivity extends AppCompatActivity {
ListView List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american_cuisine);

        List = findViewById(R.id.listview);

        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent x = new Intent(American_cuisineActivity.this,AMdetailsActivity.class);
                x.putExtra("data",position);
                startActivity(x);


            }
        });
    }
}
