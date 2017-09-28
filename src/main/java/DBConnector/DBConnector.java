/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnector;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author lucas kuhn
 */
public class DBConnector {

  private Connection conn;
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/cupcake1";
    private static String id = "root";
    private static String pw = "coca0202";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, id, pw);  // The connection will be released upon program 

        } catch (Exception e) {
            System.out.println("\n*** Remember to insert your  ID and PW in the DBConnector class! ***\n");
            System.out.println("error in DBConnector.getConnection()");
            System.out.println(e);
        }

        return conn;
    }

    public void releaseConnection(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        //Test connection
        try {
            String sql = "SELECT * from users";
            ResultSet rs = getConnection().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
