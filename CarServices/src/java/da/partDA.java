/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import dbo.partDBO;
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
public class partDA extends GeneralDA {
    public partDA() throws SQLException{
        super(); // call constuctor of parent class
    }
    public ArrayList<partDBO> getAllPart(){
        try {
            String selectSQL = "SELECT * FROM tblPart";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSQL);
            
            ArrayList<partDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get part info
                String partID = rs.getString("partID");
                String partName = rs.getString("partName");
                String partModel = rs.getString("partModel");
                String price = rs.getString("price");
                String supplierID = rs.getString("supplierID");
                String brandID = rs.getString("brandID");
                partDBO part = new partDBO(partID, partName, partModel, price, supplierID, brandID);
                list.add(part);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(partDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<partDBO> getPartByID(String partID){
        try {
            String selectSQL = "SELECT * FROM tblPart WHERE partID = ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, partID);
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<partDBO> list = new ArrayList<>();
            while(rs.next()){
                //Get part info
                String partName = rs.getString("partName");
                String partModel = rs.getString("partModel");
                String price = rs.getString("price");
                String supplierID = rs.getString("supplierID");
                String brandID = rs.getString("brandID");
                partDBO part = new partDBO(partID, partName, partModel, price, supplierID, brandID);
                list.add(part);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(partDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String insertPart(String partID, String partName, String partModel, String price, String supplierID, String brandID){
        try {
            String insertSQL = "INSERT INTO tblPart (partID,partName,partModel,price,supplierID,brandID) values (?,?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(insertSQL);
            stm.setString(1, partID);
            stm.setString(2, partName);
            stm.setString(3, partModel);
            stm.setString(4, price);
            stm.setString(5, supplierID);
            stm.setString(6, brandID);
            stm.executeUpdate();
            return "Insert Successful";
        } catch (SQLException ex) {
            Logger.getLogger(partDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Insert not Successful";
        
    }
    
    public String updatePart(String partID, String partName, String partModel, String price){
        try {
            String updateSQL = "UPDATE tblPart SET partName = ?, partModel = ?, price = ?  WHERE partID = ?";
            PreparedStatement stm = conn.prepareStatement(updateSQL);
            
            stm.setString(4, partID);
            stm.setString(1, partName);
            stm.setString(2, partModel);
            stm.setString(3, price);
            
            stm.executeUpdate();
            return "Update Successful";
        } catch (SQLException ex) {
            Logger.getLogger(partDA.class.getName()).log(Level.SEVERE, null, ex);
        }
            return "Update not Successful";
    }
    
    public String deletePart(String partID){
        try {
            String deleteSQL = "DELETE FROM tblPart WHERE partID = ?";
            PreparedStatement stm = conn.prepareStatement(deleteSQL);
            stm.setString(1, partID);
            stm.executeUpdate();
            return "Delete Successful";
        } catch (SQLException ex) {
            Logger.getLogger(partDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete not Successful";
    }
}
