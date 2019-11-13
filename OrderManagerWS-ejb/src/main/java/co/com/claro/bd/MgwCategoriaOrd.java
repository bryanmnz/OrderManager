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
@Table(name = "MGW_CATEGORIA_ORD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwCategoriaOrd.findAll", query = "SELECT m FROM MgwCategoriaOrd m")
    , @NamedQuery(name = "MgwCategoriaOrd.findByIdCategoOr", query = "SELECT m FROM MgwCategoriaOrd m WHERE m.idCategoOr = :idCategoOr")
    , @NamedQuery(name = "MgwCategoriaOrd.findByNombre", query = "SELECT m FROM MgwCategoriaOrd m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MgwCategoriaOrd.findByFechaCrea", query = "SELECT m FROM MgwCategoriaOrd m WHERE m.fechaCrea = :fechaCrea")
    , @NamedQuery(name = "MgwCategoriaOrd.findByEstado", query = "SELECT m FROM MgwCategoriaOrd m WHERE m.estado = :estado")})
public class MgwCategoriaOrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CATEGO_OR")
    private Long idCategoOr;
    @Size(max = 60)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCrea;
    @Basic(optional = false)
    @NotNull
    private short estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategoOr")
    private Collection<MgwOrden> mgwOrdenCollection;

    public MgwCategoriaOrd() {
    }

    public MgwCategoriaOrd(Long idCategoOr) {
        this.idCategoOr = idCategoOr;
    }

    public MgwCategoriaOrd(Long idCategoOr, Date fechaCrea, short estado) {
        this.idCategoOr = idCategoOr;
        this.fechaCrea = fechaCrea;
        this.estado = estado;
    }

    public Long getIdCategoOr() {
        return idCategoOr;
    }

    public void setIdCategoOr(Long idCategoOr) {
        this.idCategoOr = idCategoOr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(Date fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<MgwOrden> getMgwOrdenCollection() {
        return mgwOrdenCollection;
    }

    public void setMgwOrdenCollection(Collection<MgwOrden> mgwOrdenCollection) {
        this.mgwOrdenCollection = mgwOrdenCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoOr != null ? idCategoOr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwCategoriaOrd)) {
            return false;
        }
        MgwCategoriaOrd other = (MgwCategoriaOrd) object;
        if ((this.idCategoOr == null && other.idCategoOr != null) || (this.idCategoOr != null && !this.idCategoOr.equals(other.idCategoOr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwCategoriaOrd[ idCategoOr=" + idCategoOr + " ]";
    }
    
}
