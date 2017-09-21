/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import control.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lucas kuhn
 */
public class Usermapper {

    private Connection con;

    public Usermapper() {
        con = new DBConnector().getConnection();
    }

    DBConnector db = new DBConnector();

    public User getUser(String name, String pword) {
        Statement stmt = null;
        String query = "select * from users where u_name = '" + name + "' and u_pass = '" + pword + "'";
        User user = null;

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                user = new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5));
                        
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        return user;
    }
}