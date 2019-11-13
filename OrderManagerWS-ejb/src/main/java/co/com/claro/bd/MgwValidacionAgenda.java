/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGW_VALIDACION_AGENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwValidacionAgenda.findAll", query = "SELECT m FROM MgwValidacionAgenda m")
    , @NamedQuery(name = "MgwValidacionAgenda.findByIdValidacionAgenda", query = "SELECT m FROM MgwValidacionAgenda m WHERE m.idValidacionAgenda = :idValidacionAgenda")
    , @NamedQuery(name = "MgwValidacionAgenda.findByNombre", query = "SELECT m FROM MgwValidacionAgenda m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MgwValidacionAgenda.findByEstado", query = "SELECT m FROM MgwValidacionAgenda m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwValidacionAgenda.findByUsMod", query = "SELECT m FROM MgwValidacionAgenda m WHERE m.usMod = :usMod")})
public class MgwValidacionAgenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_VALIDACION_AGENDA")
    private Long idValidacionAgenda;
    @Size(max = 60)
    private String nombre;
    private Short estado;
    @Column(name = "US_MOD")
    private Long usMod;
    @OneToMany(mappedBy = "idValidacionAgenda")
    private Collection<MgwConfigValidacion> mgwConfigValidacionCollection;

    public MgwValidacionAgenda() {
    }

    public MgwValidacionAgenda(Long idValidacionAgenda) {
        this.idValidacionAgenda = idValidacionAgenda;
    }

    public Long getIdValidacionAgenda() {
        return idValidacionAgenda;
    }

    public void setIdValidacionAgenda(Long idValidacionAgenda) {
        this.idValidacionAgenda = idValidacionAgenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Long getUsMod() {
        return usMod;
    }

    public void setUsMod(Long usMod) {
        this.usMod = usMod;
    }

    @XmlTransient
    public Collection<MgwConfigValidacion> getMgwConfigValidacionCollection() {
        return mgwConfigValidacionCollection;
    }

    public void setMgwConfigValidacionCollection(Collection<MgwConfigValidacion> mgwConfigValidacionCollection) {
        this.mgwConfigValidacionCollection = mgwConfigValidacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValidacionAgenda != null ? idValidacionAgenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwValidacionAgenda)) {
            return false;
        }
        MgwValidacionAgenda other = (MgwValidacionAgenda) object;
        if ((this.idValidacionAgenda == null && other.idValidacionAgenda != null) || (this.idValidacionAgenda != null && !this.idValidacionAgenda.equals(other.idValidacionAgenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwValidacionAgenda[ idValidacionAgenda=" + idValidacionAgenda + " ]";
    }
    
}
