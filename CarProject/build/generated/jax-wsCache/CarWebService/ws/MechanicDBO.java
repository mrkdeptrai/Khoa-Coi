
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mechanicDBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mechanicDBO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mechanicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mechanicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mechanicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mechanicPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mechanicDBO", propOrder = {
    "mechanicAddress",
    "mechanicID",
    "mechanicName",
    "mechanicPhoneNumber"
})
public class MechanicDBO {

    protected String mechanicAddress;
    protected String mechanicID;
    protected String mechanicName;
    protected String mechanicPhoneNumber;

    /**
     * Gets the value of the mechanicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanicAddress() {
        return mechanicAddress;
    }

    /**
     * Sets the value of the mechanicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanicAddress(String value) {
        this.mechanicAddress = value;
    }

    /**
     * Gets the value of the mechanicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanicID() {
        return mechanicID;
    }

    /**
     * Sets the value of the mechanicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanicID(String value) {
        this.mechanicID = value;
    }

    /**
     * Gets the value of the mechanicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanicName() {
        return mechanicName;
    }

    /**
     * Sets the value of the mechanicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanicName(String value) {
        this.mechanicName = value;
    }

    /**
     * Gets the value of the mechanicPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanicPhoneNumber() {
        return mechanicPhoneNumber;
    }

    /**
     * Sets the value of the mechanicPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanicPhoneNumber(String value) {
        this.mechanicPhoneNumber = value;
    }

}
