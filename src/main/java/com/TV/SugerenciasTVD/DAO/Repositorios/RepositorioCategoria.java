package com.TV.SugerenciasTVD.DAO.Repositorios;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Franklin on 26/07/2017.
 */
public interface RepositorioCategoria extends JpaRepository<EntidadCategoria, String>{

    @Query("select c from EntidadCategoria c where c.idCategoria = :id_categoria")
    EntidadCategoria getCategoria(@Param("id_categoria") String id_categoria);

    @Query("select c from EntidadCategoria c")
    List<EntidadCategoria> getCategorias();

}
