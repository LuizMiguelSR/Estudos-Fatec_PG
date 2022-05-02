<%-- 
    Document   : index
    Created on : 2 de mai. de 2022, 15:35:17
    Author     : Fatec
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="demo.Disciplina" %>
<%
    Disciplina poo = new Disciplina("POO", "Programação Orientada a Objeto", "Conceitos e evolução da tecnologia de orientação a objetos. Limitações e diferenças entre o paradigma da programação estruturada em relação à orientação a objetos.", "Segunda", "13:10");
    Disciplina ibd = new Disciplina("IBD", "Banco de Dados", "Conceitos de Base de Dados. Modelos conceituais de informações. ", "Terça", "15:00");
    Disciplina iso2 = new Disciplina("ISO2", "Sistemas Operacionais II", "Comandos de linguagens usadas na construção e estruturação de sites para a Web, com páginas dinâmi­cas e interativas.", "Quarta", "15:00");
    Disciplina ilp = new Disciplina("ILP", "Linguagem de Programação IV", "Conceitos e evolução da tecnologia de orientação a objetos. Limitações e diferenças entre o paradigma da programação estruturada em relação à orientação a objetos.", "Sexta", "15:00");
    
    ArrayList<Disciplina> lista = new ArrayList();
    lista.add(poo); lista.add(ibd); lista.add(iso2); lista.add(ilp);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarefa 11</title>
    </head>
    <body>
        <h1>Tarefa 11</h1>
        <h2>Nome: Luiz Miguel Santos Rodrigues</h2>
        <h2>RA: 1290482022031</h2>
        <table border="1">
                <% for (Disciplina p: lista) {%>
                <tr>
                    <td><b> <%= p.getDiaSemana() %> </b></td>
                    <td> <%= p.getNome() %></td>
                    <td> <%= p.getSigla() %></td>
                    <td> <%= p.getEmenta() %></td>
                    <td> <%= p.getHorario() %></td>
                </tr>
                <%}%>
            </table>
    </body>
</html>
