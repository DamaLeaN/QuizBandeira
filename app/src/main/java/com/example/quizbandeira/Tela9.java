package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela9 extends AppCompatActivity {

    private Button btnResponder8;

    private RadioGroup rdGroup8;

    private RadioButton rdbEspanha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela9);
        rdGroup8 = findViewById(R.id.rdGroup8);
        btnResponder8 = findViewById(R.id.btnResponder8);
        rdbEspanha = findViewById(R.id.rdbEspanha);
    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup8.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder8.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela9(View view){

        if(rdbEspanha.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela9.this,Tela10.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}