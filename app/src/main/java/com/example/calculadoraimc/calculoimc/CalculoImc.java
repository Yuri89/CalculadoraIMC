package com.example.calculadoraimc.calculoimc;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoImc {
    @SuppressLint("SetTextI18n")
    public void CalcularImc(EditText altura, EditText peso, TextView resultado , TextView classificacao){
        double valor = Double.parseDouble(String.valueOf(peso)) / ((Double.parseDouble(String.valueOf(altura)) * (Double.parseDouble(String.valueOf(altura)))));

        if (valor >= 40){
            classificacao.setText("Peso na faixa da obesidade grau 3");
        }

        if (valor < 40 && valor >= 35){
            classificacao.setText("Peso na faixa da obesidade grau 2");
        }

        if (valor < 35 && valor >= 30){
            classificacao.setText("Peso na faixa da obesidade grau 1");
        }

        if (valor < 30 && valor >= 25){
            classificacao.setText("Peso na faixa do sobrepeso");
        }

        if (valor < 25 && valor >= 20){
            classificacao.setText("Peso considerado na faixa saudável");
        }

        if (valor < 20 && valor >= 18){
            classificacao.setText("Peso abaixo do normal");
        }


        resultado.setText(String.valueOf(valor));
        resultado.setVisibility(View.VISIBLE);
        classificacao.setVisibility(View.VISIBLE);
    }
}
