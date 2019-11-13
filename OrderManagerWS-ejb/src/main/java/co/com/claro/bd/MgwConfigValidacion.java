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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MGW_CONFIG_VALIDACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwConfigValidacion.findAll", query = "SELECT m FROM MgwConfigValidacion m")
    , @NamedQuery(name = "MgwConfigValidacion.findByIdConfigValidacion", query = "SELECT m FROM MgwConfigValidacion m WHERE m.idConfigValidacion = :idConfigValidacion")
    , @NamedQuery(name = "MgwConfigValidacion.findByNombre", query = "SELECT m FROM MgwConfigValidacion m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MgwConfigValidacion.findByFechaCreacion", query = "SELECT m FROM MgwConfigValidacion m WHERE m.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "MgwConfigValidacion.findByEstado", query = "SELECT m FROM MgwConfigValidacion m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwConfigValidacion.findByUsMod", query = "SELECT m FROM MgwConfigValidacion m WHERE m.usMod = :usMod")
    , @NamedQuery(name = "MgwConfigValidacion.findByTipoOrden", query = "SELECT m FROM MgwConfigValidacion m WHERE m.tipoOrden = :tipoOrden")
    , @NamedQuery(name = "MgwConfigValidacion.findByIdAccion", query = "SELECT m FROM MgwConfigValidacion m WHERE m.idAccion = :idAccion")})
public class MgwConfigValidacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONFIG_VALIDACION")
    private Long idConfigValidacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    private short estado;
    @Column(name = "US_MOD")
    private Long usMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPO_ORDEN")
    private String tipoOrden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ACCION")
    private long idAccion;
    @OneToMany(mappedBy = "idConfigValidacion")
    private Collection<MgwConfigCampo> mgwConfigCampoCollection;
    @JoinColumn(name = "ID_VALIDACION_AGENDA", referencedColumnName = "ID_VALIDACION_AGENDA")
    @ManyToOne
    private MgwValidacionAgenda idValidacionAgenda;

    public MgwConfigValidacion() {
    }

    public MgwConfigValidacion(Long idConfigValidacion) {
        this.idConfigValidacion = idConfigValidacion;
    }

    public MgwConfigValidacion(Long idConfigValidacion, String nombre, Date fechaCreacion, short estado, String tipoOrden, long idAccion) {
        this.idConfigValidacion = idConfigValidacion;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.tipoOrden = tipoOrden;
        this.idAccion = idAccion;
    }

    public Long getIdConfigValidacion() {
        return idConfigValidacion;
    }

    public void setIdConfigValidacion(Long idConfigValidacion) {
        this.idConfigValidacion = idConfigValidacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Long getUsMod() {
        return usMod;
    }

    public void setUsMod(Long usMod) {
        this.usMod = usMod;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    public long getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(long idAccion) {
        this.idAccion = idAccion;
    }

    @XmlTransient
    public Collection<MgwConfigCampo> getMgwConfigCampoCollection() {
        return mgwConfigCampoCollection;
    }

    public void setMgwConfigCampoCollection(Collection<MgwConfigCampo> mgwConfigCampoCollection) {
        this.mgwConfigCampoCollection = mgwConfigCampoCollection;
    }

    public MgwValidacionAgenda getIdValidacionAgenda() {
        return idValidacionAgenda;
    }

    public void setIdValidacionAgenda(MgwValidacionAgenda idValidacionAgenda) {
        this.idValidacionAgenda = idValidacionAgenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConfigValidacion != null ? idConfigValidacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwConfigValidacion)) {
            return false;
        }
        MgwConfigValidacion other = (MgwConfigValidacion) object;
        if ((this.idConfigValidacion == null && other.idConfigValidacion != null) || (this.idConfigValidacion != null && !this.idConfigValidacion.equals(other.idConfigValidacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwConfigValidacion[ idConfigValidacion=" + idConfigValidacion + " ]";
    }
   
}
