package com.example.triangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campo1, campo2;
    TextView etiResult;
    float numArea, numAltura, operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            campo1= findViewById(R.id.InpAreaTriangulo);
            campo2= findViewById(R.id.InpAlturaTriangulo);
            etiResult= findViewById(R.id.textResultado);


    }

    public void onClick(View view) {
        numArea= Float.parseFloat(campo1.getText().toString());
        numAltura= Float.parseFloat(campo2.getText().toString());

                operacion = (2* numArea) / numAltura;

        etiResult.setText("La base del triangulo es: "+operacion);
    }
}