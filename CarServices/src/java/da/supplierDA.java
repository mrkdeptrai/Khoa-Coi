/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import dbo.supplierDBO;
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
public class supplierDA extends GeneralDA {
    public supplierDA() throws SQLException{
        super(); // call constuctor of parent class
    }
    public ArrayList<supplierDBO> getAllSupplier(){
        try {
            String selectSQL = "SELECT * FROM tblSupplier";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSQL);
            
            ArrayList<supplierDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get supplier info
                String supplierID = rs.getString("supplierID");
                String supplierName = rs.getString("supplierName");
                String supplierAddress = rs.getString("supplierAddress");
                String supplierPhone = rs.getString("supplierPhone");
                supplierDBO supplier = new supplierDBO(supplierID, supplierName, supplierAddress, supplierPhone);
                list.add(supplier);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(supplierDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<supplierDBO> getSupplierByID(String supplierID){
        try {
            String selectSQL = "SELECT * FROM tblSupplier WHERE supplierID = ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, supplierID);
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<supplierDBO> list = new ArrayList<>();
            while(rs.next()){
                //Get supplier info
                String supplierName = rs.getString("supplierName");
                String supplierAddress = rs.getString("supplierAddress");
                String supplierPhone = rs.getString("supplierPhone");
                supplierDBO supplier = new supplierDBO(supplierID, supplierName, supplierAddress, supplierPhone);
                list.add(supplier);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(supplierDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<supplierDBO> getSupplierByName(String supplierName){
        try {
            String selectSQL = "SELECT * FROM tblSupplier WHERE supplierName LIKE ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, "%" + supplierName + "%");
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<supplierDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get supplier info
                String supplierID = rs.getString("supplierID");
                String sName = rs.getString("supplierName");
                String supplierAddress = rs.getString("supplierAddress");
                String supplierPhone = rs.getString("supplierPhone");
                supplierDBO supplier = new supplierDBO(supplierID, sName, supplierAddress, supplierPhone);
                list.add(supplier);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(supplierDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String insertSupplier(String supplierID, String supplierName, String supplierAddress, String supplierPhone){
        try {
            String insertSQL = "INSERT INTO tblSupplier (supplierID,supplierName,supplierAddress,supplierPhone) values (?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(insertSQL);
            stm.setString(1, supplierID);
            stm.setString(2, supplierName);
            stm.setString(3, supplierAddress);
            stm.setString(4, supplierPhone);
            stm.executeUpdate();
            return "Insert Successful";
        } catch (SQLException ex) {
            Logger.getLogger(supplierDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Insert not Successful";
    }
    
    public String updateSupplier(String supplierID, String supplierName, String supplierAddress, String supplierPhone){
        try {
            String updateSQL = "UPDATE tblSupplier SET supplierName = ?, supplierAddress = ?, supplierPhone = ?  WHERE supplierID = ?";
            PreparedStatement stm = conn.prepareStatement(updateSQL);
            
            stm.setString(4, supplierID);
            stm.setString(1, supplierName);
            stm.setString(2, supplierAddress);
            stm.setString(3, supplierPhone);
            
            stm.executeUpdate();
            return "Update Successful";
        } catch (SQLException ex) {
            Logger.getLogger(supplierDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Update not Successful";
    }
    
    public String deleteSupplier(String supplierID){
        try {
            String deleteSQL = "DELETE FROM tblSupplier WHERE supplierID = ?";
            PreparedStatement stm = conn.prepareStatement(deleteSQL);
            stm.setString(1, supplierID);
            stm.executeUpdate();
            return "Delete Successful";
        } catch (SQLException ex) {
            Logger.getLogger(supplierDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete not Successful";
    }
}
