package com.example.dineroahorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campo1, campo2, campo3;
    TextView EtiResultado;
    float gastos, salario, extras, ahorro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        campo1= findViewById(R.id.inpSalarioMensual);
        campo2= findViewById(R.id.inpIngresoExtra);
        campo3= findViewById(R.id.inpIngresoGastos);
        EtiResultado= findViewById(R.id.lbResult);


    }

    public void onClick(View view) {


        salario= Float.parseFloat(String.valueOf(campo1));
        extras= Float.parseFloat(String.valueOf(campo2));
        gastos= Float.parseFloat(String.valueOf(campo3));

                ahorro=  ((salario * 12) + extras ) - gastos;

        EtiResultado.setText("Su ahorro al año es: $ "+ ahorro);



    }
}