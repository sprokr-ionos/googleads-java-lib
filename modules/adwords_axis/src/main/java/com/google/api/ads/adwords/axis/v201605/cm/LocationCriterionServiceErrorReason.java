/**
 * LocationCriterionServiceErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;

public class LocationCriterionServiceErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocationCriterionServiceErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQUIRED_LOCATION_CRITERION_PREDICATE_MISSING = "REQUIRED_LOCATION_CRITERION_PREDICATE_MISSING";
    public static final java.lang.String _TOO_MANY_LOCATION_CRITERION_PREDICATES_SPECIFIED = "TOO_MANY_LOCATION_CRITERION_PREDICATES_SPECIFIED";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _LOCATION_CRITERION_SERVICE_ERROR = "LOCATION_CRITERION_SERVICE_ERROR";
    public static final LocationCriterionServiceErrorReason REQUIRED_LOCATION_CRITERION_PREDICATE_MISSING = new LocationCriterionServiceErrorReason(_REQUIRED_LOCATION_CRITERION_PREDICATE_MISSING);
    public static final LocationCriterionServiceErrorReason TOO_MANY_LOCATION_CRITERION_PREDICATES_SPECIFIED = new LocationCriterionServiceErrorReason(_TOO_MANY_LOCATION_CRITERION_PREDICATES_SPECIFIED);
    public static final LocationCriterionServiceErrorReason INVALID_COUNTRY_CODE = new LocationCriterionServiceErrorReason(_INVALID_COUNTRY_CODE);
    public static final LocationCriterionServiceErrorReason LOCATION_CRITERION_SERVICE_ERROR = new LocationCriterionServiceErrorReason(_LOCATION_CRITERION_SERVICE_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static LocationCriterionServiceErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocationCriterionServiceErrorReason enumeration = (LocationCriterionServiceErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocationCriterionServiceErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationCriterionServiceErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "LocationCriterionServiceError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
