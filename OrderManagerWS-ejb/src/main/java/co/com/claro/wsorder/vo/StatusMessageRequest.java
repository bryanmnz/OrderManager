package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * DTO encargado de almacenar el estado de un mensaje.
 *
 */
public class StatusMessageRequest implements Serializable {

    private static final long serialVersionUID = -7999094044774931932L;
    @XmlElement(required = true)
    private String id;
    @XmlElement(required = true)
    private String estado;
    @XmlElement(required = true)
    private UserOutBound user;
    @XmlElement(required = true)
    private String descripcion;
    @XmlElement(required = true)
    private String origen;

    public UserOutBound getUser() {
        return user;
    }

    public void setUser(UserOutBound user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "StatusMessageRequest [id=" + id + ", estado=" + estado
                + ", descripcion=" + descripcion + ", origen=" + origen + "]";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

}
