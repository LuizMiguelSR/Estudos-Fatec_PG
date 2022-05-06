<%-- 
    Document   : index
    Created on : 21 de mar. de 2022, 13:44:08
    Author     : Fatec
    Este comentário é jsp
--%>

<%@page import="java.util.Date"%>
<!-- Comentário html -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JavaEE - Data/Hora JSP</title>
    </head>
    <body>
        <% Date agora = new Date(); %>
        <h4><a href="index.jsp">Voltar</a></h4><hr>
        <h1>JavaEE</h1>
        <h2>Java Server Pages</h2>
        <h3>Data/Hora Servidor</h3>
        <h4>Montando server date com scriplets</h4>
        <div>
            <%
                out.println(agora); 
            %>
        </div>
        <h4>Montando server date com expression</h4>
        <div><%= agora %></div>
    </body>
</html>