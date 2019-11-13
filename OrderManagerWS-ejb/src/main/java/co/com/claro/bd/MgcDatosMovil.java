/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "MGC_DATOS_MOVIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgcDatosMovil.findAll", query = "SELECT m FROM MgcDatosMovil m")
    , @NamedQuery(name = "MgcDatosMovil.findByIdDatoMovil", query = "SELECT m FROM MgcDatosMovil m WHERE m.idDatoMovil = :idDatoMovil")
    , @NamedQuery(name = "MgcDatosMovil.findByCedula", query = "SELECT m FROM MgcDatosMovil m WHERE m.cedula = :cedula")
    , @NamedQuery(name = "MgcDatosMovil.findByNombres", query = "SELECT m FROM MgcDatosMovil m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "MgcDatosMovil.findByCodigoSap", query = "SELECT m FROM MgcDatosMovil m WHERE m.codigoSap = :codigoSap")
    , @NamedQuery(name = "MgcDatosMovil.findByFechaContratacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.fechaContratacion = :fechaContratacion")
    , @NamedQuery(name = "MgcDatosMovil.findByIdaliado", query = "SELECT m FROM MgcDatosMovil m WHERE m.idaliado = :idaliado")
    , @NamedQuery(name = "MgcDatosMovil.findByJefeInmediato", query = "SELECT m FROM MgcDatosMovil m WHERE m.jefeInmediato = :jefeInmediato")
    , @NamedQuery(name = "MgcDatosMovil.findByEstadoCertificacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.estadoCertificacion = :estadoCertificacion")
    , @NamedQuery(name = "MgcDatosMovil.findByVigenciaCertificacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.vigenciaCertificacion = :vigenciaCertificacion")
    , @NamedQuery(name = "MgcDatosMovil.findByFoto", query = "SELECT m FROM MgcDatosMovil m WHERE m.foto = :foto")
    , @NamedQuery(name = "MgcDatosMovil.findByCelular1", query = "SELECT m FROM MgcDatosMovil m WHERE m.celular1 = :celular1")
    , @NamedQuery(name = "MgcDatosMovil.findByMarcacel1", query = "SELECT m FROM MgcDatosMovil m WHERE m.marcacel1 = :marcacel1")
    , @NamedQuery(name = "MgcDatosMovil.findByRefcel1", query = "SELECT m FROM MgcDatosMovil m WHERE m.refcel1 = :refcel1")
    , @NamedQuery(name = "MgcDatosMovil.findByCorreo1", query = "SELECT m FROM MgcDatosMovil m WHERE m.correo1 = :correo1")
    , @NamedQuery(name = "MgcDatosMovil.findByCelular2", query = "SELECT m FROM MgcDatosMovil m WHERE m.celular2 = :celular2")
    , @NamedQuery(name = "MgcDatosMovil.findByMarcacel2", query = "SELECT m FROM MgcDatosMovil m WHERE m.marcacel2 = :marcacel2")
    , @NamedQuery(name = "MgcDatosMovil.findByRefcel2", query = "SELECT m FROM MgcDatosMovil m WHERE m.refcel2 = :refcel2")
    , @NamedQuery(name = "MgcDatosMovil.findByCorreo2", query = "SELECT m FROM MgcDatosMovil m WHERE m.correo2 = :correo2")
    , @NamedQuery(name = "MgcDatosMovil.findByActivoWfm", query = "SELECT m FROM MgcDatosMovil m WHERE m.activoWfm = :activoWfm")
    , @NamedQuery(name = "MgcDatosMovil.findByFechaActivacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.fechaActivacion = :fechaActivacion")
    , @NamedQuery(name = "MgcDatosMovil.findByComentarios", query = "SELECT m FROM MgcDatosMovil m WHERE m.comentarios = :comentarios")
    , @NamedQuery(name = "MgcDatosMovil.findByFechaActualizacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.fechaActualizacion = :fechaActualizacion")
    , @NamedQuery(name = "MgcDatosMovil.findByCiudad", query = "SELECT m FROM MgcDatosMovil m WHERE m.ciudad = :ciudad")
    , @NamedQuery(name = "MgcDatosMovil.findByApikey", query = "SELECT m FROM MgcDatosMovil m WHERE m.apikey = :apikey")
    , @NamedQuery(name = "MgcDatosMovil.findByAdicionarTiempoCertificacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.adicionarTiempoCertificacion = :adicionarTiempoCertificacion")
    , @NamedQuery(name = "MgcDatosMovil.findByFechaInactivacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.fechaInactivacion = :fechaInactivacion")
    , @NamedQuery(name = "MgcDatosMovil.findByComentariosInactivacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.comentariosInactivacion = :comentariosInactivacion")
    , @NamedQuery(name = "MgcDatosMovil.findByActivoToa", query = "SELECT m FROM MgcDatosMovil m WHERE m.activoToa = :activoToa")
    , @NamedQuery(name = "MgcDatosMovil.findByTiempoCertificacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.tiempoCertificacion = :tiempoCertificacion")
    , @NamedQuery(name = "MgcDatosMovil.findByIdSupervisor", query = "SELECT m FROM MgcDatosMovil m WHERE m.idSupervisor = :idSupervisor")
    , @NamedQuery(name = "MgcDatosMovil.findByIdTipoTecnico", query = "SELECT m FROM MgcDatosMovil m WHERE m.idTipoTecnico = :idTipoTecnico")
    , @NamedQuery(name = "MgcDatosMovil.findByParentId", query = "SELECT m FROM MgcDatosMovil m WHERE m.parentId = :parentId")
    , @NamedQuery(name = "MgcDatosMovil.findByExtencionAvaya", query = "SELECT m FROM MgcDatosMovil m WHERE m.extencionAvaya = :extencionAvaya")
    , @NamedQuery(name = "MgcDatosMovil.findByLoginAvaya", query = "SELECT m FROM MgcDatosMovil m WHERE m.loginAvaya = :loginAvaya")
    , @NamedQuery(name = "MgcDatosMovil.findByLoginrr", query = "SELECT m FROM MgcDatosMovil m WHERE m.loginrr = :loginrr")
    , @NamedQuery(name = "MgcDatosMovil.findByCargo", query = "SELECT m FROM MgcDatosMovil m WHERE m.cargo = :cargo")
    , @NamedQuery(name = "MgcDatosMovil.findByEstado", query = "SELECT m FROM MgcDatosMovil m WHERE m.estado = :estado")
    , @NamedQuery(name = "MgcDatosMovil.findByIdUsuario", query = "SELECT m FROM MgcDatosMovil m WHERE m.idUsuario = :idUsuario")
    , @NamedQuery(name = "MgcDatosMovil.findByFechaGrabacion", query = "SELECT m FROM MgcDatosMovil m WHERE m.fechaGrabacion = :fechaGrabacion")
    , @NamedQuery(name = "MgcDatosMovil.findByIdPerfilTecnico", query = "SELECT m FROM MgcDatosMovil m WHERE m.idPerfilTecnico = :idPerfilTecnico")
    , @NamedQuery(name = "MgcDatosMovil.findByIdPerfilTecnico1", query = "SELECT m FROM MgcDatosMovil m WHERE m.idPerfilTecnico1 = :idPerfilTecnico1")
    , @NamedQuery(name = "MgcDatosMovil.findByTecnicoVirtual", query = "SELECT m FROM MgcDatosMovil m WHERE m.tecnicoVirtual = :tecnicoVirtual")
    , @NamedQuery(name = "MgcDatosMovil.findByTecnicoVirtualCant", query = "SELECT m FROM MgcDatosMovil m WHERE m.tecnicoVirtualCant = :tecnicoVirtualCant")
    , @NamedQuery(name = "MgcDatosMovil.findByIdArl", query = "SELECT m FROM MgcDatosMovil m WHERE m.idArl = :idArl")
    , @NamedQuery(name = "MgcDatosMovil.findByIdEps", query = "SELECT m FROM MgcDatosMovil m WHERE m.idEps = :idEps")
    , @NamedQuery(name = "MgcDatosMovil.findByIdTipoVehiculo", query = "SELECT m FROM MgcDatosMovil m WHERE m.idTipoVehiculo = :idTipoVehiculo")
    , @NamedQuery(name = "MgcDatosMovil.findByIdTipoMovil", query = "SELECT m FROM MgcDatosMovil m WHERE m.idTipoMovil = :idTipoMovil")
    , @NamedQuery(name = "MgcDatosMovil.findByPlaca", query = "SELECT m FROM MgcDatosMovil m WHERE m.placa = :placa")
    , @NamedQuery(name = "MgcDatosMovil.findByTelefonoDespacho", query = "SELECT m FROM MgcDatosMovil m WHERE m.telefonoDespacho = :telefonoDespacho")
    , @NamedQuery(name = "MgcDatosMovil.findByOfsc", query = "SELECT m FROM MgcDatosMovil m WHERE m.ofsc = :ofsc")
    , @NamedQuery(name = "MgcDatosMovil.findByGwn", query = "SELECT m FROM MgcDatosMovil m WHERE m.gwn = :gwn")
    , @NamedQuery(name = "MgcDatosMovil.findByMg", query = "SELECT m FROM MgcDatosMovil m WHERE m.mg = :mg")
    , @NamedQuery(name = "MgcDatosMovil.findByRr", query = "SELECT m FROM MgcDatosMovil m WHERE m.rr = :rr")})
public class MgcDatosMovil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DATO_MOVIL")
    private Long idDatoMovil;
    private BigInteger cedula;
    @Size(max = 500)
    private String nombres;
    @Size(max = 100)
    @Column(name = "CODIGO_SAP")
    private String codigoSap;
    @Column(name = "FECHA_CONTRATACION")
    @Temporal(TemporalType.DATE)
    private Date fechaContratacion;
    private Long idaliado;
    @Size(max = 500)
    @Column(name = "JEFE_INMEDIATO")
    private String jefeInmediato;
    @Column(name = "ESTADO_CERTIFICACION")
    private Character estadoCertificacion;
    @Size(max = 100)
    @Column(name = "VIGENCIA_CERTIFICACION")
    private String vigenciaCertificacion;
    @Size(max = 500)
    private String foto;
    @Size(max = 100)
    private String celular1;
    @Size(max = 500)
    private String marcacel1;
    @Size(max = 10)
    private String refcel1;
    @Size(max = 100)
    private String correo1;
    @Size(max = 100)
    private String celular2;
    @Size(max = 500)
    private String marcacel2;
    @Size(max = 10)
    private String refcel2;
    @Size(max = 100)
    private String correo2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACTIVO_WFM")
    private short activoWfm;
    @Column(name = "FECHA_ACTIVACION")
    @Temporal(TemporalType.DATE)
    private Date fechaActivacion;
    @Size(max = 500)
    private String comentarios;
    @Column(name = "FECHA_ACTUALIZACION")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @Size(max = 100)
    private String ciudad;
    @Size(max = 50)
    private String apikey;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADICIONAR_TIEMPO_CERTIFICACION")
    private long adicionarTiempoCertificacion;
    @Column(name = "FECHA_INACTIVACION")
    @Temporal(TemporalType.DATE)
    private Date fechaInactivacion;
    @Size(max = 400)
    @Column(name = "COMENTARIOS_INACTIVACION")
    private String comentariosInactivacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACTIVO_TOA")
    private short activoToa;
    @Size(max = 100)
    @Column(name = "TIEMPO_CERTIFICACION")
    private String tiempoCertificacion;
    @Column(name = "ID_SUPERVISOR")
    private Long idSupervisor;
    @Column(name = "ID_TIPO_TECNICO")
    private Long idTipoTecnico;
    @Size(max = 150)
    @Column(name = "PARENT_ID")
    private String parentId;
    @Column(name = "EXTENCION_AVAYA")
    private BigInteger extencionAvaya;
    @Size(max = 20)
    @Column(name = "LOGIN_AVAYA")
    private String loginAvaya;
    @Size(max = 20)
    private String loginrr;
    private Long cargo;
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
    @Column(name = "ID_PERFIL_TECNICO")
    private Long idPerfilTecnico;
    @Column(name = "ID_PERFIL_TECNICO1")
    private Long idPerfilTecnico1;
    @Column(name = "TECNICO_VIRTUAL")
    private Long tecnicoVirtual;
    @Column(name = "TECNICO_VIRTUAL_CANT")
    private Long tecnicoVirtualCant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ARL")
    private BigInteger idArl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EPS")
    private BigInteger idEps;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_VEHICULO")
    private BigInteger idTipoVehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_MOVIL")
    private BigInteger idTipoMovil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TELEFONO_DESPACHO")
    private String telefonoDespacho;
    @Basic(optional = false)
    @NotNull
    private long ofsc;
    @Basic(optional = false)
    @NotNull
    private long gwn;
    @Basic(optional = false)
    @NotNull
    private long mg;
    @Basic(optional = false)
    @NotNull
    private long rr;
    @JoinColumn(name = "ID_SKILL_AVAYA", referencedColumnName = "ID_SKILL_AVAYA")
    @ManyToOne
    private MgcSkillsAvaya idSkillAvaya;
    @JoinColumn(name = "ID_TIPO_IDENTIFICACION", referencedColumnName = "ID_TIPO_IDENTIFICACION")
    @ManyToOne
    private MgcTiposIdentificacion idTipoIdentificacion;

    public MgcDatosMovil() {
    }

    public MgcDatosMovil(Long idDatoMovil) {
        this.idDatoMovil = idDatoMovil;
    }

    public MgcDatosMovil(Long idDatoMovil, short activoWfm, long adicionarTiempoCertificacion, short activoToa, Character estado, long idUsuario, Date fechaGrabacion, BigInteger idArl, BigInteger idEps, BigInteger idTipoVehiculo, BigInteger idTipoMovil, String placa, String telefonoDespacho, long ofsc, long gwn, long mg, long rr) {
        this.idDatoMovil = idDatoMovil;
        this.activoWfm = activoWfm;
        this.adicionarTiempoCertificacion = adicionarTiempoCertificacion;
        this.activoToa = activoToa;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.fechaGrabacion = fechaGrabacion;
        this.idArl = idArl;
        this.idEps = idEps;
        this.idTipoVehiculo = idTipoVehiculo;
        this.idTipoMovil = idTipoMovil;
        this.placa = placa;
        this.telefonoDespacho = telefonoDespacho;
        this.ofsc = ofsc;
        this.gwn = gwn;
        this.mg = mg;
        this.rr = rr;
    }

    public Long getIdDatoMovil() {
        return idDatoMovil;
    }

    public void setIdDatoMovil(Long idDatoMovil) {
        this.idDatoMovil = idDatoMovil;
    }

    public BigInteger getCedula() {
        return cedula;
    }

    public void setCedula(BigInteger cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCodigoSap() {
        return codigoSap;
    }

    public void setCodigoSap(String codigoSap) {
        this.codigoSap = codigoSap;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Long getIdaliado() {
        return idaliado;
    }

    public void setIdaliado(Long idaliado) {
        this.idaliado = idaliado;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public Character getEstadoCertificacion() {
        return estadoCertificacion;
    }

    public void setEstadoCertificacion(Character estadoCertificacion) {
        this.estadoCertificacion = estadoCertificacion;
    }

    public String getVigenciaCertificacion() {
        return vigenciaCertificacion;
    }

    public void setVigenciaCertificacion(String vigenciaCertificacion) {
        this.vigenciaCertificacion = vigenciaCertificacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getMarcacel1() {
        return marcacel1;
    }

    public void setMarcacel1(String marcacel1) {
        this.marcacel1 = marcacel1;
    }

    public String getRefcel1() {
        return refcel1;
    }

    public void setRefcel1(String refcel1) {
        this.refcel1 = refcel1;
    }

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getMarcacel2() {
        return marcacel2;
    }

    public void setMarcacel2(String marcacel2) {
        this.marcacel2 = marcacel2;
    }

    public String getRefcel2() {
        return refcel2;
    }

    public void setRefcel2(String refcel2) {
        this.refcel2 = refcel2;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    public short getActivoWfm() {
        return activoWfm;
    }

    public void setActivoWfm(short activoWfm) {
        this.activoWfm = activoWfm;
    }

    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public long getAdicionarTiempoCertificacion() {
        return adicionarTiempoCertificacion;
    }

    public void setAdicionarTiempoCertificacion(long adicionarTiempoCertificacion) {
        this.adicionarTiempoCertificacion = adicionarTiempoCertificacion;
    }

    public Date getFechaInactivacion() {
        return fechaInactivacion;
    }

    public void setFechaInactivacion(Date fechaInactivacion) {
        this.fechaInactivacion = fechaInactivacion;
    }

    public String getComentariosInactivacion() {
        return comentariosInactivacion;
    }

    public void setComentariosInactivacion(String comentariosInactivacion) {
        this.comentariosInactivacion = comentariosInactivacion;
    }

    public short getActivoToa() {
        return activoToa;
    }

    public void setActivoToa(short activoToa) {
        this.activoToa = activoToa;
    }

    public String getTiempoCertificacion() {
        return tiempoCertificacion;
    }

    public void setTiempoCertificacion(String tiempoCertificacion) {
        this.tiempoCertificacion = tiempoCertificacion;
    }

    public Long getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Long idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public Long getIdTipoTecnico() {
        return idTipoTecnico;
    }

    public void setIdTipoTecnico(Long idTipoTecnico) {
        this.idTipoTecnico = idTipoTecnico;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BigInteger getExtencionAvaya() {
        return extencionAvaya;
    }

    public void setExtencionAvaya(BigInteger extencionAvaya) {
        this.extencionAvaya = extencionAvaya;
    }

    public String getLoginAvaya() {
        return loginAvaya;
    }

    public void setLoginAvaya(String loginAvaya) {
        this.loginAvaya = loginAvaya;
    }

    public String getLoginrr() {
        return loginrr;
    }

    public void setLoginrr(String loginrr) {
        this.loginrr = loginrr;
    }

    public Long getCargo() {
        return cargo;
    }

    public void setCargo(Long cargo) {
        this.cargo = cargo;
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

    public Long getIdPerfilTecnico() {
        return idPerfilTecnico;
    }

    public void setIdPerfilTecnico(Long idPerfilTecnico) {
        this.idPerfilTecnico = idPerfilTecnico;
    }

    public Long getIdPerfilTecnico1() {
        return idPerfilTecnico1;
    }

    public void setIdPerfilTecnico1(Long idPerfilTecnico1) {
        this.idPerfilTecnico1 = idPerfilTecnico1;
    }

    public Long getTecnicoVirtual() {
        return tecnicoVirtual;
    }

    public void setTecnicoVirtual(Long tecnicoVirtual) {
        this.tecnicoVirtual = tecnicoVirtual;
    }

    public Long getTecnicoVirtualCant() {
        return tecnicoVirtualCant;
    }

    public void setTecnicoVirtualCant(Long tecnicoVirtualCant) {
        this.tecnicoVirtualCant = tecnicoVirtualCant;
    }

    public BigInteger getIdArl() {
        return idArl;
    }

    public void setIdArl(BigInteger idArl) {
        this.idArl = idArl;
    }

    public BigInteger getIdEps() {
        return idEps;
    }

    public void setIdEps(BigInteger idEps) {
        this.idEps = idEps;
    }

    public BigInteger getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(BigInteger idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public BigInteger getIdTipoMovil() {
        return idTipoMovil;
    }

    public void setIdTipoMovil(BigInteger idTipoMovil) {
        this.idTipoMovil = idTipoMovil;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTelefonoDespacho() {
        return telefonoDespacho;
    }

    public void setTelefonoDespacho(String telefonoDespacho) {
        this.telefonoDespacho = telefonoDespacho;
    }

    public long getOfsc() {
        return ofsc;
    }

    public void setOfsc(long ofsc) {
        this.ofsc = ofsc;
    }

    public long getGwn() {
        return gwn;
    }

    public void setGwn(long gwn) {
        this.gwn = gwn;
    }

    public long getMg() {
        return mg;
    }

    public void setMg(long mg) {
        this.mg = mg;
    }

    public long getRr() {
        return rr;
    }

    public void setRr(long rr) {
        this.rr = rr;
    }

    public MgcSkillsAvaya getIdSkillAvaya() {
        return idSkillAvaya;
    }

    public void setIdSkillAvaya(MgcSkillsAvaya idSkillAvaya) {
        this.idSkillAvaya = idSkillAvaya;
    }

    public MgcTiposIdentificacion getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(MgcTiposIdentificacion idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatoMovil != null ? idDatoMovil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgcDatosMovil)) {
            return false;
        }
        MgcDatosMovil other = (MgcDatosMovil) object;
        if ((this.idDatoMovil == null && other.idDatoMovil != null) || (this.idDatoMovil != null && !this.idDatoMovil.equals(other.idDatoMovil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgcDatosMovil[ idDatoMovil=" + idDatoMovil + " ]";
    }
    
}
