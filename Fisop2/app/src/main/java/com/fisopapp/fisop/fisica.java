package com.fisopapp.fisop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fisica extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);

        Button theNext = (Button) findViewById(R.id.theNext);
        theNext.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent clienteEmprestimo = new Intent(this, Analisis.class);
        startActivity(clienteEmprestimo);
    }

}
