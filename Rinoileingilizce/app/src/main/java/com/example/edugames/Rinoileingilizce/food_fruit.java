package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class food_fruit extends AppCompatActivity {


    int i = 0;
    Context context=this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_fruit);
        final ImageView ortameyve = findViewById(R.id.ortameyve);
        ImageView sagmeyve = findViewById(R.id.sagmeyve);
        ImageView solmeyve = findViewById(R.id.solmeyve);

        Bitmap apple=BitmapFactory.decodeResource(getResources(),R.drawable.aapppll);
        Bitmap apricot=BitmapFactory.decodeResource(getResources(),R.drawable.apricot);
        Bitmap banana=BitmapFactory.decodeResource(getResources(),R.drawable.banana);
        Bitmap cherry=BitmapFactory.decodeResource(getResources(),R.drawable.cherry);
        Bitmap grape=BitmapFactory.decodeResource(getResources(),R.drawable.grape);
        Bitmap lemon=BitmapFactory.decodeResource(getResources(),R.drawable.lemon);
        Bitmap orange=BitmapFactory.decodeResource(getResources(),R.drawable.oorraann);
        Bitmap peach=BitmapFactory.decodeResource(getResources(),R.drawable.peach);
        Bitmap pear=BitmapFactory.decodeResource(getResources(),R.drawable.pear);
        Bitmap strawbery=BitmapFactory.decodeResource(getResources(),R.drawable.strawberry);
        Bitmap watermelon=BitmapFactory.decodeResource(getResources(),R.drawable.wwaattrr);
        final ArrayList<Bitmap> meyveler = new ArrayList<>();
        meyveler.add(apple);
        meyveler.add(apricot);
        meyveler.add(banana);
        meyveler.add(cherry);
        meyveler.add(grape);
        meyveler.add(lemon);
        meyveler.add(orange);
        meyveler.add(peach);
        meyveler.add(pear);
        meyveler.add(strawbery);
        meyveler.add(watermelon);

        sagmeyve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 11){
                    i =0;
                }


                ortameyve.setImageBitmap(meyveler.get(i));
            }
        });

        solmeyve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=11;
                }
                i--;

                ortameyve.setImageBitmap(meyveler.get(i));
            }
        });

    }
}
