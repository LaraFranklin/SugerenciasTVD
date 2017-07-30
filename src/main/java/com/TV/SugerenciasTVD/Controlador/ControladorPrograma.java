package com.TV.SugerenciasTVD.Controlador;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;
import com.TV.SugerenciasTVD.Servicio.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Franklin on 29/07/2017.
 */

@RestController
@Controller
public class ControladorPrograma {


    @Autowired
    Programa programa;

    @GetMapping("/obtenerPrograma")
    public EntidadPrograma getPrograma(@Param("id_programa") String id_programa){
        return programa.getPrograma(id_programa);
    }
}
