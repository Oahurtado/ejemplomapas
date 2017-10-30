package com.example.oscar.ejemplomapas2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Datos extends AppCompatActivity {
    EditText lati,longi;
    String lat,lon;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        lati=(EditText)findViewById(R.id.edilati);
        longi=(EditText)findViewById(R.id.edilongi);
        enviar =(Button)findViewById(R.id.butenviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle datos = new Bundle();
                lat= lati.getText().toString().trim();
                lon=longi.getText().toString().trim();
                datos.putString("LATITUD",lat);
                datos.putString("LONGITUD",lon);
                Intent enviar = new Intent(Datos.this,MapsActivity.class);
                enviar.addFlags(enviar.FLAG_ACTIVITY_CLEAR_TOP | enviar.FLAG_ACTIVITY_CLEAR_TASK);
                enviar.putExtras(datos);




                //
                //datos.putString();

                startActivity(enviar);
            }
        });
    }
}
