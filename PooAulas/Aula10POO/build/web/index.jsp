<%-- 
    Document   : index
    Created on : 25 de abr. de 2022, 13:38:13
    Author     : Fatec
--%>

<%@page import="Demo.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    // Exemplo de declaração e instanciação de um objeto
    Data hoje; // Declaração do objeto
    hoje = new Data(); // Instanciação do objeto

    hoje.dia = 25;
    hoje.mes = 4;
    hoje.ano = 2022;
    Data amanha = new Data();
    amanha.setData(26, 4, 2022);
    
    Data padrao = new Data();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index - POO</title>
    </head>
    <body>
        <h1>POO</h1>
        <h2>Index</h2>
        <h3>Hoje é dia: <%= hoje.dia %></h3>
        <h3>Amanhã é dia: <%=  amanha.dia %></h3>
        <h3>Data padrão: <%= padrao.getData() %></h3>
    </body>
</html>
