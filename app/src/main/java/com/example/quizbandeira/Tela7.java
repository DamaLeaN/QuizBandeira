package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela7 extends AppCompatActivity {

    private Button btnResponder6;

    private RadioGroup rdGroup6;

    private RadioButton rdbChina;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);

        rdbChina = findViewById(R.id.rdbChina);
        rdGroup6 = findViewById(R.id.rdGroup6);
        btnResponder6 = findViewById(R.id.btnResponder6);
    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup6.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder6.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela7(View view){

        if(rdbChina.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela7.this,Tela8.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}