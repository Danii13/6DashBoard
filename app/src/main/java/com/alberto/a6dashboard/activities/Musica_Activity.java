package com.alberto.a6dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alberto.a6dashboard.R;
import com.alberto.a6dashboard.fragments.DetailFragment;
import com.alberto.a6dashboard.interfaces.iComunicaFragments;
import com.alberto.a6dashboard.model.Cancion;


public class Musica_Activity extends AppCompatActivity implements iComunicaFragments{

    DetailFragment detailFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);
        getSupportActionBar().hide();
        detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.cancion_detail_fragment);

        View frag = findViewById(R.id.cancion_detail_fragment);
        frag.setVisibility(View.INVISIBLE);

    }

    public void enviarCancion(Cancion cancion){

        detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.cancion_detail_fragment);

        View frag1 = findViewById(R.id.cancion_list_fragment);
        detailFragment.seAllThings(cancion.getImageUrl(), cancion.getTitulo(), cancion.getAutor());
        frag1.setVisibility(View.INVISIBLE);
        detailFragment.playSong(cancion.getSoundId());

    }


    @Override
    public void cambioLayout() {
        View frag = findViewById(R.id.cancion_detail_fragment);
        frag.setVisibility(View.VISIBLE);

    }

    @Override
    public void volver() {
        View frag = findViewById(R.id.cancion_detail_fragment);
        frag.setVisibility(View.INVISIBLE);

        View frag1 = findViewById(R.id.cancion_list_fragment);

        frag1.setVisibility(View.VISIBLE);
    }


}