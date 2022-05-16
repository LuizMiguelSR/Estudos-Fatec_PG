<%-- 
    Document   : index
    Created on : 11 de abr. de 2022, 16:24:23
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Página Inicial</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <%if(session.getAttribute("username") != null){%>
        <h2 class="container-fluid">Página Inicial</h2>
            <span class="container-fluid">
                <b>Bem vindo: </b><%= session.getAttribute("username")%>
            </span>
        <%} else {%>
        <h2 class="container-fluid">Página Inicial</h2>
            <h4 class="container-fluid">Faça seu Login</h4>
            <form class="row g-3">
                <div class="col-auto">
                    <b class="container-fluid">Login: </b>
                </div>
                <div class="col-auto">
                    <input type="text" class="form-control" name="username" placeholder="Seu Login" aria-label="Seu Login" aria-describedby="basic-addon1">
                </div>
                  <div class="col-auto">
                    <input class="btn btn-dark" type="submit" name="logon"/> 
                  </div>
            </form>           
        <%}%>
    </body>
</html>
