package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class food_vegetable extends AppCompatActivity {

    Context context=this;

    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_vegetable);

        final ImageView orta=findViewById(R.id.foveorta) ;
        final ImageView sag=findViewById(R.id.fovesag);
        ImageView sol=findViewById(R.id.fovesol);

        Bitmap carrot=BitmapFactory.decodeResource(getResources(),R.drawable.carrot);
        Bitmap corn=BitmapFactory.decodeResource(getResources(),R.drawable.corn);
        Bitmap cucumber=BitmapFactory.decodeResource(getResources(),R.drawable.cucumber);
        Bitmap lemon=BitmapFactory.decodeResource(getResources(),R.drawable.lemon);
        Bitmap mush=BitmapFactory.decodeResource(getResources(),R.drawable.mushroom);
        Bitmap onion=BitmapFactory.decodeResource(getResources(),R.drawable.onionn);
        Bitmap patato=BitmapFactory.decodeResource(getResources(),R.drawable.patoto);
        Bitmap pepper=BitmapFactory.decodeResource(getResources(),R.drawable.pepper);
        Bitmap tomato=BitmapFactory.decodeResource(getResources(),R.drawable.tomato);

        final ArrayList<Bitmap> veges = new ArrayList<>();

        veges.add(carrot);
        veges.add(corn);
        veges.add(cucumber);
        veges.add(lemon);
        veges.add(mush);
        veges.add(onion);
        veges.add(patato);
        veges.add(pepper);
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
            }
        });



    }
}
