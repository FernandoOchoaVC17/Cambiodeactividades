package com.example.fernandoochoa.cambiodeactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.button2);

        boton.setOnClickListener(this);
    }
    @Override
    public void onClick(View V){

        Intent a = new Intent (this,Principal.class );
        startActivity(a);
    }

}
