package com.example.dave.foodcrush;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ShowTipActivity extends AppCompatActivity {
EditText TipNo;
TextView About, Details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_tip);

        TipNo = findViewById(R.id.inputId);
        About = findViewById(R.id.About2);
        Details = findViewById(R.id.Details2);

    }

    public void search(View view) {
        String id = TipNo.getText().toString().trim();
        if (id.isEmpty())
        {
            return;
        }
        Database db=new Database(this);
        Cursor movie =db.getOneItem(id);
        if (movie.moveToFirst())
        {
            About.setText(movie.getString(1));
            Details.setText(movie.getString(2));

        }else
        {
            About.setText("");
            Details.setText("");
            Toast.makeText(this,"No record found",Toast.LENGTH_SHORT).show();
        }
    }

    public void delete(View view) {
        String id = TipNo.getText().toString().trim();
        if (id.isEmpty())
        {
            return;
        }
        Database db=new Database(this);
        db.deleteData(id);

    }
}

