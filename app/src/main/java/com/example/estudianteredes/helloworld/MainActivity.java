package com.example.estudianteredes.helloworld;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText mNombre, mTelefono, mCedula, mDireccion;
    private Button mEnviar;
    private Spinner mGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNombre = findViewById(R.id.etNombre);
        mCedula = findViewById(R.id.etCedula);
        mTelefono = findViewById(R.id.etTelefono);
        mEnviar = findViewById(R.id.btnEnviar);
        mGenero = findViewById(R.id.spGenero);
        mDireccion = findViewById(R.id.etDireccion);

        String []opciones={"Masculino","Femenino","Otro"};
        ArrayAdapter <String>adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, opciones);
        mGenero.setAdapter(adapter);


        mEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre, cedula, telefono, direccion, genero;
                nombre = mNombre.getText().toString();
                telefono = mTelefono.getText().toString();
                cedula = mCedula.getText().toString();
                direccion = mDireccion.getText().toString();
                genero = mGenero.getSelectedItem().toString();


                Intent formActivity = new Intent(MainActivity.this, FormActivity.class);
                formActivity.putExtra("nombre",nombre);
                formActivity.putExtra("genero",genero);
                startActivity(formActivity);
                /*
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Datos");
                builder.setMessage("Nombre: "+nombre+"\nCedula: "+cedula+"\nTelefono: "+telefono);
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();*/
            }
        });

    }

    }

