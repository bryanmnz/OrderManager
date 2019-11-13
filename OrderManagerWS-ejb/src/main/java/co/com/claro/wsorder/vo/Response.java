package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response")
public class Response implements Serializable {

    private static final long serialVersionUID = -8491859062650286567L;

    @XmlElement(required = true)
    private UserT user;

    @XmlElement(required = true)
    private String description;

    @XmlElement(required = true)
    private String codigo;

    @XmlElement(required = true)
    private Integer message_id;

    @XmlElement(required = true)
    private String status;

    public UserT getUser() {
        return user;
    }

    public void setUser(UserT user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    @Override
    public String toString() {
        return "Response [user=" + user + ", description=" + description
                + ", codigo=" + codigo + ", idMessage=" + message_id
                + ", status=" + status + "]";
    }

}
