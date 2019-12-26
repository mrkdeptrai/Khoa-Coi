/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import dbo.bookingServiceDBO;
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
public class bookingDA extends GeneralDA{
    public bookingDA() throws SQLException{
        super(); // call constuctor of parent class
    }
    public ArrayList<bookingServiceDBO> getAllBooking(){
        try {
            String selectSQL = "SELECT * FROM tblBooking";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(selectSQL);
            
            ArrayList<bookingServiceDBO> list = new ArrayList<>();
            
            while(rs.next()){
                //Get booking info
                String bookingID = rs.getString("bookingID");
                String customerID = rs.getString("customerID");
                String mechanicID = rs.getString("mechanicID");
                String carStatus = rs.getString("carStatus");
                String datetimeOfService = rs.getString("datetimeOfService");
                String paymentReceived = rs.getString("paymentReceived");
                String descriptionAboutBooking = rs.getString("bookingDescription");
                String status = rs.getString("status");
                bookingServiceDBO booking = new bookingServiceDBO(bookingID, customerID, mechanicID, carStatus, datetimeOfService, paymentReceived, descriptionAboutBooking, status);
                list.add(booking);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(bookingDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<bookingServiceDBO> getBookingByID(String bookingID){
        try {
            String selectSQL = "SELECT * FROM tblBooking WHERE bookingID = ?";
            PreparedStatement stm = conn.prepareStatement(selectSQL);
            //set parameter id
            stm.setString(1, bookingID);
            //execute query
            ResultSet rs = stm.executeQuery();
            
            ArrayList<bookingServiceDBO> list = new ArrayList<>();
            while(rs.next()){
                //Get booking info
                String customerID = rs.getString("customerID");
                String mechanicID = rs.getString("mechanicID");
                String carStatus = rs.getString("carStatus");
                String datetimeOfService = rs.getString("datetimeOfService");
                String paymentReceived = rs.getString("paymentReceived");
                String descriptionAboutBooking = rs.getString("bookingDescription");
                String status = rs.getString("status");
                bookingServiceDBO booking = new bookingServiceDBO(bookingID, customerID, mechanicID, carStatus, datetimeOfService, paymentReceived, descriptionAboutBooking, status);
                list.add(booking);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(bookingDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String insertBooking(String bookingID, String customerID, String mechanicID, String carStatus, String datetimeOfService, String paymentReceived, String descriptionAboutBooking, String status){
        try {
            String insertSQL = "INSERT INTO tblBooking (bookingID,customerID,mechanicID,carStatus,datetimeOfService,paymentReceived,bookingDescription,status) values (?,?,?,?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(insertSQL);
            stm.setString(1, bookingID);
            stm.setString(2, customerID);
            stm.setString(3, mechanicID);
            stm.setString(4, carStatus);
            stm.setString(5, datetimeOfService);
            stm.setString(6, paymentReceived);
            stm.setString(7,descriptionAboutBooking);
            stm.setString(8, status);
            stm.executeUpdate();
            return "Insert Successful";
        } catch (SQLException ex) {
            Logger.getLogger(bookingDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Insert not Successful";
    }
    
    public String updateBooking(String bookingID, String carStatus, String datetimeOfService, String paymentReceived, String descriptionAboutBooking, String status){
        try {
            String updateSQL = "UPDATE tblBooking SET carStatus = ?, datetimeOfService = ?, paymentReceived = ?, bookingDescription = ?, status = ?  WHERE bookingID = ?";
            PreparedStatement stm = conn.prepareStatement(updateSQL);
            
            stm.setString(6, bookingID);
            stm.setString(1, carStatus);
            stm.setString(2, datetimeOfService);
            stm.setString(3, paymentReceived);
            stm.setString(4,descriptionAboutBooking);
            stm.setString(5, status);
            
            stm.executeUpdate();
            return "Update Successful";
        } catch (SQLException ex) {
            Logger.getLogger(bookingDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Update not Successful";
    }
    
    public String deleteBooking(String bookingID){
        try {
            String deleteSQL = "DELETE FROM tblBooking WHERE bookingID = ?";
            PreparedStatement stm = conn.prepareStatement(deleteSQL);
            stm.setString(1, bookingID);
            stm.executeUpdate();
            return "Delete Successful";
        } catch (SQLException ex) {
            Logger.getLogger(bookingDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete not Successful";
    }
    
    public int getTotalBooking(String datetime1, String datetime2){
        try {
            int count = 0;
            String countBookingSQL = "SELECT count(*) FROM tblBooking WHERE datetimeOfService BETWEEN ? AND ?";
            PreparedStatement stm = conn.prepareStatement(countBookingSQL);
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

    public int getTotalBenefit(String datetime1, String datetime2){
        try {
            int sum = 0;
            String sumBenefitSQL = "SELECT sum(paymentReceived) FROM tblBooking WHERE datetimeOfService BETWEEN ? AND ?";
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
