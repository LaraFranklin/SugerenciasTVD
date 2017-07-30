package com.TV.SugerenciasTVD.Controlador;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCategoria;
import com.TV.SugerenciasTVD.DAO.Modelos.EntidadHistorial;
import com.TV.SugerenciasTVD.DAO.Modelos.EntidadPrograma;
import com.TV.SugerenciasTVD.Servicio.Categoria;
import com.TV.SugerenciasTVD.Servicio.Historial;
import com.TV.SugerenciasTVD.Servicio.Programa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Franklin on 27/07/2017.
 */

@RestController
@Controller
public class ControladorSugerencias {

    @Autowired
    Categoria categoria;

    @Autowired
    Historial historial;

    @Autowired
    Programa programa;

    @GetMapping("/sugerenciasCategoria")
    public List<EntidadPrograma> getSugerenciaCategoria(@Param("id_categoria") String id_categoria){
        List<EntidadPrograma> entidadProgramas = this.categoria.getSugerenciaCategoria(id_categoria);
        ArrayList<EntidadPrograma> lista = new ArrayList<EntidadPrograma>();
        ArrayList<EntidadHistorial> historial = new ArrayList<EntidadHistorial>();
        for (EntidadPrograma programa: entidadProgramas) {
            programa.setHistorialsByIdPrograma(historial);
            lista.add(programa);
        }
        return lista;
    }



    @GetMapping("/sugerenciasUsuario")
    public List<EntidadPrograma> getSugerenciaUsuario(@Param("id_usuario") String id_usuario){
        List<EntidadHistorial> historial = this.historial.getHistorial(id_usuario);
        HashSet<String> entidadCategorias = new HashSet<>();
        EntidadPrograma entidadPrograma;
        HashSet<EntidadPrograma> listaRecomendaciones = new HashSet<>();
        for (EntidadHistorial h: historial) {
            entidadPrograma = this.programa.getPrograma(h.getIdPrograma());
            entidadPrograma.setHistorialsByIdPrograma(null);
            entidadCategorias.add(entidadPrograma.getIdCategoria());
            listaRecomendaciones.add(entidadPrograma);
        }
        for (String categoria: entidadCategorias ) {
            for (EntidadPrograma p: this.categoria.getSugerenciaCategoria(categoria)) {
                p.setHistorialsByIdPrograma(null);
                listaRecomendaciones.add(p);
            }
        }
        List<EntidadPrograma> lista = new ArrayList<>();
        for (EntidadPrograma en: listaRecomendaciones) {
            lista.add(en);
        }
        return lista;
    }
}

