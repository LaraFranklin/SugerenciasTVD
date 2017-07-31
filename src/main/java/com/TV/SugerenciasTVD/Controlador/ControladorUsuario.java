package com.TV.SugerenciasTVD.Controlador;

import com.TV.SugerenciasTVD.DAO.Modelos.EntidadUsuario;
import com.TV.SugerenciasTVD.Servicio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Franklin on 26/07/2017.
 */
@RestController
@Controller
public class ControladorUsuario {

    @Autowired
    Usuario usuario;

    @GetMapping("/obtenerUsuario")
    public EntidadUsuario getUsuario(@Param("id_usuario") String id_usuario){
        EntidadUsuario entidadUsuario = this.usuario.getUsuario(id_usuario);
        entidadUsuario.setHistorialsByIdUsuario(null);
        return entidadUsuario;
    }
}
