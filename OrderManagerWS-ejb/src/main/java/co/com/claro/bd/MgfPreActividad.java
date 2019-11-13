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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGF_PRE_ACTIVIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgfPreActividad.findAll", query = "SELECT m FROM MgfPreActividad m")
    , @NamedQuery(name = "MgfPreActividad.findByIdActividad", query = "SELECT m FROM MgfPreActividad m WHERE m.idActividad = :idActividad")
    , @NamedQuery(name = "MgfPreActividad.findByIdFactura", query = "SELECT m FROM MgfPreActividad m WHERE m.idFactura = :idFactura")
    , @NamedQuery(name = "MgfPreActividad.findByIdTtactividad", query = "SELECT m FROM MgfPreActividad m WHERE m.idTtactividad = :idTtactividad")
    , @NamedQuery(name = "MgfPreActividad.findByCantidad", query = "SELECT m FROM MgfPreActividad m WHERE m.cantidad = :cantidad")
    , @NamedQuery(name = "MgfPreActividad.findByTotalMt", query = "SELECT m FROM MgfPreActividad m WHERE m.totalMt = :totalMt")
    , @NamedQuery(name = "MgfPreActividad.findByTotalMo", query = "SELECT m FROM MgfPreActividad m WHERE m.totalMo = :totalMo")
    , @NamedQuery(name = "MgfPreActividad.findByTotal", query = "SELECT m FROM MgfPreActividad m WHERE m.total = :total")
    , @NamedQuery(name = "MgfPreActividad.findByFecRegistro", query = "SELECT m FROM MgfPreActividad m WHERE m.fecRegistro = :fecRegistro")
    , @NamedQuery(name = "MgfPreActividad.findByEstado", query = "SELECT m FROM MgfPreActividad m WHERE m.estado = :estado")})
public class MgfPreActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ACTIVIDAD")
    private Long idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FACTURA")
    private long idFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TTACTIVIDAD")
    private long idTtactividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private long cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_MT")
    private BigDecimal totalMt;
    @Column(name = "TOTAL_MO")
    private BigDecimal totalMo;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEC_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private short estado;

    public MgfPreActividad() {
    }

    public MgfPreActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    public MgfPreActividad(Long idActividad, long idFactura, long idTtactividad, long cantidad, Date fecRegistro, short estado) {
        this.idActividad = idActividad;
        this.idFactura = idFactura;
        this.idTtactividad = idTtactividad;
        this.cantidad = cantidad;
        this.fecRegistro = fecRegistro;
        this.estado = estado;
    }

    public Long getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public long getIdTtactividad() {
        return idTtactividad;
    }

    public void setIdTtactividad(long idTtactividad) {
        this.idTtactividad = idTtactividad;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotalMt() {
        return totalMt;
    }

    public void setTotalMt(BigDecimal totalMt) {
        this.totalMt = totalMt;
    }

    public BigDecimal getTotalMo() {
        return totalMo;
    }

    public void setTotalMo(BigDecimal totalMo) {
        this.totalMo = totalMo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
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
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgfPreActividad)) {
            return false;
        }
        MgfPreActividad other = (MgfPreActividad) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgfPreActividad[ idActividad=" + idActividad + " ]";
    }
    
}
