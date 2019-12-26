/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import dbo.customerDBO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mrkho
 */
public class customerDA extends GeneralDA{
    public customerDA() throws SQLException{
        super(); // call constuctor of parent class
    }
    public ArrayList<customerDBO> getAllCustomer(){
        try {
            String selectSQL = "SELECT * FROM tblCustomer";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSQL);
            
            ArrayList<customerDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get customer info
                String customerID = rs.getString("customerID");
                String customerName = rs.getString("customerName");
                String customerGender = rs.getString("customerGender");
                String customerPhoneNumber = rs.getString("customerPhoneNumber");
                String customerAddress = rs.getString("customerAddress");
                String customerCarModel = rs.getString("customerCarModel");
                String carLicenseNumber = rs.getString("carLicenseNumber");
                customerDBO customer = new customerDBO(customerID, customerName, customerGender, customerPhoneNumber, customerAddress, customerCarModel, carLicenseNumber);
                list.add(customer);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(customerDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<customerDBO> getCustomerByID(String customerID){
        try {
            String selectSQL = "SELECT * FROM tblCustomer WHERE customerID = ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, customerID);
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<customerDBO> list = new ArrayList<>();
            while(rs.next()){
                //Get customer info
                String customerName = rs.getString("customerName");
                String customerGender = rs.getString("customerGender");
                String customerPhoneNumber = rs.getString("customerPhoneNumber");
                String customerAddress = rs.getString("customerAddress");
                String customerCarModel = rs.getString("customerCarModel");
                String carLicenseNumber = rs.getString("carLicenseNumber");
                customerDBO customer = new customerDBO(customerID, customerName, customerGender, customerPhoneNumber, customerAddress, customerCarModel, carLicenseNumber);
                list.add(customer);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(customerDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<customerDBO> getCustomerByName(String customerName){
        try {
            String selectSQL = "SELECT * FROM tblCustomer WHERE customerName LIKE ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, "%" + customerName + "%");
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<customerDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get customer info
                String customerID = rs.getString("customerID");
                String cName = rs.getString("customerName");
                String customerGender = rs.getString("customerGender");
                String customerPhoneNumber = rs.getString("customerPhoneNumber");
                String customerAddress = rs.getString("customerAddress");
                String customerCarModel = rs.getString("customerCarModel");
                String carLicenseNumber = rs.getString("carLicenseNumber");
                customerDBO customer = new customerDBO(customerID, cName, customerGender, customerPhoneNumber, customerAddress, customerCarModel, carLicenseNumber);
                list.add(customer);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(customerDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String insertCustomer(String customerID, String customerName, String customerGender, String customerPhoneNumber, String customerAddress, String customerCarModel, String carLicenseNumber){
        try {
            String insertSQL = "INSERT INTO tblCustomer (customerID,customerName,customerGender,customerPhoneNumber,customerAddress,customerCarModel,carLicenseNumber) values (?,?,?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(insertSQL);
            stm.setString(1, customerID);
            stm.setString(2, customerName);
            stm.setString(3, customerGender);
            stm.setString(4, customerPhoneNumber);
            stm.setString(5, customerAddress);
            stm.setString(6, customerCarModel);
            stm.setString(7,carLicenseNumber);
            stm.executeUpdate();
            return "Insert Successful";
        } catch (SQLException ex) {
            Logger.getLogger(customerDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Insert not Successful";
    }
    
    public String updateCustomer(String customerID, String customerName, String customerGender, String customerPhoneNumber, String customerAddress, String customerCarModel, String carLicenseNumber){
        try {
            String updateSQL = "UPDATE tblCustomer SET customerName = ?, customerGender = ?, customerPhoneNumber = ?, customerAddress = ?, customerCarModel = ?, carLicenseNumber = ?  WHERE customerID = ?";
            PreparedStatement stm = conn.prepareStatement(updateSQL);
            
            stm.setString(7, customerID);
            stm.setString(1, customerName);
            stm.setString(2, customerGender);
            stm.setString(3, customerPhoneNumber);
            stm.setString(4, customerAddress);
            stm.setString(5, customerCarModel);
            stm.setString(6,carLicenseNumber);
            
            stm.executeUpdate();
            return "Update Successful";
        } catch (SQLException ex) {
            Logger.getLogger(customerDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Update not Successful";
    }
    
    public String deleteCustomer(String customerID){
        try {
            String deleteSQL = "DELETE FROM tblCustomer WHERE customerID = ?";
            PreparedStatement stm = conn.prepareStatement(deleteSQL);
            stm.setString(1, customerID);
            stm.executeUpdate();
            return "Delete Successful";
        } catch (SQLException ex) {
            Logger.getLogger(customerDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete not Successful";
    }
}
