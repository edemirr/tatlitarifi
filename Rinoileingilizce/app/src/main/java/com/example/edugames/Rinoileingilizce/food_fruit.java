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

    Context context=this;

    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_fruit);

        final ImageView orta=findViewById(R.id.fofrorta) ;
        final ImageView sag=findViewById(R.id.fofrsag);
        ImageView sol=findViewById(R.id.fofrsol);

        Bitmap apple=BitmapFactory.decodeResource(getResources(),R.drawable.aapppll);
        Bitmap apricot=BitmapFactory.decodeResource(getResources(),R.drawable.apricot);
        Bitmap banana=BitmapFactory.decodeResource(getResources(),R.drawable.banana);
        Bitmap cherry=BitmapFactory.decodeResource(getResources(),R.drawable.cherry);
        Bitmap grape=BitmapFactory.decodeResource(getResources(),R.drawable.grape);
        Bitmap orange=BitmapFactory.decodeResource(getResources(),R.drawable.oorraann);
        Bitmap peach=BitmapFactory.decodeResource(getResources(),R.drawable.peach);
        Bitmap pear=BitmapFactory.decodeResource(getResources(),R.drawable.pear);
        Bitmap strawberry=BitmapFactory.decodeResource(getResources(),R.drawable.strawberry);
        Bitmap watermelon=BitmapFactory.decodeResource(getResources(),R.drawable.wwaattrr);

        final ArrayList<Bitmap> fruits = new ArrayList<>();


        fruits.add(apple);
        fruits.add(apricot);
        fruits.add(banana);
        fruits.add(cherry);
        fruits.add(grape);
        fruits.add(orange);
        fruits.add(peach);
        fruits.add(pear);
        fruits.add(strawberry);
        fruits.add(watermelon);

        orta.setImageBitmap(apple);

        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 10){
                    i =0;
                }

                orta.setImageBitmap(fruits.get(i));
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=10;
                }
                i--;
                orta.setImageBitmap(fruits.get(i));
            }
        });






    }
}
