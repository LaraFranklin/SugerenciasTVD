package com.TV.SugerenciasTVD.DAO.Repositorios;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Franklin on 26/07/2017.
 */
public interface RepositorioUsuario extends JpaRepository<EntidadUsuario, String>{

    @Query("select u from EntidadUsuario u where u.idUsuario = :id_usuario")
    EntidadUsuario getUsuario(@Param("id_usuario") String id_usuario);


}
