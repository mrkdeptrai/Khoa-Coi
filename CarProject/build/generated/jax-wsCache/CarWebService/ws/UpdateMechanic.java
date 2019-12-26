
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateMechanic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateMechanic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mechanicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mechanicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mechanicPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mechanicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMechanic", propOrder = {
    "mechanicID",
    "mechanicName",
    "mechanicPhone",
    "mechanicAddress"
})
public class UpdateMechanic {

    protected String mechanicID;
    protected String mechanicName;
    protected String mechanicPhone;
    protected String mechanicAddress;

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
     * Gets the value of the mechanicPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanicPhone() {
        return mechanicPhone;
    }

    /**
     * Sets the value of the mechanicPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanicPhone(String value) {
        this.mechanicPhone = value;
    }

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

}
