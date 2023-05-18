package com.example.quizbandeira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSair, btnIniciar;
    private EditText edtNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btnIniciar);
        btnSair = findViewById(R.id.btnSair);
        edtNome = findViewById(R.id.edtNome);

        edtNome.addTextChangedListener(inciarQuiz);
    }

    private TextWatcher inciarQuiz = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String usernameInput = edtNome.getText().toString().trim();
            btnIniciar.setEnabled(!usernameInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    public void tela1(View view){
        Intent it = new Intent(this,Tela2.class);
        startActivity(it);
        Usuario.setNome(edtNome.getText().toString());

    }

    public void encerrar(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finishAndRemoveTask();
    }

}