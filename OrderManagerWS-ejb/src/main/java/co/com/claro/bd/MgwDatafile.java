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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "MGW_DATAFILE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwDatafile.findAll", query = "SELECT m FROM MgwDatafile m")
    , @NamedQuery(name = "MgwDatafile.findByIdDatafile", query = "SELECT m FROM MgwDatafile m WHERE m.idDatafile = :idDatafile")
    , @NamedQuery(name = "MgwDatafile.findByFecha", query = "SELECT m FROM MgwDatafile m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "MgwDatafile.findByEstado", query = "SELECT m FROM MgwDatafile m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwDatafile.findByIdDatafileTipo", query = "SELECT m FROM MgwDatafile m WHERE m.idDatafileTipo = :idDatafileTipo")})
public class MgwDatafile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MGW_DATAFILE_GENERATOR")
    @SequenceGenerator(name = "MGW_DATAFILE_GENERATOR", initialValue = 1, allocationSize = 1, sequenceName = "MGW_DATAFILE_SEQ")
    @Column(name = "ID_DATAFILE")
    private Long idDatafile;
    @Lob
    private String datafile;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    private short estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DATAFILE_TIPO")
    private long idDatafileTipo;

    public MgwDatafile() {
    }

    public MgwDatafile(Long idDatafile) {
        this.idDatafile = idDatafile;
    }

    public MgwDatafile(Long idDatafile, short estado, long idDatafileTipo) {
        this.idDatafile = idDatafile;
        this.estado = estado;
        this.idDatafileTipo = idDatafileTipo;
    }

    public Long getIdDatafile() {
        return idDatafile;
    }

    public void setIdDatafile(Long idDatafile) {
        this.idDatafile = idDatafile;
    }

    public String getDatafile() {
        return datafile;
    }

    public void setDatafile(String datafile) {
        this.datafile = datafile;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public long getIdDatafileTipo() {
        return idDatafileTipo;
    }

    public void setIdDatafileTipo(long idDatafileTipo) {
        this.idDatafileTipo = idDatafileTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatafile != null ? idDatafile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwDatafile)) {
            return false;
        }
        MgwDatafile other = (MgwDatafile) object;
        if ((this.idDatafile == null && other.idDatafile != null) || (this.idDatafile != null && !this.idDatafile.equals(other.idDatafile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwDatafile[ idDatafile=" + idDatafile + " ]";
    }
    
}
