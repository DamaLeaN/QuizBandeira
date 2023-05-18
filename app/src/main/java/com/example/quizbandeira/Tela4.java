package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela4 extends AppCompatActivity {

    private RadioButton rdbBrasil, rdbSuecia, rdbIslandia, rdbCroacia;

    private Button btnResponder3;
    private RadioGroup rdGroup3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        rdGroup3 = findViewById(R.id.rdGroup3);
        rdbBrasil = findViewById(R.id.rdbBrasil);
        rdbIslandia = findViewById(R.id.rdbIslandia);
        rdbSuecia = findViewById(R.id.rdbSuecia);
        rdbCroacia = findViewById(R.id.rdbCroacia);
        btnResponder3 = findViewById(R.id.btnResponder3);

    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup3.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder3.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela4(View view){

        if(rdbBrasil.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela4.this,Tela5.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}