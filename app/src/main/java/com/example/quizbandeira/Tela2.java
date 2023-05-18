package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela2 extends AppCompatActivity {

    private RadioGroup rdGroup;
    private Button btnResponder;
    private RadioButton rdbArgentina, rdbJapao, rdbMexico, rdbItalia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        rdGroup= findViewById(R.id.rdGroup);
        btnResponder = findViewById(R.id.btnResponder);
        rdbArgentina = findViewById(R.id.rdbArgentina);
        rdbMexico = findViewById(R.id.rdbMexico);
        rdbItalia = findViewById(R.id.rdbItalia);
        rdbJapao = findViewById(R.id.rdbJapao);

    }


    public void validacao(View view){
            boolean respostaSelecionada;
            respostaSelecionada = true;
            int itemRadioGroup = rdGroup.getCheckedRadioButtonId();

            if(itemRadioGroup != -1){
                // algo foi selecionado

                RadioButton rbOpSelec = findViewById(itemRadioGroup);
                String opcao = rbOpSelec.getText().toString().trim();
                btnResponder.setEnabled(!opcao.isEmpty());


            }
        }

    public void tela2(View view){

        if(rdbJapao.isChecked()) {
            Usuario.setPontos(1);
        }

        Intent it = new Intent(Tela2.this,Tela3.class);
        startActivity(it);
        finishAndRemoveTask();
    }


}