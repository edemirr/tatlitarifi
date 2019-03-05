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

public class food_drink extends AppCompatActivity {

    Context context=this;
    public static SoundPool sp;
    public static int[] sounds ;
    int i = 0;
    private String[] adlar = {"buttermilk", "coffee","coke", "juice",
            "lemonade","milk","soda", "tea", "water"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_drink);

        final ImageView orta=findViewById(R.id.drorta) ;
        final ImageView sag=findViewById(R.id.fodrsag);
        ImageView sol=findViewById(R.id.fodrsol);
        final TextView ad7=findViewById(R.id.ad7);
        sp=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sounds = new int[9];
        sounds[0] = sp.load(context,R.raw.birdd,1);
        sounds[1] = sp.load(context,R.raw.beee,1);
        sounds[2] = sp.load(context,R.raw.catt,1);
        sounds[3] = sp.load(context,R.raw.chickenn,1);
        sounds[4] = sp.load(context,R.raw.coww,1);
        sounds[5] = sp.load(context,R.raw.dogg,1);
        sounds[6] = sp.load(context,R.raw.donkeyy,1);
        sounds[7] = sp.load(context,R.raw.duckk,1);
        sounds[8] = sp.load(context,R.raw.elephantt,1);

        Bitmap buttermilk=BitmapFactory.decodeResource(getResources(),R.drawable.buttermilk);
        Bitmap coffee=BitmapFactory.decodeResource(getResources(),R.drawable.coffee);
        Bitmap coke=BitmapFactory.decodeResource(getResources(),R.drawable.coke);
        Bitmap juice=BitmapFactory.decodeResource(getResources(),R.drawable.juice);
        Bitmap lemonade=BitmapFactory.decodeResource(getResources(),R.drawable.lemonade);
        Bitmap milk=BitmapFactory.decodeResource(getResources(),R.drawable.milk);
        Bitmap tea=BitmapFactory.decodeResource(getResources(),R.drawable.tea);
        Bitmap soda =BitmapFactory.decodeResource(getResources(),R.drawable.soda);
        Bitmap water=BitmapFactory.decodeResource(getResources(),R.drawable.water);

        final ArrayList<Bitmap> drinks = new ArrayList<>();

        drinks.add(buttermilk);
        drinks.add(coffee);
        drinks.add(coke);
        drinks.add(juice);
        drinks.add(lemonade);
        drinks.add(milk);
        drinks.add(soda);
        drinks.add(tea);
        drinks.add(water);



        

        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 9){
                    i =0;
                }

                orta.setImageBitmap(drinks.get(i));
                ad7.setText(adlar[i]);
                sp.play(sounds[i],100,100,1,0,1);
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=9;
                }
                i--;
                orta.setImageBitmap(drinks.get(i));
                ad7.setText(adlar[i]);
                sp.play(sounds[i],100,100,1,0,1);
            }
        });





        sp.play(sounds[0],100,100,1,0,1);





    }
}
