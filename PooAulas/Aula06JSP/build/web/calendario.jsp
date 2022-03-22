<%-- 
    Document   : Calendar
    Created on : 21 de mar. de 2022, 16:25:21
    Author     : Fatec
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP - Calendar</title>
    </head>
    <body>
        
         <h1> Digite um mês e ano válidos</h1>
    <form>
        <input name="ano" type="number">
        <input name="mes" type="number">
        <input type="submit">
    </form>
        <%
    int ano = 0;
    int mes = 0;
    int dia = 0;
    try {
        ano = Integer.parseInt(request.getParameter("ano"));
        mes = Integer.parseInt(request.getParameter("mes"));
    } catch (Exception e) {
        ano = Calendar.getInstance().get(Calendar.YEAR);
        mes = Calendar.getInstance().get(Calendar.MONTH)+1;
    }
    Calendar calendar = Calendar.getInstance();
    calendar.set(ano, mes-1, 1);
    int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    int daysOfMounth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
%>
<body>
</h1>
<br/>
    <table>
        <tr>
            <th>DOM</th>
            <th>SEG</th>
            <th>TER</th>
            <th>QUA</th>
            <th>QUI</th>
            <th>SEX</th>
            <th>SÁB</th>
        </tr>

        <%for(int weekDays = 1; weekDays <= 6; weekDays++){%>
        <tr>
            <%for(int weekDay = 1; weekDay <= 7; weekDay++){%>
            <%if(dia == 0 && firstDayOfWeek == weekDay){
                dia = 1;
            }%>

            <%if(dia==0 || dia>daysOfMounth){%>
            <td style="color: transparent">0</td>
            <%}else{%>
            <td><%= dia++ %></td>
            <%}%><%}}%>
        </tr>
    </table>
    <h6><a href="index.jsp">Voltar</a></h6>
    </body>
</html>