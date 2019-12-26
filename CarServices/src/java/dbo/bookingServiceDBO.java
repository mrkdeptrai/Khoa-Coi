/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

/**
 *
 * @author mrkho
 */
public class bookingServiceDBO {
    private String bookingID;
    private String customerID;
    private String mechanicID;
    private String carStatus;
    private String datetimeOfService;
    private String paymentReceived;
    private String descriptionAboutBooking;
    private String status;

    public bookingServiceDBO(String bookingID, String customerID, String mechanicID, String carStatus, String datetimeOfService, String paymentReceived, String descriptionAboutBooking, String status) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.mechanicID = mechanicID;
        this.carStatus = carStatus;
        this.datetimeOfService = datetimeOfService;
        this.paymentReceived = paymentReceived;
        this.descriptionAboutBooking = descriptionAboutBooking;
        this.status = status;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getMechanicID() {
        return mechanicID;
    }

    public void setMechanicID(String mechanicID) {
        this.mechanicID = mechanicID;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public String getDatetimeOfService() {
        return datetimeOfService;
    }

    public void setDatetimeOfService(String datetimeOfService) {
        this.datetimeOfService = datetimeOfService;
    }

    public String getPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(String paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    public String getDescriptionAboutBooking() {
        return descriptionAboutBooking;
    }

    public void setDescriptionAboutBooking(String descriptionAboutBooking) {
        this.descriptionAboutBooking = descriptionAboutBooking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public String toString(){
        return bookingID + "   " + customerID + "   " +  mechanicID + "   " +  carStatus + "   " +  datetimeOfService + "   " +  paymentReceived + "   " +  descriptionAboutBooking + "   " +  status;
    }
}
