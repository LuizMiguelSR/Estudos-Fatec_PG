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
        <title>JavaEE - Index JSP</title>
    </head>
    <body>
        
        <h1>JavaEE</h1>
        <h2>Java Server Pages</h2>
        <h3>Início</h3>
        <div>
            <a href="dataHora.jsp">Data/Hora Servidor</a>
        </div>
        <h3>Soma</h3>
        <form action="soma.jsp">
            <input type="number" name="n1"> +
            <input type="number" name="n2">
            <input type="submit" name="soma" value="=">
        </form>
        <h3>Aleatórios</h3>
        <form action="aleatorios.jsp">
            <input type="number" name="n">
            <input type="submit" name="gerar" value="Gerar">
        </form>
        <h3>Tabuada</h3>
        <form action="tabuada.jsp">
            <input type="number" name="n">
            <input type="submit" name="gerar" value="Gerar">
        </form>
        <h3>Calendário</h3>
        <form action="calendario.jsp">
            <h4>Mês</h4>
            <input type="number" name="mes">
            <h4>Ano</h4>
            <input type="number" name="ano"><br>
            <input type="submit" name="gerar" value="Enviar">
        </form>
    </body>
</html>