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

import static com.example.edugames.Rinoileingilizce.R.raw.kangrooo;

public class HayvanlarLearning extends AppCompatActivity {

    Context context=this;
    MediaPlayer np;
    int i = 0;
    final int[] sounds = new int [] {
            R.raw.birdd,R.raw.beee,R.raw.catt, R.raw.chickenn, R.raw.coww,R.raw.dogg,R.raw.donkeyy,R.raw.duckk,R.raw.elephantt,
            R.raw.fishh,R.raw.goatt,R.raw.horsee,R.raw.kangrooo,R.raw.lionn,R.raw.monkeyy,R.raw.rabbitt,R.raw.turtlee,R.raw.zebraa
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanlar_learning);

        final ImageView hayvanorta=findViewById(R.id.hayvanorta);
        ImageView hayvansag=findViewById(R.id.hayvansag);
        ImageView hayvansol=findViewById(R.id.hayvansol);
        np=MediaPlayer.create(context,sounds[i]);

        Bitmap bee= BitmapFactory.decodeResource(getResources(),R.drawable.beee);
        Bitmap bird=BitmapFactory.decodeResource(getResources(),R.drawable.bird);
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
        hayvanlar.add(turtle);
        hayvanlar.add(zebra);

        hayvansag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if (i == 18){
                    i =0;
                }

                hayvanorta.setImageBitmap(hayvanlar.get(i));

                try {
                    if (np.isPlaying()) {
                        np.stop();
                        np.release();
                        np = MediaPlayer.create(context,sounds[i]);
                    } np.start();
                } catch(Exception e) { e.printStackTrace(); }


            }
        });


        hayvansol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i==0){
                    i=18;
                }
                i--;
                hayvanorta.setImageBitmap(hayvanlar.get(i));

                try {
                    if (np.isPlaying()) {
                        np.stop();
                        np.release();
                        np = MediaPlayer.create(context, sounds[i]);
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
                np = MediaPlayer.create(context, sounds[i]);
            } np.start();
        } catch(Exception e) { e.printStackTrace(); }



    }
}
