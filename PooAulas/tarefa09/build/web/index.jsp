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
        <title>Índice</title>
    </head>
    <body>
        <h1>Índice</h1>
        
        <% if(session.getAttribute("username")!=null){%>
            <%@include file="WEB-INF/jspf/header.jspf" %>
        <%}else{%>
        <form>
            <a href="index.jsp">INDEX</a> |
            <a href="page1.jsp">PAGE 1</a> |
            <a href="page2.jsp">PAGE 2</a>
            Bem vindo: <b><%= session.getAttribute("username")%></b>
            <input type="submit" name="logoff" value="Sair"/>
        </form>
        <%}%>
    </body>
</html>
