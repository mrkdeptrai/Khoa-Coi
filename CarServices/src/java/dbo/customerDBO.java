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
public class customerDBO {
    private String customerID;
    private String customerName;
    private String customerGender;
    private String customerPhoneNumber;
    private String customerAddress;
    private String customerCarModel;
    private String carLicenseNumber;

    public customerDBO(String customerID, String customerName, String customerGender, String customerPhoneNumber, String customerAddress, String customerCarModel, String carLicenseNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerAddress = customerAddress;
        this.customerCarModel = customerCarModel;
        this.carLicenseNumber = carLicenseNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCarModel() {
        return customerCarModel;
    }

    public void setCustomerCarModel(String customerCarModel) {
        this.customerCarModel = customerCarModel;
    }

    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }

    public void setCarLicenseNumber(String carLicenseNumber) {
        this.carLicenseNumber = carLicenseNumber;
    }
    
    @Override
    public String toString(){
        return customerID + "   " + customerName + "   " + customerGender + "   " + customerPhoneNumber + "   " + customerAddress + "   " + customerCarModel + "   " + carLicenseNumber;
    }
}
