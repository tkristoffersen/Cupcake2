<%-- 
    Document   : error_not_registered
    Created on : 21-09-2017, 15:59:55
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

            <h2>And error occured writing to database. 
            <br>Please try register again.</h2><br>

            <form method="get" action="registration.jsp">
                <button type="submit">Register new user</button>
            </form>

        </div> 
    </body>
</html>
