package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SayilarLearning extends AppCompatActivity {
    Context context=this;
    public static SoundPool sp;
    public static int[] sounds ;

    int i = 0;



    private String[] adlar = {"one", "two","three", "four","five", "six", "seven","eight", "nine","zer0" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar_learning);
        final ImageView ortaresim=findViewById(R.id.ortaresim);
        final ImageView sagaokk = findViewById(R.id.sagaok);
        final ImageView solaokk = findViewById(R.id.solaok);
        final TextView ad3=findViewById(R.id.ad3);

        sp=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sounds = new int[10];
        sounds[0] = sp.load(context,R.raw.one,1);
        sounds[1] = sp.load(context,R.raw.two,1);
        sounds[2] = sp.load(context,R.raw.three,1);
        sounds[3] = sp.load(context,R.raw.four,1);
        sounds[4] = sp.load(context,R.raw.five,1);
        sounds[5] = sp.load(context,R.raw.six,1);
        sounds[6] = sp.load(context,R.raw.seven,1);
        sounds[7] = sp.load(context,R.raw.eight,1);
        sounds[8] = sp.load(context,R.raw.nine,1);
        sounds[9] = sp.load(context,R.raw.zero,1);





        Bitmap one = BitmapFactory.decodeResource(getResources(),R.drawable.one);
        Bitmap two = BitmapFactory.decodeResource(getResources(),R.drawable.two);
        Bitmap three = BitmapFactory.decodeResource(getResources(),R.drawable.three);
        Bitmap four = BitmapFactory.decodeResource(getResources(),R.drawable.four);
        Bitmap five = BitmapFactory.decodeResource(getResources(),R.drawable.five);
        Bitmap six = BitmapFactory.decodeResource(getResources(),R.drawable.six);
        Bitmap seven = BitmapFactory.decodeResource(getResources(),R.drawable.seven);
        Bitmap eight = BitmapFactory.decodeResource(getResources(),R.drawable.eight);
        Bitmap nine = BitmapFactory.decodeResource(getResources(),R.drawable.nine);
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
        sayilarpics.add(zero);
        sp.play(sounds[0],100,100,1,0,1);

        sagaokk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if (i == 10){
                    i =0;
                }

                ortaresim.setImageBitmap(sayilarpics.get(i));
                sp.play(sounds[i],100,100,1,0,1);
                ad3.setText(adlar[i]);


            }
        });

        solaokk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    i=10;
                }
                i--;
                ortaresim.setImageBitmap(sayilarpics.get(i));
                sp.play(sounds[i],100,100,1,0,1);
                ad3.setText(adlar[i]);

            }
        });


    }

    public void sesver(View view){}


}
