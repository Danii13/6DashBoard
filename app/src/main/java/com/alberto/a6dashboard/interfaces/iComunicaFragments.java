package com.alberto.a6dashboard.interfaces;

import com.alberto.a6dashboard.model.Cancion;

public interface iComunicaFragments {
    public void enviarCancion(Cancion cancion);
    public void cambioLayout();
    public void volver();
}
