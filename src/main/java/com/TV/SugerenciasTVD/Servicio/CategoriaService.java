package com.TV.SugerenciasTVD.Servicio;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCategoria;
import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;
import com.TV.SugerenciasTVD.DAO.Repositorios.RepositorioCategoria;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Franklin on 26/07/2017.
 */
@Component("Categoria")
@Transactional
public class CategoriaService implements Categoria {


    private final RepositorioCategoria repositorioCategoria;

    public CategoriaService(RepositorioCategoria repositorioCategoria) {
        this.repositorioCategoria = repositorioCategoria;
    }


    @Override
    public List<EntidadPrograma> getSugerenciaCategoria(String id_categoria) {
        EntidadCategoria categoria = this.repositorioCategoria.getCategoria(id_categoria);
        return (List<EntidadPrograma>) categoria.getProgramasByIdCategoria();
    }

    @Override
    public List<EntidadCategoria> getCategorias() {
        return this.repositorioCategoria.getCategorias();
    }
}
