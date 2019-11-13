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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "MGW_ORDEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwOrden.findAll", query = "SELECT m FROM MgwOrden m")
    , @NamedQuery(name = "MgwOrden.findByIdOrden", query = "SELECT m FROM MgwOrden m WHERE m.idOrden = :idOrden")
    , @NamedQuery(name = "MgwOrden.findByOrden", query = "SELECT m FROM MgwOrden m WHERE m.orden = :orden")
    , @NamedQuery(name = "MgwOrden.findByIdTt", query = "SELECT m FROM MgwOrden m WHERE m.idTt = :idTt")
    , @NamedQuery(name = "MgwOrden.findByIdTipoOrden", query = "SELECT m FROM MgwOrden m WHERE m.idTipoOrden = :idTipoOrden")
    , @NamedQuery(name = "MgwOrden.findByCalendario", query = "SELECT m FROM MgwOrden m WHERE m.calendario = :calendario")
    , @NamedQuery(name = "MgwOrden.findByFechaMod", query = "SELECT m FROM MgwOrden m WHERE m.fechaMod = :fechaMod")
    , @NamedQuery(name = "MgwOrden.findByCll", query = "SELECT m FROM MgwOrden m WHERE m.cll = :cll")
    , @NamedQuery(name = "MgwOrden.findByNumdir", query = "SELECT m FROM MgwOrden m WHERE m.numdir = :numdir")
    , @NamedQuery(name = "MgwOrden.findByApto", query = "SELECT m FROM MgwOrden m WHERE m.apto = :apto")
    , @NamedQuery(name = "MgwOrden.findByBarrio", query = "SELECT m FROM MgwOrden m WHERE m.barrio = :barrio")
    , @NamedQuery(name = "MgwOrden.findByUsuarioMod", query = "SELECT m FROM MgwOrden m WHERE m.usuarioMod = :usuarioMod")
    , @NamedQuery(name = "MgwOrden.findByHash", query = "SELECT m FROM MgwOrden m WHERE m.hash = :hash")
    , @NamedQuery(name = "MgwOrden.findByCuenta", query = "SELECT m FROM MgwOrden m WHERE m.cuenta = :cuenta")
    , @NamedQuery(name = "MgwOrden.findByClienteToa", query = "SELECT m FROM MgwOrden m WHERE m.clienteToa = :clienteToa")
    , @NamedQuery(name = "MgwOrden.findByCodCiudad", query = "SELECT m FROM MgwOrden m WHERE m.codCiudad = :codCiudad")
    , @NamedQuery(name = "MgwOrden.findByOrdenToa", query = "SELECT m FROM MgwOrden m WHERE m.ordenToa = :ordenToa")
    , @NamedQuery(name = "MgwOrden.findByCodnodo", query = "SELECT m FROM MgwOrden m WHERE m.codnodo = :codnodo")
    , @NamedQuery(name = "MgwOrden.findByNumlineas", query = "SELECT m FROM MgwOrden m WHERE m.numlineas = :numlineas")
    , @NamedQuery(name = "MgwOrden.findByNumnota", query = "SELECT m FROM MgwOrden m WHERE m.numnota = :numnota")
    , @NamedQuery(name = "MgwOrden.findByEstrato", query = "SELECT m FROM MgwOrden m WHERE m.estrato = :estrato")
    , @NamedQuery(name = "MgwOrden.findByTipoCliente", query = "SELECT m FROM MgwOrden m WHERE m.tipoCliente = :tipoCliente")
    , @NamedQuery(name = "MgwOrden.findByTarifa", query = "SELECT m FROM MgwOrden m WHERE m.tarifa = :tarifa")
    , @NamedQuery(name = "MgwOrden.findByTarifaSuscriptor", query = "SELECT m FROM MgwOrden m WHERE m.tarifaSuscriptor = :tarifaSuscriptor")})
public class MgwOrden implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORDEN")
    private Long idOrden;
    
    private Long orden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TT")
    private long idTt;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_ORDEN")
    private String idTipoOrden;
    
    @Size(max = 100)
    private String calendario;
    @Column(name = "FECHA_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMod;
    @Size(max = 150)
    private String cll;
    @Size(max = 50)
    private String numdir;
    @Size(max = 50)
    private String apto;
    @Size(max = 50)
    private String barrio;
    @Column(name = "USUARIO_MOD")
    private Long usuarioMod;
    @Size(max = 60)
    private String hash;
    @Basic(optional = false)
    @NotNull
    private long cuenta;
    @Size(max = 30)
    @Column(name = "CLIENTE_TOA")
    private String clienteToa;
    @Size(max = 6)
    @Column(name = "COD_CIUDAD")
    private String codCiudad;
    @Lob
    private String notas;
    @Size(max = 20)
    @Column(name = "ORDEN_TOA")
    private String ordenToa;
    @Size(max = 6)
    private String codnodo;
    private Long numlineas;
    private Long numnota;
    @Size(max = 6)
    private String estrato;
    @Size(max = 3)
    @Column(name = "TIPO_CLIENTE")
    private String tipoCliente;
    @Size(max = 6)
    private String tarifa;
    @Size(max = 6)
    @Column(name = "TARIFA_SUSCRIPTOR")
    private String tarifaSuscriptor;
    @JoinColumn(name = "ID_CATEGO_OR", referencedColumnName = "ID_CATEGO_OR")
    @ManyToOne(optional = false)
    private MgwCategoriaOrd idCategoOr;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrden")
    private Collection<MgwConciliacion> mgwConciliacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrden")
    private Collection<MgwAgenda> mgwAgendaCollection;

    public MgwOrden() {
    }

    public MgwOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public MgwOrden(Long idOrden, long idTt, String idTipoOrden, long cuenta) {
        this.idOrden = idOrden;
        this.idTt = idTt;
        this.idTipoOrden = idTipoOrden;
        this.cuenta = cuenta;
    }

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public Long getOrden() {
        return orden;
    }

    public void setOrden(Long orden) {
        this.orden = orden;
    }

    public long getIdTt() {
        return idTt;
    }

    public void setIdTt(long idTt) {
        this.idTt = idTt;
    }

    public String getIdTipoOrden() {
        return idTipoOrden;
    }

    public void setIdTipoOrden(String idTipoOrden) {
        this.idTipoOrden = idTipoOrden;
    }

    public String getCalendario() {
        return calendario;
    }

    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
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

    public Long getUsuarioMod() {
        return usuarioMod;
    }

    public void setUsuarioMod(Long usuarioMod) {
        this.usuarioMod = usuarioMod;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public String getClienteToa() {
        return clienteToa;
    }

    public void setClienteToa(String clienteToa) {
        this.clienteToa = clienteToa;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getOrdenToa() {
        return ordenToa;
    }

    public void setOrdenToa(String ordenToa) {
        this.ordenToa = ordenToa;
    }

    public String getCodnodo() {
        return codnodo;
    }

    public void setCodnodo(String codnodo) {
        this.codnodo = codnodo;
    }

    public Long getNumlineas() {
        return numlineas;
    }

    public void setNumlineas(Long numlineas) {
        this.numlineas = numlineas;
    }

    public Long getNumnota() {
        return numnota;
    }

    public void setNumnota(Long numnota) {
        this.numnota = numnota;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getTarifaSuscriptor() {
        return tarifaSuscriptor;
    }

    public void setTarifaSuscriptor(String tarifaSuscriptor) {
        this.tarifaSuscriptor = tarifaSuscriptor;
    }

    public MgwCategoriaOrd getIdCategoOr() {
        return idCategoOr;
    }

    public void setIdCategoOr(MgwCategoriaOrd idCategoOr) {
        this.idCategoOr = idCategoOr;
    }

    @XmlTransient
    public Collection<MgwConciliacion> getMgwConciliacionCollection() {
        return mgwConciliacionCollection;
    }

    public void setMgwConciliacionCollection(Collection<MgwConciliacion> mgwConciliacionCollection) {
        this.mgwConciliacionCollection = mgwConciliacionCollection;
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
        hash += (idOrden != null ? idOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwOrden)) {
            return false;
        }
        MgwOrden other = (MgwOrden) object;
        if ((this.idOrden == null && other.idOrden != null) || (this.idOrden != null && !this.idOrden.equals(other.idOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwOrden[ idOrden=" + idOrden + " ]";
    }
    
}
