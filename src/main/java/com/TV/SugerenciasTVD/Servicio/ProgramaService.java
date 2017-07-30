package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;
import com.TV.SugerenciasTVD.DAO.Repositorios.RepositorioPrograma;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by Franklin on 29/07/2017.
 */

@Component("Programa")
@Transactional
public class ProgramaService implements Programa{

    private final RepositorioPrograma repositorioPrograma;

    public ProgramaService(RepositorioPrograma repositorioPrograma) {
        this.repositorioPrograma = repositorioPrograma;
    }

    @Override
    public EntidadPrograma getPrograma(String id_programa) {
        return this.repositorioPrograma.getPrograma(id_programa);
    }
}
