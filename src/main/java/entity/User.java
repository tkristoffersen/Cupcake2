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
public class User
{
    private int u_id;
    private String u_name;
    private String u_pass;
    private double u_balance;
    
    public User(int id, String name, String pword, double bl)
    {
        u_id = id;
        u_name = name;
        u_pass = pword;
        u_balance = bl;
    }

    public double getu_balance()
    {
        return u_balance;
    }

    public void setu_balance(double u_balance)
    {
        this.u_balance = u_balance;
    }
    

    public int getu_id()
    {
        return u_id;
    }

    public void setu_id(int u_id)
    {
        this.u_id = u_id;
    }

    public String getu_name()
    {
        return u_name;
    }

    public void setu_name(String u_name)
    {
        this.u_name = u_name;
    }

    public String getu_pass()
    {
        return u_pass;
    }

    public void setu_pass(String u_pass)
    {
        this.u_pass = u_pass;
    }
}