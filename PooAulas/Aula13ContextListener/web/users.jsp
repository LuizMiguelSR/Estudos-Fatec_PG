<%-- 
    Document   : index
    Created on : 16 de mai. de 2022, 13:38:16
    Author     : Fatec
--%>

<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Exception usersException = null;
    ArrayList<User> users = new ArrayList<>();
    try{
        users = User.getAllUsers();
    }catch(Exception ex){
        usersException = ex;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuários - MyTasks</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf"%>
        <h2>Início</h2>
        <form>
            <fieldset>
                <legend>Adicionar usuário</legend>
                Username:<br/>
                <input type="text" name="username"/><br/>
                Nome:<br/>
                <input type="text" name="name"/><br/>
                Senha:<br/>
                <input type="password" name="password"/><br/><br/>
                <input type="submit" name="user-add" value="Adicionar"/>
            </fieldset>
        </form>
        <h3>Lista de Usuários</h3>
        <%if(usersException != null){%>
        <div style="color: red">
            <%= usersException.getMessage() %>
        </div><hr/>
        <%}%>
        <%if(session.getAttribute("user")==null){%>
            Você deve fazer login para visualizar este conteúdo.
        <%}else{%>
            <table>
                <tr><th>Username</th><th>Name</th></tr>
                <%for(User u: users){%>
                <tr>
                    <td><%= u.getUsername() %></td>
                    <td><%= u.getName() %></td>
                </tr>
                <%}%>
            </table>
        <%}%>
    </body>
</html>