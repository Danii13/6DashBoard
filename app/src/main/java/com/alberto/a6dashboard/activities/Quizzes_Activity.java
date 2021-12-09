package com.alberto.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.alberto.a6dashboard.R;

public class Quizzes_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);


        TextView tvPregunta = findViewById(R.id.tvPregunta);
        RadioGroup rgRespuestas = findViewById(R.id.rgRespuestas);
        RadioButton rgRespuesta1 = findViewById(R.id.rbRespuesta1);
        RadioButton rgRespuesta2 = findViewById(R.id.rbRespuesta2);
        Button btnAceptar = findViewById(R.id.btnAceptar);

        String bitmap = null;
        RoundedBitmapDrawable img2 = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        float radius = 5;
        img2.setCornerRadius(radius);


        Pregunta1(tvPregunta, rgRespuesta1, rgRespuesta2, btnAceptar);
    }

    public void Pregunta1(TextView pr, RadioButton r1, RadioButton r2, Button btn){
        Intent irSecundaria = new Intent(this, secundariaQuiz.class);
        String Pregunta = getString(R.string.pregunta1);

        String Respuesta1 = "4";
        String Respuesta2 = "7";

        pr.setText(Pregunta);

        r1.setText(Respuesta1);
        r2.setText(Respuesta2);

        //Clicl listener del boton

        btn.setOnClickListener(view -> {
            if (r1.isChecked()){
                String correcto = getString(R.string.resultadoCorrecto);
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                irSecundaria.putExtra("correcto", correcto);
                Pregunta2(pr, r1, r2, btn);
                startActivity(irSecundaria);

            } else {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                String correcto = getString(R.string.resultadoErroneo);
                irSecundaria.putExtra("correcto", correcto);
                Pregunta1(pr, r1, r2, btn);
                startActivity(irSecundaria);

            }
        });


    }

    public void Pregunta2(TextView pr, RadioButton r1, RadioButton r2, Button btn){
        Intent irSecundaria = new Intent(this, secundariaQuiz.class);
        String Pregunta = getString(R.string.pregunta2);

        String Respuesta1 = "Albert Einstein";
        String Respuesta2 = "Isaac Newton";

        pr.setText(Pregunta);

        r1.setText(Respuesta1);
        r2.setText(Respuesta2);

        btn.setOnClickListener(view -> {
            if (r2.isChecked()){
                String correcto = getString(R.string.resultadoCorrecto);
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                irSecundaria.putExtra("correcto", correcto);

                Pregunta3(pr, r1, r2, btn);
                startActivity(irSecundaria);

            } else {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                String correcto = getString(R.string.resultadoErroneo);
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                irSecundaria.putExtra("correcto", correcto);
                Pregunta2(pr, r1, r2, btn);
                startActivity(irSecundaria);
            }
        });
    }

    public void Pregunta3(TextView pr, RadioButton r1, RadioButton r2, Button btn){
        Intent irSecundaria = new Intent(this, secundariaQuiz.class);
        String Pregunta = getString(R.string.pregunta3);

        String Respuesta1 = "Spiderman";
        String Respuesta2 = "Joker";

        pr.setText(Pregunta);

        r1.setText(Respuesta1);
        r2.setText(Respuesta2);

        btn.setOnClickListener(view -> {
            if (r1.isChecked()){
                Toast.makeText(this, "Has acertado todas", Toast.LENGTH_SHORT).show();
                String correcto = getString(R.string.resultadoCorrecto);

                irSecundaria.putExtra("correcto", correcto);

                Pregunta1(pr, r1, r2, btn);
                startActivity(irSecundaria);

            } else {

                String correcto = getString(R.string.resultadoErroneo);
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                irSecundaria.putExtra("correcto", correcto);

                Pregunta3(pr, r1, r2, btn);
                startActivity(irSecundaria);

            }
        });

    }
}