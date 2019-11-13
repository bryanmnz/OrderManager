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
@Table(name = "MGW_PREAGENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwPreagenda.findAll", query = "SELECT m FROM MgwPreagenda m")
    , @NamedQuery(name = "MgwPreagenda.findByIdPreagenda", query = "SELECT m FROM MgwPreagenda m WHERE m.idPreagenda = :idPreagenda")
    , @NamedQuery(name = "MgwPreagenda.findByOrden", query = "SELECT m FROM MgwPreagenda m WHERE m.orden = :orden")
    , @NamedQuery(name = "MgwPreagenda.findByCuenta", query = "SELECT m FROM MgwPreagenda m WHERE m.cuenta = :cuenta")
    , @NamedQuery(name = "MgwPreagenda.findByIdDatafile", query = "SELECT m FROM MgwPreagenda m WHERE m.idDatafile = :idDatafile")
    , @NamedQuery(name = "MgwPreagenda.findByEstado", query = "SELECT m FROM MgwPreagenda m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwPreagenda.findByFecha", query = "SELECT m FROM MgwPreagenda m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "MgwPreagenda.findByTipoOrden", query = "SELECT m FROM MgwPreagenda m WHERE m.tipoOrden = :tipoOrden")})
public class MgwPreagenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PREAGENDA")
    private Long idPreagenda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEN")
    private long orden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUENTA")
    private long cuenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DATAFILE")
    private long idDatafile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private short estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "TIPO_ORDEN")
    private String tipoOrden;

    public MgwPreagenda() {
    }

    public MgwPreagenda(Long idPreagenda) {
        this.idPreagenda = idPreagenda;
    }

    public MgwPreagenda(Long idPreagenda, long orden, long cuenta, long idDatafile, short estado, Date fecha, String tipoOrden) {
        this.idPreagenda = idPreagenda;
        this.orden = orden;
        this.cuenta = cuenta;
        this.idDatafile = idDatafile;
        this.estado = estado;
        this.fecha = fecha;
        this.tipoOrden = tipoOrden;
    }

    public Long getIdPreagenda() {
        return idPreagenda;
    }

    public void setIdPreagenda(Long idPreagenda) {
        this.idPreagenda = idPreagenda;
    }

    public long getOrden() {
        return orden;
    }

    public void setOrden(long orden) {
        this.orden = orden;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public long getIdDatafile() {
        return idDatafile;
    }

    public void setIdDatafile(long idDatafile) {
        this.idDatafile = idDatafile;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPreagenda != null ? idPreagenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwPreagenda)) {
            return false;
        }
        MgwPreagenda other = (MgwPreagenda) object;
        if ((this.idPreagenda == null && other.idPreagenda != null) || (this.idPreagenda != null && !this.idPreagenda.equals(other.idPreagenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwPreagenda[ idPreagenda=" + idPreagenda + " ]";
    }
    
}
