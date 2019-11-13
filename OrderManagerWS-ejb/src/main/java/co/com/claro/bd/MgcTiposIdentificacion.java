/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGC_TIPOS_IDENTIFICACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgcTiposIdentificacion.findAll", query = "SELECT m FROM MgcTiposIdentificacion m")
    , @NamedQuery(name = "MgcTiposIdentificacion.findByIdTipoIdentificacion", query = "SELECT m FROM MgcTiposIdentificacion m WHERE m.idTipoIdentificacion = :idTipoIdentificacion")
    , @NamedQuery(name = "MgcTiposIdentificacion.findByTipo", query = "SELECT m FROM MgcTiposIdentificacion m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "MgcTiposIdentificacion.findByDescripcion", query = "SELECT m FROM MgcTiposIdentificacion m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgcTiposIdentificacion.findByEstado", query = "SELECT m FROM MgcTiposIdentificacion m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgcTiposIdentificacion.findByIdUsuario", query = "SELECT m FROM MgcTiposIdentificacion m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgcTiposIdentificacion.findByFechaGrabacion", query = "SELECT m FROM MgcTiposIdentificacion m WHERE m.fechaGrabacion = :fechaGrabacion")})
public class MgcTiposIdentificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_IDENTIFICACION")
    private Long idTipoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    private Character estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private long idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.DATE)
    private Date fechaGrabacion;
    @OneToMany(mappedBy = "idTipoIdentificacion")
    private Collection<MgcDatosMovil> mgcDatosMovilCollection;

    public MgcTiposIdentificacion() {
    }

    public MgcTiposIdentificacion(Long idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public MgcTiposIdentificacion(Long idTipoIdentificacion, String tipo, String descripcion, Character estado, long idUsuario, Date fechaGrabacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.fechaGrabacion = fechaGrabacion;
    }

    public Long getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Long idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    @XmlTransient
    public Collection<MgcDatosMovil> getMgcDatosMovilCollection() {
        return mgcDatosMovilCollection;
    }

    public void setMgcDatosMovilCollection(Collection<MgcDatosMovil> mgcDatosMovilCollection) {
        this.mgcDatosMovilCollection = mgcDatosMovilCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoIdentificacion != null ? idTipoIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgcTiposIdentificacion)) {
            return false;
        }
        MgcTiposIdentificacion other = (MgcTiposIdentificacion) object;
        if ((this.idTipoIdentificacion == null && other.idTipoIdentificacion != null) || (this.idTipoIdentificacion != null && !this.idTipoIdentificacion.equals(other.idTipoIdentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgcTiposIdentificacion[ idTipoIdentificacion=" + idTipoIdentificacion + " ]";
    }
    
}
