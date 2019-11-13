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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "MGW_AGENDA_ESTADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwAgendaEstados.findAll", query = "SELECT m FROM MgwAgendaEstados m")
    , @NamedQuery(name = "MgwAgendaEstados.findByIdAgendaEstados", query = "SELECT m FROM MgwAgendaEstados m WHERE m.idAgendaEstados = :idAgendaEstados")
    , @NamedQuery(name = "MgwAgendaEstados.findByDiaagenda", query = "SELECT m FROM MgwAgendaEstados m WHERE m.diaagenda = :diaagenda")
    , @NamedQuery(name = "MgwAgendaEstados.findByIdtecnico", query = "SELECT m FROM MgwAgendaEstados m WHERE m.idtecnico = :idtecnico")
    , @NamedQuery(name = "MgwAgendaEstados.findByIdTt", query = "SELECT m FROM MgwAgendaEstados m WHERE m.idTt = :idTt")
    , @NamedQuery(name = "MgwAgendaEstados.findByIdaliado", query = "SELECT m FROM MgwAgendaEstados m WHERE m.idaliado = :idaliado")
    , @NamedQuery(name = "MgwAgendaEstados.findByIdusuario", query = "SELECT m FROM MgwAgendaEstados m WHERE m.idusuario = :idusuario")
    , @NamedQuery(name = "MgwAgendaEstados.findByFechaCreacion", query = "SELECT m FROM MgwAgendaEstados m WHERE m.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "MgwAgendaEstados.findByObservacion", query = "SELECT m FROM MgwAgendaEstados m WHERE m.observacion = :observacion")
    , @NamedQuery(name = "MgwAgendaEstados.findByIdCodresultado", query = "SELECT m FROM MgwAgendaEstados m WHERE m.idCodresultado = :idCodresultado")
    , @NamedQuery(name = "MgwAgendaEstados.findByIdCapacidad", query = "SELECT m FROM MgwAgendaEstados m WHERE m.idCapacidad = :idCapacidad")
    , @NamedQuery(name = "MgwAgendaEstados.findByHoraLlegada", query = "SELECT m FROM MgwAgendaEstados m WHERE m.horaLlegada = :horaLlegada")
    , @NamedQuery(name = "MgwAgendaEstados.findByHoraSalida", query = "SELECT m FROM MgwAgendaEstados m WHERE m.horaSalida = :horaSalida")})
public class MgwAgendaEstados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGENDA_ESTADOS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MGW_AGENDA_ESTADOS_GENERATOR")
    @SequenceGenerator(name = "MGW_AGENDA_ESTADOS_GENERATOR", initialValue = 1, allocationSize = 1, sequenceName = "MGW_AGENDA_ESTADOS_SEQ")
    private Long idAgendaEstados;
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
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Size(max = 4000)
    private String observacion;
    @Column(name = "ID_CODRESULTADO")
    private Long idCodresultado;
    @Column(name = "ID_CAPACIDAD")
    private Long idCapacidad;
    @Column(name = "HORA_LLEGADA")
    @Temporal(TemporalType.DATE)
    private Date horaLlegada;
    @Column(name = "HORA_SALIDA")
    @Temporal(TemporalType.DATE)
    private Date horaSalida;
    @JoinColumn(name = "ID_AGENDA", referencedColumnName = "ID_AGENDA")
    @ManyToOne(optional = false)
    private MgwAgenda idAgenda;
    @JoinColumn(name = "ID_ESTADO_AGENDA", referencedColumnName = "ID_ESTADO_AGENDA")
    @ManyToOne(optional = false)
    private MgwEstadoAgenda idEstadoAgenda;

    public MgwAgendaEstados() {
    }

    public MgwAgendaEstados(Long idAgendaEstados) {
        this.idAgendaEstados = idAgendaEstados;
    }

    public MgwAgendaEstados(Long idAgendaEstados, Date diaagenda, long idTt, long idusuario, Date fechaCreacion) {
        this.idAgendaEstados = idAgendaEstados;
        this.diaagenda = diaagenda;
        this.idTt = idTt;
        this.idusuario = idusuario;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdAgendaEstados() {
        return idAgendaEstados;
    }

    public void setIdAgendaEstados(Long idAgendaEstados) {
        this.idAgendaEstados = idAgendaEstados;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getIdCodresultado() {
        return idCodresultado;
    }

    public void setIdCodresultado(Long idCodresultado) {
        this.idCodresultado = idCodresultado;
    }

    public Long getIdCapacidad() {
        return idCapacidad;
    }

    public void setIdCapacidad(Long idCapacidad) {
        this.idCapacidad = idCapacidad;
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

    public MgwAgenda getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(MgwAgenda idAgenda) {
        this.idAgenda = idAgenda;
    }

    public MgwEstadoAgenda getIdEstadoAgenda() {
        return idEstadoAgenda;
    }

    public void setIdEstadoAgenda(MgwEstadoAgenda idEstadoAgenda) {
        this.idEstadoAgenda = idEstadoAgenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgendaEstados != null ? idAgendaEstados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwAgendaEstados)) {
            return false;
        }
        MgwAgendaEstados other = (MgwAgendaEstados) object;
        if ((this.idAgendaEstados == null && other.idAgendaEstados != null) || (this.idAgendaEstados != null && !this.idAgendaEstados.equals(other.idAgendaEstados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwAgendaEstados[ idAgendaEstados=" + idAgendaEstados + " ]";
    }
    
}
