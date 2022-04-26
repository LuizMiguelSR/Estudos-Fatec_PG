<%-- 
    Document   : index
    Created on : 25 de abr. de 2022, 13:28:51
    Author     : rlarg
--%>

<%@page import="demo.Database"%>
<%@page import="demo.Contato"%>
<%@page import="demo.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //Exemplo de declaração, instanciação e definição de um objeto
    Data hoje = new Data();
    hoje.setAno(2022);
    hoje.setMês(4);
    hoje.setDia(25);
    
    Data amanhã = new Data();
    amanhã.setData(26, 4, 2022);
    
    Data nascimento = new Data(1, 7, 1979);
    
    Data padrão = new Data();
    
    Data errada = new Data();
    errada.setData(12, 15, 2013);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index - POO</title>
    </head>
    <body>
        <h1>POO</h1>
        <h2>Testes com a classe Data</h2>
        <h3>Hoje é dia <%= hoje.getDia() %></h3>
        <h3>Amanhã é dia <%= amanhã.getDia() %></h3>
        <h3>Nascimento <%= nascimento.getData() %></h3>
        <h4>Aniversário em <%= nascimento.getAniversário() %></h4>
        <h3>Data padrão: <%= padrão.getData() %></h3>
        <h3>Data errada <%= errada.getData() %></h3>
        <h2>Testes com a classe Contato</h2>
        <h3>Lista de contatos a partir do método Contato.getList()</h3>
        <table border="1">
            <tr><th>Nome</th><th>Telefone</th><th>Aniversário</th></tr>
            <%for(Contato c: Contato.getList()){%>
            <tr>
                <td><%= c.getNome() %></td>
                <td><%= c.getTelefone() %></td>
                <td><%= c.getNascimento().getAniversário() %></td>
            </tr>
            <%}%>
        </table>
        <h3>Lista de contatos a partir do método Database.getContatos()</h3>
        <table border="1">
            <tr><th>Nome</th><th>Telefone</th><th>Aniversário</th></tr>
            <%for(Contato c: Database.getContatos()){%>
            <tr>
                <td><%= c.getNome() %></td>
                <td><%= c.getTelefone() %></td>
                <td><%= c.getNascimento().getAniversário() %></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>