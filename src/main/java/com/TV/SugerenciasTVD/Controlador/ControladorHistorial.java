package com.TV.SugerenciasTVD.Controlador;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadHistorial;
import com.TV.SugerenciasTVD.Servicio.Historial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Franklin on 26/07/2017.
 */

@RestController
@Controller

public class ControladorHistorial {


    @Autowired
    Historial historial;

    @GetMapping("/obtenerHistorial")
    public List<EntidadHistorial> getHistorial(@RequestParam("id_usuario") String id_usuario){
        return this.historial.getHistorial(id_usuario);
    }


}
