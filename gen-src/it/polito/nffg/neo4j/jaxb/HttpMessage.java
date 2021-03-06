//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.23 at 04:09:43 PM CET 
//


package it.polito.nffg.neo4j.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="reasonPhrase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusCode",
    "reasonPhrase",
    "message"
})
@XmlRootElement(name = "httpMessage", namespace = "http://www.example.org/response/")
public class HttpMessage {

    @XmlElement(namespace = "http://www.example.org/response/", defaultValue = "500")
    @XmlSchemaType(name = "unsignedShort")
    protected int statusCode;
    @XmlElement(namespace = "http://www.example.org/response/", required = true, defaultValue = "Internal Server Error")
    protected String reasonPhrase;
    @XmlElement(namespace = "http://www.example.org/response/")
    protected String message;

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the reasonPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonPhrase() {
        return reasonPhrase;
    }

    /**
     * Sets the value of the reasonPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonPhrase(String value) {
        this.reasonPhrase = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
