//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:11:12 PM ICT 
//


package demo_bean_util.demo_request_ap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carrierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="carrierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Airline"/>
 *     &lt;enumeration value="GeneralAviation"/>
 *     &lt;enumeration value="BusCompany"/>
 *     &lt;enumeration value="ShippingCompany"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "carrierType")
@XmlEnum
public enum CarrierType {

    @XmlEnumValue("Airline")
    AIRLINE("Airline"),
    @XmlEnumValue("GeneralAviation")
    GENERAL_AVIATION("GeneralAviation"),
    @XmlEnumValue("BusCompany")
    BUS_COMPANY("BusCompany"),
    @XmlEnumValue("ShippingCompany")
    SHIPPING_COMPANY("ShippingCompany");
    private final String value;

    CarrierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarrierType fromValue(String v) {
        for (CarrierType c: CarrierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
