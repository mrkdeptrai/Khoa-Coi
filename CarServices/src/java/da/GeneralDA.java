/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mrkho
 */
public class GeneralDA {
    protected Connection conn;
    public GeneralDA() throws SQLException{
        String dbURL = "jdbc:derby://localhost:1527/CarEquipmentService";
        String username = "Khoa";
        String password = "1234";
        
        conn = DriverManager.getConnection(dbURL, username, password);
    }
    
    public void closeConnection(){
        if (conn != null) try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeneralDA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
