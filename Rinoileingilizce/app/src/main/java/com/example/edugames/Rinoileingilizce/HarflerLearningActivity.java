package com.example.edugames.Rinoileingilizce;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class HarflerLearningActivity extends AppCompatActivity {


      int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler_learning);

        final ImageView image1 = findViewById(R.id.holder1);
        final ImageView image2 = findViewById(R.id.holder2);
        final ImageView image3 = findViewById(R.id.holder3);
        final ImageView image4 = findViewById(R.id.harfholder);
        ImageView prevok = findViewById(R.id.solaok);
        final ImageView nextok = findViewById(R.id.sagaok);


        Bitmap aa =BitmapFactory.decodeResource(getResources(),R.drawable.a);
        Bitmap bb =BitmapFactory.decodeResource(getResources(),R.drawable.bb);
        Bitmap cc =BitmapFactory.decodeResource(getResources(),R.drawable.cc);
        Bitmap dd =BitmapFactory.decodeResource(getResources(),R.drawable.dd);
        Bitmap ee =BitmapFactory.decodeResource(getResources(),R.drawable.ee);
        Bitmap ff =BitmapFactory.decodeResource(getResources(),R.drawable.ff);
        Bitmap gg =BitmapFactory.decodeResource(getResources(),R.drawable.gg);
        Bitmap hh =BitmapFactory.decodeResource(getResources(),R.drawable.hh);
        Bitmap ii =BitmapFactory.decodeResource(getResources(),R.drawable.ii);
        Bitmap jj =BitmapFactory.decodeResource(getResources(),R.drawable.jj);
        Bitmap kk =BitmapFactory.decodeResource(getResources(),R.drawable.kk);
        Bitmap ll =BitmapFactory.decodeResource(getResources(),R.drawable.ll);
        Bitmap mm =BitmapFactory.decodeResource(getResources(),R.drawable.mm);
        Bitmap nn =BitmapFactory.decodeResource(getResources(),R.drawable.nn);
        Bitmap oo =BitmapFactory.decodeResource(getResources(),R.drawable.oo);
        Bitmap pp =BitmapFactory.decodeResource(getResources(),R.drawable.pp);
        Bitmap qq =BitmapFactory.decodeResource(getResources(),R.drawable.qq);
        Bitmap rr =BitmapFactory.decodeResource(getResources(),R.drawable.rr);
        Bitmap ss =BitmapFactory.decodeResource(getResources(),R.drawable.ss);
        Bitmap tt =BitmapFactory.decodeResource(getResources(),R.drawable.tt);
        Bitmap uu =BitmapFactory.decodeResource(getResources(),R.drawable.uu);
        Bitmap vv =BitmapFactory.decodeResource(getResources(),R.drawable.vv);
        Bitmap ww =BitmapFactory.decodeResource(getResources(),R.drawable.ww);
        Bitmap xx =BitmapFactory.decodeResource(getResources(),R.drawable.xx);
        Bitmap yy =BitmapFactory.decodeResource(getResources(),R.drawable.yy);
        Bitmap zz =BitmapFactory.decodeResource(getResources(),R.drawable.zz);





        Bitmap astronot=BitmapFactory.decodeResource(getResources(),R.drawable.astronot);
        Bitmap airplane=BitmapFactory.decodeResource(getResources(),R.drawable.airplane);
        Bitmap apple=BitmapFactory.decodeResource(getResources(),R.drawable.apple);
        Bitmap baby = BitmapFactory.decodeResource(getResources(), R.drawable.baby);
        Bitmap ball = BitmapFactory.decodeResource(getResources(), R.drawable.ball);
        Bitmap bee = BitmapFactory.decodeResource(getResources(), R.drawable.bee);
        Bitmap car = BitmapFactory.decodeResource(getResources(), R.drawable.car);
        Bitmap cake = BitmapFactory.decodeResource(getResources(), R.drawable.cake);
        Bitmap cat = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        Bitmap doll = BitmapFactory.decodeResource(getResources(), R.drawable.doll);
        Bitmap drum = BitmapFactory.decodeResource(getResources(), R.drawable.drum);
        Bitmap dog = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
        Bitmap elephant = BitmapFactory.decodeResource(getResources(), R.drawable.elephant);
        Bitmap earth = BitmapFactory.decodeResource(getResources(), R.drawable.earth);
        Bitmap egg = BitmapFactory.decodeResource(getResources(), R.drawable.egg);
        Bitmap flower = BitmapFactory.decodeResource(getResources(), R.drawable.flower);
        Bitmap fire = BitmapFactory.decodeResource(getResources(), R.drawable.fire);
        Bitmap fish = BitmapFactory.decodeResource(getResources(), R.drawable.fish);
        Bitmap gift = BitmapFactory.decodeResource(getResources(), R.drawable.gift);
        Bitmap giraffe = BitmapFactory.decodeResource(getResources(), R.drawable.giraffe);
        Bitmap guitar = BitmapFactory.decodeResource(getResources(), R.drawable.guitar);
        Bitmap hamburger = BitmapFactory.decodeResource(getResources(), R.drawable.hamburger1);
        Bitmap horse = BitmapFactory.decodeResource(getResources(), R.drawable.horse);
        Bitmap home = BitmapFactory.decodeResource(getResources(), R.drawable.house);
        Bitmap icecream = BitmapFactory.decodeResource(getResources(), R.drawable.icecream);
        Bitmap iron = BitmapFactory.decodeResource(getResources(), R.drawable.iron);
        Bitmap island = BitmapFactory.decodeResource(getResources(), R.drawable.island);
        Bitmap jacket = BitmapFactory.decodeResource(getResources(), R.drawable.jacket);
        Bitmap jeep = BitmapFactory.decodeResource(getResources(), R.drawable.jeep);
        Bitmap jelybean = BitmapFactory.decodeResource(getResources(), R.drawable.jellybeans2);
        Bitmap kangroo = BitmapFactory.decodeResource(getResources(), R.drawable.kangroo);
        Bitmap kid = BitmapFactory.decodeResource(getResources(), R.drawable.kids2);
        Bitmap key = BitmapFactory.decodeResource(getResources(), R.drawable.keys);
        Bitmap lamp = BitmapFactory.decodeResource(getResources(), R.drawable.lamp);
        Bitmap leaf = BitmapFactory.decodeResource(getResources(), R.drawable.leaf3);
        Bitmap lock = BitmapFactory.decodeResource(getResources(), R.drawable.lock2);
        Bitmap milk = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3);
        Bitmap monkey = BitmapFactory.decodeResource(getResources(), R.drawable.moon2);
        Bitmap moon = BitmapFactory.decodeResource(getResources(), R.drawable.milk2);
        Bitmap nail = BitmapFactory.decodeResource(getResources(),R.drawable.nail);
        Bitmap nurse = BitmapFactory.decodeResource(getResources(),R.drawable.nurse2);
        Bitmap note = BitmapFactory.decodeResource(getResources(),R.drawable.note);
        Bitmap octopus = BitmapFactory.decodeResource(getResources(),R.drawable.octopus);
        Bitmap onion = BitmapFactory.decodeResource(getResources(),R.drawable.onion);
        Bitmap owl = BitmapFactory.decodeResource(getResources(),R.drawable.owl2);
        Bitmap pencil = BitmapFactory.decodeResource(getResources(),R.drawable.pencil);
        Bitmap pizza = BitmapFactory.decodeResource(getResources(),R.drawable.pizza);
        Bitmap potato = BitmapFactory.decodeResource(getResources(),R.drawable.potato);
        Bitmap quarter = BitmapFactory.decodeResource(getResources(),R.drawable.quater);
        Bitmap quiet = BitmapFactory.decodeResource(getResources(),R.drawable.quiet);
        Bitmap quilt = BitmapFactory.decodeResource(getResources(),R.drawable.quilt);
        Bitmap rabbit = BitmapFactory.decodeResource(getResources(),R.drawable.rabbit);
        Bitmap rainbow = BitmapFactory.decodeResource(getResources(),R.drawable.rainbow);
        Bitmap robot = BitmapFactory.decodeResource(getResources(),R.drawable.robot1);
        Bitmap sun = BitmapFactory.decodeResource(getResources(),R.drawable.sun);
        Bitmap spoon = BitmapFactory.decodeResource(getResources(),R.drawable.spoon);
        Bitmap sheep = BitmapFactory.decodeResource(getResources(),R.drawable.sheep);
        Bitmap tent = BitmapFactory.decodeResource(getResources(),R.drawable.tent);
        Bitmap tooth = BitmapFactory.decodeResource(getResources(),R.drawable.tooth);
        Bitmap toy = BitmapFactory.decodeResource(getResources(),R.drawable.toy);
        Bitmap umbrella = BitmapFactory.decodeResource(getResources(),R.drawable.umbrealla);
        Bitmap unicorn = BitmapFactory.decodeResource(getResources(),R.drawable.unicorn);
        Bitmap uniform = BitmapFactory.decodeResource(getResources(),R.drawable.uniform);
        Bitmap vegetable = BitmapFactory.decodeResource(getResources(),R.drawable.vegetable);
        Bitmap violin = BitmapFactory.decodeResource(getResources(),R.drawable.violin);
        Bitmap volcano = BitmapFactory.decodeResource(getResources(),R.drawable.volcano);
        Bitmap watermelon = BitmapFactory.decodeResource(getResources(),R.drawable.watermelon);
        Bitmap wheel = BitmapFactory.decodeResource(getResources(),R.drawable.wheel);
        Bitmap window = BitmapFactory.decodeResource(getResources(),R.drawable.window);
        Bitmap ax = BitmapFactory.decodeResource(getResources(),R.drawable.ax);
        Bitmap xylophone = BitmapFactory.decodeResource(getResources(),R.drawable.xylophone);
        Bitmap xray = BitmapFactory.decodeResource(getResources(),R.drawable.xray);
        Bitmap yacht = BitmapFactory.decodeResource(getResources(),R.drawable.yacht);
        Bitmap yoyo = BitmapFactory.decodeResource(getResources(),R.drawable.yoyo);
        Bitmap yogurt = BitmapFactory.decodeResource(getResources(),R.drawable.yogurt);
        Bitmap zebra = BitmapFactory.decodeResource(getResources(),R.drawable.zebra);
        Bitmap zipper = BitmapFactory.decodeResource(getResources(),R.drawable.zipper);
        Bitmap zoo = BitmapFactory.decodeResource(getResources(),R.drawable.zoo);


        final ArrayList<Bitmap> pics1 = new ArrayList<>();
        final ArrayList<Bitmap> pics2 = new ArrayList<>();
        final ArrayList<Bitmap> pics3 = new ArrayList<>();
        final ArrayList<Bitmap> picsorta = new ArrayList<>();




        pics1.add(astronot);
        pics1.add(baby);
        pics1.add(cake);
        pics1.add(dog);
        pics1.add(earth);
        pics1.add(fire);
        pics1.add(gift);
        pics1.add(hamburger);
        pics1.add(icecream);
        pics1.add(jacket);
        pics1.add(kangroo);
        pics1.add(lamp);
        pics1.add(milk);
        pics1.add(nail);
        pics1.add(octopus);
        pics1.add(pencil);
        pics1.add(quarter);
        pics1.add(rabbit);
        pics1.add(sun);
        pics1.add(tent);
        pics1.add(umbrella);
        pics1.add(vegetable);
        pics1.add(watermelon);
        pics1.add(ax);
        pics1.add(yacht);
        pics1.add(zebra);

        pics2.add(apple);
        pics2.add(ball);
        pics2.add(car);
        pics2.add(doll);
        pics2.add(egg);
        pics2.add(fish);
        pics2.add(giraffe);
        pics2.add(home);
        pics2.add(iron);
        pics2.add(jeep);
        pics2.add(key);
        pics2.add(leaf);
        pics2.add(monkey);
        pics2.add(nurse);
        pics2.add(onion);
        pics2.add(pizza);
        pics2.add(quiet);
        pics2.add(rainbow);
        pics2.add(sheep);
        pics2.add(tooth);
        pics2.add(unicorn);
        pics2.add(violin);
        pics2.add(wheel);
        pics2.add(xylophone);
        pics2.add(yoyo);
        pics2.add(zipper);

        pics3.add(airplane);
        pics3.add(bee);
        pics3.add(cat);
        pics3.add(drum);
        pics3.add(elephant);
        pics3.add(flower);
        pics3.add(guitar);
        pics3.add(horse);
        pics3.add(island);
        pics3.add(jelybean);
        pics3.add(kid);
        pics3.add(lock);
        pics3.add(moon);
        pics3.add(note);
        pics3.add(owl);
        pics3.add(potato);
        pics3.add(quilt);
        pics3.add(robot);
        pics3.add(spoon);
        pics3.add(toy);
        pics3.add(uniform);
        pics3.add(volcano);
        pics3.add(window);
        pics3.add(xray);
        pics3.add(yogurt);
        pics3.add(zoo);

        picsorta.add(aa);
        picsorta.add(bb);
        picsorta.add(cc);
        picsorta.add(dd);
        picsorta.add(ee);
        picsorta.add(ff);
        picsorta.add(gg);
        picsorta.add(hh);
        picsorta.add(ii);
        picsorta.add(jj);
        picsorta.add(kk);
        picsorta.add(ll);
        picsorta.add(mm);
        picsorta.add(nn);
        picsorta.add(oo);
        picsorta.add(pp);
        picsorta.add(qq);
        picsorta.add(rr);
        picsorta.add(ss);
        picsorta.add(tt);
        picsorta.add(uu);
        picsorta.add(vv);
        picsorta.add(ww);
        picsorta.add(xx);
        picsorta.add(yy);
        picsorta.add(zz);



        nextok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i++;
                if (i == 26){
                    i =0;
                }
                image1.setImageBitmap(pics1.get(i));
                image2.setImageBitmap(pics2.get(i));
                image3.setImageBitmap(pics3.get(i));
                image4.setImageBitmap(picsorta.get(i));



            }
        });



        prevok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               if(i==0){
                   i=26;
               }
                i--;
                image1.setImageBitmap(pics1.get(i));
                image2.setImageBitmap(pics2.get(i));
                image3.setImageBitmap(pics3.get(i));
                image4.setImageBitmap(picsorta.get(i));


            }
        });

    }
}
















