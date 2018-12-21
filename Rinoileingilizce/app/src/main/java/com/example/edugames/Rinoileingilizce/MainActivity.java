package com.example.edugames.Rinoileingilizce;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {



    ImageView letters,numbers,fruits,colors,animals,vehicles,jobs,days,body,objects;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        letters = findViewById(R.id.HarflerMain);
        numbers=findViewById(R.id.SayılarMain);
        fruits=findViewById(R.id.FoodDrinkMain);
        colors=findViewById(R.id.colorsMain);
        animals=findViewById(R.id.animalsMain);
        vehicles=findViewById(R.id.VerbsMain);
        jobs=findViewById(R.id.jobsMain);
        days=findViewById(R.id.DailyWordsMain);
        body=findViewById(R.id.bodyMain);
        objects=findViewById(R.id.DailyWordsMain);
    }

    public void harfleregit ( View view){

        Intent ıntent = new Intent(this,HarflerActivity.class);
        startActivity(ıntent);
    }
    public void sayilaragit ( View view){

        Intent ıntent = new Intent(this,SayilarActivity.class);
        startActivity(ıntent);
    }
    public void meyveleregit ( View view){

        Intent ıntent = new Intent(this,FoodDrinkActivity.class);
        startActivity(ıntent);
    }
    public void renkleregit ( View view){

        Intent ıntent = new Intent(this,RenklerActivity.class);
        startActivity(ıntent);
    }
    public void hayvanlaragit ( View view){

        Intent ıntent = new Intent(this,HayvanlarActivity.class);
        startActivity(ıntent);
    }
    public void araclaragit ( View view){

        Intent ıntent = new Intent(this,VerbsActivity.class);
        startActivity(ıntent);
    }
    public void meslekleregit ( View view){

        Intent ıntent = new Intent(this,MesleklerActivity.class);
        startActivity(ıntent);
    }
    public void vucudagit ( View view){

        Intent ıntent = new Intent(this,VucutActivity.class);
        startActivity(ıntent);
    }
    public void gunleregit ( View view){

        Intent ıntent = new Intent(this,ThingsActivity.class);
        startActivity(ıntent);
    }
    public void esyalaragit ( View view){

        Intent ıntent = new Intent(this,DailyWordsActivity.class);
        startActivity(ıntent);
    }
}
