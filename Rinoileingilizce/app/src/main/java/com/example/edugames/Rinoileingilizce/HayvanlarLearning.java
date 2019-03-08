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

import java.io.IOException;
import java.util.ArrayList;

import static com.example.edugames.Rinoileingilizce.R.raw.kangrooo;

public class HayvanlarLearning extends AppCompatActivity {

    Context context=this;
    public static SoundPool sp;    int i = 0;
    public static int[] sounds ;

    private String[] adlar = {"bird", "bee", "cat","chicken", "cow", "dog","donkey", "duck", "elephant","fish", "goat", "horse","kangroo", "lion", "monkey",
            "rabbit","snake", "turtle", "zebra"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanlar_learning);
        final ImageView hayvanorta=findViewById(R.id.hayvanorta);
        ImageView hayvansag=findViewById(R.id.hayvansag);
        ImageView hayvansol=findViewById(R.id.hayvansol);
        final TextView ad=findViewById(R.id.ad);


        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        sp=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sounds = new int[19];
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
        sounds[14] = sp.load(context,R.raw.monkeyy,1);
        sounds[15] = sp.load(context,R.raw.rabbitt,1);
        sounds[16] = sp.load(context,R.raw.lionn,1);
        sounds[17] = sp.load(context,R.raw.turtlee,1);
        sounds[18] = sp.load(context,R.raw.zebraa,1);


        Bitmap bird=BitmapFactory.decodeResource(getResources(),R.drawable.bird);
        Bitmap bee=BitmapFactory.decodeResource(getResources(),R.drawable.beee);
        Bitmap cat=BitmapFactory.decodeResource(getResources(),R.drawable.catt);
        Bitmap chicken=BitmapFactory.decodeResource(getResources(),R.drawable.chicken);
        Bitmap cow=BitmapFactory.decodeResource(getResources(),R.drawable.cow);
        Bitmap dog=BitmapFactory.decodeResource(getResources(),R.drawable.dogg);
        Bitmap donkey=BitmapFactory.decodeResource(getResources(),R.drawable.donkey);
        Bitmap duck=BitmapFactory.decodeResource(getResources(),R.drawable.duck);
        Bitmap elephant=BitmapFactory.decodeResource(getResources(),R.drawable.elephantt);
        Bitmap fish=BitmapFactory.decodeResource(getResources(),R.drawable.fishh);
        Bitmap goat=BitmapFactory.decodeResource(getResources(),R.drawable.goat);
        Bitmap horse=BitmapFactory.decodeResource(getResources(),R.drawable.horsee);
        Bitmap kangroo=BitmapFactory.decodeResource(getResources(),R.drawable.kangrooo);
        Bitmap lion=BitmapFactory.decodeResource(getResources(),R.drawable.lion);
        Bitmap monkey=BitmapFactory.decodeResource(getResources(),R.drawable.monkeyy);
        Bitmap rabbit=BitmapFactory.decodeResource(getResources(),R.drawable.rabbitt);
        Bitmap snake= BitmapFactory.decodeResource(getResources(),R.drawable.snake);
        Bitmap turtle=BitmapFactory.decodeResource(getResources(),R.drawable.turtle);
        Bitmap zebra=BitmapFactory.decodeResource(getResources(),R.drawable.zebraa);

        final ArrayList<Bitmap> hayvanlar = new ArrayList<>();

        hayvanlar.add(bird);
        hayvanlar.add(bee);
        hayvanlar.add(cat);
        hayvanlar.add(chicken);
        hayvanlar.add(cow);
        hayvanlar.add(dog);
        hayvanlar.add(donkey);
        hayvanlar.add(duck);
        hayvanlar.add(elephant);
        hayvanlar.add(fish);
        hayvanlar.add(goat);
        hayvanlar.add(horse);
        hayvanlar.add(kangroo);
        hayvanlar.add(lion);
        hayvanlar.add(monkey);
        hayvanlar.add(rabbit);
        hayvanlar.add(snake);
        hayvanlar.add(turtle);
        hayvanlar.add(zebra);

        sp.play(sounds[0],100,100,1,0,1);

        hayvansag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if (i == 19){
                    i =0;
                }
                hayvanorta.setImageBitmap(hayvanlar.get(i));
                sp.play(sounds[i],100,100,1,0,1);
                ad.setText(adlar[i]);

            }
        });


        hayvansol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i==0){
                    i=19;
                }
                i--;

                hayvanorta.setImageBitmap(hayvanlar.get(i));
                sp.play(sounds[i],100,100,1,0,1);
                ad.setText(adlar[i]);
             }
        });

    }

    public void sesver(View view){
        sp.play(sounds[i],100,100,1,0,1);
    }
    @Override
    protected void onPause(){
        super.onPause();
        sp.release();
        sp=null;
    }
}
