<%-- 
    Document   : login
    Created on : 21-09-2017, 12:46:19
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
        <h1>Login</h1>
        <form action="RegistrationController" method="post">
            <div class="container text-center">
                <input type="hidden" name="origin" value="login">
                <p>Username:<br><input type="text" name="username" value="" placeholder=""></p>
                <p>Password:<br><input type="password" name="password" value="" placeholder=""></p>
                <button type="submit" class="btn btn-default" name="Login" value="Log in">Log me in</button>
        </form>
                <form method="get" action="registration.jsp">
            <button type="submit">Go to registrationn</button>
        </form>
        <form method="get" action="index.jsp">
              <button type="submit">Go Back to Index</button>
        </form>
            </div>
        </form>
    </body>
</html>
