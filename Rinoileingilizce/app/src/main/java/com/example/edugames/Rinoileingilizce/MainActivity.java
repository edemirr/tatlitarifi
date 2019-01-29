package com.example.edugames.Rinoileingilizce;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {



    ImageView letters,numbers,fruits,colors,animals,body;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        letters = findViewById(R.id.HarflerMain);
        numbers=findViewById(R.id.SayılarMain);
        fruits=findViewById(R.id.FoodDrinkMain);
        colors=findViewById(R.id.colorsMain);
        animals=findViewById(R.id.animalsMain);
        body=findViewById(R.id.bodyMain);

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

    public void vucudagit ( View view){

        Intent ıntent = new Intent(this,VucutActivity.class);
        startActivity(ıntent);
    }

}
