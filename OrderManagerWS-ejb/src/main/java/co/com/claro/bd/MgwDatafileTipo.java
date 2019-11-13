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
@Table(name = "MGW_DATAFILE_TIPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwDatafileTipo.findAll", query = "SELECT m FROM MgwDatafileTipo m")
    , @NamedQuery(name = "MgwDatafileTipo.findByIdDatafileTipo", query = "SELECT m FROM MgwDatafileTipo m WHERE m.idDatafileTipo = :idDatafileTipo")
    , @NamedQuery(name = "MgwDatafileTipo.findByTipo", query = "SELECT m FROM MgwDatafileTipo m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "MgwDatafileTipo.findByEstado", query = "SELECT m FROM MgwDatafileTipo m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwDatafileTipo.findByFechaMod", query = "SELECT m FROM MgwDatafileTipo m WHERE m.fechaMod = :fechaMod")
    , @NamedQuery(name = "MgwDatafileTipo.findByUsuarioMod", query = "SELECT m FROM MgwDatafileTipo m WHERE m.usuarioMod = :usuarioMod")})
public class MgwDatafileTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DATAFILE_TIPO")
    private Long idDatafileTipo;
    @Size(max = 30)
    private String tipo;
    @Basic(optional = false)
    @NotNull
    private short estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMod;
    @Column(name = "USUARIO_MOD")
    private Long usuarioMod;

    public MgwDatafileTipo() {
    }

    public MgwDatafileTipo(Long idDatafileTipo) {
        this.idDatafileTipo = idDatafileTipo;
    }

    public MgwDatafileTipo(Long idDatafileTipo, short estado, Date fechaMod) {
        this.idDatafileTipo = idDatafileTipo;
        this.estado = estado;
        this.fechaMod = fechaMod;
    }

    public Long getIdDatafileTipo() {
        return idDatafileTipo;
    }

    public void setIdDatafileTipo(Long idDatafileTipo) {
        this.idDatafileTipo = idDatafileTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    public Long getUsuarioMod() {
        return usuarioMod;
    }

    public void setUsuarioMod(Long usuarioMod) {
        this.usuarioMod = usuarioMod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatafileTipo != null ? idDatafileTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwDatafileTipo)) {
            return false;
        }
        MgwDatafileTipo other = (MgwDatafileTipo) object;
        if ((this.idDatafileTipo == null && other.idDatafileTipo != null) || (this.idDatafileTipo != null && !this.idDatafileTipo.equals(other.idDatafileTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwDatafileTipo[ idDatafileTipo=" + idDatafileTipo + " ]";
    }
    
}
