package co.com.claro.wsorder.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class AssignResourceRequest implements Serializable{
	
	private static final long serialVersionUID = -3203858393616783127L;

	@XmlElement(required = true)
	private UserOutBound user;
	
	@XmlElement(required = true)
	private Integer idMensaje;
	
	@XmlElement(required = true)
	private String idOT;
	
	@XmlElement(required = true)
	private String origen;
	
	@XmlElement(required = true)
	private String idTecnico;
	
	private String IdBucket;
	
	private String idOrdenEta;

	public String getIdOT() {
		return idOT;
	}

	public void setIdOT(String idOT) {
		this.idOT = idOT;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(String idTecnico) {
		this.idTecnico = idTecnico;
	}

	public UserOutBound getUser() {
		return user;
	}

	public void setUser(UserOutBound user) {
		this.user = user;
	}

	public String getIdBucket() {
		return IdBucket;
	}

	public void setIdBucket(String idBucket) {
		IdBucket = idBucket;
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}
	
	public String getIdOrdenEta() {
		return idOrdenEta;
	}

	public void setIdOrdenEta(String idOrdenEta) {
		this.idOrdenEta = idOrdenEta;
	}

	@Override
	public String toString() {
		return "AssignResourceRequest [idMensaje=" + idMensaje + ", idOT="
				+ idOT + ", origen=" + origen + ", idTecnico=" + idTecnico
				+ ", IdBucket=" + IdBucket + ", idOrdenEta=" + idOrdenEta + "]";
	}
	
}
