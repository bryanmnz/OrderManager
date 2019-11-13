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
@Table(name = "MGW_ACCIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwAcciones.findAll", query = "SELECT m FROM MgwAcciones m")
    , @NamedQuery(name = "MgwAcciones.findByIdAccion", query = "SELECT m FROM MgwAcciones m WHERE m.idAccion = :idAccion")
    , @NamedQuery(name = "MgwAcciones.findByNombre", query = "SELECT m FROM MgwAcciones m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MgwAcciones.findByDescripcion", query = "SELECT m FROM MgwAcciones m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgwAcciones.findByEstado", query = "SELECT m FROM MgwAcciones m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwAcciones.findByFechaGrabacion", query = "SELECT m FROM MgwAcciones m WHERE m.fechaGrabacion = :fechaGrabacion")
    , @NamedQuery(name = "MgwAcciones.findByIdUsuario", query = "SELECT m FROM MgwAcciones m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgwAcciones.findByUsoConciliacion", query = "SELECT m FROM MgwAcciones m WHERE m.usoConciliacion = :usoConciliacion")})
public class MgwAcciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ACCION")
    private Long idAccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    private Character estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.DATE)
    private Date fechaGrabacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private long idUsuario;
    @Column(name = "USO_CONCILIACION")
    private Character usoConciliacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAccion")
    private Collection<MgwCodResultado> mgwCodResultadoCollection;
    @OneToMany(mappedBy = "idAccion")
    private Collection<MgwConciliacion> mgwConciliacionCollection;
    @OneToMany(mappedBy = "idCncProcesoAccion")
    private Collection<MgwConciliacionProcesos> mgwConciliacionProcesosCollection;

    public MgwAcciones() {
    }

    public MgwAcciones(Long idAccion) {
        this.idAccion = idAccion;
    }

    public MgwAcciones(Long idAccion, String nombre, String descripcion, Character estado, Date fechaGrabacion, long idUsuario) {
        this.idAccion = idAccion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaGrabacion = fechaGrabacion;
        this.idUsuario = idUsuario;
    }

    public Long getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Long idAccion) {
        this.idAccion = idAccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Character getUsoConciliacion() {
        return usoConciliacion;
    }

    public void setUsoConciliacion(Character usoConciliacion) {
        this.usoConciliacion = usoConciliacion;
    }

    @XmlTransient
    public Collection<MgwCodResultado> getMgwCodResultadoCollection() {
        return mgwCodResultadoCollection;
    }

    public void setMgwCodResultadoCollection(Collection<MgwCodResultado> mgwCodResultadoCollection) {
        this.mgwCodResultadoCollection = mgwCodResultadoCollection;
    }

    @XmlTransient
    public Collection<MgwConciliacion> getMgwConciliacionCollection() {
        return mgwConciliacionCollection;
    }

    public void setMgwConciliacionCollection(Collection<MgwConciliacion> mgwConciliacionCollection) {
        this.mgwConciliacionCollection = mgwConciliacionCollection;
    }

    @XmlTransient
    public Collection<MgwConciliacionProcesos> getMgwConciliacionProcesosCollection() {
        return mgwConciliacionProcesosCollection;
    }

    public void setMgwConciliacionProcesosCollection(Collection<MgwConciliacionProcesos> mgwConciliacionProcesosCollection) {
        this.mgwConciliacionProcesosCollection = mgwConciliacionProcesosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccion != null ? idAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwAcciones)) {
            return false;
        }
        MgwAcciones other = (MgwAcciones) object;
        if ((this.idAccion == null && other.idAccion != null) || (this.idAccion != null && !this.idAccion.equals(other.idAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwAcciones[ idAccion=" + idAccion + " ]";
    }
    
}
