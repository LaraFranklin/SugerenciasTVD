package com.TV.SugerenciasTVD.DAO.Modelos;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Franklin on 27/07/2017.
 */
@Entity
@Table(name = "categoria", schema = "televison", catalog = "")
public class EntidadCategoria {
    private String idCategoria;
    private String descripcion;
    private Collection<EntidadPrograma> programasByIdCategoria;

    @Id
    @Column(name = "id_categoria")
    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
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

        EntidadCategoria that = (EntidadCategoria) o;

        if (idCategoria != null ? !idCategoria.equals(that.idCategoria) : that.idCategoria != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategoria != null ? idCategoria.hashCode() : 0;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoriaByIdCategoria")
    public Collection<EntidadPrograma> getProgramasByIdCategoria() {
        return programasByIdCategoria;
    }

    public void setProgramasByIdCategoria(Collection<EntidadPrograma> programasByIdCategoria) {
        this.programasByIdCategoria = programasByIdCategoria;
    }
}
