//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:10:55 PM ICT 
//


package demo_bean_util.demo_request_ap;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Common response for PreCheckIn, CheckIn and Recheck transactions.
 * 
 * <p>Java class for CheckInTravellerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInTravellerResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://sita.aero/iborders/APP/APPService/V1}HeaderType"/>
 *         &lt;element name="TravellerResult" type="{http://sita.aero/iborders/APP/APPService/V1}CheckInTravellerResultType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://sita.aero/iborders/APP/APPService/V1}SystemErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInTravellerResponseType", namespace = "http://sita.aero/iborders/APP/APPService/V1"
	, propOrder = {"header","travellerResult","error"
	})
@XmlRootElement(name = "CheckInTravellerResponse", namespace = "http://sita.aero/iborders/APP/APPService/V1")
public class CheckInTravellerResponseType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "TravellerResult")
    protected List<CheckInTravellerResultType> travellerResult;
    @XmlElement(name = "Error")
    protected List<SystemErrorType> error;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the travellerResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInTravellerResultType }
     * 
     * 
     */
    public List<CheckInTravellerResultType> getTravellerResult() {
        if (travellerResult == null) {
            travellerResult = new ArrayList<CheckInTravellerResultType>();
        }
        return this.travellerResult;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemErrorType }
     * 
     * 
     */
    public List<SystemErrorType> getError() {
        if (error == null) {
            error = new ArrayList<SystemErrorType>();
        }
        return this.error;
    }

}
