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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MGW_PRE_FACTURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwPreFactura.findAll", query = "SELECT m FROM MgwPreFactura m")
    , @NamedQuery(name = "MgwPreFactura.findByIdFactura", query = "SELECT m FROM MgwPreFactura m WHERE m.idFactura = :idFactura")
    , @NamedQuery(name = "MgwPreFactura.findByFechaCrea", query = "SELECT m FROM MgwPreFactura m WHERE m.fechaCrea = :fechaCrea")
    , @NamedQuery(name = "MgwPreFactura.findByEstado", query = "SELECT m FROM MgwPreFactura m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwPreFactura.findByTotal", query = "SELECT m FROM MgwPreFactura m WHERE m.total = :total")
    , @NamedQuery(name = "MgwPreFactura.findByTotalReal", query = "SELECT m FROM MgwPreFactura m WHERE m.totalReal = :totalReal")})
public class MgwPreFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FACTURA")
    private Long idFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCrea;
    private Short estado;
    private Long total;
    @Column(name = "TOTAL_REAL")
    private Long totalReal;
    @JoinColumn(name = "ID_AGENDA", referencedColumnName = "ID_AGENDA")
    @ManyToOne(optional = false)
    private MgwAgenda idAgenda;

    public MgwPreFactura() {
    }

    public MgwPreFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public MgwPreFactura(Long idFactura, Date fechaCrea) {
        this.idFactura = idFactura;
        this.fechaCrea = fechaCrea;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(Date fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotalReal() {
        return totalReal;
    }

    public void setTotalReal(Long totalReal) {
        this.totalReal = totalReal;
    }

    public MgwAgenda getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(MgwAgenda idAgenda) {
        this.idAgenda = idAgenda;
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
        if (!(object instanceof MgwPreFactura)) {
            return false;
        }
        MgwPreFactura other = (MgwPreFactura) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwPreFactura[ idFactura=" + idFactura + " ]";
    }
    
}
