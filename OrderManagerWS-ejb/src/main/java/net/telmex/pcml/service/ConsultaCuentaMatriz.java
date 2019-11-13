/**
 * ConsultaCuentaMatriz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.pcml.service;

public class ConsultaCuentaMatriz  implements java.io.Serializable {
    private java.lang.String[] blackList;

    private java.lang.String casa;

    private java.lang.String codigoNodo;

    private java.lang.String comunidad;

    private java.lang.String dirHome;

    private java.lang.String dirStnm;

    private java.math.BigDecimal dirStr;

    private java.lang.String dxrMsg;

    private java.lang.String error;

    private java.lang.String[] infeQptp;

    private java.lang.String mensaje;

    private java.lang.String msgr;

    private java.lang.String nombreCalle;

    private java.lang.String nombreContp;

    private java.lang.String nombreEdificio;

    private java.lang.String numeroCasa;

    private java.lang.String numeroCuentaM;

    private java.math.BigDecimal numeroHHPP;

    private java.math.BigDecimal numeroSusap;

    private java.lang.String[] QTorestp;

    private java.math.BigDecimal QTorresp;

    private java.math.BigDecimal telefonoCuentaM;

    public ConsultaCuentaMatriz() {
    }

    public ConsultaCuentaMatriz(
           java.lang.String[] blackList,
           java.lang.String casa,
           java.lang.String codigoNodo,
           java.lang.String comunidad,
           java.lang.String dirHome,
           java.lang.String dirStnm,
           java.math.BigDecimal dirStr,
           java.lang.String dxrMsg,
           java.lang.String error,
           java.lang.String[] infeQptp,
           java.lang.String mensaje,
           java.lang.String msgr,
           java.lang.String nombreCalle,
           java.lang.String nombreContp,
           java.lang.String nombreEdificio,
           java.lang.String numeroCasa,
           java.lang.String numeroCuentaM,
           java.math.BigDecimal numeroHHPP,
           java.math.BigDecimal numeroSusap,
           java.lang.String[] QTorestp,
           java.math.BigDecimal QTorresp,
           java.math.BigDecimal telefonoCuentaM) {
           this.blackList = blackList;
           this.casa = casa;
           this.codigoNodo = codigoNodo;
           this.comunidad = comunidad;
           this.dirHome = dirHome;
           this.dirStnm = dirStnm;
           this.dirStr = dirStr;
           this.dxrMsg = dxrMsg;
           this.error = error;
           this.infeQptp = infeQptp;
           this.mensaje = mensaje;
           this.msgr = msgr;
           this.nombreCalle = nombreCalle;
           this.nombreContp = nombreContp;
           this.nombreEdificio = nombreEdificio;
           this.numeroCasa = numeroCasa;
           this.numeroCuentaM = numeroCuentaM;
           this.numeroHHPP = numeroHHPP;
           this.numeroSusap = numeroSusap;
           this.QTorestp = QTorestp;
           this.QTorresp = QTorresp;
           this.telefonoCuentaM = telefonoCuentaM;
    }


    /**
     * Gets the blackList value for this ConsultaCuentaMatriz.
     * 
     * @return blackList
     */
    public java.lang.String[] getBlackList() {
        return blackList;
    }


    /**
     * Sets the blackList value for this ConsultaCuentaMatriz.
     * 
     * @param blackList
     */
    public void setBlackList(java.lang.String[] blackList) {
        this.blackList = blackList;
    }

    public java.lang.String getBlackList(int i) {
        return this.blackList[i];
    }

    public void setBlackList(int i, java.lang.String _value) {
        this.blackList[i] = _value;
    }


    /**
     * Gets the casa value for this ConsultaCuentaMatriz.
     * 
     * @return casa
     */
    public java.lang.String getCasa() {
        return casa;
    }


    /**
     * Sets the casa value for this ConsultaCuentaMatriz.
     * 
     * @param casa
     */
    public void setCasa(java.lang.String casa) {
        this.casa = casa;
    }


    /**
     * Gets the codigoNodo value for this ConsultaCuentaMatriz.
     * 
     * @return codigoNodo
     */
    public java.lang.String getCodigoNodo() {
        return codigoNodo;
    }


    /**
     * Sets the codigoNodo value for this ConsultaCuentaMatriz.
     * 
     * @param codigoNodo
     */
    public void setCodigoNodo(java.lang.String codigoNodo) {
        this.codigoNodo = codigoNodo;
    }


    /**
     * Gets the comunidad value for this ConsultaCuentaMatriz.
     * 
     * @return comunidad
     */
    public java.lang.String getComunidad() {
        return comunidad;
    }


    /**
     * Sets the comunidad value for this ConsultaCuentaMatriz.
     * 
     * @param comunidad
     */
    public void setComunidad(java.lang.String comunidad) {
        this.comunidad = comunidad;
    }


    /**
     * Gets the dirHome value for this ConsultaCuentaMatriz.
     * 
     * @return dirHome
     */
    public java.lang.String getDirHome() {
        return dirHome;
    }


    /**
     * Sets the dirHome value for this ConsultaCuentaMatriz.
     * 
     * @param dirHome
     */
    public void setDirHome(java.lang.String dirHome) {
        this.dirHome = dirHome;
    }


    /**
     * Gets the dirStnm value for this ConsultaCuentaMatriz.
     * 
     * @return dirStnm
     */
    public java.lang.String getDirStnm() {
        return dirStnm;
    }


    /**
     * Sets the dirStnm value for this ConsultaCuentaMatriz.
     * 
     * @param dirStnm
     */
    public void setDirStnm(java.lang.String dirStnm) {
        this.dirStnm = dirStnm;
    }


    /**
     * Gets the dirStr value for this ConsultaCuentaMatriz.
     * 
     * @return dirStr
     */
    public java.math.BigDecimal getDirStr() {
        return dirStr;
    }


    /**
     * Sets the dirStr value for this ConsultaCuentaMatriz.
     * 
     * @param dirStr
     */
    public void setDirStr(java.math.BigDecimal dirStr) {
        this.dirStr = dirStr;
    }


    /**
     * Gets the dxrMsg value for this ConsultaCuentaMatriz.
     * 
     * @return dxrMsg
     */
    public java.lang.String getDxrMsg() {
        return dxrMsg;
    }


    /**
     * Sets the dxrMsg value for this ConsultaCuentaMatriz.
     * 
     * @param dxrMsg
     */
    public void setDxrMsg(java.lang.String dxrMsg) {
        this.dxrMsg = dxrMsg;
    }


    /**
     * Gets the error value for this ConsultaCuentaMatriz.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this ConsultaCuentaMatriz.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the infeQptp value for this ConsultaCuentaMatriz.
     * 
     * @return infeQptp
     */
    public java.lang.String[] getInfeQptp() {
        return infeQptp;
    }


    /**
     * Sets the infeQptp value for this ConsultaCuentaMatriz.
     * 
     * @param infeQptp
     */
    public void setInfeQptp(java.lang.String[] infeQptp) {
        this.infeQptp = infeQptp;
    }

    public java.lang.String getInfeQptp(int i) {
        return this.infeQptp[i];
    }

    public void setInfeQptp(int i, java.lang.String _value) {
        this.infeQptp[i] = _value;
    }


    /**
     * Gets the mensaje value for this ConsultaCuentaMatriz.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this ConsultaCuentaMatriz.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the msgr value for this ConsultaCuentaMatriz.
     * 
     * @return msgr
     */
    public java.lang.String getMsgr() {
        return msgr;
    }


    /**
     * Sets the msgr value for this ConsultaCuentaMatriz.
     * 
     * @param msgr
     */
    public void setMsgr(java.lang.String msgr) {
        this.msgr = msgr;
    }


    /**
     * Gets the nombreCalle value for this ConsultaCuentaMatriz.
     * 
     * @return nombreCalle
     */
    public java.lang.String getNombreCalle() {
        return nombreCalle;
    }


    /**
     * Sets the nombreCalle value for this ConsultaCuentaMatriz.
     * 
     * @param nombreCalle
     */
    public void setNombreCalle(java.lang.String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }


    /**
     * Gets the nombreContp value for this ConsultaCuentaMatriz.
     * 
     * @return nombreContp
     */
    public java.lang.String getNombreContp() {
        return nombreContp;
    }


    /**
     * Sets the nombreContp value for this ConsultaCuentaMatriz.
     * 
     * @param nombreContp
     */
    public void setNombreContp(java.lang.String nombreContp) {
        this.nombreContp = nombreContp;
    }


    /**
     * Gets the nombreEdificio value for this ConsultaCuentaMatriz.
     * 
     * @return nombreEdificio
     */
    public java.lang.String getNombreEdificio() {
        return nombreEdificio;
    }


    /**
     * Sets the nombreEdificio value for this ConsultaCuentaMatriz.
     * 
     * @param nombreEdificio
     */
    public void setNombreEdificio(java.lang.String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }


    /**
     * Gets the numeroCasa value for this ConsultaCuentaMatriz.
     * 
     * @return numeroCasa
     */
    public java.lang.String getNumeroCasa() {
        return numeroCasa;
    }


    /**
     * Sets the numeroCasa value for this ConsultaCuentaMatriz.
     * 
     * @param numeroCasa
     */
    public void setNumeroCasa(java.lang.String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }


    /**
     * Gets the numeroCuentaM value for this ConsultaCuentaMatriz.
     * 
     * @return numeroCuentaM
     */
    public java.lang.String getNumeroCuentaM() {
        return numeroCuentaM;
    }


    /**
     * Sets the numeroCuentaM value for this ConsultaCuentaMatriz.
     * 
     * @param numeroCuentaM
     */
    public void setNumeroCuentaM(java.lang.String numeroCuentaM) {
        this.numeroCuentaM = numeroCuentaM;
    }


    /**
     * Gets the numeroHHPP value for this ConsultaCuentaMatriz.
     * 
     * @return numeroHHPP
     */
    public java.math.BigDecimal getNumeroHHPP() {
        return numeroHHPP;
    }


    /**
     * Sets the numeroHHPP value for this ConsultaCuentaMatriz.
     * 
     * @param numeroHHPP
     */
    public void setNumeroHHPP(java.math.BigDecimal numeroHHPP) {
        this.numeroHHPP = numeroHHPP;
    }


    /**
     * Gets the numeroSusap value for this ConsultaCuentaMatriz.
     * 
     * @return numeroSusap
     */
    public java.math.BigDecimal getNumeroSusap() {
        return numeroSusap;
    }


    /**
     * Sets the numeroSusap value for this ConsultaCuentaMatriz.
     * 
     * @param numeroSusap
     */
    public void setNumeroSusap(java.math.BigDecimal numeroSusap) {
        this.numeroSusap = numeroSusap;
    }


    /**
     * Gets the QTorestp value for this ConsultaCuentaMatriz.
     * 
     * @return QTorestp
     */
    public java.lang.String[] getQTorestp() {
        return QTorestp;
    }


    /**
     * Sets the QTorestp value for this ConsultaCuentaMatriz.
     * 
     * @param QTorestp
     */
    public void setQTorestp(java.lang.String[] QTorestp) {
        this.QTorestp = QTorestp;
    }

    public java.lang.String getQTorestp(int i) {
        return this.QTorestp[i];
    }

    public void setQTorestp(int i, java.lang.String _value) {
        this.QTorestp[i] = _value;
    }


    /**
     * Gets the QTorresp value for this ConsultaCuentaMatriz.
     * 
     * @return QTorresp
     */
    public java.math.BigDecimal getQTorresp() {
        return QTorresp;
    }


    /**
     * Sets the QTorresp value for this ConsultaCuentaMatriz.
     * 
     * @param QTorresp
     */
    public void setQTorresp(java.math.BigDecimal QTorresp) {
        this.QTorresp = QTorresp;
    }


    /**
     * Gets the telefonoCuentaM value for this ConsultaCuentaMatriz.
     * 
     * @return telefonoCuentaM
     */
    public java.math.BigDecimal getTelefonoCuentaM() {
        return telefonoCuentaM;
    }


    /**
     * Sets the telefonoCuentaM value for this ConsultaCuentaMatriz.
     * 
     * @param telefonoCuentaM
     */
    public void setTelefonoCuentaM(java.math.BigDecimal telefonoCuentaM) {
        this.telefonoCuentaM = telefonoCuentaM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaCuentaMatriz)) return false;
        ConsultaCuentaMatriz other = (ConsultaCuentaMatriz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blackList==null && other.getBlackList()==null) || 
             (this.blackList!=null &&
              java.util.Arrays.equals(this.blackList, other.getBlackList()))) &&
            ((this.casa==null && other.getCasa()==null) || 
             (this.casa!=null &&
              this.casa.equals(other.getCasa()))) &&
            ((this.codigoNodo==null && other.getCodigoNodo()==null) || 
             (this.codigoNodo!=null &&
              this.codigoNodo.equals(other.getCodigoNodo()))) &&
            ((this.comunidad==null && other.getComunidad()==null) || 
             (this.comunidad!=null &&
              this.comunidad.equals(other.getComunidad()))) &&
            ((this.dirHome==null && other.getDirHome()==null) || 
             (this.dirHome!=null &&
              this.dirHome.equals(other.getDirHome()))) &&
            ((this.dirStnm==null && other.getDirStnm()==null) || 
             (this.dirStnm!=null &&
              this.dirStnm.equals(other.getDirStnm()))) &&
            ((this.dirStr==null && other.getDirStr()==null) || 
             (this.dirStr!=null &&
              this.dirStr.equals(other.getDirStr()))) &&
            ((this.dxrMsg==null && other.getDxrMsg()==null) || 
             (this.dxrMsg!=null &&
              this.dxrMsg.equals(other.getDxrMsg()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.infeQptp==null && other.getInfeQptp()==null) || 
             (this.infeQptp!=null &&
              java.util.Arrays.equals(this.infeQptp, other.getInfeQptp()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.msgr==null && other.getMsgr()==null) || 
             (this.msgr!=null &&
              this.msgr.equals(other.getMsgr()))) &&
            ((this.nombreCalle==null && other.getNombreCalle()==null) || 
             (this.nombreCalle!=null &&
              this.nombreCalle.equals(other.getNombreCalle()))) &&
            ((this.nombreContp==null && other.getNombreContp()==null) || 
             (this.nombreContp!=null &&
              this.nombreContp.equals(other.getNombreContp()))) &&
            ((this.nombreEdificio==null && other.getNombreEdificio()==null) || 
             (this.nombreEdificio!=null &&
              this.nombreEdificio.equals(other.getNombreEdificio()))) &&
            ((this.numeroCasa==null && other.getNumeroCasa()==null) || 
             (this.numeroCasa!=null &&
              this.numeroCasa.equals(other.getNumeroCasa()))) &&
            ((this.numeroCuentaM==null && other.getNumeroCuentaM()==null) || 
             (this.numeroCuentaM!=null &&
              this.numeroCuentaM.equals(other.getNumeroCuentaM()))) &&
            ((this.numeroHHPP==null && other.getNumeroHHPP()==null) || 
             (this.numeroHHPP!=null &&
              this.numeroHHPP.equals(other.getNumeroHHPP()))) &&
            ((this.numeroSusap==null && other.getNumeroSusap()==null) || 
             (this.numeroSusap!=null &&
              this.numeroSusap.equals(other.getNumeroSusap()))) &&
            ((this.QTorestp==null && other.getQTorestp()==null) || 
             (this.QTorestp!=null &&
              java.util.Arrays.equals(this.QTorestp, other.getQTorestp()))) &&
            ((this.QTorresp==null && other.getQTorresp()==null) || 
             (this.QTorresp!=null &&
              this.QTorresp.equals(other.getQTorresp()))) &&
            ((this.telefonoCuentaM==null && other.getTelefonoCuentaM()==null) || 
             (this.telefonoCuentaM!=null &&
              this.telefonoCuentaM.equals(other.getTelefonoCuentaM())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBlackList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlackList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlackList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCasa() != null) {
            _hashCode += getCasa().hashCode();
        }
        if (getCodigoNodo() != null) {
            _hashCode += getCodigoNodo().hashCode();
        }
        if (getComunidad() != null) {
            _hashCode += getComunidad().hashCode();
        }
        if (getDirHome() != null) {
            _hashCode += getDirHome().hashCode();
        }
        if (getDirStnm() != null) {
            _hashCode += getDirStnm().hashCode();
        }
        if (getDirStr() != null) {
            _hashCode += getDirStr().hashCode();
        }
        if (getDxrMsg() != null) {
            _hashCode += getDxrMsg().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getInfeQptp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfeQptp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfeQptp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getMsgr() != null) {
            _hashCode += getMsgr().hashCode();
        }
        if (getNombreCalle() != null) {
            _hashCode += getNombreCalle().hashCode();
        }
        if (getNombreContp() != null) {
            _hashCode += getNombreContp().hashCode();
        }
        if (getNombreEdificio() != null) {
            _hashCode += getNombreEdificio().hashCode();
        }
        if (getNumeroCasa() != null) {
            _hashCode += getNumeroCasa().hashCode();
        }
        if (getNumeroCuentaM() != null) {
            _hashCode += getNumeroCuentaM().hashCode();
        }
        if (getNumeroHHPP() != null) {
            _hashCode += getNumeroHHPP().hashCode();
        }
        if (getNumeroSusap() != null) {
            _hashCode += getNumeroSusap().hashCode();
        }
        if (getQTorestp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQTorestp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQTorestp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQTorresp() != null) {
            _hashCode += getQTorresp().hashCode();
        }
        if (getTelefonoCuentaM() != null) {
            _hashCode += getTelefonoCuentaM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaCuentaMatriz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.pcml.telmex.net/", "consultaCuentaMatriz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blackList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blackList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "casa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoNodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoNodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comunidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirHome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dirHome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirStnm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dirStnm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dirStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dxrMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dxrMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infeQptp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infeQptp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCalle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreCalle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreContp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreContp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEdificio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreEdificio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCasa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCuentaM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCuentaM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroHHPP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroHHPP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSusap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroSusap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTorestp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QTorestp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTorresp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QTorresp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoCuentaM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefonoCuentaM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
