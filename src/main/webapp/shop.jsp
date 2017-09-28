<%-- 
    Document   : shop
    Created on : 21-09-2017, 11:52:29
    Author     : tommy
--%>

<%@page import="control.RendUtilBottom"%>
<%@page import="control.RendUtilTopping"%>
<%@page import="java.util.List"%>
<%@page import="control.CupCakeMapper"%>
<%@page import="entity.User"%>
<%@page import="entity.OrderLine"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Bottom"%>
<%@page import="entity.Topping"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Webshop</title>
    </head>
    <body>
        
        <h1>Velkommen</h1>
        
        <%User user = (User) (session.getAttribute("user"));
            String username = user.getName();
            double balance = user.getBalance();
            %>
            
            <div class='brugerP'>
            Customer : <b><%=username%></b> - Balance = <b><%=balance%></b><br>
            </div>
            
            <h2>CupCake butikken:</h2>
        
    <container class="column">
            <%CupCakeMapper cupcakeList = new CupCakeMapper();%>
            
            <%
            List<Topping> toppingList = cupcakeList.getListOfToppings();
            List<Bottom> bottomList = cupcakeList.getListOfBottoms();
            %>
            
            <%= RendUtilTopping.toppingTable(toppingList)%>
        <br>
        <br>
        <br>
         <%= RendUtilBottom.bottomTable(bottomList)%>
        </container>
        <button type="submit" >See your CupCake </button>

        
        
                    <div class="logout">
                <form method="get" action="login.jsp">
                    <input type="submit" name="submit" value="Log Out">
                </form>
                        
            </div>
    </body>
</html>
