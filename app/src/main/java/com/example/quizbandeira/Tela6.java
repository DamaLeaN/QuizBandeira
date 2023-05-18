package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela6 extends AppCompatActivity {

    private RadioGroup rdGroup5;

    private Button btnResponder5;

    private RadioButton rdbRussia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        btnResponder5 = findViewById(R.id.btnResponder5);
        rdGroup5 = findViewById(R.id.rdGroup5);
        rdbRussia = findViewById(R.id.rdbRussia);
    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup5.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder5.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela6(View view){

        if(rdbRussia.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela6.this,Tela7.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}