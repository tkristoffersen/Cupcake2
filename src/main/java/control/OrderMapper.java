/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DBConnector.DBConnector;
import entity.Bottom;
import entity.Order;
import entity.OrderLine;
import entity.Topping;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {

    public List<Order> getOrdersByUserId(User user) {
        List<Order> output = new ArrayList<Order>();
        try {
            Order order = null;
            String sql = "SELECT order_id, date, users_user_id "
                    + "FROM cupcake.orders where users_user_id ="
                    + user.getUser_id();
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            int orderId = 0;
            String date = "";
            while (rs.next()) {
                orderId = rs.getInt("order_id");
                date = rs.getString("date");
                order = new Order(user);
                order.setDate(date);
                order.setOrder_id(orderId);
                order.setOrderlines(this.getOrderlinesByOrderId(order));
                output.add(order);
            }
        } catch (Exception e) {
            return null;
        }
        return output;
    }

    public Order getOrderById(int id) {
        Order order = null;
        try {

            String sql = "SELECT date, users_user_id "
                    + "FROM cupcake.orders where order_id ="
                    + id;
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int user_id = 0;
            String date = "";
            UserMapper um = new UserMapper();
            while (rs.next()) {
                user_id = rs.getInt("users_user_id");
                date = rs.getString("date");
                order = new Order(um.getUserByID(user_id));
                order.setDate(date);
                order.setOrder_id(id);
                order.setOrderlines(this.getOrderlinesByOrderId(order));
            }
        } catch (Exception e) {
            return null;
        }
        return order;
    }

    public List<OrderLine> getOrderlinesByOrderId(Order order) {
        List<OrderLine> output = new ArrayList<OrderLine>();
        try {
            CupCakeMapper cm = new CupCakeMapper();

            OrderLine oLine = null;
            String sql = "SELECT "
                    + "orderline_id, "
                    + "bottoms_bottom_id, "
                    + "toppings_topping_id, "
                    + "price, "
                    + "quantity "
                    + "FROM cupcake.vieworderlinedetails where orders_order_id = "
                    + order.getOrder_id();
            PreparedStatement pstmt = DBConnector.getConnection().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            int orderlineId = 0;
            int bottomId = 0;
            int toppingId = 0;
            double price = 0;
            int quantity = 0;
            while (rs.next()) {
                orderlineId = rs.getInt("orderline_id");
                bottomId = rs.getInt("bottoms_bottom_id");
                toppingId = rs.getInt("toppings_topping_id");
                price = rs.getDouble("price");
                quantity = rs.getInt("quantity");

                Bottom bot = new Bottom(bottomId);
                bot = cm.getBottomByBottomId(bot);

                Topping top = new Topping(toppingId);
                top = cm.getToppingByToppingId(top);

                oLine = new OrderLine(bot, top, quantity, price);
                oLine.setId(orderlineId);
                output.add(oLine);
            }
        } catch (Exception e) {
            return null;
        }
        return output;
    }

    public void putToOrderdetailsTable(int orderId, int orderlineId, int quantity) throws SQLException {
        Connection conn = DBConnector.getConnection();
        String insertUser = "INSERT INTO cupcake.orderdetails ("
                + "orders_order_id, "
                + "orderlines_orderline_id,"
                + "quantity) "
                + "VALUES (?, ?, ?);";
        PreparedStatement recipePstmt = conn.prepareStatement(insertUser);
        try {
            conn.setAutoCommit(false);
            recipePstmt.setInt(1, orderId);
            recipePstmt.setInt(2, orderlineId);
            recipePstmt.setInt(3, quantity);
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


    public int putToOrderTable(Order order) throws SQLException {
        int output = 0;
        ResultSet rs = null;
        int userId = order.getUser().getUser_id();

        //String name, String password, double balance, String email
        Connection conn = DBConnector.getConnection();
        String insertUser = "INSERT INTO cupcake.orders ("
                + "users_user_id)"
                + "VALUES (?);";
        PreparedStatement recipePstmt = conn.prepareStatement(insertUser, Statement.RETURN_GENERATED_KEYS);
        try {
            conn.setAutoCommit(false);
            recipePstmt.setInt(1, userId);
            recipePstmt.executeUpdate();
            rs = recipePstmt.getGeneratedKeys();
            rs.next();
            output = rs.getInt(1);
            conn.commit();
        } catch (SQLException ex) {
            if (conn != null) {
                conn.rollback();
            }
        } finally {
            conn.setAutoCommit(true);
        }
        return output;

    }


    // public Orderline(Bottom bottom, Topping topping, int quantity, double price) {
    public int putToOrderLineTable(OrderLine oLine) throws SQLException {
        int output = 0;
        ResultSet rs = null;
        Bottom bot = oLine.getBottom();
        Topping top = oLine.getTopping();
        double price = oLine.getPrice();

        Connection conn = DBConnector.getConnection();
        String insertOrderline = "INSERT INTO cupcake.orderlines ("
                + "price, bottoms_bottom_id, toppings_topping_id)"
                + "VALUES (?, ?, ?);";
        PreparedStatement recipePstmt = conn.prepareStatement(insertOrderline, Statement.RETURN_GENERATED_KEYS);
        try {
            conn.setAutoCommit(false);
            recipePstmt.setDouble(1, price);
            recipePstmt.setInt(2, bot.getId());
            recipePstmt.setInt(3, top.getId());
            recipePstmt.executeUpdate();
            rs = recipePstmt.getGeneratedKeys();
            rs.next();
            output = rs.getInt(1);
            conn.commit();
        } catch (SQLException ex) {
            if (conn != null) {
                conn.rollback();
            }
        } finally {
            conn.setAutoCommit(true);
        }
        return output;

    }
}

