package com.example.estudianteredes.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    private TextView mNombre, mGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mNombre = findViewById(R.id.tvNombre);
        mGenero = findViewById(R.id.tvGenero);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("nombre");
        String genero = bundle.getString("genero");

        mNombre.setText(nombre);
        mGenero.setText(genero);

    }
}
