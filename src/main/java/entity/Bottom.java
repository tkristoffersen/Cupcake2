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

    private int id;
    private String name;
    private double price;

    public Bottom(int id) {
        this.id = id;
        //this.name = bottom;
        //this.price = price;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bottom{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
}
