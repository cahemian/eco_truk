package com.example.ejemplonavegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView registrarse;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarse=findViewById(R.id.textView5);
        login= findViewById(R.id.button);

        //Navegación forzada, usamos Intent

        Intent register= new Intent(getApplicationContext(),RegisterActivity.class);
        Intent home= new Intent(getApplicationContext(), HomeActivity.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(home);
            }
        });

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(register);
            }
        });


    }
}