package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mCampoNombre;
    private Button mBotonInicio;
    private String nombre;


}

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCampoNombre = findViewById(R.id.nombreEditText);
        mBotonInicio = findViewById(R.id.InicioButton)
        mBotonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = mCampoNombre.getText().toString();
                startStory(nombre);
            }
        });
    }

    private void startStory(String nombre) {
        this.nombre = nombre;
        Intent intent;
        intent = new Intent (packageContext; this, SecundarioActivity.class);
        intent.putExtra(name:"Nombre", nombre);
        startActivity(intent);

    }

    private void startActivity(Intent intent) {
    }
}