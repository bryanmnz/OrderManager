/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MGF_PRE_ITEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgfPreItem.findAll", query = "SELECT m FROM MgfPreItem m")
    , @NamedQuery(name = "MgfPreItem.findByIdItem", query = "SELECT m FROM MgfPreItem m WHERE m.idItem = :idItem")
    , @NamedQuery(name = "MgfPreItem.findByIdMomtr", query = "SELECT m FROM MgfPreItem m WHERE m.idMomtr = :idMomtr")
    , @NamedQuery(name = "MgfPreItem.findByCantidad", query = "SELECT m FROM MgfPreItem m WHERE m.cantidad = :cantidad")
    , @NamedQuery(name = "MgfPreItem.findByTotal", query = "SELECT m FROM MgfPreItem m WHERE m.total = :total")
    , @NamedQuery(name = "MgfPreItem.findByTipo", query = "SELECT m FROM MgfPreItem m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "MgfPreItem.findByReal", query = "SELECT m FROM MgfPreItem m WHERE m.real = :real")})
public class MgfPreItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ITEM")
    private Long idItem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MOMTR")
    private long idMomtr;
    private Long cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    private BigDecimal total;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    private String tipo;
    @Basic(optional = false)
    @NotNull
    private short real;
    @JoinColumn(name = "ID_ACTIVIDAD", referencedColumnName = "ID_ACTIVIDAD")
    @ManyToOne(optional = false)
    private MgfPreActividad idActividad;

    public MgfPreItem() {
    }

    public MgfPreItem(Long idItem) {
        this.idItem = idItem;
    }

    public MgfPreItem(Long idItem, long idMomtr, BigDecimal total, String tipo, short real) {
        this.idItem = idItem;
        this.idMomtr = idMomtr;
        this.total = total;
        this.tipo = tipo;
        this.real = real;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public long getIdMomtr() {
        return idMomtr;
    }

    public void setIdMomtr(long idMomtr) {
        this.idMomtr = idMomtr;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public short getReal() {
        return real;
    }

    public void setReal(short real) {
        this.real = real;
    }

    public MgfPreActividad getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(MgfPreActividad idActividad) {
        this.idActividad = idActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItem != null ? idItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgfPreItem)) {
            return false;
        }
        MgfPreItem other = (MgfPreItem) object;
        if ((this.idItem == null && other.idItem != null) || (this.idItem != null && !this.idItem.equals(other.idItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgfPreItem[ idItem=" + idItem + " ]";
    }
    
}
