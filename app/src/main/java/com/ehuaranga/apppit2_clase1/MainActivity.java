package com.ehuaranga.apppit2_clase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewSaludo;
    EditText editTextNombre;
    Button buttonSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSaludo = findViewById(R.id.textview_saludo);
        editTextNombre = findViewById(R.id.edittext_nombre);
        buttonSaludar = findViewById(R.id.button_saludar);


    }

    public void Saludar(View view){
        Toast.makeText(this, "Has presionado el boton de  saludar",Toast.LENGTH_SHORT).show();
    }

}
