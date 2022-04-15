<%-- 
    Document   : loteria
    Created on : 11 de abr. de 2022, 16:42:51
    Author     : Fatec
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dicas da Loteria</title>
    </head>
    
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <h2>Dicas para Loteria</h2>
        <%if(session.getAttribute("username")!=null){
            ArrayList lista = (ArrayList) session.getAttribute("arrayNaSessao");
            if (lista == null) {
                lista = new ArrayList();
                for (int i = 0; i < 6; i++) {
                    int r = ((int)(Math.random()*100));
                    lista.add(r);
                }
                session.setAttribute("arrayNaSessao", lista);
            }%>
            <table border='1'>
                <tr><th>Números Gerados</th></tr>
                <% for (int i = 0; i < 6; i++) {%>
                <tr>
                    <td>
                        <% ArrayList listaRecebida =(ArrayList)  request.getSession().getAttribute("arrayNaSessao"); %>
                        <p> <%= listaRecebida.get(i) %> </p>
                    </td>
                </tr>
                <%}%>
            </table>
        <%}else{%>
            <p style="color: red">Você não tem permissão para ver esta página</p>
        <%}%>