package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela3 extends AppCompatActivity {

    private RadioButton rdbEscocia, rdbNoruega, rdbPortugal, rdbInglaterra;
    private Button btnResponder2;

    private RadioGroup rdGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        rdGroup2 = findViewById(R.id.rdGroup2);
        rdbEscocia = findViewById(R.id.rdbEscocia);
        rdbInglaterra = findViewById(R.id.rdbInglaterra);
        rdbNoruega = findViewById(R.id.rdbNoruega);
        rdbPortugal = findViewById(R.id.rdbPortugal);
        btnResponder2 = findViewById(R.id.btnResponder2);


    }

    public void validacao(View view){
        boolean respostaSelecionada;
        respostaSelecionada = true;
        int itemRadioGroup = rdGroup2.getCheckedRadioButtonId();

        if(itemRadioGroup != -1){
            // algo foi selecionado

            RadioButton rbOpSelec = findViewById(itemRadioGroup);
            String opcao = rbOpSelec.getText().toString().trim();
            btnResponder2.setEnabled(!opcao.isEmpty());


        }
    }

    public void tela3(View view){



        if(rdbPortugal.isChecked()) {
            Usuario.setPontos(Usuario.getPontos() + 1);
        }

        Intent it = new Intent(Tela3.this,Tela4.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}