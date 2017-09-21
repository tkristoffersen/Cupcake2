<%-- 
    Document   : shop
    Created on : 21-09-2017, 11:52:29
    Author     : tommy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Webshop</title>
    </head>
    <body>
        
        <h1>Velkommen 
            <% out.println(request.getParameter("username"));%> Din Balance er <% out.println(request.getParameter("balance"));%> </h1>
        <h2>CupCake butikken:</h2>
        <h3>Vælg topping:</h3>
        <div class="row">
            <div class="col-sm-2"> 
            Chokolade
            <div class="panel-footer text-center">5.0,-</div>
            Blåbær
            <div class="panel-footer text-center">5.0,-</div>
            hindbær
            <div class="panel-footer text-center">5.0,-</div>
        </div>
            <h4>Vælg bund:</h4>
        <div class="row">
            Chokolade
            <div class="panel-footer text-center">5.0,-</div>
            Vanilie
            <div class="panel-footer text-center">5.0,-</div>
            Banan
            <div class="panel-footer text-center">5.0,-</div>


        </div>

    </body>
</html>
