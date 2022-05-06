<%-- 
    Document   : page 2
    Created on : 15 de abr de 2022, 13:35:00
    Author     : Luiz Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página 2 - SessionApp</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <h2>Página 2</h2>
        <%if(session.getAttribute("username")!=null){%>
            <p>Dados da página dois</p>
        <%}else{%>
            <p style="color: red">Você não tem permissão para ver esta página</p>
        <%}%>
    </body>
</html>
