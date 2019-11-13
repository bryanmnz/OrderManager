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
@Table(name = "MGW_CONSTANTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwConstantes.findAll", query = "SELECT m FROM MgwConstantes m")
    , @NamedQuery(name = "MgwConstantes.findByCodigo", query = "SELECT m FROM MgwConstantes m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "MgwConstantes.findByNombre", query = "SELECT m FROM MgwConstantes m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MgwConstantes.findByValor", query = "SELECT m FROM MgwConstantes m WHERE m.valor = :valor")
    , @NamedQuery(name = "MgwConstantes.findByDescripcion", query = "SELECT m FROM MgwConstantes m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgwConstantes.findByUsuarioCreacion", query = "SELECT m FROM MgwConstantes m WHERE m.usuarioCreacion = :usuarioCreacion")
    , @NamedQuery(name = "MgwConstantes.findByFechaCreacion", query = "SELECT m FROM MgwConstantes m WHERE m.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "MgwConstantes.findByUsuarioModificacion", query = "SELECT m FROM MgwConstantes m WHERE m.usuarioModificacion = :usuarioModificacion")
    , @NamedQuery(name = "MgwConstantes.findByFechaModificacion", query = "SELECT m FROM MgwConstantes m WHERE m.fechaModificacion = :fechaModificacion")})
public class MgwConstantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Long codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    private String descripcion;
    @Column(name = "USUARIO_CREACION")
    private Long usuarioCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "USUARIO_MODIFICACION")
    private Long usuarioModificacion;
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;

    public MgwConstantes() {
    }

    public MgwConstantes(Long codigo) {
        this.codigo = codigo;
    }

    public MgwConstantes(Long codigo, String nombre, String valor, String descripcion, Date fechaCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(Long usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Long usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwConstantes)) {
            return false;
        }
        MgwConstantes other = (MgwConstantes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwConstantes[ codigo=" + codigo + " ]";
    }
    
}
