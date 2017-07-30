package com.fisopapp.fisop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Cadastro extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button btnSolicitar = (Button) findViewById(R.id.btnSolicitar);
        btnSolicitar.setOnClickListener(this);
    }

    public void onClick(View view) {
            Intent solicitarEmprestimo = new Intent(this, Analisis.class);
            startActivity(solicitarEmprestimo);
    }
}
