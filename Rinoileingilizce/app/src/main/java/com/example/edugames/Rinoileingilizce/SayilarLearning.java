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

import java.util.ArrayList;

public class SayilarLearning extends AppCompatActivity {

    Context context=this;
    public static SoundPool sp1;
    int i = 0;
    public static int[] sounds ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar_learning);
        final ImageView ortaresim=findViewById(R.id.ortaresim);
        ImageView sagaokk = findViewById(R.id.sagaok);
        ImageView solaokk = findViewById(R.id.solaok);

        sp1=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sounds = new int[11];

        sounds[0] = sp1.load(context,R.raw.one,1);
        sounds[1] = sp1.load(context,R.raw.two,1);
       sounds[2] = sp1.load(context,R.raw.three,1);
        sounds[3] = sp1.load(context,R.raw.four,1);
        sounds[4] = sp1.load(context,R.raw.five,1);
        sounds[5] = sp1.load(context,R.raw.six,1);
        sounds[6] = sp1.load(context,R.raw.seven,1);
        sounds[7] = sp1.load(context,R.raw.eight,1);
        sounds[8] = sp1.load(context,R.raw.nine,1);
        sounds[9] = sp1.load(context,R.raw.ten,1);
        sounds[10] = sp1.load(context,R.raw.zero,1);


        Bitmap one = BitmapFactory.decodeResource(getResources(),R.drawable.one);
        Bitmap two = BitmapFactory.decodeResource(getResources(),R.drawable.two);
        Bitmap three = BitmapFactory.decodeResource(getResources(),R.drawable.three);
        Bitmap four = BitmapFactory.decodeResource(getResources(),R.drawable.four);
        Bitmap five = BitmapFactory.decodeResource(getResources(),R.drawable.five);
        Bitmap six = BitmapFactory.decodeResource(getResources(),R.drawable.six);
        Bitmap seven = BitmapFactory.decodeResource(getResources(),R.drawable.seven);
        Bitmap eight = BitmapFactory.decodeResource(getResources(),R.drawable.eight);
        Bitmap nine = BitmapFactory.decodeResource(getResources(),R.drawable.nine);
        Bitmap ten = BitmapFactory.decodeResource(getResources(),R.drawable.ten);
        Bitmap zero = BitmapFactory.decodeResource(getResources(),R.drawable.zero);

        final ArrayList<Bitmap> sayilarpics = new ArrayList<>();

        sayilarpics.add(one);
        sayilarpics.add(two);
        sayilarpics.add(three);
        sayilarpics.add(four);
        sayilarpics.add(five);
        sayilarpics.add(six);
        sayilarpics.add(seven);
        sayilarpics.add(eight);
        sayilarpics.add(nine);
        sayilarpics.add(ten);
        sayilarpics.add(zero);

       sp1.play(sounds[0],100,100,1,0,1);

        sagaokk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if (i == 11){
                    i =0;
                }
                ortaresim.setImageBitmap(sayilarpics.get(i));
                sp1.play(sounds[i],100,100,1,0,1);
            }
        });

        solaokk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=11;
                }
                i--;
                ortaresim.setImageBitmap(sayilarpics.get(i));
               sp1.play(sounds[i],100,100,1,0,1);
            }
        });

    }public void sesver(View view){
        sp1.play(sounds[i],100,100,1,0,1);
    }
   /* @Override
    protected void onPause(){
        super.onPause();
        sp1.release();
        sp1=null;
    }*/
}
