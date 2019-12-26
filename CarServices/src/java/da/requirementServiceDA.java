/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import dbo.requirementServiceDBO;
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
public class requirementServiceDA extends GeneralDA{
    public requirementServiceDA() throws SQLException{
        super(); // call constuctor of parent class
    }
    public ArrayList<requirementServiceDBO> getAllRequirement(){
        try {
            String selectSQL = "SELECT * FROM tblRequirement";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSQL);
            
            ArrayList<requirementServiceDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get requirement info
                String requirementID = rs.getString("requirementID");
                String partID = rs.getString("partID");
                String customerID = rs.getString("customerID");
                String requirementDescription = rs.getString("requirementDescription");
                String dateRequirement = rs.getString("dateRequirement");
                requirementServiceDBO requirement = new requirementServiceDBO(requirementID, partID, customerID, requirementDescription, dateRequirement);
                list.add(requirement);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(requirementServiceDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<requirementServiceDBO> getRequirementByID(String requirementID){
        try {
            String selectSQL = "SELECT * FROM tblRequirement WHERE requirementID = ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, requirementID);
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<requirementServiceDBO> list = new ArrayList<>();
            while(rs.next()){
                //Get requirement info
                String partID = rs.getString("partID");
                String customerID = rs.getString("customerID");
                String requirementDescription = rs.getString("requirementDescription");
                String dateRequirement = rs.getString("dateRequirement");
                requirementServiceDBO requirement = new requirementServiceDBO(requirementID, partID, customerID, requirementDescription, dateRequirement);
                list.add(requirement);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(requirementServiceDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String insertRequirement(String requirementID, String partID, String customerID, String requirementDescription, String dateRequirement){
        try {
            String insertSQL = "INSERT INTO tblRequirement (requirementID,partID,customerID,requirementDescription,dateRequirement) values (?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(insertSQL);
            stm.setString(1, requirementID);
            stm.setString(2, partID);
            stm.setString(3, customerID);
            stm.setString(4, requirementDescription);
            stm.setString(5, dateRequirement);
            stm.executeUpdate();
            return "Insert Successful";
        } catch (SQLException ex) {
            Logger.getLogger(requirementServiceDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Insert not Successful";
    }
    
    public String updateRequirement(String requirementID, String requirementDescription, String dateRequirement){
        try {
            String updateSQL = "UPDATE tblRequirement SET requirementDescription = ?, dateRequirement = ? WHERE requirementID = ?";
            PreparedStatement stm = conn.prepareStatement(updateSQL);
            
            stm.setString(3, requirementID);
            stm.setString(1, requirementDescription);
            stm.setString(2, dateRequirement);
            
            stm.executeUpdate();
            return "Update Successful";
        } catch (SQLException ex) {
            Logger.getLogger(requirementServiceDA.class.getName()).log(Level.SEVERE, null, ex);
        }
            return "Update not Successful";
    }
    
    public String deleteRequirement(String requirementID){
        try {
            String deleteSQL = "DELETE FROM tblRequirement WHERE requirementID = ?";
            PreparedStatement stm = conn.prepareStatement(deleteSQL);
            stm.setString(1, requirementID);
            stm.executeUpdate();
            return "Delete Successful";
        } catch (SQLException ex) {
            Logger.getLogger(requirementServiceDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete not Successful";
    }
    
    public int getTotalRequirement(String datetime1, String datetime2){
        try {
            int count = 0;
            String sumBenefitSQL = "SELECT count(*) FROM tblRequirement WHERE dateRequirement BETWEEN ? AND ?";
            PreparedStatement stm = conn.prepareStatement(sumBenefitSQL);
            stm.setString(1, datetime1);
            stm.setString(2, datetime2);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(bookingDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int getTotalPartSale(String datetime1, String datetime2){
        try {
            int sum = 0;
            String sumBenefitSQL = "SELECT sum(price) FROM tblRequirement JOIN tblPart ON tblRequirement.partID = tblPart.partID WHERE dateRequirement BETWEEN ? AND ? ";
            PreparedStatement stm = conn.prepareStatement(sumBenefitSQL);
            stm.setString(1, datetime1);
            stm.setString(2, datetime2);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                sum = rs.getInt(1);
            }
            return sum;
        } catch (SQLException ex) {
            Logger.getLogger(bookingDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
