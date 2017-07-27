package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadUsuario;
import com.TV.SugerenciasTVD.DAO.Repositorios.RepositorioUsuario;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by Franklin on 26/07/2017.
 */
@Component("Usuario")
@Transactional
public class UsuarioService implements Usuario {

    private final RepositorioUsuario repositorioUsuario;

    public UsuarioService(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public EntidadUsuario getUsuario(String id_usuario){
        return this.repositorioUsuario.getUsuario(id_usuario);
    }
}
