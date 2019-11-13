/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.bd;

import java.io.Serializable;
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
@Table(name = "MGW_CARACTERISTICAS_AG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MgwCaracteristicasAg.findAll", query = "SELECT m FROM MgwCaracteristicasAg m")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByIdAgCaract", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.idAgCaract = :idAgCaract")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByIims1", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.iims1 = :iims1")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByIims2", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.iims2 = :iims2")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByIims3", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.iims3 = :iims3")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByFechaAct", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.fechaAct = :fechaAct")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByIdBucket", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.idBucket = :idBucket")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByCoordenadas", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.coordenadas = :coordenadas")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByRecaudo", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.recaudo = :recaudo")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByValorRecaudo", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.valorRecaudo = :valorRecaudo")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByNotasFirma", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.notasFirma = :notasFirma")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByRespuestaEncuesta", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.respuestaEncuesta = :respuestaEncuesta")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByConveniente", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.conveniente = :conveniente")
    , @NamedQuery(name = "MgwCaracteristicasAg.findByPrimercupo", query = "SELECT m FROM MgwCaracteristicasAg m WHERE m.primercupo = :primercupo")})
public class MgwCaracteristicasAg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AG_CARACT")
    private Long idAgCaract;
    @Size(max = 10)
    private String iims1;
    @Size(max = 10)
    private String iims2;
    @Size(max = 10)
    private String iims3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_ACT")
    @Temporal(TemporalType.DATE)
    private Date fechaAct;
    @Size(max = 20)
    @Column(name = "ID_BUCKET")
    private String idBucket;
    @Size(max = 50)
    private String coordenadas;
    @Size(max = 50)
    private String recaudo;
    @Size(max = 20)
    @Column(name = "VALOR_RECAUDO")
    private String valorRecaudo;
    @Size(max = 50)
    @Column(name = "NOTAS_FIRMA")
    private String notasFirma;
    @Size(max = 50)
    @Column(name = "RESPUESTA_ENCUESTA")
    private String respuestaEncuesta;
    private Short conveniente;
    @Size(max = 60)
    private String primercupo;
    @JoinColumn(name = "ID_AGENDA", referencedColumnName = "ID_AGENDA")
    @ManyToOne(optional = false)
    private MgwAgenda idAgenda;

    public MgwCaracteristicasAg() {
    }

    public MgwCaracteristicasAg(Long idAgCaract) {
        this.idAgCaract = idAgCaract;
    }

    public MgwCaracteristicasAg(Long idAgCaract, Date fechaAct) {
        this.idAgCaract = idAgCaract;
        this.fechaAct = fechaAct;
    }

    public Long getIdAgCaract() {
        return idAgCaract;
    }

    public void setIdAgCaract(Long idAgCaract) {
        this.idAgCaract = idAgCaract;
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

    public Date getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(Date fechaAct) {
        this.fechaAct = fechaAct;
    }

    public String getIdBucket() {
        return idBucket;
    }

    public void setIdBucket(String idBucket) {
        this.idBucket = idBucket;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(String recaudo) {
        this.recaudo = recaudo;
    }

    public String getValorRecaudo() {
        return valorRecaudo;
    }

    public void setValorRecaudo(String valorRecaudo) {
        this.valorRecaudo = valorRecaudo;
    }

    public String getNotasFirma() {
        return notasFirma;
    }

    public void setNotasFirma(String notasFirma) {
        this.notasFirma = notasFirma;
    }

    public String getRespuestaEncuesta() {
        return respuestaEncuesta;
    }

    public void setRespuestaEncuesta(String respuestaEncuesta) {
        this.respuestaEncuesta = respuestaEncuesta;
    }

    public Short getConveniente() {
        return conveniente;
    }

    public void setConveniente(Short conveniente) {
        this.conveniente = conveniente;
    }

    public String getPrimercupo() {
        return primercupo;
    }

    public void setPrimercupo(String primercupo) {
        this.primercupo = primercupo;
    }

    public MgwAgenda getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(MgwAgenda idAgenda) {
        this.idAgenda = idAgenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgCaract != null ? idAgCaract.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MgwCaracteristicasAg)) {
            return false;
        }
        MgwCaracteristicasAg other = (MgwCaracteristicasAg) object;
        if ((this.idAgCaract == null && other.idAgCaract != null) || (this.idAgCaract != null && !this.idAgCaract.equals(other.idAgCaract))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.bd.MgwCaracteristicasAg[ idAgCaract=" + idAgCaract + " ]";
    }
    
}
