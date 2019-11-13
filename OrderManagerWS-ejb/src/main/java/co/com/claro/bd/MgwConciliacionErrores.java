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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
@Table(name = "MGW_CONCILIACION_ERRORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwConciliacionErrores.findAll", query = "SELECT m FROM MgwConciliacionErrores m")
    , @NamedQuery(name = "MgwConciliacionErrores.findByIdConciliacionError", query = "SELECT m FROM MgwConciliacionErrores m WHERE m.idConciliacionError = :idConciliacionError")
    , @NamedQuery(name = "MgwConciliacionErrores.findByDescripcion", query = "SELECT m FROM MgwConciliacionErrores m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgwConciliacionErrores.findByIdUsuario", query = "SELECT m FROM MgwConciliacionErrores m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgwConciliacionErrores.findByFechaGrabacion", query = "SELECT m FROM MgwConciliacionErrores m WHERE m.fechaGrabacion = :fechaGrabacion")
    , @NamedQuery(name = "MgwConciliacionErrores.findByEstado", query = "SELECT m FROM MgwConciliacionErrores m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwConciliacionErrores.findByPlataformas", query = "SELECT m FROM MgwConciliacionErrores m WHERE m.plataformas = :plataformas")
    , @NamedQuery(name = "MgwConciliacionErrores.findByCodigoError", query = "SELECT m FROM MgwConciliacionErrores m WHERE m.codigoError = :codigoError")})
public class MgwConciliacionErrores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONCILIACION_ERROR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MGW_CONCILIACION_ERRORES_GENERATOR")
    @SequenceGenerator(name = "MGW_CONCILIACION_ERRORES_GENERATOR", initialValue = 1, allocationSize = 1, sequenceName = "MGW_CONCILIACION_ERRORES_SEQ")
    private Long idConciliacionError;
    @Size(max = 150)
    private String descripcion;
    @Size(max = 20)
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.DATE)
    private Date fechaGrabacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    private String estado;
    @Size(max = 20)
    private String plataformas;
    @Size(max = 20)
    @Column(name = "CODIGO_ERROR")
    private String codigoError;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConciliacionError")
    private Collection<MgwConciliacion> mgwConciliacionCollection;

    public MgwConciliacionErrores() {
    }

    public MgwConciliacionErrores(Long idConciliacionError) {
        this.idConciliacionError = idConciliacionError;
    }

    public MgwConciliacionErrores(Long idConciliacionError, Date fechaGrabacion, String estado) {
        this.idConciliacionError = idConciliacionError;
        this.fechaGrabacion = fechaGrabacion;
        this.estado = estado;
    }

    public Long getIdConciliacionError() {
        return idConciliacionError;
    }

    public void setIdConciliacionError(Long idConciliacionError) {
        this.idConciliacionError = idConciliacionError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    @XmlTransient
    public Collection<MgwConciliacion> getMgwConciliacionCollection() {
        return mgwConciliacionCollection;
    }

    public void setMgwConciliacionCollection(Collection<MgwConciliacion> mgwConciliacionCollection) {
        this.mgwConciliacionCollection = mgwConciliacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConciliacionError != null ? idConciliacionError.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwConciliacionErrores)) {
            return false;
        }
        MgwConciliacionErrores other = (MgwConciliacionErrores) object;
        if ((this.idConciliacionError == null && other.idConciliacionError != null) || (this.idConciliacionError != null && !this.idConciliacionError.equals(other.idConciliacionError))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwConciliacionErrores[ idConciliacionError=" + idConciliacionError + " ]";
    }

}
