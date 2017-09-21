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
public class Bottom {
    private int b_id;
    private String b_name;
    private double b_price;
    private String b_image;

    public Bottom(int b_id, String bottom, double b_price, String b_image) {
        this.b_id = b_id;
        this.b_name = bottom;
        this.b_price = b_price;
        this.b_image = b_image;
    }

    public Bottom() {
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public double getB_price() {
        return b_price;
    }

    public void setB_price(double b_price) {
        this.b_price = b_price;
    }

    public String getB_image() {
        return b_image;
    }

    public void setB_image(String b_image) {
        this.b_image = b_image;
    }

    @Override
    public String toString() {
        return "Bottom{" + "b_id=" + b_id + ", bottom=" + b_name + ", b_price=" + b_price + ", b_image=" + b_image + '}';
    }

    
}