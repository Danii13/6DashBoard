package com.alberto.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.alberto.a6dashboard.R;

public class secundariaQuiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria_quiz);


        TextView tvResultado = findViewById(R.id.tvResultado);
        Button btn = findViewById(R.id.btnContinue);

        Bundle extra = getIntent().getExtras();




        tvResultado.setText(extra.getString("correcto"));

        btn.setOnClickListener(view -> {
            finish();
        });





    }
}