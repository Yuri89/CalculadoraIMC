package com.example.calculadoraimc;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText alturaValor = findViewById(R.id.alturaValor);
        EditText pesoValor = findViewById(R.id.pesoValor);

        TextView resultadoCalculo = findViewById(R.id.resultadoCalculo);
        TextView classificacao = findViewById(R.id.classificacao);

        Button botaoResultado = findViewById(R.id.botaoResultado);

        botaoResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularImc(alturaValor,pesoValor,resultadoCalculo,classificacao);
            }

            @SuppressLint("SetTextI18n")
            public void CalcularImc(EditText altura, EditText peso, TextView resultado , TextView classificacao){
                double valor = Double.parseDouble(String.valueOf(peso)) / Double.parseDouble(String.valueOf(altura));

                if (valor >= 40){
                    resultado.setText(String.valueOf(valor));
                    classificacao.setText("Peso na faixa da obesidade grau 3");
                    resultado.setVisibility(View.VISIBLE);
                    classificacao.setVisibility(View.VISIBLE);
                }
                if (valor < 40 && valor >= 35){
                    resultado.setText(String.valueOf(valor));
                    classificacao.setText("Peso na faixa da obesidade grau 2");
                    resultado.setVisibility(View.VISIBLE);
                    classificacao.setVisibility(View.VISIBLE);
                }
                if (valor < 35 && valor >= 30){
                    resultado.setText(String.valueOf(valor));
                    classificacao.setText("Peso na faixa da obesidade grau 1");
                    resultado.setVisibility(View.VISIBLE);
                    classificacao.setVisibility(View.VISIBLE);
                }
                if (valor < 30 && valor >= 25){
                    resultado.setText(String.valueOf(valor));
                    classificacao.setText("Peso na faixa do sobrepeso");
                    resultado.setVisibility(View.VISIBLE);
                    classificacao.setVisibility(View.VISIBLE);
                }
                if (valor < 25 && valor >= 20){
                    resultado.setText(String.valueOf(valor));
                    classificacao.setText("Peso considerado na faixa saudável");
                    resultado.setVisibility(View.VISIBLE);
                    classificacao.setVisibility(View.VISIBLE);
                }
                if (valor < 20 && valor >= 18){
                    resultado.setText(String.valueOf(valor));
                    classificacao.setText("Peso abaixo do normal");
                    resultado.setVisibility(View.VISIBLE);
                    classificacao.setVisibility(View.VISIBLE);
                }

            }
        });
    }


}