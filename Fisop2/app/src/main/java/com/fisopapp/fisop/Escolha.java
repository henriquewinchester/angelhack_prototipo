package com.fisopapp.fisop;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Escolha extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        ImageView btLojista = (ImageView) findViewById(R.id.imageView1);
        btLojista.setOnClickListener(this);
        ImageView btCliente = (ImageView)findViewById(R.id.imageView2);
        btCliente.setOnClickListener(this);


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void onClick(View view) {
        if (view.getId() == R.id.imageView1) {
            Intent solicitarEmprestimo = new Intent(this, Cadastro.class);
            startActivity(solicitarEmprestimo);
        } else if (view.getId() == R.id.imageView2) {
            Intent clienteEmprestimo = new Intent(this, fisica.class);
            startActivity(clienteEmprestimo);
        }
    }

}
