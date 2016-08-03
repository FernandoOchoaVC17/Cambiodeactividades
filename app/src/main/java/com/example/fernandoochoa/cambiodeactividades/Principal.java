package com.example.fernandoochoa.cambiodeactividades;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(this);

    }
    @Override
    public  void    onClick(View v){

        Intent a = new Intent(this,MainActivity.class);

        startActivity(a);

    }

    }

