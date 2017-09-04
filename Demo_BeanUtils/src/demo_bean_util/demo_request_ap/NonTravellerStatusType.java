//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:10:55 PM ICT 
//


package demo_bean_util.demo_request_ap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonTravellerStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nonTravellerStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Board"/>
 *     &lt;enumeration value="DoNotBoard"/>
 *     &lt;enumeration value="UnableToDetermineStatus"/>
 *     &lt;enumeration value="InsufficientData"/>
 *     &lt;enumeration value="Timeout"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nonTravellerStatusType", namespace = "http://sita.aero/iborders/APP/APPService/V1")
@XmlEnum
public enum NonTravellerStatusType {

    @XmlEnumValue("Board")
    BOARD("Board"),
    @XmlEnumValue("DoNotBoard")
    DO_NOT_BOARD("DoNotBoard"),
    @XmlEnumValue("UnableToDetermineStatus")
    UNABLE_TO_DETERMINE_STATUS("UnableToDetermineStatus"),
    @XmlEnumValue("InsufficientData")
    INSUFFICIENT_DATA("InsufficientData"),
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    NonTravellerStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonTravellerStatusType fromValue(String v) {
        for (NonTravellerStatusType c: NonTravellerStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
