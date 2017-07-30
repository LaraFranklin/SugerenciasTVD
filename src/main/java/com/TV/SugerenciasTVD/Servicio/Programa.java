package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;

/**
 * Created by Franklin on 29/07/2017.
 */
public interface Programa {

    EntidadPrograma getPrograma(String id_programa);
}
