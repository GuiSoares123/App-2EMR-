package com.example.recomendacaapp;

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

    public void irParaTelaAmericanas(View view) {
        Intent intent1 = new Intent(getApplicationContext(), americanas.class);
        startActivity(intent1);
    }

    public void irParaTelaSubmarino(View view){
        Intent intent3 = new Intent(getApplicationContext(), submarino.class);
        startActivity(intent3);

    }
    public void irParaTelaNetshoes(View view){
        Intent intent4 = new Intent(getApplicationContext(), netshoes.class);
        startActivity(intent4);
    }
    public void irParaTelaMagalu(View view){
        Intent intent8 = new Intent(getApplicationContext(),magalu.class);
        startActivity(intent8);
    }
    public void irParaTelaDados(View view){
        Intent intent9 =new Intent(getApplicationContext(),dados.class);
        startActivity(intent9);
    }


}

