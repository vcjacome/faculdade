package com.example.trataeventos;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.trataeventos.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tNome, tIdade;
    private EditText eNome, eIdade;
    private Button bEnviar;
    private Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tela1);

        eNome = (EditText)findViewById(R.id.txtNome);
        eIdade = (EditText)findViewById(R.id.txtIdade);

        bEnviar = (Button)findViewById(R.id.btnEnviar);

        tela = new Intent(this, Tela2.class);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tela.putExtra("nome", eNome.getText().toString());
                tela.putExtra("idade", eIdade.getText().toString());
                startActivity(tela);
            }
        });
    }
}