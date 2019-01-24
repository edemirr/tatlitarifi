package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class food_drink extends AppCompatActivity {

    Context context=this;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_drink);

        final ImageView orta=findViewById(R.id.fooddrinkorta) ;
        final ImageView sag=findViewById(R.id.fooddrinksag);
        ImageView sol=findViewById(R.id.fooddrinksol);

        Bitmap coffee=BitmapFactory.decodeResource(getResources(),R.drawable.ffcoffee);
        Bitmap coke=BitmapFactory.decodeResource(getResources(),R.drawable.ffcoke);
        Bitmap juice=BitmapFactory.decodeResource(getResources(),R.drawable.ffjuice);
        Bitmap lemonade=BitmapFactory.decodeResource(getResources(),R.drawable.fflemonade);
        Bitmap milk=BitmapFactory.decodeResource(getResources(),R.drawable.ffmilk);
        Bitmap tea=BitmapFactory.decodeResource(getResources(),R.drawable.fftea);
        Bitmap water=BitmapFactory.decodeResource(getResources(),R.drawable.ffwater);

        final ArrayList<Bitmap> drinks = new ArrayList<>();

        drinks.add(coffee);
        drinks.add(coke);
        drinks.add(juice);
        drinks.add(lemonade);
        drinks.add(milk);
        drinks.add(tea);
        drinks.add(water);

        orta.setImageBitmap(coffee);

        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 7){
                    i =0;
                }

                orta.setImageBitmap(drinks.get(i));
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=7;
                }
                i--;
                orta.setImageBitmap(drinks.get(i));
            }
        });











    }
}
