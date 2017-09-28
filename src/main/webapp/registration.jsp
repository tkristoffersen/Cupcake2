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
              <link href="newcss.css" rel="stylesheet" type="text/css"/>
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
    </body>
    <body
</head>
<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="login.jsp">Login</a></li>
  <li><a href="registration.jsp">Registration</a></li>
  </ul>
        <h1>Registrer dig her</h1>
        
        <form action="RegistrationController">   
           <div <b>Username:</b><br> 
             <input type="text" name="username" value=""><br><br> </div>
            <div <b>Password:</b><br> 
                <input type="password" name="password" value=""><br><br> </div>
           <div <b>Balance:</b><br>
           <input type="text" name="balance" value=""><br><br> </div>
           <div <b>Email:</b><br>
               <input type="text" name="email" value=""><br><br> </div>

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
