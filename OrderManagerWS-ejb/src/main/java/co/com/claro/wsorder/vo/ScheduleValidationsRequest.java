package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ScheduleValidationsRequest implements Serializable {

    private static final long serialVersionUID = 6246933558458148540L;

    @XmlElement(required = true)
    private Long numberOrder;

    @XmlElement(required = true)
    private String typeOT;

    @XmlElement(required = true)
    private String action;

    private String user;

    public Long getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(Long numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getTypeOT() {
        return typeOT;
    }

    public void setTypeOT(String typeOT) {
        this.typeOT = typeOT;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String usuario) {
        this.user = usuario;
    }

    @Override
    public String toString() {
        return "ScheduleValidationsRequest [numberOrder=" + numberOrder
                + ", typeOT=" + typeOT + ", action=" + action + ", usuario="
                + user + "]";
    }

}
