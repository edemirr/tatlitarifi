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

import java.util.ArrayList;

public class SayilarLearning extends AppCompatActivity {


    int i = 0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar_learning);
        final ImageView ortaresim=findViewById(R.id.ortaresim);
        final ImageView sagaokk = findViewById(R.id.sagaok);
        final ImageView solaokk = findViewById(R.id.solaok);





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


        sagaokk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if (i == 11){
                    i =0;
                }

                ortaresim.setImageBitmap(sayilarpics.get(i));


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


            }
        });


    }

    public void sesver(View view){}


}
