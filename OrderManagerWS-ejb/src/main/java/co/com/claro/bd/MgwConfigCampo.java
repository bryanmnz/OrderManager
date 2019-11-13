/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodriguezjavr
 */
@Entity
@Table(name = "MGW_CONFIG_CAMPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwConfigCampo.findAll", query = "SELECT m FROM MgwConfigCampo m")
    , @NamedQuery(name = "MgwConfigCampo.findByIdConfigCampo", query = "SELECT m FROM MgwConfigCampo m WHERE m.idConfigCampo = :idConfigCampo")
    , @NamedQuery(name = "MgwConfigCampo.findByIdMensajesCampos", query = "SELECT m FROM MgwConfigCampo m WHERE m.idMensajesCampos = :idMensajesCampos")
    , @NamedQuery(name = "MgwConfigCampo.findByValor", query = "SELECT m FROM MgwConfigCampo m WHERE m.valor = :valor")
    , @NamedQuery(name = "MgwConfigCampo.findByOperador", query = "SELECT m FROM MgwConfigCampo m WHERE m.operador = :operador")})
public class MgwConfigCampo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONFIG_CAMPO")
    private Long idConfigCampo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MENSAJES_CAMPOS")
    private long idMensajesCampos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    private String valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    private String operador;
    @JoinColumn(name = "ID_CONFIG_VALIDACION", referencedColumnName = "ID_CONFIG_VALIDACION")
    @ManyToOne
    private MgwConfigValidacion idConfigValidacion;

    public MgwConfigCampo() {
    }

    public MgwConfigCampo(Long idConfigCampo) {
        this.idConfigCampo = idConfigCampo;
    }

    public MgwConfigCampo(Long idConfigCampo, long idMensajesCampos, String valor, String operador) {
        this.idConfigCampo = idConfigCampo;
        this.idMensajesCampos = idMensajesCampos;
        this.valor = valor;
        this.operador = operador;
    }

    public Long getIdConfigCampo() {
        return idConfigCampo;
    }

    public void setIdConfigCampo(Long idConfigCampo) {
        this.idConfigCampo = idConfigCampo;
    }

    public long getIdMensajesCampos() {
        return idMensajesCampos;
    }

    public void setIdMensajesCampos(long idMensajesCampos) {
        this.idMensajesCampos = idMensajesCampos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public MgwConfigValidacion getIdConfigValidacion() {
        return idConfigValidacion;
    }

    public void setIdConfigValidacion(MgwConfigValidacion idConfigValidacion) {
        this.idConfigValidacion = idConfigValidacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConfigCampo != null ? idConfigCampo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwConfigCampo)) {
            return false;
        }
        MgwConfigCampo other = (MgwConfigCampo) object;
        if ((this.idConfigCampo == null && other.idConfigCampo != null) || (this.idConfigCampo != null && !this.idConfigCampo.equals(other.idConfigCampo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwConfigCampo[ idConfigCampo=" + idConfigCampo + " ]";
    }

    public MgwMensajesCampos getMgwMensajesCampo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}