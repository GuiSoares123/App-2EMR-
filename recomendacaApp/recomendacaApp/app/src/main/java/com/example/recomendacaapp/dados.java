package com.example.recomendacaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
    }
    public void voltarInicio5 (View view){
        Intent intent10 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent10);
    }
}
