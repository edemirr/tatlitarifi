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

public class food_fruit extends AppCompatActivity {


    int i = 0;

    private String[] adlar = {"apple", "apricot","banana", "cherry",
            "grape","melon", "orange","peach", "pear","strawberry","watermelon",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_fruit);
        final ImageView ortameyve = findViewById(R.id.ortameyve);
        ImageView sagmeyve = findViewById(R.id.sagmeyve);
        ImageView solmeyve = findViewById(R.id.solmeyve);
        final TextView ad5=findViewById(R.id.ad5);


        Bitmap apple=BitmapFactory.decodeResource(getResources(),R.drawable.elma);
        Bitmap apricot=BitmapFactory.decodeResource(getResources(),R.drawable.kayisi);
        Bitmap banana=BitmapFactory.decodeResource(getResources(),R.drawable.muz);
        Bitmap cherry=BitmapFactory.decodeResource(getResources(),R.drawable.visne);
        Bitmap grape=BitmapFactory.decodeResource(getResources(),R.drawable.uzum);
        Bitmap orange=BitmapFactory.decodeResource(getResources(),R.drawable.portakal);
        Bitmap peach=BitmapFactory.decodeResource(getResources(),R.drawable.seftali);
        Bitmap pear=BitmapFactory.decodeResource(getResources(),R.drawable.armut);
        Bitmap strawbery=BitmapFactory.decodeResource(getResources(),R.drawable.cilek);
        Bitmap watermelon=BitmapFactory.decodeResource(getResources(),R.drawable.karpuz);
        Bitmap melon=BitmapFactory.decodeResource(getResources(),R.drawable.kavun);
        final ArrayList<Bitmap> meyveler = new ArrayList<>();

        meyveler.add(apple);
        meyveler.add(apricot);
        meyveler.add(banana);
        meyveler.add(cherry);
        meyveler.add(grape);  meyveler.add(melon);meyveler.add(orange);
        meyveler.add(peach); meyveler.add(pear);



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
                ad5.setText(adlar[i]);

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
                ad5.setText(adlar[i]);

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
