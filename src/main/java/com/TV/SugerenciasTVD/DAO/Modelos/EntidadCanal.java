package com.TV.SugerenciasTVD.DAO.Modelos;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Franklin on 27/07/2017.
 */
@Entity
@Table(name = "canal", schema = "televison", catalog = "")
public class EntidadCanal {
    private String idCanal;
    private String descripcion;
    private Collection<EntidadPrograma> programasByIdCanal;

    @Id
    @Column(name = "id_canal")
    public String getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(String idCanal) {
        this.idCanal = idCanal;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntidadCanal that = (EntidadCanal) o;

        if (idCanal != null ? !idCanal.equals(that.idCanal) : that.idCanal != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCanal != null ? idCanal.hashCode() : 0;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "canalByIdCanal")
    public Collection<EntidadPrograma> getProgramasByIdCanal() {
        return programasByIdCanal;
    }

    public void setProgramasByIdCanal(Collection<EntidadPrograma> programasByIdCanal) {
        this.programasByIdCanal = programasByIdCanal;
    }
}
