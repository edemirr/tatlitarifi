package com.example.edugames.Rinoileingilizce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FoodDrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodanddrink);

        ImageView foods = findViewById(R.id.fdfd);
        ImageView drinks = findViewById(R.id.fddr);
        ImageView vege = findViewById(R.id.fdvg);
        ImageView fruit = findViewById(R.id.fdfr);


        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }


    public void intentfood(View view){

        Intent ıntent = new Intent(this,food_food.class);
        startActivity(ıntent);

    }
    public void intentdrink(View view){

        Intent ıntent = new Intent(this,food_drink.class);
        startActivity(ıntent);

    }
    public void meyveye(View view){

        Intent ıntent = new Intent(this,food_fruit.class);
        startActivity(ıntent);

    }
    public void intentvege(View view){

        Intent ıntent = new Intent(this,food_vegetable.class);
        startActivity(ıntent);

    }







}
