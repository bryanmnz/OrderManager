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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "MGW_LOG_AUDITORIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwLogAuditoria.findAll", query = "SELECT m FROM MgwLogAuditoria m")
    , @NamedQuery(name = "MgwLogAuditoria.findByIdMgwLogAuditoria", query = "SELECT m FROM MgwLogAuditoria m WHERE m.idMgwLogAuditoria = :idMgwLogAuditoria")
    , @NamedQuery(name = "MgwLogAuditoria.findByError", query = "SELECT m FROM MgwLogAuditoria m WHERE m.error = :error")
    , @NamedQuery(name = "MgwLogAuditoria.findByEstado", query = "SELECT m FROM MgwLogAuditoria m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwLogAuditoria.findByFechaGrabacion", query = "SELECT m FROM MgwLogAuditoria m WHERE m.fechaGrabacion = :fechaGrabacion")
    , @NamedQuery(name = "MgwLogAuditoria.findByFuncion", query = "SELECT m FROM MgwLogAuditoria m WHERE m.funcion = :funcion")
    , @NamedQuery(name = "MgwLogAuditoria.findByNombreServicio", query = "SELECT m FROM MgwLogAuditoria m WHERE m.nombreServicio = :nombreServicio")
    , @NamedQuery(name = "MgwLogAuditoria.findByRequest", query = "SELECT m FROM MgwLogAuditoria m WHERE m.request = :request")
    , @NamedQuery(name = "MgwLogAuditoria.findByResponse", query = "SELECT m FROM MgwLogAuditoria m WHERE m.response = :response")
    , @NamedQuery(name = "MgwLogAuditoria.findByUsuario", query = "SELECT m FROM MgwLogAuditoria m WHERE m.usuario = :usuario")})
public class MgwLogAuditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MGW_LOG_AUDITORIA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MGW_LOG_AUDITORIA_GENERATOR")
    @SequenceGenerator(name = "MGW_LOG_AUDITORIA_GENERATOR", initialValue = 1, allocationSize = 1, sequenceName = "MGW_LOG_AUDITORIA_SEQ")
    private Long idMgwLogAuditoria;
    @Size(max = 4000)
    @Column(name = "ERROR")
    private String error;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private short estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGrabacion;
    @Size(max = 60)
    @Column(name = "FUNCION")
    private String funcion;
    @Size(max = 60)
    @Column(name = "NOMBRE_SERVICIO")
    private String nombreServicio;
    @Column(name = "REQUEST")
    private Long request;
    @Column(name = "RESPONSE")
    private Long response;
    @Size(max = 60)
    @Column(name = "USUARIO")
    private String usuario;

    public MgwLogAuditoria() {
    }

    public MgwLogAuditoria(Long idMgwLogAuditoria) {
        this.idMgwLogAuditoria = idMgwLogAuditoria;
    }

    public MgwLogAuditoria(Long idMgwLogAuditoria, short estado, Date fechaGrabacion) {
        this.idMgwLogAuditoria = idMgwLogAuditoria;
        this.estado = estado;
        this.fechaGrabacion = fechaGrabacion;
    }

    public Long getIdMgwLogAuditoria() {
        return idMgwLogAuditoria;
    }

    public void setIdMgwLogAuditoria(Long idMgwLogAuditoria) {
        this.idMgwLogAuditoria = idMgwLogAuditoria;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Long getRequest() {
        return request;
    }

    public void setRequest(Long request) {
        this.request = request;
    }

    public Long getResponse() {
        return response;
    }

    public void setResponse(Long response) {
        this.response = response;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMgwLogAuditoria != null ? idMgwLogAuditoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwLogAuditoria)) {
            return false;
        }
        MgwLogAuditoria other = (MgwLogAuditoria) object;
        if ((this.idMgwLogAuditoria == null && other.idMgwLogAuditoria != null) || (this.idMgwLogAuditoria != null && !this.idMgwLogAuditoria.equals(other.idMgwLogAuditoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwLogAuditoria[ idMgwLogAuditoria=" + idMgwLogAuditoria + " ]";
    }
    
}
