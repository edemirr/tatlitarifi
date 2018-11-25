package com.example.edugames.Rinoileingilizce;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.media.MediaPlayer;

public class HarflerLearningActivity extends AppCompatActivity {

    ImageView sağaok ;
    ImageView solaok;
    ImageView aHarfi;
    ImageView astronot;
    ImageView airplane;
    ImageView apple;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler_learning);

        final MediaPlayer ucakses = MediaPlayer.create(this, R.raw.ucakmp3);

        sağaok = findViewById(R.id.sağaoklettters);
        solaok = findViewById(R.id.solaokletters);
        aHarfi = findViewById(R.id.Aharfi);
        astronot = findViewById(R.id.astronot);
        airplane = findViewById(R.id.airplane);
        apple = findViewById(R.id.apple);

        airplane.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                ucakses.start();
            }

        });

    }

}
