package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela5 extends AppCompatActivity {

    private RadioGroup rdGroup4;
    private Button btnResponder4;

    private RadioButton rdbEstadosUnidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        rdbEstadosUnidos = findViewById(R.id.rdbEstadoUnidos);
        btnResponder4 = findViewById(R.id.btnResponder4);
        rdGroup4 = findViewById(R.id.rdGroup4);

    }
    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup4.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder4.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela5(View view){

        if(rdbEstadosUnidos.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela5.this,Tela6.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}