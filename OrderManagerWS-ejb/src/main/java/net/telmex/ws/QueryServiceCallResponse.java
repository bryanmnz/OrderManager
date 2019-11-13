/**
 * QueryServiceCallResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.telmex.ws;

public class QueryServiceCallResponse  extends net.telmex.ws.ResponseMessage  implements java.io.Serializable {
    private java.lang.String bookingDate;

    private java.lang.String bookingSEQ;

    private java.lang.String bookingTimeCode;

    private java.lang.String calledInName;

    private java.lang.String calledReceivedBy;

    private java.lang.String comments;

    private java.lang.String contactPhoneNumber;

    private java.lang.String dateOfCall;

    private java.lang.String idIntegracionHpsm;

    private java.lang.String priority;

    private java.lang.String problemDescription;

    private java.lang.String reasonForService;

    private java.lang.String requestServiceDate;

    private java.lang.String requestServiceTime;

    private java.lang.String s_cPoints;

    private java.lang.String secondContactNumber;

    private java.lang.String statDispatch;

    private java.lang.String timeOfCall;

    private java.lang.String truckRequiredFlag;

    private java.lang.String[] unot;

    private java.lang.String whateverCode;

    public QueryServiceCallResponse() {
    }

    public QueryServiceCallResponse(
           java.lang.String messageText,
           java.lang.String messageType,
           java.lang.String subscriberAccount,
           java.lang.String workOrderNo,
           java.lang.String bookingDate,
           java.lang.String bookingSEQ,
           java.lang.String bookingTimeCode,
           java.lang.String calledInName,
           java.lang.String calledReceivedBy,
           java.lang.String comments,
           java.lang.String contactPhoneNumber,
           java.lang.String dateOfCall,
           java.lang.String idIntegracionHpsm,
           java.lang.String priority,
           java.lang.String problemDescription,
           java.lang.String reasonForService,
           java.lang.String requestServiceDate,
           java.lang.String requestServiceTime,
           java.lang.String s_cPoints,
           java.lang.String secondContactNumber,
           java.lang.String statDispatch,
           java.lang.String timeOfCall,
           java.lang.String truckRequiredFlag,
           java.lang.String[] unot,
           java.lang.String whateverCode) {
        super(
            messageText,
            messageType,
            subscriberAccount,
            workOrderNo);
        this.bookingDate = bookingDate;
        this.bookingSEQ = bookingSEQ;
        this.bookingTimeCode = bookingTimeCode;
        this.calledInName = calledInName;
        this.calledReceivedBy = calledReceivedBy;
        this.comments = comments;
        this.contactPhoneNumber = contactPhoneNumber;
        this.dateOfCall = dateOfCall;
        this.idIntegracionHpsm = idIntegracionHpsm;
        this.priority = priority;
        this.problemDescription = problemDescription;
        this.reasonForService = reasonForService;
        this.requestServiceDate = requestServiceDate;
        this.requestServiceTime = requestServiceTime;
        this.s_cPoints = s_cPoints;
        this.secondContactNumber = secondContactNumber;
        this.statDispatch = statDispatch;
        this.timeOfCall = timeOfCall;
        this.truckRequiredFlag = truckRequiredFlag;
        this.unot = unot;
        this.whateverCode = whateverCode;
    }


    /**
     * Gets the bookingDate value for this QueryServiceCallResponse.
     * 
     * @return bookingDate
     */
    public java.lang.String getBookingDate() {
        return bookingDate;
    }


    /**
     * Sets the bookingDate value for this QueryServiceCallResponse.
     * 
     * @param bookingDate
     */
    public void setBookingDate(java.lang.String bookingDate) {
        this.bookingDate = bookingDate;
    }


    /**
     * Gets the bookingSEQ value for this QueryServiceCallResponse.
     * 
     * @return bookingSEQ
     */
    public java.lang.String getBookingSEQ() {
        return bookingSEQ;
    }


    /**
     * Sets the bookingSEQ value for this QueryServiceCallResponse.
     * 
     * @param bookingSEQ
     */
    public void setBookingSEQ(java.lang.String bookingSEQ) {
        this.bookingSEQ = bookingSEQ;
    }


    /**
     * Gets the bookingTimeCode value for this QueryServiceCallResponse.
     * 
     * @return bookingTimeCode
     */
    public java.lang.String getBookingTimeCode() {
        return bookingTimeCode;
    }


    /**
     * Sets the bookingTimeCode value for this QueryServiceCallResponse.
     * 
     * @param bookingTimeCode
     */
    public void setBookingTimeCode(java.lang.String bookingTimeCode) {
        this.bookingTimeCode = bookingTimeCode;
    }


    /**
     * Gets the calledInName value for this QueryServiceCallResponse.
     * 
     * @return calledInName
     */
    public java.lang.String getCalledInName() {
        return calledInName;
    }


    /**
     * Sets the calledInName value for this QueryServiceCallResponse.
     * 
     * @param calledInName
     */
    public void setCalledInName(java.lang.String calledInName) {
        this.calledInName = calledInName;
    }


    /**
     * Gets the calledReceivedBy value for this QueryServiceCallResponse.
     * 
     * @return calledReceivedBy
     */
    public java.lang.String getCalledReceivedBy() {
        return calledReceivedBy;
    }


    /**
     * Sets the calledReceivedBy value for this QueryServiceCallResponse.
     * 
     * @param calledReceivedBy
     */
    public void setCalledReceivedBy(java.lang.String calledReceivedBy) {
        this.calledReceivedBy = calledReceivedBy;
    }


    /**
     * Gets the comments value for this QueryServiceCallResponse.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this QueryServiceCallResponse.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the contactPhoneNumber value for this QueryServiceCallResponse.
     * 
     * @return contactPhoneNumber
     */
    public java.lang.String getContactPhoneNumber() {
        return contactPhoneNumber;
    }


    /**
     * Sets the contactPhoneNumber value for this QueryServiceCallResponse.
     * 
     * @param contactPhoneNumber
     */
    public void setContactPhoneNumber(java.lang.String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }


    /**
     * Gets the dateOfCall value for this QueryServiceCallResponse.
     * 
     * @return dateOfCall
     */
    public java.lang.String getDateOfCall() {
        return dateOfCall;
    }


    /**
     * Sets the dateOfCall value for this QueryServiceCallResponse.
     * 
     * @param dateOfCall
     */
    public void setDateOfCall(java.lang.String dateOfCall) {
        this.dateOfCall = dateOfCall;
    }


    /**
     * Gets the idIntegracionHpsm value for this QueryServiceCallResponse.
     * 
     * @return idIntegracionHpsm
     */
    public java.lang.String getIdIntegracionHpsm() {
        return idIntegracionHpsm;
    }


    /**
     * Sets the idIntegracionHpsm value for this QueryServiceCallResponse.
     * 
     * @param idIntegracionHpsm
     */
    public void setIdIntegracionHpsm(java.lang.String idIntegracionHpsm) {
        this.idIntegracionHpsm = idIntegracionHpsm;
    }


    /**
     * Gets the priority value for this QueryServiceCallResponse.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this QueryServiceCallResponse.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the problemDescription value for this QueryServiceCallResponse.
     * 
     * @return problemDescription
     */
    public java.lang.String getProblemDescription() {
        return problemDescription;
    }


    /**
     * Sets the problemDescription value for this QueryServiceCallResponse.
     * 
     * @param problemDescription
     */
    public void setProblemDescription(java.lang.String problemDescription) {
        this.problemDescription = problemDescription;
    }


    /**
     * Gets the reasonForService value for this QueryServiceCallResponse.
     * 
     * @return reasonForService
     */
    public java.lang.String getReasonForService() {
        return reasonForService;
    }


    /**
     * Sets the reasonForService value for this QueryServiceCallResponse.
     * 
     * @param reasonForService
     */
    public void setReasonForService(java.lang.String reasonForService) {
        this.reasonForService = reasonForService;
    }


    /**
     * Gets the requestServiceDate value for this QueryServiceCallResponse.
     * 
     * @return requestServiceDate
     */
    public java.lang.String getRequestServiceDate() {
        return requestServiceDate;
    }


    /**
     * Sets the requestServiceDate value for this QueryServiceCallResponse.
     * 
     * @param requestServiceDate
     */
    public void setRequestServiceDate(java.lang.String requestServiceDate) {
        this.requestServiceDate = requestServiceDate;
    }


    /**
     * Gets the requestServiceTime value for this QueryServiceCallResponse.
     * 
     * @return requestServiceTime
     */
    public java.lang.String getRequestServiceTime() {
        return requestServiceTime;
    }


    /**
     * Sets the requestServiceTime value for this QueryServiceCallResponse.
     * 
     * @param requestServiceTime
     */
    public void setRequestServiceTime(java.lang.String requestServiceTime) {
        this.requestServiceTime = requestServiceTime;
    }


    /**
     * Gets the s_cPoints value for this QueryServiceCallResponse.
     * 
     * @return s_cPoints
     */
    public java.lang.String getS_cPoints() {
        return s_cPoints;
    }


    /**
     * Sets the s_cPoints value for this QueryServiceCallResponse.
     * 
     * @param s_cPoints
     */
    public void setS_cPoints(java.lang.String s_cPoints) {
        this.s_cPoints = s_cPoints;
    }


    /**
     * Gets the secondContactNumber value for this QueryServiceCallResponse.
     * 
     * @return secondContactNumber
     */
    public java.lang.String getSecondContactNumber() {
        return secondContactNumber;
    }


    /**
     * Sets the secondContactNumber value for this QueryServiceCallResponse.
     * 
     * @param secondContactNumber
     */
    public void setSecondContactNumber(java.lang.String secondContactNumber) {
        this.secondContactNumber = secondContactNumber;
    }


    /**
     * Gets the statDispatch value for this QueryServiceCallResponse.
     * 
     * @return statDispatch
     */
    public java.lang.String getStatDispatch() {
        return statDispatch;
    }


    /**
     * Sets the statDispatch value for this QueryServiceCallResponse.
     * 
     * @param statDispatch
     */
    public void setStatDispatch(java.lang.String statDispatch) {
        this.statDispatch = statDispatch;
    }


    /**
     * Gets the timeOfCall value for this QueryServiceCallResponse.
     * 
     * @return timeOfCall
     */
    public java.lang.String getTimeOfCall() {
        return timeOfCall;
    }


    /**
     * Sets the timeOfCall value for this QueryServiceCallResponse.
     * 
     * @param timeOfCall
     */
    public void setTimeOfCall(java.lang.String timeOfCall) {
        this.timeOfCall = timeOfCall;
    }


    /**
     * Gets the truckRequiredFlag value for this QueryServiceCallResponse.
     * 
     * @return truckRequiredFlag
     */
    public java.lang.String getTruckRequiredFlag() {
        return truckRequiredFlag;
    }


    /**
     * Sets the truckRequiredFlag value for this QueryServiceCallResponse.
     * 
     * @param truckRequiredFlag
     */
    public void setTruckRequiredFlag(java.lang.String truckRequiredFlag) {
        this.truckRequiredFlag = truckRequiredFlag;
    }


    /**
     * Gets the unot value for this QueryServiceCallResponse.
     * 
     * @return unot
     */
    public java.lang.String[] getUnot() {
        return unot;
    }


    /**
     * Sets the unot value for this QueryServiceCallResponse.
     * 
     * @param unot
     */
    public void setUnot(java.lang.String[] unot) {
        this.unot = unot;
    }

    public java.lang.String getUnot(int i) {
        return this.unot[i];
    }

    public void setUnot(int i, java.lang.String _value) {
        this.unot[i] = _value;
    }


    /**
     * Gets the whateverCode value for this QueryServiceCallResponse.
     * 
     * @return whateverCode
     */
    public java.lang.String getWhateverCode() {
        return whateverCode;
    }


    /**
     * Sets the whateverCode value for this QueryServiceCallResponse.
     * 
     * @param whateverCode
     */
    public void setWhateverCode(java.lang.String whateverCode) {
        this.whateverCode = whateverCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryServiceCallResponse)) return false;
        QueryServiceCallResponse other = (QueryServiceCallResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bookingDate==null && other.getBookingDate()==null) || 
             (this.bookingDate!=null &&
              this.bookingDate.equals(other.getBookingDate()))) &&
            ((this.bookingSEQ==null && other.getBookingSEQ()==null) || 
             (this.bookingSEQ!=null &&
              this.bookingSEQ.equals(other.getBookingSEQ()))) &&
            ((this.bookingTimeCode==null && other.getBookingTimeCode()==null) || 
             (this.bookingTimeCode!=null &&
              this.bookingTimeCode.equals(other.getBookingTimeCode()))) &&
            ((this.calledInName==null && other.getCalledInName()==null) || 
             (this.calledInName!=null &&
              this.calledInName.equals(other.getCalledInName()))) &&
            ((this.calledReceivedBy==null && other.getCalledReceivedBy()==null) || 
             (this.calledReceivedBy!=null &&
              this.calledReceivedBy.equals(other.getCalledReceivedBy()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.contactPhoneNumber==null && other.getContactPhoneNumber()==null) || 
             (this.contactPhoneNumber!=null &&
              this.contactPhoneNumber.equals(other.getContactPhoneNumber()))) &&
            ((this.dateOfCall==null && other.getDateOfCall()==null) || 
             (this.dateOfCall!=null &&
              this.dateOfCall.equals(other.getDateOfCall()))) &&
            ((this.idIntegracionHpsm==null && other.getIdIntegracionHpsm()==null) || 
             (this.idIntegracionHpsm!=null &&
              this.idIntegracionHpsm.equals(other.getIdIntegracionHpsm()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.problemDescription==null && other.getProblemDescription()==null) || 
             (this.problemDescription!=null &&
              this.problemDescription.equals(other.getProblemDescription()))) &&
            ((this.reasonForService==null && other.getReasonForService()==null) || 
             (this.reasonForService!=null &&
              this.reasonForService.equals(other.getReasonForService()))) &&
            ((this.requestServiceDate==null && other.getRequestServiceDate()==null) || 
             (this.requestServiceDate!=null &&
              this.requestServiceDate.equals(other.getRequestServiceDate()))) &&
            ((this.requestServiceTime==null && other.getRequestServiceTime()==null) || 
             (this.requestServiceTime!=null &&
              this.requestServiceTime.equals(other.getRequestServiceTime()))) &&
            ((this.s_cPoints==null && other.getS_cPoints()==null) || 
             (this.s_cPoints!=null &&
              this.s_cPoints.equals(other.getS_cPoints()))) &&
            ((this.secondContactNumber==null && other.getSecondContactNumber()==null) || 
             (this.secondContactNumber!=null &&
              this.secondContactNumber.equals(other.getSecondContactNumber()))) &&
            ((this.statDispatch==null && other.getStatDispatch()==null) || 
             (this.statDispatch!=null &&
              this.statDispatch.equals(other.getStatDispatch()))) &&
            ((this.timeOfCall==null && other.getTimeOfCall()==null) || 
             (this.timeOfCall!=null &&
              this.timeOfCall.equals(other.getTimeOfCall()))) &&
            ((this.truckRequiredFlag==null && other.getTruckRequiredFlag()==null) || 
             (this.truckRequiredFlag!=null &&
              this.truckRequiredFlag.equals(other.getTruckRequiredFlag()))) &&
            ((this.unot==null && other.getUnot()==null) || 
             (this.unot!=null &&
              java.util.Arrays.equals(this.unot, other.getUnot()))) &&
            ((this.whateverCode==null && other.getWhateverCode()==null) || 
             (this.whateverCode!=null &&
              this.whateverCode.equals(other.getWhateverCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBookingDate() != null) {
            _hashCode += getBookingDate().hashCode();
        }
        if (getBookingSEQ() != null) {
            _hashCode += getBookingSEQ().hashCode();
        }
        if (getBookingTimeCode() != null) {
            _hashCode += getBookingTimeCode().hashCode();
        }
        if (getCalledInName() != null) {
            _hashCode += getCalledInName().hashCode();
        }
        if (getCalledReceivedBy() != null) {
            _hashCode += getCalledReceivedBy().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getContactPhoneNumber() != null) {
            _hashCode += getContactPhoneNumber().hashCode();
        }
        if (getDateOfCall() != null) {
            _hashCode += getDateOfCall().hashCode();
        }
        if (getIdIntegracionHpsm() != null) {
            _hashCode += getIdIntegracionHpsm().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProblemDescription() != null) {
            _hashCode += getProblemDescription().hashCode();
        }
        if (getReasonForService() != null) {
            _hashCode += getReasonForService().hashCode();
        }
        if (getRequestServiceDate() != null) {
            _hashCode += getRequestServiceDate().hashCode();
        }
        if (getRequestServiceTime() != null) {
            _hashCode += getRequestServiceTime().hashCode();
        }
        if (getS_cPoints() != null) {
            _hashCode += getS_cPoints().hashCode();
        }
        if (getSecondContactNumber() != null) {
            _hashCode += getSecondContactNumber().hashCode();
        }
        if (getStatDispatch() != null) {
            _hashCode += getStatDispatch().hashCode();
        }
        if (getTimeOfCall() != null) {
            _hashCode += getTimeOfCall().hashCode();
        }
        if (getTruckRequiredFlag() != null) {
            _hashCode += getTruckRequiredFlag().hashCode();
        }
        if (getUnot() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnot());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnot(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWhateverCode() != null) {
            _hashCode += getWhateverCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryServiceCallResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.telmex.net/", "queryServiceCallResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingSEQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookingSEQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingTimeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookingTimeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledInName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledInName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledReceivedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledReceivedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idIntegracionHpsm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idIntegracionHpsm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonForService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonForService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestServiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestServiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestServiceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestServiceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s_cPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "s_cPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondContactNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondContactNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statDispatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statDispatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeOfCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("truckRequiredFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "truckRequiredFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whateverCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whateverCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
