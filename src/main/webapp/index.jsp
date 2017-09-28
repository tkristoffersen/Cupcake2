<%-- 
    Document   : index
    Created on : 21-09-2017, 11:21:07
    Author     : tommy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forside</title>
        
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
</head>
<body>

<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="login.jsp">Login</a></li>
  <li><a href="registration.jsp">Registration</a></li>
  </ul>

        
        
   

    </body>
</html>
