<%-- 
    Document   : index
    Created on : 16 de mai de 2022, 23:19:24
    Author     : luiz
--%>
<%@page import="model.Artist"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Exception requestEx = null;
    ArrayList<Artist> list = new ArrayList<>();
    int count = 0;
    try{
        count = Artist.getCount();
        list = Artist.getList();
    }catch(Exception e){
        requestEx = e;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index - JDBC | Artistas</title>
    </head>
    <body>
        <h1>JDBC</h1>
        <h2>Lista de artistas (<%= count %> registros)</h2>
        <%if(requestEx!=null){%>
        <h3 style="color: red"><%= requestEx.getMessage() %></h3>
        <%}%>
        <table border="1">
            <tr><th>id</th><th>name</th></tr>
            <%for(Artist a: list){%>
            <tr>
                <td><%= a.getId() %></td>
                <td><%= a.getName() %></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>