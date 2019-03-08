package com.example.edugames.Rinoileingilizce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HarflerActivity extends AppCompatActivity {

    ImageView learn,test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler);
        learn = findViewById(R.id.learn);

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }



    public void harflerlearn(View view){

        Intent ıntent = new Intent(this,HarflerLearningActivity.class);
        startActivity(ıntent);

    }
}
