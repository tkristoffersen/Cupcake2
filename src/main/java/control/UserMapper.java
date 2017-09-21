/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.DBConnector;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tobbe
 */
public class UserMapper {

    public User getUserByName(String name) {
        User output = null;
        try {
            String sql = "SELECT u_id, u_name, u_pass, u_balance, u_email FROM Nydatabase.users where username='" + name+"'";
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            int u_id = 0;
            String u_name = "";
            String u_pass = "";
            double u_balance = 0;
            String u_email = "";
            while (rs.next()) {
                u_id = rs.getInt("u_id");
                u_name = name; //rs.getString("u_name");
                u_pass = rs.getString("u_pass");
                u_balance = rs.getDouble("u_balance");
                u_email = rs.getString("u_email");
            }
            output = new User(u_name, u_pass, u_balance, u_email);
            output.setu_id(u_id);
        }catch (SQLException ex) {
            return null;
        }
        return output;
    } 
    
    public User getUserByID(int id) {
        User output = null;
        try{
            String sql = "SELECT u_id, u_name, u_pass, u_balance, u_email FROM Nydatabase.users where u_id='" + id;
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int u_id = 0;
            String u_name = "";
            String u_pass = "";
            double u_balance = 0;
            String u_email = "";
            while (rs.next()) {
                u_id = id;//rs.getInt("u_id");
                u_name = rs.getString("u_name");
                u_pass = rs.getString("u_pass");
                u_balance = rs.getDouble("u_balance");
                u_email = rs.getString("u_email");
            }
            output = new User( u_name, u_pass, u_balance, u_email);
            output.setu_id(id);
        }catch (Exception e) {
            return null;
        }
        return output;
    }
    
    public void putUser(User user) throws SQLException {
        
        int u_id = user.getu_id();
        String u_name = user.getu_name();
        String u_pass = user.getu_pass();
        double u_balance = user.getu_balance();
        String u_email = user.getu_email();
        //String name, String password, double balance, String email
        Connection conn = DBConnector.getConnection();
        String insertUser = "INSERT INTO Nydatabase.users ("
                + "u_name, u_pass, u_balance, u_email)"
                + "VALUES (?, ?, ?, ?);";
        PreparedStatement recipePstmt = conn.prepareStatement(insertUser);
        try {
            conn.setAutoCommit(false);
            recipePstmt.setString(1, u_name);
            recipePstmt.setString(2, u_pass);
            recipePstmt.setDouble(3, u_balance);
            recipePstmt.setString(4, u_email);
            recipePstmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            if (conn != null) {
                conn.rollback();
            }
        } finally {
            conn.setAutoCommit(true);
        }
    }
}



        
        
    
