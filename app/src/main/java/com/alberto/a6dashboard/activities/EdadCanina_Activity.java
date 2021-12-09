package com.alberto.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.alberto.a6dashboard.R;

public class EdadCanina_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad_canina);


     // 1 - Agregamos los IDs a los elementos
        EditText edadEdit = findViewById(R.id.edad_et);
        TextView resultadoText = findViewById(R.id.resultado_tv);
        Button boton = findViewById(R.id.button_btn);

        // 2. Damos actividad al boton al ser pulsado
        boton.setOnClickListener( view -> {
            //3.Recogemos el texto del editText
            String edad = edadEdit.getText().toString();

            //4. Convertimos el string a entero
            int edadInt = Integer.parseInt(edad);

            //5.Calculamos la edad canina
            int resultado = edadInt * 7;

            //6.Creamos el texto que vamos a mostrar
            String resultadoString = getString(R.string.edadPerro) + resultado + getString(R.string.anios);

            //7.Asignamos el texto al elemento TextoView
            resultadoText.setText(resultadoString);

        });
    }
}