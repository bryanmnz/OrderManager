/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Webservices.findAll", query = "SELECT w FROM Webservices w")
    , @NamedQuery(name = "Webservices.findByIdws", query = "SELECT w FROM Webservices w WHERE w.idws = :idws")
    , @NamedQuery(name = "Webservices.findByUrl", query = "SELECT w FROM Webservices w WHERE w.url = :url")
    , @NamedQuery(name = "Webservices.findByDescripcion", query = "SELECT w FROM Webservices w WHERE w.descripcion = :descripcion")
    , @NamedQuery(name = "Webservices.findByEstado", query = "SELECT w FROM Webservices w WHERE w.estado = :estado")
    , @NamedQuery(name = "Webservices.findByFecha", query = "SELECT w FROM Webservices w WHERE w.fecha = :fecha")
    , @NamedQuery(name = "Webservices.findByFechaMod", query = "SELECT w FROM Webservices w WHERE w.fechaMod = :fechaMod")})
public class Webservices implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    private BigDecimal idws;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    private String url;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 290)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    private Character estado;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "FECHA_MOD")
    @Temporal(TemporalType.DATE)
    private Date fechaMod;

    public Webservices() {
    }

    public Webservices(BigDecimal idws) {
        this.idws = idws;
    }

    public Webservices(BigDecimal idws, String url, String descripcion, Character estado, Date fecha) {
        this.idws = idws;
        this.url = url;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha = fecha;
    }

    public BigDecimal getIdws() {
        return idws;
    }

    public void setIdws(BigDecimal idws) {
        this.idws = idws;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idws != null ? idws.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Webservices)) {
            return false;
        }
        Webservices other = (Webservices) object;
        if ((this.idws == null && other.idws != null) || (this.idws != null && !this.idws.equals(other.idws))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.Webservices[ idws=" + idws + " ]";
    }
    
}
