package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCanal;
import com.TV.SugerenciasTVD.DAO.Repositorios.RepositorioCanal;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Franklin on 29/07/2017.
 */

@Component("Canal")
@Transactional
public class CanalService implements Canal{

    private final RepositorioCanal repositorioCanal;

    public CanalService(RepositorioCanal repositorioCanal) {
        this.repositorioCanal = repositorioCanal;
    }

    @Override
    public EntidadCanal getCanal(String id_canal) {
        return this.repositorioCanal.getCanal(id_canal);
    }

    @Override
    public List<EntidadCanal> getCanales() {
        return this.repositorioCanal.getCanales();
    }
}
