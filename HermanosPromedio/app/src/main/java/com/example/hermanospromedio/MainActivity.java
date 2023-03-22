package com.example.hermanospromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campo1, campo2, campo3;
    TextView PromedioBros, campoNombreUno, campoNombreDos, campoNombreTres,
                etiBro1, etiBro2, etiBro3;
    int edadUno, edadDos, edadTres, totalProm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

            campo1= findViewById(R.id.lbBroEdadUno);
            campo2= findViewById(R.id.lbBroEdadDos);
            campo3= findViewById(R.id.lbBroEdadTres);

            campoNombreUno= findViewById(R.id.lbBroUno);
            campoNombreDos= findViewById(R.id.lbBroDos);
            campoNombreTres= findViewById(R.id.lbBroTres);


            etiBro1= findViewById(R.id.etiBroUno);
            etiBro2= findViewById(R.id.etiBroDos);
            etiBro3= findViewById(R.id.etiBroTres);
            PromedioBros= findViewById(R.id.etiPromedio);



    }

    public void onClick(View view) {
        edadUno= Integer.parseInt(campo1.getText().toString());
        edadDos= Integer.parseInt(campo2.getText().toString());
        edadTres= Integer.parseInt(campo3.getText().toString());

        totalProm = (edadUno + edadDos + edadTres) / 3;

        etiBro1.setText("Nombre del Primer Hermano es: "+campoNombreUno + " Y la edad es: "+campo1);
        etiBro2.setText("Nombre del Segundo Hermano es: "+campoNombreDos + " Y la edad es: "+campo2);
        etiBro3.setText("Nombre del Segundo Hermano es: "+campoNombreTres + " Y la edad es: "+campo3);
        PromedioBros.setText("El promedio de edad de todos es: " + totalProm);
    }
}