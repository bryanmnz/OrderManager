/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGW_CONCILIACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwConciliacion.findAll", query = "SELECT m FROM MgwConciliacion m")
    , @NamedQuery(name = "MgwConciliacion.findByIdConciliacion", query = "SELECT m FROM MgwConciliacion m WHERE m.idConciliacion = :idConciliacion")
    , @NamedQuery(name = "MgwConciliacion.findByIdUsuario", query = "SELECT m FROM MgwConciliacion m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgwConciliacion.findByFechaGrabacion", query = "SELECT m FROM MgwConciliacion m WHERE m.fechaGrabacion = :fechaGrabacion")
    , @NamedQuery(name = "MgwConciliacion.findByFechaLlegadaMensaje", query = "SELECT m FROM MgwConciliacion m WHERE m.fechaLlegadaMensaje = :fechaLlegadaMensaje")
    , @NamedQuery(name = "MgwConciliacion.findByFechaProcesoMensaje", query = "SELECT m FROM MgwConciliacion m WHERE m.fechaProcesoMensaje = :fechaProcesoMensaje")
    , @NamedQuery(name = "MgwConciliacion.findByEstadoConciliacion", query = "SELECT m FROM MgwConciliacion m WHERE m.estadoConciliacion = :estadoConciliacion")
    , @NamedQuery(name = "MgwConciliacion.findByIdMgwLogAuditoria", query = "SELECT m FROM MgwConciliacion m WHERE m.idMgwLogAuditoria = :idMgwLogAuditoria")
    , @NamedQuery(name = "MgwConciliacion.findByEstadoEta", query = "SELECT m FROM MgwConciliacion m WHERE m.estadoEta = :estadoEta")})
public class MgwConciliacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONCILIACION")
    private Long idConciliacion;
    @Size(max = 20)
    @Column(name = "ID_USUARIO")
    private String idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.DATE)
    private Date fechaGrabacion;
    @Column(name = "FECHA_LLEGADA_MENSAJE")
    @Temporal(TemporalType.DATE)
    private Date fechaLlegadaMensaje;
    @Column(name = "FECHA_PROCESO_MENSAJE")
    @Temporal(TemporalType.DATE)
    private Date fechaProcesoMensaje;
    @Column(name = "ESTADO_CONCILIACION")
    private Character estadoConciliacion;
    @Column(name = "ID_MGW_LOG_AUDITORIA")
    private Long idMgwLogAuditoria;
    @Size(max = 20)
    @Column(name = "ESTADO_ETA")
    private String estadoEta;
    @JoinColumn(name = "ID_ACCION", referencedColumnName = "ID_ACCION")
    @ManyToOne
    private MgwAcciones idAccion;
    @JoinColumn(name = "ID_CONCILIACION_ERROR", referencedColumnName = "ID_CONCILIACION_ERROR")
    @ManyToOne(optional = false)
    private MgwConciliacionErrores idConciliacionError;
    @JoinColumn(name = "PROCESO", referencedColumnName = "PROCESO")
    @ManyToOne(optional = false)
    private MgwConciliacionProcesos proceso;
    @JoinColumn(name = "ID_ORDEN", referencedColumnName = "ID_ORDEN")
    @ManyToOne(optional = false)
    private MgwOrden idOrden;

    public MgwConciliacion() {
    }

    public MgwConciliacion(Long idConciliacion) {
        this.idConciliacion = idConciliacion;
    }

    public MgwConciliacion(Long idConciliacion, Date fechaGrabacion) {
        this.idConciliacion = idConciliacion;
        this.fechaGrabacion = fechaGrabacion;
    }

    public Long getIdConciliacion() {
        return idConciliacion;
    }

    public void setIdConciliacion(Long idConciliacion) {
        this.idConciliacion = idConciliacion;
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

    public Date getFechaLlegadaMensaje() {
        return fechaLlegadaMensaje;
    }

    public void setFechaLlegadaMensaje(Date fechaLlegadaMensaje) {
        this.fechaLlegadaMensaje = fechaLlegadaMensaje;
    }

    public Date getFechaProcesoMensaje() {
        return fechaProcesoMensaje;
    }

    public void setFechaProcesoMensaje(Date fechaProcesoMensaje) {
        this.fechaProcesoMensaje = fechaProcesoMensaje;
    }

    public Character getEstadoConciliacion() {
        return estadoConciliacion;
    }

    public void setEstadoConciliacion(Character estadoConciliacion) {
        this.estadoConciliacion = estadoConciliacion;
    }

    public Long getIdMgwLogAuditoria() {
        return idMgwLogAuditoria;
    }

    public void setIdMgwLogAuditoria(Long idMgwLogAuditoria) {
        this.idMgwLogAuditoria = idMgwLogAuditoria;
    }

    public String getEstadoEta() {
        return estadoEta;
    }

    public void setEstadoEta(String estadoEta) {
        this.estadoEta = estadoEta;
    }

    public MgwAcciones getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(MgwAcciones idAccion) {
        this.idAccion = idAccion;
    }

    public MgwConciliacionErrores getIdConciliacionError() {
        return idConciliacionError;
    }

    public void setIdConciliacionError(MgwConciliacionErrores idConciliacionError) {
        this.idConciliacionError = idConciliacionError;
    }

    public MgwConciliacionProcesos getProceso() {
        return proceso;
    }

    public void setProceso(MgwConciliacionProcesos proceso) {
        this.proceso = proceso;
    }

    public MgwOrden getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(MgwOrden idOrden) {
        this.idOrden = idOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConciliacion != null ? idConciliacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwConciliacion)) {
            return false;
        }
        MgwConciliacion other = (MgwConciliacion) object;
        if ((this.idConciliacion == null && other.idConciliacion != null) || (this.idConciliacion != null && !this.idConciliacion.equals(other.idConciliacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwConciliacion[ idConciliacion=" + idConciliacion + " ]";
    }
    
}
