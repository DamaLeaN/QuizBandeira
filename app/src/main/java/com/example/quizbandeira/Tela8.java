package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela8 extends AppCompatActivity {

    private Button btnResponder7;

    private RadioGroup rdGroup7;

    private RadioButton rdbMarrocos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela8);

        rdbMarrocos = findViewById(R.id.rdbMarrocos);
        rdGroup7 = findViewById(R.id.rdGroup7);
        btnResponder7 = findViewById(R.id.btnResponder7);
    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup7.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder7.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela8(View view){

        if(rdbMarrocos.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela8.this,Tela9.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}