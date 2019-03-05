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

public class VucutLearning extends AppCompatActivity {
    int i = 0;
    Context context=this;
    public static SoundPool sp;
    public static int[] sounds ;

    private String[] adlar = {"arm", "ear", "eye","finger", "foot", "hair","hand", "head", "knee","leg", "mouth", "nose","tooth"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vucut_learning);
        final ImageView orta=findViewById(R.id.vucutorta);
        ImageView sag=findViewById(R.id.vucutsag);
        ImageView sol=findViewById(R.id.vucutsol);
        final TextView ad=findViewById(R.id.ad8);
        sp=new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        sounds = new int[13];
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


        Bitmap arm=BitmapFactory.decodeResource(getResources(),R.drawable.arm);
        Bitmap ear=BitmapFactory.decodeResource(getResources(),R.drawable.ear);
        Bitmap eye=BitmapFactory.decodeResource(getResources(),R.drawable.eye);
        Bitmap finger=BitmapFactory.decodeResource(getResources(),R.drawable.finger);
        Bitmap foot=BitmapFactory.decodeResource(getResources(),R.drawable.foot);
        Bitmap hair=BitmapFactory.decodeResource(getResources(),R.drawable.hair);
        Bitmap hand=BitmapFactory.decodeResource(getResources(),R.drawable.hand);
        Bitmap head=BitmapFactory.decodeResource(getResources(),R.drawable.head);
        Bitmap knee=BitmapFactory.decodeResource(getResources(),R.drawable.knee);
        Bitmap leg=BitmapFactory.decodeResource(getResources(),R.drawable.leg);
        Bitmap mouth=BitmapFactory.decodeResource(getResources(),R.drawable.mouth);
        Bitmap nose=BitmapFactory.decodeResource(getResources(),R.drawable.nose);
        Bitmap tooth=BitmapFactory.decodeResource(getResources(),R.drawable.toothh);
        final ArrayList<Bitmap> vucut = new ArrayList<>();
        vucut.add(arm);
        vucut.add(ear);
        vucut.add(eye);
        vucut.add(finger);
        vucut.add(foot);
        vucut.add(hair);
        vucut.add(hand);
        vucut.add(head);
        vucut.add(knee);
        vucut.add(leg);
        vucut.add(mouth);
        vucut.add(nose);
        vucut.add(tooth);

        sp.play(sounds[0],100,100,1,0,1);

        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 13){
                    i =0;
                }


                orta.setImageBitmap(vucut.get(i));
                sp.play(sounds[i],100,100,1,0,1);
                ad.setText(adlar[i]);
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if (i == 13){
                    i =0;
                }


                orta.setImageBitmap(vucut.get(i));
                sp.play(sounds[i],100,100,1,0,1);
                ad.setText(adlar[i]);
            }
        });



    }
}
