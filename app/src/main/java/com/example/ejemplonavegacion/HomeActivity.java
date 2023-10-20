package com.example.ejemplonavegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button recommendation,stadistics,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recommendation=findViewById(R.id.button2);
        stadistics=findViewById(R.id.button3);
        register=findViewById(R.id.button4);

        Intent recomendaciones= new Intent(getApplicationContext(),
                RecommendationActivity.class);
        Intent estadisticas= new Intent(getApplicationContext(),
                StadisticsActivity.class);
        Intent registrarItem= new Intent(getApplicationContext(),
                ItemsRegisterActivity.class);

        recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(recomendaciones);
            }
        });

        stadistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(estadisticas);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(registrarItem);
            }
        });

    }
}