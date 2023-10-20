package com.example.evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText MiDireccion;
    EditText Pdireccion;
    EditText Sdireccion;
    EditText Tdireccion;
    Button Buscar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    MiDireccion = findViewById(R.id.miUbicacion);
    Pdireccion = findViewById(R.id.pdireccion);
    Sdireccion = findViewById(R.id.sdireccion);
    Sdireccion = findViewById(R.id.Tdireccion);
    Buscar= findViewById(R.id.btnBuscar);

    Buscar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(
                    getApplicationContext(),
                    MainActivity2.class);
            intent.putExtra("midireccion",MiDireccion.getText().toString());
            intent.putExtra("pdireccion",Pdireccion.getText().toString());
            intent.putExtra("Sdireccion",Sdireccion.getText().toString());
            intent.putExtra("Tdireccion",Tdireccion.getText().toString());


            startActivity(intent);

        }
    });
    }
}