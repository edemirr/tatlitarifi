package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RenklerLearning extends AppCompatActivity {

    Context context=this;
    MediaPlayer np;
    int i = 0;
    final int[] sounds = new int [] {
            R.raw.black,R.raw.brown,R.raw.red,R.raw.orange,R.raw.yellow,R.raw.green,R.raw.blue,R.raw.purple,R.raw.pink,R.raw.white
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renkler_learning);


        final ImageView renkorta=findViewById(R.id.renkorta) ;
        ImageView renksag=findViewById(R.id.renksag);
        ImageView renksol=findViewById(R.id.renksol);
        np=MediaPlayer.create(context,sounds[i]);

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

                try {
                    i++;
                    if (i == 10){
                        i =0;
                    }

                    renkorta.setImageBitmap(renkler.get(i));

                    if (np.isPlaying()) {
                        np.stop();
                        np.release();
                        np = MediaPlayer.create(context,sounds[i]);
                    } np.start();
                } catch(Exception e) { e.printStackTrace(); }

            }
        });

        renksol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    if(i==0){
                        i=10;
                    }
                    i--;
                    renkorta.setImageBitmap(renkler.get(i));

                    if (np.isPlaying()) {
                        np.stop();
                        np.release();
                        np = MediaPlayer.create(context,sounds[i]);
                    } np.start();
                } catch(Exception e) { e.printStackTrace(); }


            }
        });

        np=MediaPlayer.create(context,sounds[0]);
        np.start();


    }
    public void sesver(View view){
        try {
            if (np.isPlaying()) {
                np.stop();
                np.release();
                np = MediaPlayer.create(context,sounds[i]);
            } np.start();
        }
        catch(Exception e) { e.printStackTrace(); }


    }
}
