package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadHistorial;

import java.util.List;

/**
 * Created by Franklin on 26/07/2017.
 */
public interface Historial {

    List<EntidadHistorial> getHistorial(String id_usuario);
}
