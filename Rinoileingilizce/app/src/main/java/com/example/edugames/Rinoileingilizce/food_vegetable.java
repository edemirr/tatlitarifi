package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class food_vegetable extends AppCompatActivity {




    int i = 0;
    private String[] adlar = {"carrot", "corn","cucumber", "mushroom",
            "onion", "potato","pepper", "pumpkin","tomato"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_vegetable);

        final ImageView orta=findViewById(R.id.foveorta) ;
        final ImageView sag=findViewById(R.id.fovesag);
        ImageView sol=findViewById(R.id.fovesol);
        final TextView ad4=findViewById(R.id.ad4);





        Bitmap carrot=BitmapFactory.decodeResource(getResources(),R.drawable.carrot);
        Bitmap corn=BitmapFactory.decodeResource(getResources(),R.drawable.corn);
        Bitmap cucumber=BitmapFactory.decodeResource(getResources(),R.drawable.cucumber);
        Bitmap mush=BitmapFactory.decodeResource(getResources(),R.drawable.mushroom);
        Bitmap onion=BitmapFactory.decodeResource(getResources(),R.drawable.onion);
        Bitmap patato=BitmapFactory.decodeResource(getResources(),R.drawable.potato);
        Bitmap pumpkin=BitmapFactory.decodeResource(getResources(),R.drawable.pumpkin);
        Bitmap pepper=BitmapFactory.decodeResource(getResources(),R.drawable.pepper);
        Bitmap tomato=BitmapFactory.decodeResource(getResources(),R.drawable.tomato);

        final ArrayList<Bitmap> veges = new ArrayList<>();

        veges.add(carrot);
        veges.add(corn);
        veges.add(cucumber);
        veges.add(mush);
        veges.add(onion);
        veges.add(patato);
        veges.add(pepper);
        veges.add(pumpkin);
        veges.add(tomato);




        orta.setImageBitmap(carrot);

        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 9){
                    i =0;
                }

                orta.setImageBitmap(veges.get(i));
                ad4.setText(adlar[i]);

            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=9;
                }
                i--;
                orta.setImageBitmap(veges.get(i));
                ad4.setText(adlar[i]);

            }
        });

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
