package com.alberto.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.alberto.a6dashboard.R;

public class Calculadora_Activity extends AppCompatActivity {

    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDividir;

    EditText n1;
    EditText n2;

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        result = findViewById(R.id.txtViewResultado);

        btnSumar.setOnClickListener(view -> {

            String num1 = n1.getText().toString();
            String num2 = n2.getText().toString();

            if (!num1.isEmpty() && !num2.isEmpty()){

                Double nn1 = Double.parseDouble(num1);
                Double nn2 = Double.parseDouble(num2);
                Double resultado = nn1 + nn2;

                String rstFinal = getString(R.string.ResultadoCalc)+ resultado;

                result.setText(rstFinal);
            }
        });

        btnRestar.setOnClickListener(view -> {

            String num1 = n1.getText().toString();
            String num2 = n2.getText().toString();

            if (!num1.isEmpty() && !num2.isEmpty()){

                Double nn1 = Double.parseDouble(num1);
                Double nn2 = Double.parseDouble(num2);
                Double resultado = nn1 - nn2;

                String rstFinal = getString(R.string.ResultadoCalc) + resultado;

                result.setText(rstFinal);
            }
        });

        btnMultiplicar.setOnClickListener(view -> {

            String num1 = n1.getText().toString();
            String num2 = n2.getText().toString();

            if (!num1.isEmpty() && !num2.isEmpty()){

                Double nn1 = Double.parseDouble(num1);
                Double nn2 = Double.parseDouble(num2);
                Double resultado = nn1 * nn2;

                String rstFinal = getString(R.string.ResultadoCalc) + resultado;

                result.setText(rstFinal);
            }
        });


        btnDividir.setOnClickListener(view -> {

            String num1 = n1.getText().toString();
            String num2 = n2.getText().toString();

            if (!num1.isEmpty() && !num2.isEmpty()){

                Double nn1 = Double.parseDouble(num1);
                Double nn2 = Double.parseDouble(num2);
                Double resultado = nn1 / nn2;

                String rstFinal = getString(R.string.ResultadoCalc) + resultado;

                result.setText(rstFinal);
            }
        });
    }
}