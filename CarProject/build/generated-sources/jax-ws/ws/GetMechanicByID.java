
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMechanicByID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMechanicByID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mechanicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMechanicByID", propOrder = {
    "mechanicID"
})
public class GetMechanicByID {

    protected String mechanicID;

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

}
