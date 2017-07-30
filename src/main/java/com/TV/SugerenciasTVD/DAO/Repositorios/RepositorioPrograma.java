package com.TV.SugerenciasTVD.DAO.Repositorios;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Franklin on 27/07/2017.
 */
public interface RepositorioPrograma extends JpaRepository<EntidadPrograma, String>{

    @Query("select p from EntidadPrograma p where p.idPrograma = :id_programa")
    EntidadPrograma getPrograma(@Param("id_programa") String id_programa);
}
