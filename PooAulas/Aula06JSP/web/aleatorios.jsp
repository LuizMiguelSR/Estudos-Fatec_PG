<%-- 
    Document   : aleatorios
    Created on : 21 de mar. de 2022, 14:28:59
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    boolean hasParameters = request.getParameter("gerar")!=null;
    String errorMessage = null;
    int n =0, gerar=0;
    try{
        if(request.getParameter("n") != null){
            String p = request.getParameter("n");
            n = Integer.parseInt(p);
            
        }
    }catch(Exception e){
        errorMessage = e.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aleatorios - JavaEE</title>
    </head>
    <body>
        <h4><a href="index.jsp">Voltar</a></h4><hr>
        <h1>JavaEE</h1>
        <h2>Java Server Pages</h2>
        <h3>Números Aleatórios</h3>
        <form action="aleatorios.jsp">
            <input type="number" name="n" value="<%= n %>">
            <input type="submit" name="gerar" value="Gerar">
        </form>
        <% if (errorMessage != null) {%>
            <h4 style="color:red"><%= errorMessage %></h4>
        <%} else if (hasParameters) {%>
            <hr/>
            <table border="1">
                <tr>
                    <th>Índice</th>
                    <th>Números</th>
                </tr>
                <% for(int i = 1; i <= n; i++){%>
                <tr>
                    <td><%= i %></td>
                    <td><%= ((int)(Math.random()*100)) %></td>
                </tr>
                <%}%>
            </table>
        <%}%>
    </body>
</html>