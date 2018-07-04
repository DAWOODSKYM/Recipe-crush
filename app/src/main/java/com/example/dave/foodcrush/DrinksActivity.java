package com.example.dave.foodcrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DrinksActivity extends AppCompatActivity {
ListView List3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinc);

        List3 = findViewById(R.id.listView3);

        List3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Dr = new Intent(DrinksActivity.this,DRdetailsActivity.class);
                Dr.putExtra("data3",i);
                startActivity(Dr);
            }
        });
    }
}
