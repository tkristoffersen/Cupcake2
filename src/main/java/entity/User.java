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
public class User {

    int u_id;
    String u_name;
    String u_pass;
    double u_balance;
    String u_email;

    public User(String name, String password, double balance, String email) {
        //this.u_id = id;
        this.u_name = name;
        this.u_pass = password;
        this.u_balance = balance;
        this.u_email = email;
    }

    public void setu_id(int id) {
        this.u_id = id;
    }

    public int getu_id() {
        return u_id;
    }

    public void setu_name(String name) {
        this.u_name = name;
    }

    public String getu_name() {
        return u_name;
    }

    public void setu_pass(String password) {
        this.u_pass = password;
    }

    public String getu_pass() {
        return u_pass;
    }

    public void setu_balance(double balance) {
        this.u_balance = balance;
    }

    public double getu_balance() {
        return u_balance;
    }

    public void setu_email(String email) {

        this.u_email = email;
    }

    public String getu_email() {

        return u_email;
    }
    
    @Override
    public String toString(){
        return "User{" + "u_id=" + u_id + ", name=" + u_name + ", password=" + u_pass +  ", balance=" + u_balance + ", email=" + u_email + '}';
    }

}
