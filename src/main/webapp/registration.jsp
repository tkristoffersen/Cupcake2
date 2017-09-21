<%-- 
    Document   : registration
    Created on : 21-09-2017, 10:54:08
    Author     : tommy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrering</title>
    </head>
    <body>
        <h1>Registrer dig her</h1>
        
        <form action="RegistrationController">   
            <b>Username:</b><br>
            <input type="text" name="username" value=""><br><br>
            <b>Password:</b><br>
            <input type="password" name="password" value=""><br><br>
            <b>Balance:</b><br>
            <input type="text" name="balance" value=""><br><br>
            <b>Email:</b><br>
            <input type="text" name="email" value=""><br><br>

            <input type="submit" name="submit" value="Registrer">
        </form>
        <br>

        <form method="get" action="login.jsp">
            <button type="submit">Go back to Login</button>
        </form>
        <form method="get" action="index.jsp">
              <button type="submit">Go Back to Index</button>
        </form>
    </body>
</html>
