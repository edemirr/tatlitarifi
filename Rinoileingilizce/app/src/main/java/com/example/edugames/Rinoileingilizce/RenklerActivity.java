package com.example.edugames.Rinoileingilizce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RenklerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renkler);

        ImageView learn = findViewById(R.id.colorlearn);

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }

    public void renklerlearn(View view){
        Intent ıntent= new Intent(this,RenklerLearning.class);
        startActivity(ıntent);
    }
}
