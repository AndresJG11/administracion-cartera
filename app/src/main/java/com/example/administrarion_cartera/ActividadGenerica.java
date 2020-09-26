package com.example.administrarion_cartera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActividadGenerica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_generica);

        getSupportActionBar().setTitle(getIntent().getExtras().get("Nombre").toString());
    }
}
