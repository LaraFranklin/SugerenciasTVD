package com.TV.SugerenciasTVD.Controlador;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCanal;
import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;
import com.TV.SugerenciasTVD.Servicio.Canal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Franklin on 29/07/2017.
 */
@RestController
@Controller
public class ControladorCanal {

    @Autowired
    Canal canal;

    @GetMapping("/programcionCanal")
    public List<EntidadPrograma> getProgramacion(@Param("id_canal") String id_canal){
        List<EntidadPrograma> lista = (List<EntidadPrograma>) this.canal.getCanal(id_canal).getProgramasByIdCanal();
        ArrayList<EntidadPrograma> programas = new ArrayList<>();
        for (EntidadPrograma programa: lista) {
            programa.setHistorialsByIdPrograma(null);
            programas.add(programa);
        }

        return programas;
    }

    @GetMapping("/getCanales")
    public List<EntidadCanal> getCanales(){
        List<EntidadCanal> canales = this.canal.getCanales();
        ArrayList<EntidadCanal> lista  = new ArrayList<>();
        for (EntidadCanal entidadCanal: canales) {
            ArrayList<EntidadPrograma> l = new ArrayList<>();
            for (EntidadPrograma programa: entidadCanal.getProgramasByIdCanal()) {
                programa.setHistorialsByIdPrograma(null);
                l.add(programa);
            }
            entidadCanal.setProgramasByIdCanal(l);
            lista.add(entidadCanal);
        }
        return lista;
    }
}
