/**
 * ConversionTrackingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public class ConversionTrackingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConversionTrackingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ANALYTICS_NOT_ALLOWED = "ANALYTICS_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_ADD_CONVERSION_TYPE_SUBCLASS = "CANNOT_ADD_CONVERSION_TYPE_SUBCLASS";
    public static final java.lang.String _CANNOT_CHANGE_APP_CONVERSION_TYPE = "CANNOT_CHANGE_APP_CONVERSION_TYPE";
    public static final java.lang.String _CANNOT_CHANGE_APP_PLATFORM = "CANNOT_CHANGE_APP_PLATFORM";
    public static final java.lang.String _CANNNOT_CHANGE_CONVERSION_SUBCLASS = "CANNNOT_CHANGE_CONVERSION_SUBCLASS";
    public static final java.lang.String _CANNOT_SET_HIDDEN_STATUS = "CANNOT_SET_HIDDEN_STATUS";
    public static final java.lang.String _CONVERSION_TYPE_NOT_FOUND = "CONVERSION_TYPE_NOT_FOUND";
    public static final java.lang.String _DOMAIN_EXCEPTION = "DOMAIN_EXCEPTION";
    public static final java.lang.String _DUPLICATE_APP_ID = "DUPLICATE_APP_ID";
    public static final java.lang.String _DUPLICATE_NAME = "DUPLICATE_NAME";
    public static final java.lang.String _EMAIL_FAILED = "EMAIL_FAILED";
    public static final java.lang.String _EXCEEDED_CONVERSION_TYPE_LIMIT = "EXCEEDED_CONVERSION_TYPE_LIMIT";
    public static final java.lang.String _ID_IS_NULL = "ID_IS_NULL";
    public static final java.lang.String _INVALID_APP_ID = "INVALID_APP_ID";
    public static final java.lang.String _INVALID_COLOR = "INVALID_COLOR";
    public static final java.lang.String _INVALID_CONVERSION = "INVALID_CONVERSION";
    public static final java.lang.String _INVALID_DATE_RANGE = "INVALID_DATE_RANGE";
    public static final java.lang.String _INVALID_EMAIL_ADDRESS = "INVALID_EMAIL_ADDRESS";
    public static final java.lang.String _MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER = "MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER";
    public static final java.lang.String _NAME_ALREADY_EXISTS = "NAME_ALREADY_EXISTS";
    public static final java.lang.String _NO_RECIPIENTS = "NO_RECIPIENTS";
    public static final java.lang.String _NO_SNIPPET = "NO_SNIPPET";
    public static final java.lang.String _REMARKETING_TYPE_NOT_ALLOWED = "REMARKETING_TYPE_NOT_ALLOWED";
    public static final java.lang.String _TOO_MANY_WEBPAGES = "TOO_MANY_WEBPAGES";
    public static final java.lang.String _UNKNOWN_SORTING_TYPE = "UNKNOWN_SORTING_TYPE";
    public static final ConversionTrackingErrorReason ANALYTICS_NOT_ALLOWED = new ConversionTrackingErrorReason(_ANALYTICS_NOT_ALLOWED);
    public static final ConversionTrackingErrorReason CANNOT_ADD_CONVERSION_TYPE_SUBCLASS = new ConversionTrackingErrorReason(_CANNOT_ADD_CONVERSION_TYPE_SUBCLASS);
    public static final ConversionTrackingErrorReason CANNOT_CHANGE_APP_CONVERSION_TYPE = new ConversionTrackingErrorReason(_CANNOT_CHANGE_APP_CONVERSION_TYPE);
    public static final ConversionTrackingErrorReason CANNOT_CHANGE_APP_PLATFORM = new ConversionTrackingErrorReason(_CANNOT_CHANGE_APP_PLATFORM);
    public static final ConversionTrackingErrorReason CANNNOT_CHANGE_CONVERSION_SUBCLASS = new ConversionTrackingErrorReason(_CANNNOT_CHANGE_CONVERSION_SUBCLASS);
    public static final ConversionTrackingErrorReason CANNOT_SET_HIDDEN_STATUS = new ConversionTrackingErrorReason(_CANNOT_SET_HIDDEN_STATUS);
    public static final ConversionTrackingErrorReason CONVERSION_TYPE_NOT_FOUND = new ConversionTrackingErrorReason(_CONVERSION_TYPE_NOT_FOUND);
    public static final ConversionTrackingErrorReason DOMAIN_EXCEPTION = new ConversionTrackingErrorReason(_DOMAIN_EXCEPTION);
    public static final ConversionTrackingErrorReason DUPLICATE_APP_ID = new ConversionTrackingErrorReason(_DUPLICATE_APP_ID);
    public static final ConversionTrackingErrorReason DUPLICATE_NAME = new ConversionTrackingErrorReason(_DUPLICATE_NAME);
    public static final ConversionTrackingErrorReason EMAIL_FAILED = new ConversionTrackingErrorReason(_EMAIL_FAILED);
    public static final ConversionTrackingErrorReason EXCEEDED_CONVERSION_TYPE_LIMIT = new ConversionTrackingErrorReason(_EXCEEDED_CONVERSION_TYPE_LIMIT);
    public static final ConversionTrackingErrorReason ID_IS_NULL = new ConversionTrackingErrorReason(_ID_IS_NULL);
    public static final ConversionTrackingErrorReason INVALID_APP_ID = new ConversionTrackingErrorReason(_INVALID_APP_ID);
    public static final ConversionTrackingErrorReason INVALID_COLOR = new ConversionTrackingErrorReason(_INVALID_COLOR);
    public static final ConversionTrackingErrorReason INVALID_CONVERSION = new ConversionTrackingErrorReason(_INVALID_CONVERSION);
    public static final ConversionTrackingErrorReason INVALID_DATE_RANGE = new ConversionTrackingErrorReason(_INVALID_DATE_RANGE);
    public static final ConversionTrackingErrorReason INVALID_EMAIL_ADDRESS = new ConversionTrackingErrorReason(_INVALID_EMAIL_ADDRESS);
    public static final ConversionTrackingErrorReason MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER = new ConversionTrackingErrorReason(_MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER);
    public static final ConversionTrackingErrorReason NAME_ALREADY_EXISTS = new ConversionTrackingErrorReason(_NAME_ALREADY_EXISTS);
    public static final ConversionTrackingErrorReason NO_RECIPIENTS = new ConversionTrackingErrorReason(_NO_RECIPIENTS);
    public static final ConversionTrackingErrorReason NO_SNIPPET = new ConversionTrackingErrorReason(_NO_SNIPPET);
    public static final ConversionTrackingErrorReason REMARKETING_TYPE_NOT_ALLOWED = new ConversionTrackingErrorReason(_REMARKETING_TYPE_NOT_ALLOWED);
    public static final ConversionTrackingErrorReason TOO_MANY_WEBPAGES = new ConversionTrackingErrorReason(_TOO_MANY_WEBPAGES);
    public static final ConversionTrackingErrorReason UNKNOWN_SORTING_TYPE = new ConversionTrackingErrorReason(_UNKNOWN_SORTING_TYPE);
    public java.lang.String getValue() { return _value_;}
    public static ConversionTrackingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConversionTrackingErrorReason enumeration = (ConversionTrackingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConversionTrackingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConversionTrackingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ConversionTrackingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
