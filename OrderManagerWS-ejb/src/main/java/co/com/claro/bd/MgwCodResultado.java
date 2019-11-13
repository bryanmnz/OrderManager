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
@Table(name = "MGW_COD_RESULTADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwCodResultado.findAll", query = "SELECT m FROM MgwCodResultado m")
    , @NamedQuery(name = "MgwCodResultado.findByIdCodRes", query = "SELECT m FROM MgwCodResultado m WHERE m.idCodRes = :idCodRes")
    , @NamedQuery(name = "MgwCodResultado.findByCodigo", query = "SELECT m FROM MgwCodResultado m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "MgwCodResultado.findByDescripcion", query = "SELECT m FROM MgwCodResultado m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgwCodResultado.findByEstado", query = "SELECT m FROM MgwCodResultado m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwCodResultado.findByIdUsuario", query = "SELECT m FROM MgwCodResultado m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgwCodResultado.findByFechaGrabacion", query = "SELECT m FROM MgwCodResultado m WHERE m.fechaGrabacion = :fechaGrabacion")})
public class MgwCodResultado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COD_RES")
    private Long idCodRes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
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
    @JoinColumn(name = "ID_ACCION", referencedColumnName = "ID_ACCION")
    @ManyToOne(optional = false)
    private MgwAcciones idAccion;

    public MgwCodResultado() {
    }

    public MgwCodResultado(Long idCodRes) {
        this.idCodRes = idCodRes;
    }

    public MgwCodResultado(Long idCodRes, String codigo, String descripcion, Character estado, long idUsuario, Date fechaGrabacion) {
        this.idCodRes = idCodRes;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.fechaGrabacion = fechaGrabacion;
    }

    public Long getIdCodRes() {
        return idCodRes;
    }

    public void setIdCodRes(Long idCodRes) {
        this.idCodRes = idCodRes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public MgwAcciones getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(MgwAcciones idAccion) {
        this.idAccion = idAccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCodRes != null ? idCodRes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwCodResultado)) {
            return false;
        }
        MgwCodResultado other = (MgwCodResultado) object;
        if ((this.idCodRes == null && other.idCodRes != null) || (this.idCodRes != null && !this.idCodRes.equals(other.idCodRes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwCodResultado[ idCodRes=" + idCodRes + " ]";
    }
    
}
