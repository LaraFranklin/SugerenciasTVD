package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadUsuario;

/**
 * Created by Franklin on 26/07/2017.
 */
public interface Usuario {

    EntidadUsuario getUsuario(String id_usuario);
}
