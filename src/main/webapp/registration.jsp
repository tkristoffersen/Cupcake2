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
        <title>Registrer</title>
    </head>
    <body>
        <h1>Registrer dig her</h1>
        <form action="RegistrationController" method="post">
            <div class="container text-center">
                <input type="hidden" name="origin" value="login">
                <p>Username:<br><input type="text" name="username" value="" placeholder=""></p>
                <p>Password:<br><input type="password" name="password" value="" placeholder=""></p>
                <button type="submit" class="btn btn-default" name="Login" value="Log in">Log me in</button>
            </div>
        </form>
    </body>
</html>
