package com.example.carwash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText campo1, campo2, campo3, campo4;
    TextView TaxiResult, BusesResult, ParticuResult, MotoResult, TotalResult;
    float nTaxiValor, nBusValor, nParticValor, nMotoValor, nValorTotal,
            taxiTotal, busTotal, particularesTotal, motoTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

            campo1= findViewById(R.id.lbTaxiConteo);
            campo2= findViewById(R.id.lbBusesConteo);
            campo3= findViewById(R.id.lbParticularesConteo);
            campo4= findViewById(R.id.lbMotosConteo);

        TaxiResult= findViewById(R.id.TextDineroTaxi);
        BusesResult= findViewById(R.id.TextDineroBuses);
        ParticuResult= findViewById(R.id.TextDineroParticulares);
        MotoResult= findViewById(R.id.TextDineroMoto);
        TotalResult= findViewById(R.id.TextDineroTotal);



    }

    public void onClick(View view) {
        nTaxiValor= Float.parseFloat(String.valueOf(campo1));
        nBusValor= Float.parseFloat(String.valueOf(campo2));
        nParticValor= Float.parseFloat(String.valueOf(campo3));
        nMotoValor= Float.parseFloat(String.valueOf(campo4));

        taxiTotal=  nTaxiValor * 3000;
        busTotal=  nBusValor * 10000;
        particularesTotal=  nParticValor * 5000;
        motoTotal=  nMotoValor * 2000;
        nValorTotal= taxiTotal + busTotal + particularesTotal + motoTotal;

        TaxiResult.setText("El total de Taxis lavados es: $"+taxiTotal);
        BusesResult.setText("El total de  Buses lavados es: $"+busTotal);
        ParticuResult.setText("El total de Particulares lavados es de: $"+particularesTotal);
        MotoResult.setText("El total de Motos lavadas es de: $"+ motoTotal);
        TotalResult.setText("El total del dia es de: $"+nValorTotal);


    }
}