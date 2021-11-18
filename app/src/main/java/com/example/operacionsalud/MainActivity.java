package com.example.operacionsalud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculadora(View view)
    {
        startActivity(new Intent(this, Operaciones.class));
    }

    public void Salir(View view)
    {
        finish();
    }

    public void Salud(View view)
    {
        startActivity(new Intent(this, Salud.class));
    }
}