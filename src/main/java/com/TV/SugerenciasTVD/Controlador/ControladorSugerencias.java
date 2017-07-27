package com.TV.SugerenciasTVD.Controlador;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;
import com.TV.SugerenciasTVD.Servicio.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Franklin on 27/07/2017.
 */

@RestController
@Controller
public class ControladorSugerencias {

    @Autowired
    Categoria categoria;

    @GetMapping("/sugerenciasCategoria")
    public List<EntidadPrograma> getSugerenciaCategoria(@Param("id_categoria") String id_categoria){
        return this.categoria.getSugerenciaCategoria(id_categoria);
    }
}

