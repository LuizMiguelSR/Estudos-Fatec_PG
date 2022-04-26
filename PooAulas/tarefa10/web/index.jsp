<%-- 
    Document   : index
    Created on : 25 de abr de 2022, 22:29:34
    Author     : Luiz Miguel
--%>

<%@page import="java.util.TimeZone"%>
<%@page import="java.util.Calendar"%>
<%@page import="Tempo.Horario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
    Horario atual = new Horario(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
    Horario intervalo = new Horario(15, 45, 11);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hora Atual e Hora do intervalo</h1>
        <h3>Horário Atual <%= atual.retornaHora() %></h3>
        <h3>Horário Intervalo <%= intervalo.retornaHora() %></h3>
        <h3>Nome: Luiz Miguel Santos Rodrigues Dia: 25/04/2022</h3>
    </body>
</html>
