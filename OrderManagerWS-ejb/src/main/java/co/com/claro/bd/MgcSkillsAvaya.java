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
@Table(name = "MGC_SKILLS_AVAYA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgcSkillsAvaya.findAll", query = "SELECT m FROM MgcSkillsAvaya m")
    , @NamedQuery(name = "MgcSkillsAvaya.findByIdSkillAvaya", query = "SELECT m FROM MgcSkillsAvaya m WHERE m.idSkillAvaya = :idSkillAvaya")
    , @NamedQuery(name = "MgcSkillsAvaya.findByDescripcion", query = "SELECT m FROM MgcSkillsAvaya m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MgcSkillsAvaya.findByEstado", query = "SELECT m FROM MgcSkillsAvaya m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgcSkillsAvaya.findByIdUsuario", query = "SELECT m FROM MgcSkillsAvaya m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgcSkillsAvaya.findByFechaGrabacion", query = "SELECT m FROM MgcSkillsAvaya m WHERE m.fechaGrabacion = :fechaGrabacion")})
public class MgcSkillsAvaya implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SKILL_AVAYA")
    private Long idSkillAvaya;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    private Character estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private long idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.DATE)
    private Date fechaGrabacion;
    @OneToMany(mappedBy = "idSkillAvaya")
    private Collection<MgcDatosMovil> mgcDatosMovilCollection;

    public MgcSkillsAvaya() {
    }

    public MgcSkillsAvaya(Long idSkillAvaya) {
        this.idSkillAvaya = idSkillAvaya;
    }

    public MgcSkillsAvaya(Long idSkillAvaya, String descripcion, Character estado, long idUsuario, Date fechaGrabacion) {
        this.idSkillAvaya = idSkillAvaya;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.fechaGrabacion = fechaGrabacion;
    }

    public Long getIdSkillAvaya() {
        return idSkillAvaya;
    }

    public void setIdSkillAvaya(Long idSkillAvaya) {
        this.idSkillAvaya = idSkillAvaya;
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

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    @XmlTransient
    public Collection<MgcDatosMovil> getMgcDatosMovilCollection() {
        return mgcDatosMovilCollection;
    }

    public void setMgcDatosMovilCollection(Collection<MgcDatosMovil> mgcDatosMovilCollection) {
        this.mgcDatosMovilCollection = mgcDatosMovilCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkillAvaya != null ? idSkillAvaya.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgcSkillsAvaya)) {
            return false;
        }
        MgcSkillsAvaya other = (MgcSkillsAvaya) object;
        if ((this.idSkillAvaya == null && other.idSkillAvaya != null) || (this.idSkillAvaya != null && !this.idSkillAvaya.equals(other.idSkillAvaya))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgcSkillsAvaya[ idSkillAvaya=" + idSkillAvaya + " ]";
    }
    
}
