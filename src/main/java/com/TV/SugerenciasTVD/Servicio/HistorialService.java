package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadHistorial;
import com.TV.SugerenciasTVD.DAO.Repositorios.RepositorioHistorial;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Franklin on 26/07/2017.
 */

@Component("Historial")
@Transactional
public class HistorialService implements Historial {


    private final RepositorioHistorial repositorioHistorial;

    public HistorialService(RepositorioHistorial repositorioHistorial) {
        this.repositorioHistorial = repositorioHistorial;
    }

    @Override
    public List<EntidadHistorial> getHistorial(String id_usuario) {
        return repositorioHistorial.getHitorial(id_usuario);
    }
}
