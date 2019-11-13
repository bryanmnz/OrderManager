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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MGW_CONCILIACION_PROCESOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwConciliacionProcesos.findAll", query = "SELECT m FROM MgwConciliacionProcesos m")
    , @NamedQuery(name = "MgwConciliacionProcesos.findByProceso", query = "SELECT m FROM MgwConciliacionProcesos m WHERE m.proceso = :proceso")
    , @NamedQuery(name = "MgwConciliacionProcesos.findByDescripcion", query = "SELECT m FROM MgwConciliacionProcesos m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgwConciliacionProcesos.findByUsuario", query = "SELECT m FROM MgwConciliacionProcesos m WHERE m.usuario = :usuario")
    , @NamedQuery(name = "MgwConciliacionProcesos.findByFechaGrabacion", query = "SELECT m FROM MgwConciliacionProcesos m WHERE m.fechaGrabacion = :fechaGrabacion")
    , @NamedQuery(name = "MgwConciliacionProcesos.findByEstado", query = "SELECT m FROM MgwConciliacionProcesos m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwConciliacionProcesos.findByIdConciliacionProceso", query = "SELECT m FROM MgwConciliacionProcesos m WHERE m.idConciliacionProceso = :idConciliacionProceso")})
public class MgwConciliacionProcesos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    private String proceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.DATE)
    private Date fechaGrabacion;
    @Basic(optional = false)
    @NotNull
    private Character estado;
    @Column(name = "ID_CONCILIACION_PROCESO")
    private Integer idConciliacionProceso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proceso")
    private Collection<MgwConciliacion> mgwConciliacionCollection;
    @JoinColumn(name = "ID_CNC_PROCESO_ACCION", referencedColumnName = "ID_ACCION")
    @ManyToOne
    private MgwAcciones idCncProcesoAccion;

    public MgwConciliacionProcesos() {
    }

    public MgwConciliacionProcesos(String proceso) {
        this.proceso = proceso;
    }

    public MgwConciliacionProcesos(String proceso, String descripcion, String usuario, Date fechaGrabacion, Character estado) {
        this.proceso = proceso;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.fechaGrabacion = fechaGrabacion;
        this.estado = estado;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Integer getIdConciliacionProceso() {
        return idConciliacionProceso;
    }

    public void setIdConciliacionProceso(Integer idConciliacionProceso) {
        this.idConciliacionProceso = idConciliacionProceso;
    }

    @XmlTransient
    public Collection<MgwConciliacion> getMgwConciliacionCollection() {
        return mgwConciliacionCollection;
    }

    public void setMgwConciliacionCollection(Collection<MgwConciliacion> mgwConciliacionCollection) {
        this.mgwConciliacionCollection = mgwConciliacionCollection;
    }

    public MgwAcciones getIdCncProcesoAccion() {
        return idCncProcesoAccion;
    }

    public void setIdCncProcesoAccion(MgwAcciones idCncProcesoAccion) {
        this.idCncProcesoAccion = idCncProcesoAccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proceso != null ? proceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwConciliacionProcesos)) {
            return false;
        }
        MgwConciliacionProcesos other = (MgwConciliacionProcesos) object;
        if ((this.proceso == null && other.proceso != null) || (this.proceso != null && !this.proceso.equals(other.proceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwConciliacionProcesos[ proceso=" + proceso + " ]";
    }
    
}
