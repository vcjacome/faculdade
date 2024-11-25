package com.example.trataeventos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends Activity {

    private TextView tNome, tIdade;
    private Button btnVoltar;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);

        tNome = (TextView)findViewById(R.id.lblNomeTela2);
        tIdade = (TextView)findViewById(R.id.lblIdadeTela2);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");

        tNome.setText(nome);
        tIdade.setText(idade);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });



    }
}
