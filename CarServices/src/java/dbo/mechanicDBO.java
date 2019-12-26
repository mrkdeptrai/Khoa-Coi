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
public class mechanicDBO {
    private String mechanicID;
    private String mechanicName;
    private String mechanicPhoneNumber;
    private String mechanicAddress;

    public mechanicDBO(String mechanicID, String mechanicName, String mechanicPhoneNumber, String mechanicAddress) {
        this.mechanicID = mechanicID;
        this.mechanicName = mechanicName;
        this.mechanicPhoneNumber = mechanicPhoneNumber;
        this.mechanicAddress = mechanicAddress;
    }

    public String getMechanicID() {
        return mechanicID;
    }

    public void setMechanicID(String mechanicID) {
        this.mechanicID = mechanicID;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public String getMechanicPhoneNumber() {
        return mechanicPhoneNumber;
    }

    public void setMechanicPhoneNumber(String mechanicPhoneNumber) {
        this.mechanicPhoneNumber = mechanicPhoneNumber;
    }

    public String getMechanicAddress() {
        return mechanicAddress;
    }

    public void setMechanicAddress(String mechanicAddress) {
        this.mechanicAddress = mechanicAddress;
    }
    
    @Override
    public String toString(){
        return mechanicID + "   " + mechanicName + "   " + mechanicPhoneNumber + "   " + mechanicAddress;
    }
    
}
