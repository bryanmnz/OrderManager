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
@Table(name = "MGW_ESTADO_AGENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwEstadoAgenda.findAll", query = "SELECT m FROM MgwEstadoAgenda m")
    , @NamedQuery(name = "MgwEstadoAgenda.findByIdEstadoAgenda", query = "SELECT m FROM MgwEstadoAgenda m WHERE m.idEstadoAgenda = :idEstadoAgenda")
    , @NamedQuery(name = "MgwEstadoAgenda.findByNombreEstadoAgenda", query = "SELECT m FROM MgwEstadoAgenda m WHERE m.nombreEstadoAgenda = :nombreEstadoAgenda")
    , @NamedQuery(name = "MgwEstadoAgenda.findByFechaMod", query = "SELECT m FROM MgwEstadoAgenda m WHERE m.fechaMod = :fechaMod")
    , @NamedQuery(name = "MgwEstadoAgenda.findByUsuarioMod", query = "SELECT m FROM MgwEstadoAgenda m WHERE m.usuarioMod = :usuarioMod")
    , @NamedQuery(name = "MgwEstadoAgenda.findByEstado", query = "SELECT m FROM MgwEstadoAgenda m WHERE m.estado = :estado")})
public class MgwEstadoAgenda implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoAgenda")
    private Collection<MgwAgendaEstados> mgwAgendaEstadosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoAgenda")
    private Collection<MgwAgenda> mgwAgendaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ESTADO_AGENDA")
    private Long idEstadoAgenda;

    @Size(max = 30)
    @Column(name = "NOMBRE_ESTADO_AGENDA")
    private String nombreEstadoAgenda;

    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMod;

    @Column(name = "USUARIO_MOD")
    private Long usuarioMod;

    private Character estado;

    public MgwEstadoAgenda() {
    }

    public MgwEstadoAgenda(Long idEstadoAgenda) {
        this.idEstadoAgenda = idEstadoAgenda;
    }

    public MgwEstadoAgenda(Long idEstadoAgenda, Date fechaMod) {
        this.idEstadoAgenda = idEstadoAgenda;
        this.fechaMod = fechaMod;
    }

    public Long getIdEstadoAgenda() {
        return idEstadoAgenda;
    }

    public void setIdEstadoAgenda(Long idEstadoAgenda) {
        this.idEstadoAgenda = idEstadoAgenda;
    }

    public String getNombreEstadoAgenda() {
        return nombreEstadoAgenda;
    }

    public void setNombreEstadoAgenda(String nombreEstadoAgenda) {
        this.nombreEstadoAgenda = nombreEstadoAgenda;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    public Long getUsuarioMod() {
        return usuarioMod;
    }

    public void setUsuarioMod(Long usuarioMod) {
        this.usuarioMod = usuarioMod;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoAgenda != null ? idEstadoAgenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwEstadoAgenda)) {
            return false;
        }
        MgwEstadoAgenda other = (MgwEstadoAgenda) object;
        if ((this.idEstadoAgenda == null && other.idEstadoAgenda != null) || (this.idEstadoAgenda != null && !this.idEstadoAgenda.equals(other.idEstadoAgenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwEstadoAgenda[ idEstadoAgenda=" + idEstadoAgenda + " ]";
    }

    @XmlTransient
    public Collection<MgwAgendaEstados> getMgwAgendaEstadosCollection() {
        return mgwAgendaEstadosCollection;
    }

    public void setMgwAgendaEstadosCollection(Collection<MgwAgendaEstados> mgwAgendaEstadosCollection) {
        this.mgwAgendaEstadosCollection = mgwAgendaEstadosCollection;
    }

    @XmlTransient
    public Collection<MgwAgenda> getMgwAgendaCollection() {
        return mgwAgendaCollection;
    }

    public void setMgwAgendaCollection(Collection<MgwAgenda> mgwAgendaCollection) {
        this.mgwAgendaCollection = mgwAgendaCollection;
    }

}
