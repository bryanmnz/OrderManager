package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CancelOrderRequest")
public class CancelOrderRequest implements Serializable {

    private static final long serialVersionUID = 6365236953935903614L;
    @XmlElement(required = true)
    private User user;
    @XmlElement(required = true)
    private Integer idMensaje;
    @XmlElement(required = true)
    private String fechaAgenda;
    @XmlElement(required = true)
    private String app_number;
    private String razon;
    private String notas;

    public String getFechaAgenda() {
        return fechaAgenda;
    }

    public void setFechaAgenda(String fechaAgenda) {
        this.fechaAgenda = fechaAgenda;
    }

    public String getApp_number() {
        return app_number;
    }

    public void setApp_number(String app_number) {
        this.app_number = app_number;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Integer getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Integer idMensaje) {
        this.idMensaje = idMensaje;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CancelOrderRequest [idUsuario=" + "" + ", idMensaje="
                + idMensaje + ", fechaAgenda=" + fechaAgenda + ", app_number="
                + app_number + ", razon=" + razon + ", notas=" + notas + "]";
    }

}
