package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class food_food extends AppCompatActivity {

    Context context=this;
    public static SoundPool sp;
    public static int[] sounds ;

    int i = 0;
    private String[] adlar = {"bread", "cake","cheese", "chocolate",
            "egg","fries", "honey","icecream", "meatball","olive","pasta","salad","soup","yoghurt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_food);

        final ImageView orta=findViewById(R.id.orta) ;
        final ImageView sag=findViewById(R.id.fofosag);
        ImageView sol=findViewById(R.id.fofosol);
        final TextView ad6=findViewById(R.id.ad6);
        sp=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sounds = new int[14];
        sounds[0] = sp.load(context,R.raw.birdd,1);
        sounds[1] = sp.load(context,R.raw.beee,1);
        sounds[2] = sp.load(context,R.raw.catt,1);
        sounds[3] = sp.load(context,R.raw.chickenn,1);
        sounds[4] = sp.load(context,R.raw.coww,1);
        sounds[5] = sp.load(context,R.raw.dogg,1);
        sounds[6] = sp.load(context,R.raw.donkeyy,1);
        sounds[7] = sp.load(context,R.raw.duckk,1);
        sounds[8] = sp.load(context,R.raw.elephantt,1);
        sounds[9] = sp.load(context,R.raw.fishh,1);
        sounds[10] = sp.load(context,R.raw.goatt,1);
        sounds[11] = sp.load(context,R.raw.horsee,1);
        sounds[12] = sp.load(context,R.raw.kangrooo,1);
        sounds[13] = sp.load(context,R.raw.lionn,1);

        Bitmap bread=BitmapFactory.decodeResource(getResources(),R.drawable.bread);
        Bitmap cake=BitmapFactory.decodeResource(getResources(),R.drawable.cakee);
        Bitmap cheese=BitmapFactory.decodeResource(getResources(),R.drawable.cheese);
        Bitmap choco=BitmapFactory.decodeResource(getResources(),R.drawable.chocolate);
        Bitmap egg=BitmapFactory.decodeResource(getResources(),R.drawable.eg);
        Bitmap fries=BitmapFactory.decodeResource(getResources(),R.drawable.fries);
        Bitmap honey=BitmapFactory.decodeResource(getResources(),R.drawable.honey);
        Bitmap icecream=BitmapFactory.decodeResource(getResources(),R.drawable.icecreamm);
        Bitmap meatball=BitmapFactory.decodeResource(getResources(),R.drawable.meatball);
        Bitmap olive=BitmapFactory.decodeResource(getResources(),R.drawable.olive);
        Bitmap pasta=BitmapFactory.decodeResource(getResources(),R.drawable.pasta);
        Bitmap salad=BitmapFactory.decodeResource(getResources(),R.drawable.salad);
        Bitmap soup=BitmapFactory.decodeResource(getResources(),R.drawable.soup);
        Bitmap yoghurt=BitmapFactory.decodeResource(getResources(),R.drawable.yoghurt);


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
                ad6.setText(adlar[i]);
                sp.play(sounds[i],100,100,1,0,1);
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
                ad6.setText(adlar[i]);
                sp.play(sounds[i],100,100,1,0,1);
            }
        });




        sp.play(sounds[0],100,100,1,0,1);









    }
}
