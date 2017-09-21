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

    public double getU_balance()
    {
        return u_balance;
    }

    public void setU_balance(double u_balance)
    {
        this.u_balance = u_balance;
    }
    

    public int getU_id()
    {
        return u_id;
    }

    public void setU_id(int u_id)
    {
        this.u_id = u_id;
    }

    public String getU_name()
    {
        return u_name;
    }

    public void setU_name(String u_name)
    {
        this.u_name = u_name;
    }

    public String getU_pass()
    {
        return u_pass;
    }

    public void setU_pass(String u_pass)
    {
        this.u_pass = u_pass;
    }
}