package com.TV.SugerenciasTVD.Controlador;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadCategoria;
import com.TV.SugerenciasTVD.Servicio.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Franklin on 30/07/2017.
 */
@RestController
@Controller
public class ControladorCategoria {

    @Autowired
    Categoria categoria;

    @RequestMapping(method = RequestMethod.GET, path = "/getCategorias")
    //@GetMapping("/getCategorias")
    public List<EntidadCategoria> getCategorias(){
        List<EntidadCategoria> lista = this.categoria.getCategorias();
        ArrayList<EntidadCategoria> l = new ArrayList<>();
        for (EntidadCategoria categoria: lista) {
            categoria.setProgramasByIdCategoria(null);
            l.add(categoria);
        }
        return l;
    }
}
