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
        <style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
</head>
        <ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="login.jsp">Login</a></li>
  <li><a href="registration.jsp">Registration</a></li>
  </ul>
        <h1>Login</h1>
        <form action="CheckLogin" method="post">
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
