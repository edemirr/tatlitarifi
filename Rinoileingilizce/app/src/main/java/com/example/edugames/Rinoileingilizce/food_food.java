package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class food_food extends AppCompatActivity {

    Context context=this;
    MediaPlayer np;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_food);

        final ImageView orta=findViewById(R.id.foodfruitorta) ;
        final ImageView sag=findViewById(R.id.foodfruitsag);
        ImageView sol=findViewById(R.id.foodfruitsol);

        Bitmap bread=BitmapFactory.decodeResource(getResources(),R.drawable.ffbread);
        Bitmap cake=BitmapFactory.decodeResource(getResources(),R.drawable.ffcake);
        Bitmap cheese=BitmapFactory.decodeResource(getResources(),R.drawable.ffcheese);
        Bitmap choco=BitmapFactory.decodeResource(getResources(),R.drawable.ffchocolate);
        Bitmap egg=BitmapFactory.decodeResource(getResources(),R.drawable.ffeg);
        Bitmap fries=BitmapFactory.decodeResource(getResources(),R.drawable.fffries);
        Bitmap honey=BitmapFactory.decodeResource(getResources(),R.drawable.ffhoney);
        Bitmap icecream=BitmapFactory.decodeResource(getResources(),R.drawable.fficecream);
        Bitmap meatball=BitmapFactory.decodeResource(getResources(),R.drawable.ffmeatball);
        Bitmap olive=BitmapFactory.decodeResource(getResources(),R.drawable.ffolive);
        Bitmap pasta=BitmapFactory.decodeResource(getResources(),R.drawable.ffpasta);
        Bitmap salad=BitmapFactory.decodeResource(getResources(),R.drawable.ffsalad);
        Bitmap soup=BitmapFactory.decodeResource(getResources(),R.drawable.ffsoup);
        Bitmap yoghurt=BitmapFactory.decodeResource(getResources(),R.drawable.ffyoghurt);


        final ArrayList<Bitmap> foods = new ArrayList<>();

        foods.add(bread);
        foods.add(cake);
        foods.add(cheese);
        foods.add(choco);
        foods.add(egg);
        foods.add(fries);
        foods.add(honey);
        foods.add(icecream);
        foods.add(meatball);
        foods.add(olive);
        foods.add(pasta);
        foods.add(salad);
        foods.add(soup);
        foods.add(yoghurt);

        orta.setImageBitmap(bread);

        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 14){
                    i =0;
                }

                orta.setImageBitmap(foods.get(i));
            }
            });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=14;
                }
                i--;
                orta.setImageBitmap(foods.get(i));
            }
        });














    }
}
