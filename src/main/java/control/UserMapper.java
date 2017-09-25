/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DBConnector.DBConnector;
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
            String sql = "SELECT user_id, username, password, balance, email FROM finalcupcake.users where username='" + name+"'";
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            int userID = 0;
            String userName = "";
            String password = "";
            double balance = 0;
            String email = "";
            while (rs.next()) {
                userID = rs.getInt("user_id");
                userName = name; //rs.getString("username");
                password = rs.getString("password");
                balance = rs.getDouble("balance");
                email = rs.getString("email");
            }
            output = new User(userName, password, balance, email);
            output.setUser_id(userID);
        }catch (SQLException ex) {
            return null;
        }
        return output;
    } 
    
    
    public User getUserByID(int id) {
        User output = null;
        try{
            String sql = "SELECT user_id, username, password, balance, email FROM finalcupcake.users where u_id='" + id;
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int userID = 0;
            String userName = "";
            String password = "";
            double balance = 0;
            String email = "";
            while (rs.next()) {
                userID = id;//rs.getInt("user_id");
                userName = rs.getString("username");
                password = rs.getString("password");
                balance = rs.getDouble("balance");
                email = rs.getString("email");
            }
            output = new User(userName, password, balance, email);
            output.setUser_id(id);
        }catch (Exception e) {
            return null;
        }
        return output;
    }
    
    public void putUser(User user) throws SQLException {
        
        String name = user.getName();
        String password = user.getPassword();
        double balance = user.getBalance();
        String email = user.getEmail();
        //String name, String password, double balance, String email
        Connection conn = DBConnector.getConnection();
        String insertUser = "INSERT INTO finalcupcake.users ("
                + "username, password, balance, email)"
                + "VALUES (?, ?, ?, ?);";
        PreparedStatement recipePstmt = conn.prepareStatement(insertUser);
        try {
            conn.setAutoCommit(false);
            recipePstmt.setString(1, name);
            recipePstmt.setString(2, password);
            recipePstmt.setDouble(3, balance);
            recipePstmt.setString(4, email);
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



        
        
    
