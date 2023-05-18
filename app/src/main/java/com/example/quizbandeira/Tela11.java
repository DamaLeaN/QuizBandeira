package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela11 extends AppCompatActivity {

    private Button btnResponder10;

    private RadioGroup rdGroup10;

    private RadioButton rdbHolanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela11);
        rdGroup10 = findViewById(R.id.rdGroup10);
        btnResponder10 = findViewById(R.id.btnResponder10);
        rdbHolanda = findViewById(R.id.rdbHolanda);
    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup10.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder10.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela11(View view){

        if(rdbHolanda.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela11.this,TelaFinal.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}