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
public class brandDBO {
    private String brandID;
    private String brandName;
    private String brandDescription;

    public brandDBO(String brandID, String brandName, String brandDescription) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.brandDescription = brandDescription;
    }

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    @Override
    public String toString() {
        return brandID + "   " + brandName + "   " + brandDescription;
    }
    
    
}
