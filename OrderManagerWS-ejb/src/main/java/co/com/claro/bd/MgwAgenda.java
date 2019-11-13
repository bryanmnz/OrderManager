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
@Table(name = "MGW_AGENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwAgenda.findAll", query = "SELECT m FROM MgwAgenda m")
    , @NamedQuery(name = "MgwAgenda.findByIdAgenda", query = "SELECT m FROM MgwAgenda m WHERE m.idAgenda = :idAgenda")
    , @NamedQuery(name = "MgwAgenda.findByDiaagenda", query = "SELECT m FROM MgwAgenda m WHERE m.diaagenda = :diaagenda")
    , @NamedQuery(name = "MgwAgenda.findByIdtecnico", query = "SELECT m FROM MgwAgenda m WHERE m.idtecnico = :idtecnico")
    , @NamedQuery(name = "MgwAgenda.findByIdTt", query = "SELECT m FROM MgwAgenda m WHERE m.idTt = :idTt")
    , @NamedQuery(name = "MgwAgenda.findByIdaliado", query = "SELECT m FROM MgwAgenda m WHERE m.idaliado = :idaliado")
    , @NamedQuery(name = "MgwAgenda.findByIdusuario", query = "SELECT m FROM MgwAgenda m WHERE m.idusuario = :idusuario")
    , @NamedQuery(name = "MgwAgenda.findByFechaCreacion", query = "SELECT m FROM MgwAgenda m WHERE m.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "MgwAgenda.findByNumticket", query = "SELECT m FROM MgwAgenda m WHERE m.numticket = :numticket")
    , @NamedQuery(name = "MgwAgenda.findByIdCodresultado", query = "SELECT m FROM MgwAgenda m WHERE m.idCodresultado = :idCodresultado")
    , @NamedQuery(name = "MgwAgenda.findByObservacion", query = "SELECT m FROM MgwAgenda m WHERE m.observacion = :observacion")
    , @NamedQuery(name = "MgwAgenda.findByHoraLlegada", query = "SELECT m FROM MgwAgenda m WHERE m.horaLlegada = :horaLlegada")
    , @NamedQuery(name = "MgwAgenda.findByHoraSalida", query = "SELECT m FROM MgwAgenda m WHERE m.horaSalida = :horaSalida")
    , @NamedQuery(name = "MgwAgenda.findByCuenta", query = "SELECT m FROM MgwAgenda m WHERE m.cuenta = :cuenta")
    , @NamedQuery(name = "MgwAgenda.findByCodciudad", query = "SELECT m FROM MgwAgenda m WHERE m.codciudad = :codciudad")
    , @NamedQuery(name = "MgwAgenda.findByEstadoCrm", query = "SELECT m FROM MgwAgenda m WHERE m.estadoCrm = :estadoCrm")
    , @NamedQuery(name = "MgwAgenda.findByOrdenToa", query = "SELECT m FROM MgwAgenda m WHERE m.ordenToa = :ordenToa")
    , @NamedQuery(name = "MgwAgenda.findByNumNotarr", query = "SELECT m FROM MgwAgenda m WHERE m.numNotarr = :numNotarr")})
public class MgwAgenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGENDA")
    private Long idAgenda;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date diaagenda;
    private Long idtecnico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TT")
    private long idTt;
    private Long idaliado;
    @Basic(optional = false)
    @NotNull
    private long idusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Size(max = 20)
    private String numticket;
    @Column(name = "ID_CODRESULTADO")
    private Long idCodresultado;
    @Size(max = 4000)
    private String observacion;
    @Column(name = "HORA_LLEGADA")
    @Temporal(TemporalType.DATE)
    private Date horaLlegada;
    @Column(name = "HORA_SALIDA")
    @Temporal(TemporalType.DATE)
    private Date horaSalida;
    private Long cuenta;
    @Size(max = 6)
    private String codciudad;
    @Column(name = "ESTADO_CRM")
    private Character estadoCrm;
    @Size(max = 20)
    @Column(name = "ORDEN_TOA")
    private String ordenToa;
    @Column(name = "NUM_NOTARR")
    private Long numNotarr;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgenda")
    private Collection<MgwActFact> mgwActFactCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgenda")
    private Collection<MgwAgendaEstados> mgwAgendaEstadosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgenda")
    private Collection<MgwPreFactura> mgwPreFacturaCollection;
    @JoinColumn(name = "ID_CAPACIDAD", referencedColumnName = "ID_CAPACIDAD")
    @ManyToOne(optional = false)
    private MgwCapacidades idCapacidad;
    @JoinColumn(name = "ID_ESTADO_AGENDA", referencedColumnName = "ID_ESTADO_AGENDA")
    @ManyToOne(optional = false)
    private MgwEstadoAgenda idEstadoAgenda;
    @JoinColumn(name = "ID_ORDEN", referencedColumnName = "ID_ORDEN")
    @ManyToOne(optional = false)
    private MgwOrden idOrden;
    @JoinColumn(name = "ID_ORIGEN", referencedColumnName = "ID_ORIGEN")
    @ManyToOne(optional = false)
    private MgwOrigen idOrigen;
    @JoinColumn(name = "ID_SUSCRIPTOR", referencedColumnName = "ID_SUSCRIPTOR")
    @ManyToOne
    private MgwSuscriptor idSuscriptor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgenda")
    private Collection<MgwCaracteristicasAg> mgwCaracteristicasAgCollection;

    public MgwAgenda() {
    }

    public MgwAgenda(Long idAgenda) {
        this.idAgenda = idAgenda;
    }

    public MgwAgenda(Long idAgenda, Date diaagenda, long idTt, long idusuario, Date fechaCreacion) {
        this.idAgenda = idAgenda;
        this.diaagenda = diaagenda;
        this.idTt = idTt;
        this.idusuario = idusuario;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Long idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Date getDiaagenda() {
        return diaagenda;
    }

    public void setDiaagenda(Date diaagenda) {
        this.diaagenda = diaagenda;
    }

    public Long getIdtecnico() {
        return idtecnico;
    }

    public void setIdtecnico(Long idtecnico) {
        this.idtecnico = idtecnico;
    }

    public long getIdTt() {
        return idTt;
    }

    public void setIdTt(long idTt) {
        this.idTt = idTt;
    }

    public Long getIdaliado() {
        return idaliado;
    }

    public void setIdaliado(Long idaliado) {
        this.idaliado = idaliado;
    }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNumticket() {
        return numticket;
    }

    public void setNumticket(String numticket) {
        this.numticket = numticket;
    }

    public Long getIdCodresultado() {
        return idCodresultado;
    }

    public void setIdCodresultado(Long idCodresultado) {
        this.idCodresultado = idCodresultado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Long getCuenta() {
        return cuenta;
    }

    public void setCuenta(Long cuenta) {
        this.cuenta = cuenta;
    }

    public String getCodciudad() {
        return codciudad;
    }

    public void setCodciudad(String codciudad) {
        this.codciudad = codciudad;
    }

    public Character getEstadoCrm() {
        return estadoCrm;
    }

    public void setEstadoCrm(Character estadoCrm) {
        this.estadoCrm = estadoCrm;
    }

    public String getOrdenToa() {
        return ordenToa;
    }

    public void setOrdenToa(String ordenToa) {
        this.ordenToa = ordenToa;
    }

    public Long getNumNotarr() {
        return numNotarr;
    }

    public void setNumNotarr(Long numNotarr) {
        this.numNotarr = numNotarr;
    }

    @XmlTransient
    public Collection<MgwActFact> getMgwActFactCollection() {
        return mgwActFactCollection;
    }

    public void setMgwActFactCollection(Collection<MgwActFact> mgwActFactCollection) {
        this.mgwActFactCollection = mgwActFactCollection;
    }

    @XmlTransient
    public Collection<MgwAgendaEstados> getMgwAgendaEstadosCollection() {
        return mgwAgendaEstadosCollection;
    }

    public void setMgwAgendaEstadosCollection(Collection<MgwAgendaEstados> mgwAgendaEstadosCollection) {
        this.mgwAgendaEstadosCollection = mgwAgendaEstadosCollection;
    }

    @XmlTransient
    public Collection<MgwPreFactura> getMgwPreFacturaCollection() {
        return mgwPreFacturaCollection;
    }

    public void setMgwPreFacturaCollection(Collection<MgwPreFactura> mgwPreFacturaCollection) {
        this.mgwPreFacturaCollection = mgwPreFacturaCollection;
    }

    public MgwCapacidades getIdCapacidad() {
        return idCapacidad;
    }

    public void setIdCapacidad(MgwCapacidades idCapacidad) {
        this.idCapacidad = idCapacidad;
    }

    public MgwEstadoAgenda getIdEstadoAgenda() {
        return idEstadoAgenda;
    }

    public void setIdEstadoAgenda(MgwEstadoAgenda idEstadoAgenda) {
        this.idEstadoAgenda = idEstadoAgenda;
    }

    public MgwOrden getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(MgwOrden idOrden) {
        this.idOrden = idOrden;
    }

    public MgwOrigen getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(MgwOrigen idOrigen) {
        this.idOrigen = idOrigen;
    }

    public MgwSuscriptor getIdSuscriptor() {
        return idSuscriptor;
    }

    public void setIdSuscriptor(MgwSuscriptor idSuscriptor) {
        this.idSuscriptor = idSuscriptor;
    }

    @XmlTransient
    public Collection<MgwCaracteristicasAg> getMgwCaracteristicasAgCollection() {
        return mgwCaracteristicasAgCollection;
    }

    public void setMgwCaracteristicasAgCollection(Collection<MgwCaracteristicasAg> mgwCaracteristicasAgCollection) {
        this.mgwCaracteristicasAgCollection = mgwCaracteristicasAgCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgenda != null ? idAgenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwAgenda)) {
            return false;
        }
        MgwAgenda other = (MgwAgenda) object;
        if ((this.idAgenda == null && other.idAgenda != null) || (this.idAgenda != null && !this.idAgenda.equals(other.idAgenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MgwAgenda{" + "idAgenda=" + idAgenda + ", diaagenda=" + diaagenda + ", idtecnico=" + idtecnico + ", idTt=" + idTt + ", idaliado=" + idaliado + ", idusuario=" + idusuario + ", fechaCreacion=" + fechaCreacion + ", numticket=" + numticket + ", idCodresultado=" + idCodresultado + ", observacion=" + observacion + ", horaLlegada=" + horaLlegada + ", horaSalida=" + horaSalida + ", cuenta=" + cuenta + ", codciudad=" + codciudad + ", estadoCrm=" + estadoCrm + ", ordenToa=" + ordenToa + ", numNotarr=" + numNotarr + ", mgwActFactCollection=" + mgwActFactCollection + ", mgwAgendaEstadosCollection=" + mgwAgendaEstadosCollection + ", mgwPreFacturaCollection=" + mgwPreFacturaCollection + ", idCapacidad=" + idCapacidad + ", idEstadoAgenda=" + idEstadoAgenda + ", idOrden=" + idOrden + ", idOrigen=" + idOrigen + ", idSuscriptor=" + idSuscriptor + ", mgwCaracteristicasAgCollection=" + mgwCaracteristicasAgCollection + '}';
    }

    

}
