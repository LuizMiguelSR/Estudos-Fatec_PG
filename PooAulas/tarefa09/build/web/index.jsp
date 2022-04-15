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
        <title>Página Inicial</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <%if(session.getAttribute("username") != null){%>
            <h1>Página Inicial</h1>
            <span>
                <b>Bem vindo: </b><%= session.getAttribute("username")%>
            </span>
        <%} else {%>
            <h1>Página Inicial</h1>
            <h3>Faça seu Login abaixo</h3>
            <form>
                <b>Login: </b><input type="text" name="username"/>
                <input type="submit" name="logon"/> 
            </form>           
        <%}%>
    </body>
</html>
