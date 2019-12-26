
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requirementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requirementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRequirement", propOrder = {
    "requirementID",
    "requirementDescription",
    "dateRequirement"
})
public class UpdateRequirement {

    protected String requirementID;
    protected String requirementDescription;
    protected String dateRequirement;

    /**
     * Gets the value of the requirementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirementID() {
        return requirementID;
    }

    /**
     * Sets the value of the requirementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirementID(String value) {
        this.requirementID = value;
    }

    /**
     * Gets the value of the requirementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirementDescription() {
        return requirementDescription;
    }

    /**
     * Sets the value of the requirementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirementDescription(String value) {
        this.requirementDescription = value;
    }

    /**
     * Gets the value of the dateRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateRequirement() {
        return dateRequirement;
    }

    /**
     * Sets the value of the dateRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRequirement(String value) {
        this.dateRequirement = value;
    }

}
