package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RenklerLearning extends AppCompatActivity {

    Context context=this;

    public static SoundPool sp;
    int i = 0;
    public static int[] sounds;

        @Override
    protected void onPause(){
        super.onPause();
        sp.release();
        sp=null;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renkler_learning);

        sp=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sounds = new int[10];
        sounds[0] = sp.load(context,R.raw.black,1);
        sounds[1] = sp.load(context,R.raw.brown,1);
        sounds[2] = sp.load(context,R.raw.red,1);
        sounds[3] = sp.load(context,R.raw.orange,1);
        sounds[4] = sp.load(context,R.raw.yellow,1);
        sounds[5] = sp.load(context,R.raw.green,1);
        sounds[6] = sp.load(context,R.raw.blue,1);
        sounds[7] = sp.load(context,R.raw.purple,1);
        sounds[8] = sp.load(context,R.raw.pink,1);
        sounds[9] = sp.load(context,R.raw.white,1);



        final ImageView renkorta=findViewById(R.id.renkorta) ;
        final ImageView renksag=findViewById(R.id.renksag);
        ImageView renksol=findViewById(R.id.renksol);


        Bitmap red=BitmapFactory.decodeResource(getResources(),R.drawable.red);
        Bitmap orange=BitmapFactory.decodeResource(getResources(),R.drawable.orange);
        Bitmap yellow=BitmapFactory.decodeResource(getResources(),R.drawable.yellow);
        Bitmap green=BitmapFactory.decodeResource(getResources(),R.drawable.green);
        Bitmap blue=BitmapFactory.decodeResource(getResources(),R.drawable.blue);
        Bitmap purple=BitmapFactory.decodeResource(getResources(),R.drawable.purple);
        Bitmap pink=BitmapFactory.decodeResource(getResources(),R.drawable.pink);
        Bitmap brown=BitmapFactory.decodeResource(getResources(),R.drawable.brown);
        Bitmap black=BitmapFactory.decodeResource(getResources(),R.drawable.blcak);
        Bitmap white=BitmapFactory.decodeResource(getResources(),R.drawable.white);

        final ArrayList<Bitmap> renkler = new ArrayList<>();

        renkler.add(black);
        renkler.add(brown);
        renkler.add(red);
        renkler.add(orange);
        renkler.add(yellow);
        renkler.add(green);
        renkler.add(blue);
        renkler.add(purple);
        renkler.add(pink);
        renkler.add(white);



        renksag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                     i++;
                    if (i == 10){
                        i =0;
                    }


                    renkorta.setImageBitmap(renkler.get(i));
                    sp.play(sounds[i],100,100,1,0,1);


            }
        });

        renksol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    if(i==0){
                        i=10;
                    }
                    i--;

                    renkorta.setImageBitmap(renkler.get(i));

                sp.play(sounds[i],100,100,1,0,1);


            }
        });

        sp.play(sounds[0],100,100,1,0,1);



    }


    public void sesver(View view) {


        sp.play(sounds[i],100,100,1,0,1);

    }

}
