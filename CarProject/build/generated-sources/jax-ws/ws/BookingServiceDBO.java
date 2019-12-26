
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingServiceDBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingServiceDBO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datetimeOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionAboutBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mechanicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingServiceDBO", propOrder = {
    "bookingID",
    "carStatus",
    "customerID",
    "datetimeOfService",
    "descriptionAboutBooking",
    "mechanicID",
    "paymentReceived",
    "status"
})
public class BookingServiceDBO {

    protected String bookingID;
    protected String carStatus;
    protected String customerID;
    protected String datetimeOfService;
    protected String descriptionAboutBooking;
    protected String mechanicID;
    protected String paymentReceived;
    protected String status;

    /**
     * Gets the value of the bookingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingID(String value) {
        this.bookingID = value;
    }

    /**
     * Gets the value of the carStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarStatus() {
        return carStatus;
    }

    /**
     * Sets the value of the carStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarStatus(String value) {
        this.carStatus = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the datetimeOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatetimeOfService() {
        return datetimeOfService;
    }

    /**
     * Sets the value of the datetimeOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatetimeOfService(String value) {
        this.datetimeOfService = value;
    }

    /**
     * Gets the value of the descriptionAboutBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionAboutBooking() {
        return descriptionAboutBooking;
    }

    /**
     * Sets the value of the descriptionAboutBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionAboutBooking(String value) {
        this.descriptionAboutBooking = value;
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
     * Gets the value of the paymentReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReceived() {
        return paymentReceived;
    }

    /**
     * Sets the value of the paymentReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReceived(String value) {
        this.paymentReceived = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
