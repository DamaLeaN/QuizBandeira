package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela10 extends AppCompatActivity {

    private Button btnResponder9;

    private RadioGroup rdGroup9;

    private RadioButton rdbEscocia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela10);
        rdGroup9 = findViewById(R.id.rdGroup9);
        btnResponder9 = findViewById(R.id.btnResponder9);
        rdbEscocia = findViewById(R.id.rdbEscocia);
    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup9.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder9.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela10(View view){

        if(rdbEscocia.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela10.this,Tela11.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}