package com.example.edugames.Rinoileingilizce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HayvanlarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanlar);

        ImageView hayvanlearn=findViewById(R.id.hayvanlarlearn);
        ImageView hayvanlartest=findViewById(R.id.hayvanlartest);


    }
    public void hayvanlearn(View view){
        Intent ıntent = new Intent(getApplicationContext(),HayvanlarLearning.class);
        startActivity(ıntent);

    }
}
