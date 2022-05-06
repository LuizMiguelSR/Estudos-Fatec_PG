<%-- 
    Document   : index
    Created on : 2 de mai. de 2022, 14:00:01
    Author     : Fatec
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="demo.Pessoa" %>
<%
   Pessoa ramiro = new Pessoa("Ramiro");
   Pessoa maria = new Pessoa("Maria");
   Pessoa albina = new Pessoa("Albina");
   Pessoa jose = new Pessoa("José");
   jose.setPai(ramiro);
   jose.setMae(maria);
   Pessoa mariaHelena = new Pessoa("Maria Helena");
   mariaHelena.setMae(albina);
   Pessoa eu = new Pessoa("Ricardo");
   eu.setPai(jose);
   eu.setMae(mariaHelena);
   Pessoa joseRicardo = new Pessoa("José Ricardo");
   joseRicardo.setPai(eu);
   Pessoa mariaEduarda = new Pessoa ("Maria Eduarda");
   mariaEduarda.setPai(eu);
   ArrayList<Pessoa> lista = new ArrayList();
   lista.add(ramiro); lista.add(maria); lista.add(jose);
   lista.add(albina); lista.add(mariaHelena); lista.add(eu);
   lista.add(joseRicardo); lista.add(mariaEduarda);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Índice</title>
    </head>
    <body>
        <h1>POO</h1>
        <h2>Índice</h2>
        <div>
            <table border="1">
                <tr>
                    <td><b>Nome</b></td>
                    <td><b>Pai</b></td>
                    <td><b>Avô Paterno</b></td>
                    <td><b>Avó Paterna</b></td>
                    <td><b>Mãe</b></td>
                    <td><b>Avô Materno</b></td>
                    <td><b>Avó Materna</b></td>
                </tr>
                <% for (Pessoa p: lista) {%>
                <tr>
                    <td> <%= p.getNome() %></td>
                    <td> <%= (p.getPai() != null) ? p.getPai().getNome(): "" %></td>
                    <td> <%= (p.getAvoPaterno() != null) ? p.getAvoPaterno().getNome(): "" %></td>
                    <td> <%= (p.getAvoPaterna() != null) ? p.getAvoPaterna().getNome(): "" %></td>
                    <td> <%= (p.getMae() != null) ? p.getMae().getNome(): "" %></td>
                    <td> <%= (p.getAvoMaterno() != null) ? p.getAvoMaterno().getNome(): "" %></td>
                    <td> <%= (p.getAvoMaterna() != null) ? p.getAvoMaterna().getNome(): "" %></td>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>
