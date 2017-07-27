package com.TV.SugerenciasTVD.DAO.Modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Franklin on 27/07/2017.
 */
@Entity
@Table(name = "historial", schema = "televison", catalog = "")
@IdClass(EntidadHistorialPK.class)
public class EntidadHistorial {
    private String idUsuario;
    private String idPrograma;
    private String idCanal;
    private Integer tiempo;
    private Integer like;
    private Date fecha;
    private EntidadUsuario usuarioByIdUsuario;
    private EntidadPrograma programaByIdPrograma;

    @Id
    @Column(name = "id_usuario")
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Id
    @Column(name = "id_programa")
    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }

    @Id
    @Column(name = "id_canal")
    public String getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(String idCanal) {
        this.idCanal = idCanal;
    }

    @Basic
    @Column(name = "tiempo")
    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    @Basic
    @Column(name = "like")
    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    @Id
    @Column(name = "fecha")
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

        EntidadHistorial that = (EntidadHistorial) o;

        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idPrograma != null ? !idPrograma.equals(that.idPrograma) : that.idPrograma != null) return false;
        if (idCanal != null ? !idCanal.equals(that.idCanal) : that.idCanal != null) return false;
        if (tiempo != null ? !tiempo.equals(that.tiempo) : that.tiempo != null) return false;
        if (like != null ? !like.equals(that.like) : that.like != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario != null ? idUsuario.hashCode() : 0;
        result = 31 * result + (idPrograma != null ? idPrograma.hashCode() : 0);
        result = 31 * result + (idCanal != null ? idCanal.hashCode() : 0);
        result = 31 * result + (tiempo != null ? tiempo.hashCode() : 0);
        result = 31 * result + (like != null ? like.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false, insertable = false, updatable = false)
    public EntidadUsuario getUsuarioByIdUsuario() {
        return usuarioByIdUsuario;
    }

    public void setUsuarioByIdUsuario(EntidadUsuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_programa", referencedColumnName = "id_programa", nullable = false, insertable = false, updatable = false)
    public EntidadPrograma getProgramaByIdPrograma() {
        return programaByIdPrograma;
    }

    public void setProgramaByIdPrograma(EntidadPrograma programaByIdPrograma) {
        this.programaByIdPrograma = programaByIdPrograma;
    }
}
