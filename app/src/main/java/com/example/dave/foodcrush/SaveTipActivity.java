package com.example.dave.foodcrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SaveTipActivity extends AppCompatActivity {
EditText about,tip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_tip);

        about = findViewById(R.id.about2);
        tip = findViewById(R.id.tip2);
    }

    public void save(View view) {
        String About = about.getText().toString();
        String Tip = tip.getText().toString();
        if (About.isEmpty() || Tip.isEmpty()){
            Toast.makeText(this, "Empty Tip", Toast.LENGTH_SHORT).show();
        }
        Database db = new Database(this);
        boolean status= db.insertData(About,Tip);
        if (status == true){
            Toast.makeText(this,"SAVED",Toast.LENGTH_SHORT).show();
            about.setText("");
            tip.setText("");

        }else{
            Toast.makeText(this,"Failed To Save Tip",Toast.LENGTH_SHORT).show();
        }
    }


}

