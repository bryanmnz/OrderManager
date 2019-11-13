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
@Table(name = "MGW_CAPACIDADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwCapacidades.findAll", query = "SELECT m FROM MgwCapacidades m")
    , @NamedQuery(name = "MgwCapacidades.findByIdCapacidad", query = "SELECT m FROM MgwCapacidades m WHERE m.idCapacidad = :idCapacidad")
    , @NamedQuery(name = "MgwCapacidades.findByUbicacion", query = "SELECT m FROM MgwCapacidades m WHERE m.ubicacion = :ubicacion")
    , @NamedQuery(name = "MgwCapacidades.findByDuracionactividad", query = "SELECT m FROM MgwCapacidades m WHERE m.duracionactividad = :duracionactividad")
    , @NamedQuery(name = "MgwCapacidades.findByTiempoactividadesviaje", query = "SELECT m FROM MgwCapacidades m WHERE m.tiempoactividadesviaje = :tiempoactividadesviaje")
    , @NamedQuery(name = "MgwCapacidades.findByFechaItem", query = "SELECT m FROM MgwCapacidades m WHERE m.fechaItem = :fechaItem")
    , @NamedQuery(name = "MgwCapacidades.findByFranjastiempo", query = "SELECT m FROM MgwCapacidades m WHERE m.franjastiempo = :franjastiempo")
    , @NamedQuery(name = "MgwCapacidades.findByActividadestrabajo", query = "SELECT m FROM MgwCapacidades m WHERE m.actividadestrabajo = :actividadestrabajo")
    , @NamedQuery(name = "MgwCapacidades.findByTiempototal", query = "SELECT m FROM MgwCapacidades m WHERE m.tiempototal = :tiempototal")
    , @NamedQuery(name = "MgwCapacidades.findByTiempodisponible", query = "SELECT m FROM MgwCapacidades m WHERE m.tiempodisponible = :tiempodisponible")
    , @NamedQuery(name = "MgwCapacidades.findByFechaMod", query = "SELECT m FROM MgwCapacidades m WHERE m.fechaMod = :fechaMod")
    , @NamedQuery(name = "MgwCapacidades.findByUsuarioMod", query = "SELECT m FROM MgwCapacidades m WHERE m.usuarioMod = :usuarioMod")
    , @NamedQuery(name = "MgwCapacidades.findByConveniente", query = "SELECT m FROM MgwCapacidades m WHERE m.conveniente = :conveniente")})
public class MgwCapacidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CAPACIDAD")
    private Long idCapacidad;
    @Size(max = 150)
    private String ubicacion;
    private Long duracionactividad;
    private Long tiempoactividadesviaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_ITEM")
    @Temporal(TemporalType.DATE)
    private Date fechaItem;
    @Size(max = 20)
    private String franjastiempo;
    @Size(max = 30)
    private String actividadestrabajo;
    private Long tiempototal;
    private Long tiempodisponible;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_MOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMod;
    @Column(name = "USUARIO_MOD")
    private Long usuarioMod;
    @Basic(optional = false)
    @NotNull
    private long conveniente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCapacidad")
    private Collection<MgwAgenda> mgwAgendaCollection;

    public MgwCapacidades() {
    }

    public MgwCapacidades(Long idCapacidad) {
        this.idCapacidad = idCapacidad;
    }

    public MgwCapacidades(Long idCapacidad, Date fechaItem, Date fechaMod, long conveniente) {
        this.idCapacidad = idCapacidad;
        this.fechaItem = fechaItem;
        this.fechaMod = fechaMod;
        this.conveniente = conveniente;
    }

    public Long getIdCapacidad() {
        return idCapacidad;
    }

    public void setIdCapacidad(Long idCapacidad) {
        this.idCapacidad = idCapacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Long getDuracionactividad() {
        return duracionactividad;
    }

    public void setDuracionactividad(Long duracionactividad) {
        this.duracionactividad = duracionactividad;
    }

    public Long getTiempoactividadesviaje() {
        return tiempoactividadesviaje;
    }

    public void setTiempoactividadesviaje(Long tiempoactividadesviaje) {
        this.tiempoactividadesviaje = tiempoactividadesviaje;
    }

    public Date getFechaItem() {
        return fechaItem;
    }

    public void setFechaItem(Date fechaItem) {
        this.fechaItem = fechaItem;
    }

    public String getFranjastiempo() {
        return franjastiempo;
    }

    public void setFranjastiempo(String franjastiempo) {
        this.franjastiempo = franjastiempo;
    }

    public String getActividadestrabajo() {
        return actividadestrabajo;
    }

    public void setActividadestrabajo(String actividadestrabajo) {
        this.actividadestrabajo = actividadestrabajo;
    }

    public Long getTiempototal() {
        return tiempototal;
    }

    public void setTiempototal(Long tiempototal) {
        this.tiempototal = tiempototal;
    }

    public Long getTiempodisponible() {
        return tiempodisponible;
    }

    public void setTiempodisponible(Long tiempodisponible) {
        this.tiempodisponible = tiempodisponible;
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

    public long getConveniente() {
        return conveniente;
    }

    public void setConveniente(long conveniente) {
        this.conveniente = conveniente;
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
        hash += (idCapacidad != null ? idCapacidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwCapacidades)) {
            return false;
        }
        MgwCapacidades other = (MgwCapacidades) object;
        if ((this.idCapacidad == null && other.idCapacidad != null) || (this.idCapacidad != null && !this.idCapacidad.equals(other.idCapacidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwCapacidades[ idCapacidad=" + idCapacidad + " ]";
    }
    
}
