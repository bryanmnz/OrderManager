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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGW_ACT_FACT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwActFact.findAll", query = "SELECT m FROM MgwActFact m")
    , @NamedQuery(name = "MgwActFact.findByIdActividad", query = "SELECT m FROM MgwActFact m WHERE m.idActividad = :idActividad")
    , @NamedQuery(name = "MgwActFact.findByActividad", query = "SELECT m FROM MgwActFact m WHERE m.actividad = :actividad")
    , @NamedQuery(name = "MgwActFact.findByCantidad", query = "SELECT m FROM MgwActFact m WHERE m.cantidad = :cantidad")
    , @NamedQuery(name = "MgwActFact.findByMinutos", query = "SELECT m FROM MgwActFact m WHERE m.minutos = :minutos")
    , @NamedQuery(name = "MgwActFact.findByEstado", query = "SELECT m FROM MgwActFact m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwActFact.findByFecMod", query = "SELECT m FROM MgwActFact m WHERE m.fecMod = :fecMod")
    , @NamedQuery(name = "MgwActFact.findByUsMod", query = "SELECT m FROM MgwActFact m WHERE m.usMod = :usMod")
    , @NamedQuery(name = "MgwActFact.findByCodigo", query = "SELECT m FROM MgwActFact m WHERE m.codigo = :codigo")})
public class MgwActFact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ACTIVIDAD")
    private Long idActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String actividad;
    @Basic(optional = false)
    @NotNull
    private long cantidad;
    @Basic(optional = false)
    @NotNull
    private long minutos;
    @Basic(optional = false)
    @NotNull
    private short estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEC_MOD")
    @Temporal(TemporalType.DATE)
    private Date fecMod;
    @Column(name = "US_MOD")
    private Long usMod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String codigo;
    @JoinColumn(name = "ID_AGENDA", referencedColumnName = "ID_AGENDA")
    @ManyToOne(optional = false)
    private MgwAgenda idAgenda;

    public MgwActFact() {
    }

    public MgwActFact(Long idActividad) {
        this.idActividad = idActividad;
    }

    public MgwActFact(Long idActividad, String actividad, long cantidad, long minutos, short estado, Date fecMod, String codigo) {
        this.idActividad = idActividad;
        this.actividad = actividad;
        this.cantidad = cantidad;
        this.minutos = minutos;
        this.estado = estado;
        this.fecMod = fecMod;
        this.codigo = codigo;
    }

    public Long getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getMinutos() {
        return minutos;
    }

    public void setMinutos(long minutos) {
        this.minutos = minutos;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Date getFecMod() {
        return fecMod;
    }

    public void setFecMod(Date fecMod) {
        this.fecMod = fecMod;
    }

    public Long getUsMod() {
        return usMod;
    }

    public void setUsMod(Long usMod) {
        this.usMod = usMod;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwActFact)) {
            return false;
        }
        MgwActFact other = (MgwActFact) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwActFact[ idActividad=" + idActividad + " ]";
    }
    
}
