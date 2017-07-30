package com.TV.SugerenciasTVD.DAO.Repositorios;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCanal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Franklin on 29/07/2017.
 */
public interface RepositorioCanal extends JpaRepository<EntidadCanal, String>{

    @Query("SELECT c from EntidadCanal c where c.idCanal= :id_canal")
    EntidadCanal getCanal(@Param("id_canal") String id_canal);

    @Query("select c from EntidadCanal c")
    List<EntidadCanal> getCanales();

}
