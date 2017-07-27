package com.TV.SugerenciasTVD.DAO.Modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;

/**
 * Created by Franklin on 27/07/2017.
 */
@Entity
@Table(name = "programa", schema = "televison", catalog = "")
public class EntidadPrograma {
    private String idPrograma;
    private Integer duracion;
    private String descripcion;
    private String url;
    private Time horaInicio;
    private Time horaFin;
    private String idTipoprograma;
    private String idCategoria;
    private String idCanal;
    private Collection<EntidadHistorial> historialsByIdPrograma;
    private EntidadTipoprograma tipoprogramaByIdTipoprograma;
    private EntidadCategoria categoriaByIdCategoria;
    private EntidadCanal canalByIdCanal;

    @Id
    @Column(name = "id_programa")
    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }

    @Basic
    @Column(name = "duracion")
    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "hora_inicio")
    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Basic
    @Column(name = "hora_fin")
    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    @Basic
    @Column(name = "id_tipoprograma")
    public String getIdTipoprograma() {
        return idTipoprograma;
    }

    public void setIdTipoprograma(String idTipoprograma) {
        this.idTipoprograma = idTipoprograma;
    }

    @Basic
    @Column(name = "id_categoria")
    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "id_canal")
    public String getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(String idCanal) {
        this.idCanal = idCanal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntidadPrograma that = (EntidadPrograma) o;

        if (idPrograma != null ? !idPrograma.equals(that.idPrograma) : that.idPrograma != null) return false;
        if (duracion != null ? !duracion.equals(that.duracion) : that.duracion != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (horaInicio != null ? !horaInicio.equals(that.horaInicio) : that.horaInicio != null) return false;
        if (horaFin != null ? !horaFin.equals(that.horaFin) : that.horaFin != null) return false;
        if (idTipoprograma != null ? !idTipoprograma.equals(that.idTipoprograma) : that.idTipoprograma != null)
            return false;
        if (idCategoria != null ? !idCategoria.equals(that.idCategoria) : that.idCategoria != null) return false;
        if (idCanal != null ? !idCanal.equals(that.idCanal) : that.idCanal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrograma != null ? idPrograma.hashCode() : 0;
        result = 31 * result + (duracion != null ? duracion.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (horaInicio != null ? horaInicio.hashCode() : 0);
        result = 31 * result + (horaFin != null ? horaFin.hashCode() : 0);
        result = 31 * result + (idTipoprograma != null ? idTipoprograma.hashCode() : 0);
        result = 31 * result + (idCategoria != null ? idCategoria.hashCode() : 0);
        result = 31 * result + (idCanal != null ? idCanal.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "programaByIdPrograma")
    public Collection<EntidadHistorial> getHistorialsByIdPrograma() {
        return historialsByIdPrograma;
    }

    public void setHistorialsByIdPrograma(Collection<EntidadHistorial> historialsByIdPrograma) {
        this.historialsByIdPrograma = historialsByIdPrograma;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_tipoprograma", referencedColumnName = "id_tipoprograma", nullable = false, insertable = false, updatable = false)
    public EntidadTipoprograma getTipoprogramaByIdTipoprograma() {
        return tipoprogramaByIdTipoprograma;
    }

    public void setTipoprogramaByIdTipoprograma(EntidadTipoprograma tipoprogramaByIdTipoprograma) {
        this.tipoprogramaByIdTipoprograma = tipoprogramaByIdTipoprograma;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria", nullable = false, insertable = false, updatable = false)
    public EntidadCategoria getCategoriaByIdCategoria() {
        return categoriaByIdCategoria;
    }

    public void setCategoriaByIdCategoria(EntidadCategoria categoriaByIdCategoria) {
        this.categoriaByIdCategoria = categoriaByIdCategoria;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_canal", referencedColumnName = "id_canal", nullable = false, insertable = false, updatable = false)
    public EntidadCanal getCanalByIdCanal() {
        return canalByIdCanal;
    }

    public void setCanalByIdCanal(EntidadCanal canalByIdCanal) {
        this.canalByIdCanal = canalByIdCanal;
    }
}
