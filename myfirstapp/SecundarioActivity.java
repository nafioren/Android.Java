package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SecundarioActivity extends AppCompatActivity {
    private String mNombre;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContenView(R.layout.activity_secundario);
        Intent intent = getIntent();
        mNombre = intent.getStringExtra("Nombre");



    }

    private void setContenView(int activity_secundario) {
    }
}




