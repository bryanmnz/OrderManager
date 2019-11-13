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
@Table(name = "MGF_PRE_FACTURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgfPreFactura.findAll", query = "SELECT m FROM MgfPreFactura m")
    , @NamedQuery(name = "MgfPreFactura.findByIdFactura", query = "SELECT m FROM MgfPreFactura m WHERE m.idFactura = :idFactura")
    , @NamedQuery(name = "MgfPreFactura.findByIdAgenda", query = "SELECT m FROM MgfPreFactura m WHERE m.idAgenda = :idAgenda")
    , @NamedQuery(name = "MgfPreFactura.findByFecRegistro", query = "SELECT m FROM MgfPreFactura m WHERE m.fecRegistro = :fecRegistro")
    , @NamedQuery(name = "MgfPreFactura.findByEstado", query = "SELECT m FROM MgfPreFactura m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgfPreFactura.findByIdusuario", query = "SELECT m FROM MgfPreFactura m WHERE m.idusuario = :idusuario")
    , @NamedQuery(name = "MgfPreFactura.findByTotal", query = "SELECT m FROM MgfPreFactura m WHERE m.total = :total")
    , @NamedQuery(name = "MgfPreFactura.findByTotalReal", query = "SELECT m FROM MgfPreFactura m WHERE m.totalReal = :totalReal")
    , @NamedQuery(name = "MgfPreFactura.findByReal", query = "SELECT m FROM MgfPreFactura m WHERE m.real = :real")})
public class MgfPreFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FACTURA")
    private Long idFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGENDA")
    private long idAgenda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEC_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fecRegistro;
    @Basic(optional = false)
    @NotNull
    private short estado;
    private Long idusuario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal total;
    @Column(name = "TOTAL_REAL")
    private BigDecimal totalReal;
    @Basic(optional = false)
    @NotNull
    private short real;

    public MgfPreFactura() {
    }

    public MgfPreFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public MgfPreFactura(Long idFactura, long idAgenda, Date fecRegistro, short estado, short real) {
        this.idFactura = idFactura;
        this.idAgenda = idAgenda;
        this.fecRegistro = fecRegistro;
        this.estado = estado;
        this.real = real;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public long getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(long idAgenda) {
        this.idAgenda = idAgenda;
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

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalReal() {
        return totalReal;
    }

    public void setTotalReal(BigDecimal totalReal) {
        this.totalReal = totalReal;
    }

    public short getReal() {
        return real;
    }

    public void setReal(short real) {
        this.real = real;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgfPreFactura)) {
            return false;
        }
        MgfPreFactura other = (MgfPreFactura) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgfPreFactura[ idFactura=" + idFactura + " ]";
    }
    
}
