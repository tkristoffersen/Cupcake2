/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DBConnector.DBConnector;
import entity.Bottom;
import entity.Topping;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CupCakeMapper {
    
    public List<Topping> getListOfToppings() {
        List<Topping> output = new ArrayList();
        try{   
            String sql = "SELECT topping_id "
                    + "FROM toppings";
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            Topping mytop = null;
            int topping_id = 0;
            while (rs.next()) {
                topping_id = rs.getInt("topping_id");
                mytop = new Topping(topping_id);
                mytop = this.getToppingByToppingId(mytop);
                output.add(mytop);
            }
        }catch (Exception e) {
            return null;
        }
        return output;
    }
    
    public List<Bottom> getListOfBottoms() {
        List<Bottom> output = new ArrayList();
        try{   
            String sql = "SELECT bottom_id "
                    + "FROM bottoms";
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            Bottom mybot = null;
            int bottom_id = 0;
            while (rs.next()) {
                bottom_id = rs.getInt("bottom_id");
                mybot = new Bottom(bottom_id);
                mybot = this.getBottomByBottomId(mybot);
                output.add(mybot);
            }
        }catch (Exception e) {
            return null;
        }
        return output;
    }
    
    public Topping getToppingByToppingId(Topping topping) {
        Topping output = topping;
        try {
            String sql = "SELECT name, price "
                    + "FROM toppings where topping_id =" + 
                    topping.getId();
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            String name = "";
            double price = 0;
            while (rs.next()) {
                name = rs.getString("name");
                price = rs.getDouble("price");
            }
            output.setName(name);
            output.setPrice(price);
        }catch (Exception e) {
            return null;
        }
        return output;
    }
    
        public Topping getToppingByToppingId(int id) {
        Topping output = new Topping(id);
        try {
            String sql = "SELECT name, price "
                    + "FROM toppings where topping_id =" + 
                    id;
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            String name = "";
            double price = 0;
            while (rs.next()) {
                name = rs.getString("name");
                price = rs.getDouble("price");
            }
            output.setName(name);
            output.setPrice(price);
        }catch (Exception e) {
            return null;
        }
        return output;
    }
    
    
    public Bottom getBottomByBottomId(Bottom bottom) {
        Bottom output = bottom;
        try{
            String sql = "SELECT name, price "
                    + "FROM bottoms where bottom_id =" + 
                    bottom.getId();
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            String name = "";
            double price = 0;
            while (rs.next()) {
                name = rs.getString("name");
                price = rs.getDouble("price");
            }
            output.setName(name);
            output.setPrice(price);
        }catch (Exception e) {
            return null;
        }
        return output;
    }
    
    public Bottom getBottomByBottomId(int id) {
        Bottom output = new Bottom(id);
        try{
            String sql = "SELECT name, price "
                    + "FROM bottoms where bottom_id =" + 
                    id;
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            String name = "";
            double price = 0;
            while (rs.next()) {
                name = rs.getString("name");
                price = rs.getDouble("price");
            }
            output.setName(name);
            output.setPrice(price);
        }catch (Exception e) {
            return null;
        }
        return output;
    }

}
