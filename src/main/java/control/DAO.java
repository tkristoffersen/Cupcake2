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
    public void insertOrder(int user_id, String b_name, String t_name, int b_price, int t_price) {
        PreparedStatement insertRS = null;
        
        String stmtRS = "INSERT INTO orders (fkuser_id, b_name, t_name, b_price,t_price) VALUES (?,?,?,?,?)";
        try {
        
        insertRS = con.prepareStatement(stmtRS);
        
        
        insertRS.setInt(1, user_id);
        insertRS.setString(2, b_name);
        insertRS.setString(3, t_name);
        insertRS.setInt(4, b_price);
        insertRS.setInt(5,t_price);
        
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


