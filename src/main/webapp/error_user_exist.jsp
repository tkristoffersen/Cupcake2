<%-- 
    Document   : error_user_exist
    Created on : 21-09-2017, 15:58:48
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
            <h1>Error!</h1>
            <% String u_name = request.getParameter("u_name");%>

            <h2>The username <%=u_name%> is already used by another user. 
                <br>Please choose another username.</h2><br>

            <form method="get" action="registration.jsp">
                <button type="submit">Register new user</button>
            </form>

        </div>
    </body>
</html>
