<%-- 
    Document   : index
    Created on : 16 de mai. de 2022, 13:48:56
    Author     : Fatec
--%>

<%@page import="model.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio - MyTasks</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <h1>Início</h1>
        <h3>Usuarios</h3>
        <table>
            <tr><th>Username</th><th>Name</th></tr>
            <%for(user u: user.getAllUsers()){%>
            <tr>
                <td><%= u.getUsername() %></td>
                <td><%= u.getName() %></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
