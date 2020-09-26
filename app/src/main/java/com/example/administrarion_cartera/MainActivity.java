package com.example.administrarion_cartera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    Button btnRegistro;

    TextView txtUser;
    TextView txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);

        try{
            this.getSupportActionBar().hide();
        }catch(NullPointerException e){};

        btnLogin = findViewById(R.id.btnLogin);
        btnRegistro = findViewById(R.id.btnRegistro);
        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);

        btnLogin.setOnClickListener(this);
        btnRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                Toast.makeText(this, "Login", Toast.LENGTH_LONG).show();
                 Intent intent = new Intent(v.getContext(), MenuPrincipal.class);
                 startActivity(intent);
                break;
            case R.id.btnRegistro:
                Toast.makeText(this, "Login", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
