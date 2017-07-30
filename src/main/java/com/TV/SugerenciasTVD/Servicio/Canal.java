package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCanal;

import java.util.List;

/**
 * Created by Franklin on 29/07/2017.
 */
public interface Canal {

    EntidadCanal getCanal(String id_canal);
    List<EntidadCanal> getCanales();
}
