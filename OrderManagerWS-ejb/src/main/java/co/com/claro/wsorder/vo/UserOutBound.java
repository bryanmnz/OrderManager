package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * DTO con los datos de autenticacion de un usuario.
 *
 * Creado el 10/01/2014
 *
 * @author Jairo Andr�s Tabares M <tabaresj@globalhitss.com>
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user")
public class UserOutBound implements Serializable {

    private static final long serialVersionUID = -4311223330048186473L;

    @XmlElement(required = true)
    private String now;
    @XmlElement(required = true)
    private String login;
    @XmlElement(required = true)
    private String auth_string;
    @XmlElement(required = true)
    private String company;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAuth_string() {
        return auth_string;
    }

    public void setAuth_string(String auth_string) {
        this.auth_string = auth_string;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "UserOutBound [now=" + now + ", login=" + login + ", company="
                + company + "]";
    }

}
