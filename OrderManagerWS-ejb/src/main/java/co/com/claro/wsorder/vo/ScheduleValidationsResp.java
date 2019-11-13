package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ScheduleValidationsResp implements Serializable {

    private static final long serialVersionUID = -3469763582319431763L;

    @XmlElement(name = "status")
    private String estado;

    @XmlElement(name = "description")
    private String descripcion;

    @XmlElement(name = "validation")
    private String validacion;

    @XmlElement(name = "field_name")
    private String nombreCampo;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValidacion() {
        return validacion;
    }

    public void setValidacion(String validacion) {
        this.validacion = validacion;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    @Override
    public String toString() {
        return "ScheduleValidationsResp [estado=" + estado + ", descripcion="
                + descripcion + ", validacion=" + validacion + ", nombreCampo="
                + nombreCampo + "]";
    }

}
