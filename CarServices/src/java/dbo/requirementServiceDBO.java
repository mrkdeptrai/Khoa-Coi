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
public class requirementServiceDBO {
    private String requirementID;
    private String partID;
    private String customerID;
    private String requirementDescription;
    private String dateRequirement;

    public requirementServiceDBO(String requirementID, String partID, String customerID, String requirementDescription, String dateRequirement) {
        this.requirementID = requirementID;
        this.partID = partID;
        this.customerID = customerID;
        this.requirementDescription = requirementDescription;
        this.dateRequirement = dateRequirement;
    }

    public String getRequirementID() {
        return requirementID;
    }

    public void setRequirementID(String requirementID) {
        this.requirementID = requirementID;
    }

    public String getPartID() {
        return partID;
    }

    public void setPartID(String partID) {
        this.partID = partID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getRequirementDescription() {
        return requirementDescription;
    }

    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription;
    }

    public String getDateRequirement() {
        return dateRequirement;
    }

    public void setDateRequirement(String dateRequirement) {
        this.dateRequirement = dateRequirement;
    }
    
    @Override
    public String toString(){
        return requirementID + "   " + partID + "   " + customerID + "   " + requirementDescription + "   " + dateRequirement;
    }
}
