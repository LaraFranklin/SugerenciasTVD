package com.TV.SugerenciasTVD.DAO.Repositorios;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadHistorial;
import com.TV.SugerenciasTVD.DAO.Modelos.EntidadHistorialPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Created by Franklin on 26/07/2017.
 */
public interface RepositorioHistorial extends JpaRepository<EntidadHistorial, EntidadHistorialPK>{

    @Query("SELECT h FROM EntidadHistorial h WHERE h.idUsuario = :id_usuario order by h.like asc")
    List<EntidadHistorial> getHitorial(@Param("id_usuario") String id_usuario);

}
