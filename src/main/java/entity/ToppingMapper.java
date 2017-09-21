/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import control.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tobbe
 */
public class ToppingMapper {
    public ArrayList<Topping> getToppings(){
        ArrayList <Topping> toppings = new ArrayList();
        
        Topping top = null;
        
        try{
            Connection conn = new DBConnector().getConnection();
            String sql = "select * from toppings order by t_price";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                top = new Topping();
                top.setT_id(rs.getInt("t_id"));
                top.setT_name(rs.getString("t_name"));
                top.setT_price(rs.getDouble("t_price"));
                top.setT_image(rs.getString("t_image"));
                toppings.add(top);
            }
            return toppings;
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }
}
