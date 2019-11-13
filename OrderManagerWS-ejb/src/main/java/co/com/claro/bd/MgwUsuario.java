/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGW_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwUsuario.findAll", query = "SELECT m FROM MgwUsuario m")
    , @NamedQuery(name = "MgwUsuario.findByIdUsuario", query = "SELECT m FROM MgwUsuario m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgwUsuario.findByUsuario", query = "SELECT m FROM MgwUsuario m WHERE m.usuario = :usuario")
    , @NamedQuery(name = "MgwUsuario.findByOrigen", query = "SELECT m FROM MgwUsuario m WHERE m.origen = :origen")
    , @NamedQuery(name = "MgwUsuario.findByPassword", query = "SELECT m FROM MgwUsuario m WHERE m.password = :password")
    , @NamedQuery(name = "MgwUsuario.findByEstado", query = "SELECT m FROM MgwUsuario m WHERE m.estado = :estado")})
public class MgwUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private Long idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    private String usuario;
    @Size(max = 100)
    private String origen;
    @Size(max = 100)
    private String password;
    @Basic(optional = false)
    @NotNull
    private short estado;

    public MgwUsuario() {
    }

    public MgwUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public MgwUsuario(Long idUsuario, String usuario, short estado) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.estado = estado;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwUsuario)) {
            return false;
        }
        MgwUsuario other = (MgwUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
