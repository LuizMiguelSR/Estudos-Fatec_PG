<%-- 
    Document   : soma
    Created on : 21 de mar. de 2022, 14:28:59
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    boolean hasParameters = request.getParameter("soma")!=null;
    String errorMessage = null;
    double n1 =0, n2=0, soma=0;
    try{
        if(request.getParameter("soma") != null){
            String p1 = request.getParameter("n1");
            n1 = Double.parseDouble(p1);
            String p2 = request.getParameter("n2");
            n2 = Double.parseDouble(p2);
            soma = n1 + n2;
        }
    }catch(Exception e){
        errorMessage = e.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4><a href="index.jsp">Voltar</a></h4><hr>
        <h1>JavaEE</h1>
        <h2>Java Server Pages</h2>
        <h3>Soma</h3>
        <% if (errorMessage != null) {%>
            <h4 style="color:red"><%= errorMessage %></h4>
        <%} else if (hasParameters) {%>
            <h4> <%= n1 %> + <%= n2 %> = <%= soma %></u></h4>
            <hr/>
        <%}%>
        <form action="soma.jsp">
            <input type="number" name="n1" value="<%= n1 %>"> +
            <input type="number" name="n2" value="<%= n2 %>">
            <input type="submit" name="soma" value="=">
        </form>
    </body>
</html>