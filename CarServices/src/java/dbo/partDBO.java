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
public class partDBO {
    private String partID;
    private String partName;
    private String partModel;
    private String price;
    private String supplierID;
    private String brandID;

    public partDBO(String partID, String partName, String partModel, String price, String supplierID, String brandID) {
        this.partID = partID;
        this.partName = partName;
        this.partModel = partModel;
        this.price = price;
        this.supplierID = supplierID;
        this.brandID = brandID;
    }

    public String getPartID() {
        return partID;
    }

    public void setPartID(String partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartModel() {
        return partModel;
    }

    public void setPartModel(String partModel) {
        this.partModel = partModel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }
    
    @Override
    public String toString(){
        return partID + "   " + partName + "   " + partModel + "   " + price + "   " + supplierID + "   " + brandID;
    }
}
