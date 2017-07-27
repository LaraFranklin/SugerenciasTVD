package com.TV.SugerenciasTVD.DAO.Modelos;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Franklin on 27/07/2017.
 */
@Entity
@Table(name = "tipoprograma", schema = "televison", catalog = "")
public class EntidadTipoprograma {
    private String idTipoprograma;
    private String descripcion;
    private int edadRestringida;
    private Collection<EntidadPrograma> programasByIdTipoprograma;

    @Id
    @Column(name = "id_tipoprograma")
    public String getIdTipoprograma() {
        return idTipoprograma;
    }

    public void setIdTipoprograma(String idTipoprograma) {
        this.idTipoprograma = idTipoprograma;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "edad_restringida")
    public int getEdadRestringida() {
        return edadRestringida;
    }

    public void setEdadRestringida(int edadRestringida) {
        this.edadRestringida = edadRestringida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntidadTipoprograma that = (EntidadTipoprograma) o;

        if (edadRestringida != that.edadRestringida) return false;
        if (idTipoprograma != null ? !idTipoprograma.equals(that.idTipoprograma) : that.idTipoprograma != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoprograma != null ? idTipoprograma.hashCode() : 0;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + edadRestringida;
        return result;
    }

    @OneToMany(mappedBy = "tipoprogramaByIdTipoprograma")
    public Collection<EntidadPrograma> getProgramasByIdTipoprograma() {
        return programasByIdTipoprograma;
    }

    public void setProgramasByIdTipoprograma(Collection<EntidadPrograma> programasByIdTipoprograma) {
        this.programasByIdTipoprograma = programasByIdTipoprograma;
    }
}
