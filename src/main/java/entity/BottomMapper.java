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
public class BottomMapper {
    public ArrayList<Bottom> getBottoms(){
        ArrayList <Bottom> bottoms = new ArrayList();
        
        Bottom bot = null;
        
        try{
            Connection conn = new DBConnector().getConnection();
            String sql = "select * from bottoms order by b_price";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                bot = new Bottom();
                bot.setB_id(rs.getInt("b_id"));
                bot.setB_name(rs.getString("b_name"));
                bot.setB_price(rs.getDouble("b_price"));
                bot.setB_image(rs.getString("b_image"));
                bottoms.add(bot);
            }
            return bottoms;
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }
}
