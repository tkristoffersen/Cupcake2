<%-- 
    Document   : shop
    Created on : 21-09-2017, 11:52:29
    Author     : tommy
--%>

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
            ArrayList<Topping> toppingList = (ArrayList) (session.getAttribute("toppingList"));
            ArrayList<Bottom> bottomList = (ArrayList) (session.getAttribute("bottomList"));
            ArrayList<OrderLine> orderlineList = (ArrayList) (session.getAttribute("orderLines"));
            
            
            %>
            <div class='brugerP'>
            Customer : <b><%=username%></b> - Balance = <b><%=balance%></b><br>
            </div>
            <h2>CupCake butikken:</h2>
        

                    <div class="logout">
                <form method="get" action="login.jsp">
                    <input type="submit" name="submit" value="Log Out">
                </form>
                        
            </div>
    </body>
</html>
