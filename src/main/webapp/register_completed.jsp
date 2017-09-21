<%-- 
    Document   : register_completed
    Created on : 21-09-2017, 15:57:06
    Author     : tobbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Succes</h1>
            <% String u_name = request.getParameter("u_name"); %>
            
            <h2>The user <%=u_name%> has been succesfully registered. 
            <br>Please login before you continue.</h2><br>
            
            <form method="get" action="login.jsp">
                <button type="submit">Go to Login</button>
            </form>

        </div> 
    </body>
</html>
