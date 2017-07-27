package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;

import java.util.List;

/**
 * Created by Franklin on 26/07/2017.
 */
public interface Categoria {

    List<EntidadPrograma> getSugerenciaCategoria(String id_categoria);
}
