package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SoftCloseRequest implements Serializable {

    private static final long serialVersionUID = -2126486036242927053L;

    @XmlElement(required = true)
    private UserOutBound user;

    @XmlElement(required = true)
    private Integer idMensaje;

    @XmlElement(required = true)
    private String appt_number;

    @XmlElement(required = true)
    private String origenId;

    private String iims1;

    private String iims2;

    private String iims3;

    @XmlElement(required = true)
    private String tecnicoId;

    private String actividades;

    private String cambios;

    private String observacion;

    private String razon;

    private String respuestaEncuesta;

    private String im;

    public UserOutBound getUser() {
        return user;
    }

    public void setUser(UserOutBound user) {
        this.user = user;
    }

    public String getAppt_number() {
        return appt_number;
    }

    public void setAppt_number(String appt_number) {
        this.appt_number = appt_number;
    }

    public String getOrigenId() {
        return origenId;
    }

    public void setOrigenId(String origenId) {
        this.origenId = origenId;
    }

    public String getIims1() {
        return iims1;
    }

    public void setIims1(String iims1) {
        this.iims1 = iims1;
    }

    public String getIims2() {
        return iims2;
    }

    public void setIims2(String iims2) {
        this.iims2 = iims2;
    }

    public String getIims3() {
        return iims3;
    }

    public void setIims3(String iims3) {
        this.iims3 = iims3;
    }

    public String getTecnicoId() {
        return tecnicoId;
    }

    public void setTecnicoId(String tecnicoId) {
        this.tecnicoId = tecnicoId;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getRespuestaEncuesta() {
        return respuestaEncuesta;
    }

    public void setRespuestaEncuesta(String respuestaEncuesta) {
        this.respuestaEncuesta = respuestaEncuesta;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public Integer getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Integer idMensaje) {
        this.idMensaje = idMensaje;
    }

    @Override
    public String toString() {
        return "SoftCloseRequest [idMensaje=" + idMensaje
                + ", appt_number=" + appt_number + ", origenId=" + origenId
                + ", iims1=" + iims1 + ", iims2=" + iims2 + ", iims3=" + iims3
                + ", tecnicoId=" + tecnicoId + ", actividades=" + actividades
                + ", cambios=" + cambios + ", obsevacion=" + observacion
                + ", razon=" + razon + ", respuestaEncuesta="
                + respuestaEncuesta + ", im=" + im + "]";
    }

}
