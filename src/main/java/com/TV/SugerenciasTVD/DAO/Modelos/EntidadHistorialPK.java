package com.TV.SugerenciasTVD.DAO.Modelos;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Franklin on 27/07/2017.
 */
public class EntidadHistorialPK implements Serializable {
    private String idUsuario;
    private String idPrograma;
    private String idCanal;
    private Date fecha;

    @Column(name = "id_usuario")
    @Id
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Column(name = "id_programa")
    @Id
    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }

    @Column(name = "id_canal")
    @Id
    public String getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(String idCanal) {
        this.idCanal = idCanal;
    }

    @Column(name = "fecha")
    @Id
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntidadHistorialPK that = (EntidadHistorialPK) o;

        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idPrograma != null ? !idPrograma.equals(that.idPrograma) : that.idPrograma != null) return false;
        if (idCanal != null ? !idCanal.equals(that.idCanal) : that.idCanal != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario != null ? idUsuario.hashCode() : 0;
        result = 31 * result + (idPrograma != null ? idPrograma.hashCode() : 0);
        result = 31 * result + (idCanal != null ? idCanal.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        return result;
    }
}
