<%-- 
    Document   : loteria
    Created on : 11 de abr. de 2022, 16:42:51
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <h2>Loteria</h2>
        <%if(session.getAttribute("username")!=null){%>
            <p>Dados da página um</p>
        <%}else{%>
            <p style="color: red">Você não tem permissão para ver esta página</p>
        <%}%>
    </body>
</html>
