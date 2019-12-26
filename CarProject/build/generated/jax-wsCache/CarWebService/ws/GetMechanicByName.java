
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMechanicByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMechanicByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mechanicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMechanicByName", propOrder = {
    "mechanicName"
})
public class GetMechanicByName {

    protected String mechanicName;

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

}
