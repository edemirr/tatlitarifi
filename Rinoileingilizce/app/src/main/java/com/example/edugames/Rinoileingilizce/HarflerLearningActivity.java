package com.example.edugames.Rinoileingilizce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class HarflerLearningActivity extends AppCompatActivity {


      int i = 0;


ImageView orta;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler_learning);


        ImageView prevok = findViewById(R.id.solaok);
        final ImageView nextok = findViewById(R.id.sagaok);
        orta=findViewById(R.id.harforta);





        Bitmap a = BitmapFactory.decodeResource(getResources(),R.drawable.a);
        Bitmap b = BitmapFactory.decodeResource(getResources(),R.drawable.b);
        Bitmap c = BitmapFactory.decodeResource(getResources(),R.drawable.c);
        Bitmap d = BitmapFactory.decodeResource(getResources(),R.drawable.d);
        Bitmap e = BitmapFactory.decodeResource(getResources(),R.drawable.e);
        Bitmap f = BitmapFactory.decodeResource(getResources(),R.drawable.f);
        Bitmap g = BitmapFactory.decodeResource(getResources(),R.drawable.g);
        Bitmap h = BitmapFactory.decodeResource(getResources(),R.drawable.h);
        Bitmap ii = BitmapFactory.decodeResource(getResources(),R.drawable.i);
        Bitmap j = BitmapFactory.decodeResource(getResources(),R.drawable.j);
        Bitmap k = BitmapFactory.decodeResource(getResources(),R.drawable.k);
        Bitmap l = BitmapFactory.decodeResource(getResources(),R.drawable.l);
        Bitmap m = BitmapFactory.decodeResource(getResources(),R.drawable.m);
        Bitmap n = BitmapFactory.decodeResource(getResources(),R.drawable.n);
        Bitmap o = BitmapFactory.decodeResource(getResources(),R.drawable.o);
        Bitmap p = BitmapFactory.decodeResource(getResources(),R.drawable.p);
        Bitmap q = BitmapFactory.decodeResource(getResources(),R.drawable.q);
        Bitmap r = BitmapFactory.decodeResource(getResources(),R.drawable.r);
        Bitmap s = BitmapFactory.decodeResource(getResources(),R.drawable.s);
        Bitmap t = BitmapFactory.decodeResource(getResources(),R.drawable.t);
        Bitmap u = BitmapFactory.decodeResource(getResources(),R.drawable.u);
        Bitmap v = BitmapFactory.decodeResource(getResources(),R.drawable.v);
        Bitmap w = BitmapFactory.decodeResource(getResources(),R.drawable.w);
        Bitmap x = BitmapFactory.decodeResource(getResources(),R.drawable.x);
        Bitmap y = BitmapFactory.decodeResource(getResources(),R.drawable.y);
        Bitmap z = BitmapFactory.decodeResource(getResources(),R.drawable.z);
        orta.setImageBitmap(a);
        final ArrayList<Bitmap> pics = new ArrayList<>();
        pics.add(a);
        pics.add(b);
        pics.add(c);
        pics.add(d);
        pics.add(e);
        pics.add(f);
        pics.add(g);
        pics.add(h);
        pics.add(ii);
        pics.add(j);
        pics.add(k);
        pics.add(l);
        pics.add(m);
        pics.add(n);
        pics.add(o);
        pics.add(p);
        pics.add(q);
        pics.add(r);
        pics.add(s);
        pics.add(t);
        pics.add(u);
        pics.add(v);
        pics.add(w);
        pics.add(x);
        pics.add(y);
        pics.add(z);

















        nextok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if (i == 26){
                    i =0;
                }

                orta.setImageBitmap(pics.get(i));

            }
        });



        prevok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               if(i==0){
                   i=26;
               }
                i--;

                orta.setImageBitmap(pics.get(i));


            }

        });

    }


}
















