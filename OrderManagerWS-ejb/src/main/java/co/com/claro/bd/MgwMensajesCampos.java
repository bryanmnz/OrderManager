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
@Table(name = "MGW_MENSAJES_CAMPOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwMensajesCampos.findAll", query = "SELECT m FROM MgwMensajesCampos m")
    , @NamedQuery(name = "MgwMensajesCampos.findByIdCampos", query = "SELECT m FROM MgwMensajesCampos m WHERE m.idCampos = :idCampos")
    , @NamedQuery(name = "MgwMensajesCampos.findByNombres", query = "SELECT m FROM MgwMensajesCampos m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "MgwMensajesCampos.findByVariable", query = "SELECT m FROM MgwMensajesCampos m WHERE m.variable = :variable")
    , @NamedQuery(name = "MgwMensajesCampos.findByEstado", query = "SELECT m FROM MgwMensajesCampos m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwMensajesCampos.findByIdUsuario", query = "SELECT m FROM MgwMensajesCampos m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgwMensajesCampos.findByFechaGrabacion", query = "SELECT m FROM MgwMensajesCampos m WHERE m.fechaGrabacion = :fechaGrabacion")})
public class MgwMensajesCampos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CAMPOS")
    private Long idCampos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRES")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "VARIABLE")
    private String variable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
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

    public MgwMensajesCampos() {
    }

    public MgwMensajesCampos(Long idCampos) {
        this.idCampos = idCampos;
    }

    public MgwMensajesCampos(Long idCampos, String nombres, String variable, Character estado, long idUsuario, Date fechaGrabacion) {
        this.idCampos = idCampos;
        this.nombres = nombres;
        this.variable = variable;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.fechaGrabacion = fechaGrabacion;
    }

    public Long getIdCampos() {
        return idCampos;
    }

    public void setIdCampos(Long idCampos) {
        this.idCampos = idCampos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCampos != null ? idCampos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwMensajesCampos)) {
            return false;
        }
        MgwMensajesCampos other = (MgwMensajesCampos) object;
        if ((this.idCampos == null && other.idCampos != null) || (this.idCampos != null && !this.idCampos.equals(other.idCampos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwMensajesCampos[ idCampos=" + idCampos + " ]";
    }
    
}
