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
@Table(name = "MGW_PROCESO_ORDENES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwProcesoOrdenes.findAll", query = "SELECT m FROM MgwProcesoOrdenes m")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByIdProcesoOrdenes", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.idProcesoOrdenes = :idProcesoOrdenes")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByCrearOrden", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.crearOrden = :crearOrden")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByAsignarTecnico", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.asignarTecnico = :asignarTecnico")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByIniciarOrden", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.iniciarOrden = :iniciarOrden")
    , @NamedQuery(name = "MgwProcesoOrdenes.findBySoftClose", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.softClose = :softClose")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByCompletarOrden", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.completarOrden = :completarOrden")
    , @NamedQuery(name = "MgwProcesoOrdenes.findBySuspenderOrden", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.suspenderOrden = :suspenderOrden")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByActNoRealizada", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.actNoRealizada = :actNoRealizada")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByFechaGrabacion", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.fechaGrabacion = :fechaGrabacion")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByFechaModificacion", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByUsuario", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.usuario = :usuario")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByCompletarRr", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.completarRr = :completarRr")
    , @NamedQuery(name = "MgwProcesoOrdenes.findByActualizarRr", query = "SELECT m FROM MgwProcesoOrdenes m WHERE m.actualizarRr = :actualizarRr")})
public class MgwProcesoOrdenes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PROCESO_ORDENES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MGW_PROCESO_ORDENES_GENERATOR")
    @SequenceGenerator(name = "MGW_PROCESO_ORDENES_GENERATOR", initialValue = 1, allocationSize = 1, sequenceName = "MGW_PROCESO_ORDENES_SEQ")
    private Long idProcesoOrdenes;
    @Column(name = "CREAR_ORDEN")
    @Temporal(TemporalType.DATE)
    private Date crearOrden;
    @Column(name = "ASIGNAR_TECNICO")
    @Temporal(TemporalType.DATE)
    private Date asignarTecnico;
    @Column(name = "INICIAR_ORDEN")
    @Temporal(TemporalType.DATE)
    private Date iniciarOrden;
    @Column(name = "SOFT_CLOSE")
    @Temporal(TemporalType.DATE)
    private Date softClose;
    @Column(name = "COMPLETAR_ORDEN")
    @Temporal(TemporalType.DATE)
    private Date completarOrden;
    @Column(name = "SUSPENDER_ORDEN")
    @Temporal(TemporalType.DATE)
    private Date suspenderOrden;
    @Column(name = "ACT_NO_REALIZADA")
    @Temporal(TemporalType.DATE)
    private Date actNoRealizada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_GRABACION")
    @Temporal(TemporalType.DATE)
    private Date fechaGrabacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @Size(max = 15)
    @Column(name = "USUARIO")
    private String usuario;
    @Size(max = 20)
    @Column(name = "COMPLETAR_RR")
    private String completarRr;
    @Column(name = "ACTUALIZAR_RR")
    @Temporal(TemporalType.DATE)
    private Date actualizarRr;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORDEN")
    private Long idOrden;

    public MgwProcesoOrdenes() {
    }

    public MgwProcesoOrdenes(Long idProcesoOrdenes) {
        this.idProcesoOrdenes = idProcesoOrdenes;
    }

    public MgwProcesoOrdenes(Long idProcesoOrdenes, Date fechaGrabacion, Date fechaModificacion) {
        this.idProcesoOrdenes = idProcesoOrdenes;
        this.fechaGrabacion = fechaGrabacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getIdProcesoOrdenes() {
        return idProcesoOrdenes;
    }

    public void setIdProcesoOrdenes(Long idProcesoOrdenes) {
        this.idProcesoOrdenes = idProcesoOrdenes;
    }

    public Date getCrearOrden() {
        return crearOrden;
    }

    public void setCrearOrden(Date crearOrden) {
        this.crearOrden = crearOrden;
    }

    public Date getAsignarTecnico() {
        return asignarTecnico;
    }

    public void setAsignarTecnico(Date asignarTecnico) {
        this.asignarTecnico = asignarTecnico;
    }

    public Date getIniciarOrden() {
        return iniciarOrden;
    }

    public void setIniciarOrden(Date iniciarOrden) {
        this.iniciarOrden = iniciarOrden;
    }

    public Date getSoftClose() {
        return softClose;
    }

    public void setSoftClose(Date softClose) {
        this.softClose = softClose;
    }

    public Date getCompletarOrden() {
        return completarOrden;
    }

    public void setCompletarOrden(Date completarOrden) {
        this.completarOrden = completarOrden;
    }

    public Date getSuspenderOrden() {
        return suspenderOrden;
    }

    public void setSuspenderOrden(Date suspenderOrden) {
        this.suspenderOrden = suspenderOrden;
    }

    public Date getActNoRealizada() {
        return actNoRealizada;
    }

    public void setActNoRealizada(Date actNoRealizada) {
        this.actNoRealizada = actNoRealizada;
    }

    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }

    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCompletarRr() {
        return completarRr;
    }

    public void setCompletarRr(String completarRr) {
        this.completarRr = completarRr;
    }

    public Date getActualizarRr() {
        return actualizarRr;
    }

    public void setActualizarRr(Date actualizarRr) {
        this.actualizarRr = actualizarRr;
    }

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcesoOrdenes != null ? idProcesoOrdenes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwProcesoOrdenes)) {
            return false;
        }
        MgwProcesoOrdenes other = (MgwProcesoOrdenes) object;
        if ((this.idProcesoOrdenes == null && other.idProcesoOrdenes != null) || (this.idProcesoOrdenes != null && !this.idProcesoOrdenes.equals(other.idProcesoOrdenes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwProcesoOrdenes[ idProcesoOrdenes=" + idProcesoOrdenes + " ]";
    }

}
