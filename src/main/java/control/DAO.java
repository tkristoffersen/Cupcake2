/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lucas kuhn
 */
public class DAO {
     private Connection con;

    public DAO() {
        con = new DBConnector().getConnection();
    }

    DBConnector db = new DBConnector();
    public void insertUser(int user_id, String u_name, String u_pass, int u_balance, String u_email) {
        PreparedStatement insertRS = null;
        
        String stmtRS = "INSERT INTO users (user_id, u_name, u_pass, u_balance,u_email) VALUES (?,?,?,?,?)";
        try {
        
        insertRS = con.prepareStatement(stmtRS);
        
        
        insertRS.setInt(1, user_id);
        insertRS.setString(2, u_name);
        insertRS.setString(3, u_pass);
        insertRS.setInt(4, u_balance);
        insertRS.setString(5,u_email);
        
        insertRS.executeUpdate();
        
        
        } catch (Exception e)
        {
            if(con != null) {
                try {
                    System.out.println(e.getMessage());
                    con.rollback();
                }
                catch (SQLException excep) {
}
            }
        }
    }
}


