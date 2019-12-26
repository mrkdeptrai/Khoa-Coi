/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import dbo.mechanicDBO;
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
public class mechanicDA extends GeneralDA{
    public mechanicDA() throws SQLException{
        super(); // call constuctor of parent class
    }
    public ArrayList<mechanicDBO> getAllMechanic(){
        try {
            String selectSQL = "SELECT * FROM tblMechanic";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSQL);
            
            ArrayList<mechanicDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get mechanic info
                String mechanicID = rs.getString("mechanicID");
                String mechanicName = rs.getString("mechanicName");
                String mechanicPhoneNumber = rs.getString("mechanicPhoneNumber");
                String mechanicAddress = rs.getString("mechanicAddress");
                mechanicDBO mechanic = new mechanicDBO(mechanicID, mechanicName, mechanicPhoneNumber, mechanicAddress);
                list.add(mechanic);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(mechanicDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<mechanicDBO> getMechanicByID(String mechanicID){
        try {
            String selectSQL = "SELECT * FROM tblMechanic WHERE mechanicID = ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, mechanicID);
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<mechanicDBO> list = new ArrayList<>();
            while(rs.next()){
                //Get booking info
                String mechanicName = rs.getString("mechanicName");
                String mechanicPhoneNumber = rs.getString("mechanicPhoneNumber");
                String mechanicAddress = rs.getString("mechanicAddress");
                mechanicDBO mechanic = new mechanicDBO(mechanicID, mechanicName, mechanicPhoneNumber, mechanicAddress);
                list.add(mechanic);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(mechanicDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<mechanicDBO> getMechanicByName(String mechanicName){
        try {
            String selectSQL = "SELECT * FROM tblMechanic WHERE mechanicName LIKE ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, "%" + mechanicName + "%");
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<mechanicDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get mechanic info
                String mechanicID = rs.getString("mechanicID");
                String mName = rs.getString("mechanicName");
                String mechanicPhoneNumber = rs.getString("mechanicPhoneNumber");
                String mechanicAddress = rs.getString("mechanicAddress");
                mechanicDBO mechanic = new mechanicDBO(mechanicID, mName, mechanicPhoneNumber, mechanicAddress);
                list.add(mechanic);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(mechanicDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String insertMechanic(String mechanicID, String mechanicName, String mechanicPhoneNumber, String mechanicAddress){
        try {
            String insertSQL = "INSERT INTO tblMechanic (mechanicID,mechanicName,mechanicPhoneNumber,mechanicAddress) values (?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(insertSQL);
            stm.setString(1, mechanicID);
            stm.setString(2, mechanicName);
            stm.setString(3, mechanicPhoneNumber);
            stm.setString(4, mechanicAddress);
            stm.executeUpdate();
            return "Insert Successful";
        } catch (SQLException ex) {
            Logger.getLogger(mechanicDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Insert not Successful";
    }
    
    public String updateMechanic(String mechanicID, String mechanicName, String mechanicPhoneNumber, String mechanicAddress){
        try {
            String updateSQL = "UPDATE tblMechanic SET mechanicName = ?, mechanicPhoneNumber = ?, mechanicAddress = ?  WHERE mechanicID = ?";
            PreparedStatement stm = conn.prepareStatement(updateSQL);
            
            stm.setString(4, mechanicID);
            stm.setString(1, mechanicName);
            stm.setString(2, mechanicPhoneNumber);
            stm.setString(3, mechanicAddress);
            
            stm.executeUpdate();
            return "Update Successful";
        } catch (SQLException ex) {
            Logger.getLogger(mechanicDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Update not Successful";
    }
    
    public String deleteMechanic(String mechanicID){
        try {
            String deleteSQL = "DELETE FROM tblMechanic WHERE mechanicID = ?";
            PreparedStatement stm = conn.prepareStatement(deleteSQL);
            stm.setString(1, mechanicID);
            stm.executeUpdate();
            return "Delete Successful";
        } catch (SQLException ex) {
            Logger.getLogger(mechanicDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete not Successful";
    }
}
