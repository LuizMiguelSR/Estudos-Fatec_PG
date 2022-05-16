<%-- 
    Document   : loteria
    Created on : 11 de abr. de 2022, 16:42:51
    Author     : Fatec
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Dicas da Loteria</title>
    </head>
    <body>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <h2 class="container-fluid">Dicas para Loteria</h2>
        <%if(session.getAttribute("username")!=null){
            ArrayList lista = (ArrayList) session.getAttribute("arrayNaSessao");
            if (lista == null) {
                lista = new ArrayList();
                int [] num = new int[6];
                for (int i = 0; i < 6; i++) {
                    int r = ((int)(Math.random()*100));
                    for (int j = 0; j < 6; j++) {
                        if (r == num[j] && j != i){
                            r = ((int)(Math.random()*100));
                        } else {
                            num[i] = r;
                        }
                    }                    
                }
                for (int i = 0; i < 6; i++) {
                    lista.add(num[i]);
                }              
                session.setAttribute("arrayNaSessao", lista);
            }%>
            <div class="container-fluid">
                <table class="table table-dark table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Números Gerados</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (int i = 0; i < 6; i++) {%>
                        <tr>
                            <td >
                                <% ArrayList listaRecebida =(ArrayList)  request.getSession().getAttribute("arrayNaSessao"); %>
                                <p style="alignment-adjust: central"> <%= listaRecebida.get(i) %> </p>
                            </td>
                        </tr>
                        <%}%>
                    </tbody> 
                </table>
            </div>
        <%}else{%>
            <p class="container-fluid" style="color: red">Você não tem permissão para ver esta página</p>
        <%}%>
    </body>
</html>