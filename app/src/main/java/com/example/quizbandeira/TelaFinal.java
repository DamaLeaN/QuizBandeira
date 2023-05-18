package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaFinal extends AppCompatActivity {

    TextView txtNome,txtPonto;
    Button btnNovamente, btnPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);

        btnNovamente = findViewById(R.id.btnNovamente);
        btnPrincipal = findViewById(R.id.btnPrincipal);
        txtNome = findViewById(R.id.txtNome);
        txtPonto = findViewById(R.id.txtPonto);

        txtNome.setText(Usuario.getNome());
        txtPonto.setText(" " + Usuario.getPontos());
    }

    public void principal(View view){
        Intent it = new Intent(TelaFinal.this,MainActivity.class);
        startActivity(it);
        finishAndRemoveTask();
    }

    public void novamente(View view){
        Intent it = new Intent(TelaFinal.this,Tela2.class);
        startActivity(it);
        finishAndRemoveTask();
    }
}