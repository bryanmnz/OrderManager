/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGW_SUSCRIPTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwSuscriptor.findAll", query = "SELECT m FROM MgwSuscriptor m")
    , @NamedQuery(name = "MgwSuscriptor.findByIdSuscriptor", query = "SELECT m FROM MgwSuscriptor m WHERE m.idSuscriptor = :idSuscriptor")
    , @NamedQuery(name = "MgwSuscriptor.findByDocumento", query = "SELECT m FROM MgwSuscriptor m WHERE m.documento = :documento")
    , @NamedQuery(name = "MgwSuscriptor.findByNombre", query = "SELECT m FROM MgwSuscriptor m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MgwSuscriptor.findByEstado", query = "SELECT m FROM MgwSuscriptor m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgwSuscriptor.findByTelefono1", query = "SELECT m FROM MgwSuscriptor m WHERE m.telefono1 = :telefono1")
    , @NamedQuery(name = "MgwSuscriptor.findByTelefono2", query = "SELECT m FROM MgwSuscriptor m WHERE m.telefono2 = :telefono2")
    , @NamedQuery(name = "MgwSuscriptor.findByCuenta", query = "SELECT m FROM MgwSuscriptor m WHERE m.cuenta = :cuenta")
    , @NamedQuery(name = "MgwSuscriptor.findByCll", query = "SELECT m FROM MgwSuscriptor m WHERE m.cll = :cll")
    , @NamedQuery(name = "MgwSuscriptor.findByNumdir", query = "SELECT m FROM MgwSuscriptor m WHERE m.numdir = :numdir")
    , @NamedQuery(name = "MgwSuscriptor.findByApto", query = "SELECT m FROM MgwSuscriptor m WHERE m.apto = :apto")
    , @NamedQuery(name = "MgwSuscriptor.findByBarrio", query = "SELECT m FROM MgwSuscriptor m WHERE m.barrio = :barrio")
    , @NamedQuery(name = "MgwSuscriptor.findByCodciudad", query = "SELECT m FROM MgwSuscriptor m WHERE m.codciudad = :codciudad")
    , @NamedQuery(name = "MgwSuscriptor.findByNumdir2", query = "SELECT m FROM MgwSuscriptor m WHERE m.numdir2 = :numdir2")
    , @NamedQuery(name = "MgwSuscriptor.findByCll2", query = "SELECT m FROM MgwSuscriptor m WHERE m.cll2 = :cll2")
    , @NamedQuery(name = "MgwSuscriptor.findByApto2", query = "SELECT m FROM MgwSuscriptor m WHERE m.apto2 = :apto2")
    , @NamedQuery(name = "MgwSuscriptor.findByCiudad2", query = "SELECT m FROM MgwSuscriptor m WHERE m.ciudad2 = :ciudad2")
    , @NamedQuery(name = "MgwSuscriptor.findByTarifa", query = "SELECT m FROM MgwSuscriptor m WHERE m.tarifa = :tarifa")
    , @NamedQuery(name = "MgwSuscriptor.findByEstrato", query = "SELECT m FROM MgwSuscriptor m WHERE m.estrato = :estrato")})
public class MgwSuscriptor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SUSCRIPTOR")
    private Long idSuscriptor;
    private Long documento;
    @Size(max = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    private short estado;
    @Size(max = 20)
    private String telefono1;
    @Size(max = 20)
    private String telefono2;
    private Long cuenta;
    @Size(max = 100)
    private String cll;
    @Size(max = 50)
    private String numdir;
    @Size(max = 50)
    private String apto;
    @Size(max = 50)
    private String barrio;
    @Size(max = 6)
    private String codciudad;
    @Size(max = 50)
    private String numdir2;
    @Size(max = 50)
    private String cll2;
    @Size(max = 50)
    private String apto2;
    @Size(max = 50)
    private String ciudad2;
    @Size(max = 20)
    private String tarifa;
    @Size(max = 20)
    private String estrato;
    @OneToMany(mappedBy = "idSuscriptor")
    private Collection<MgwAgenda> mgwAgendaCollection;

    public MgwSuscriptor() {
    }

    public MgwSuscriptor(Long idSuscriptor) {
        this.idSuscriptor = idSuscriptor;
    }

    public MgwSuscriptor(Long idSuscriptor, short estado) {
        this.idSuscriptor = idSuscriptor;
        this.estado = estado;
    }

    public Long getIdSuscriptor() {
        return idSuscriptor;
    }

    public void setIdSuscriptor(Long idSuscriptor) {
        this.idSuscriptor = idSuscriptor;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public Long getCuenta() {
        return cuenta;
    }

    public void setCuenta(Long cuenta) {
        this.cuenta = cuenta;
    }

    public String getCll() {
        return cll;
    }

    public void setCll(String cll) {
        this.cll = cll;
    }

    public String getNumdir() {
        return numdir;
    }

    public void setNumdir(String numdir) {
        this.numdir = numdir;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCodciudad() {
        return codciudad;
    }

    public void setCodciudad(String codciudad) {
        this.codciudad = codciudad;
    }

    public String getNumdir2() {
        return numdir2;
    }

    public void setNumdir2(String numdir2) {
        this.numdir2 = numdir2;
    }

    public String getCll2() {
        return cll2;
    }

    public void setCll2(String cll2) {
        this.cll2 = cll2;
    }

    public String getApto2() {
        return apto2;
    }

    public void setApto2(String apto2) {
        this.apto2 = apto2;
    }

    public String getCiudad2() {
        return ciudad2;
    }

    public void setCiudad2(String ciudad2) {
        this.ciudad2 = ciudad2;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    @XmlTransient
    public Collection<MgwAgenda> getMgwAgendaCollection() {
        return mgwAgendaCollection;
    }

    public void setMgwAgendaCollection(Collection<MgwAgenda> mgwAgendaCollection) {
        this.mgwAgendaCollection = mgwAgendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSuscriptor != null ? idSuscriptor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwSuscriptor)) {
            return false;
        }
        MgwSuscriptor other = (MgwSuscriptor) object;
        if ((this.idSuscriptor == null && other.idSuscriptor != null) || (this.idSuscriptor != null && !this.idSuscriptor.equals(other.idSuscriptor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwSuscriptor[ idSuscriptor=" + idSuscriptor + " ]";
    }
    
}
