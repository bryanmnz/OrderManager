/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "MGW_ORIGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwOrigen.findAll", query = "SELECT m FROM MgwOrigen m")
    , @NamedQuery(name = "MgwOrigen.findByIdOrigen", query = "SELECT m FROM MgwOrigen m WHERE m.idOrigen = :idOrigen")
    , @NamedQuery(name = "MgwOrigen.findByDescripcion", query = "SELECT m FROM MgwOrigen m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgwOrigen.findByNombre", query = "SELECT m FROM MgwOrigen m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MgwOrigen.findByEstado", query = "SELECT m FROM MgwOrigen m WHERE m.estado = :estado")})
public class MgwOrigen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORIGEN")
    private Long idOrigen;
    @Size(max = 255)
    private String descripcion;
    @Size(max = 150)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    private short estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrigen")
    private Collection<MgwAgenda> mgwAgendaCollection;

    public MgwOrigen() {
    }

    public MgwOrigen(Long idOrigen) {
        this.idOrigen = idOrigen;
    }

    public MgwOrigen(Long idOrigen, short estado) {
        this.idOrigen = idOrigen;
        this.estado = estado;
    }

    public Long getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Long idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<MgwAgenda> getMgwAgendaCollection() {
        return mgwAgendaCollection;
    }

    public void setMgwAgendaCollection(Collection<MgwAgenda> mgwAgendaCollection) {
        this.mgwAgendaCollection = mgwAgendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrigen != null ? idOrigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwOrigen)) {
            return false;
        }
        MgwOrigen other = (MgwOrigen) object;
        if ((this.idOrigen == null && other.idOrigen != null) || (this.idOrigen != null && !this.idOrigen.equals(other.idOrigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwOrigen[ idOrigen=" + idOrigen + " ]";
    }
    
}
