/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author lucas kuhn
 */
public class Topping {
    private int t_id;
    private String t_name;
    private double t_price;
    private String t_image;

    public Topping(int t_id, String topping, double t_price, String t_image) {
        this.t_id = t_id;
        this.t_name = topping;
        this.t_price = t_price;
        this.t_image = t_image;
    }

    public Topping() {
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public double getT_price() {
        return t_price;
    }

    public void setT_price(double t_price) {
        this.t_price = t_price;
    }

    public String getT_image() {
        return t_image;
    }

    public void setT_image(String t_image) {
        this.t_image = t_image;
    }

    @Override
    public String toString() {
        return "Topping{" + "t_id=" + t_id + ", topping=" + t_name + ", t_price=" + t_price + ", t_image=" + t_image + '}';
    }
}