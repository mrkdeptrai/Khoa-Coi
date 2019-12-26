/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import dbo.brandDBO;
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
public class brandDA extends GeneralDA{
    public brandDA() throws SQLException{
        super(); // call constuctor of parent class
    }
    public ArrayList<brandDBO> getAllBrand(){
        try {
            String selectSQL = "SELECT * FROM tblBrand";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSQL);
            
            ArrayList<brandDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get brand info
                String brandID = rs.getString("brandID");
                String brandName = rs.getString("brandName");
                String brandDescription = rs.getString("brandDescription");
                brandDBO brand = new brandDBO(brandID, brandName, brandDescription);
                list.add(brand);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(brandDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<brandDBO> getBrandByID(String brandID){
        try {
            String selectSQL = "SELECT * FROM tblBrand WHERE brandID = ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, brandID);
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<brandDBO> list = new ArrayList<>();
            while(rs.next()){
                //Get brand info
                String brandName = rs.getString("brandName");
                String brandDescription = rs.getString("brandDescription");
                brandDBO brand = new brandDBO(brandID, brandName, brandDescription);
                list.add(brand);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(brandDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<brandDBO> getBrandByName(String brandName){
        try {
            String selectSQL = "SELECT * FROM tblBrand WHERE brandName LIKE ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, "%" + brandName + "%");
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<brandDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get brand info
                String brandID = rs.getString("brandID");
                String bName = rs.getString("brandName");
                String brandDescription = rs.getString("brandDescription");
                brandDBO brand = new brandDBO(brandID, bName, brandDescription);
                list.add(brand);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(brandDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String insertBrand(String brandID, String brandName, String brandDescription){
        try {
            String insertSQL = "INSERT INTO tblBrand (brandID,brandName,brandDescription) values (?,?,?)";
            PreparedStatement stm = conn.prepareStatement(insertSQL);
            stm.setString(1, brandID);
            stm.setString(2, brandName);
            stm.setString(3, brandDescription);
            stm.executeUpdate();
            return "Insert Successful";
        } catch (SQLException ex) {
            Logger.getLogger(brandDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Insert not Successful";
    }
    
    public String updateBrand(String brandID, String brandName, String brandDescription){
        try {
            String updateSQL = "UPDATE tblBrand SET brandName = ?, brandDescription = ?  WHERE brandID = ?";
            PreparedStatement stm = conn.prepareStatement(updateSQL);
            
            stm.setString(3, brandID);
            stm.setString(1, brandName);
            stm.setString(2, brandDescription);
            
            stm.executeUpdate();
            return "Update Successful";
        } catch (SQLException ex) {
            Logger.getLogger(brandDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Update not Successful";
    }
    
    public String deleteBrand(String brandID){
        try {
            String deleteSQL = "DELETE FROM tblBrand WHERE brandID = ?";
            PreparedStatement stm = conn.prepareStatement(deleteSQL);
            stm.setString(1, brandID);
            stm.executeUpdate();
            return "Delete Successful"; 
        } catch (SQLException ex) {
            Logger.getLogger(brandDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete not Successful";
    }
}
