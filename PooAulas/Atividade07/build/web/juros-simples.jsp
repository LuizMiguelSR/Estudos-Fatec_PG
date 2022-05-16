<%-- 
    Document   : index
    Created on : 28 de mar. de 2022, 13:55:02
    Author     : Fatec
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    boolean hasParameters = request.getParameter("calc")!=null;
    String errorMessage = null;
    double presente =0, taxa=0, tempo =0, futuro=0;
    try{
        if(request.getParameter("calc") != null){
            String p1 = request.getParameter("presente");
            presente = Double.parseDouble(p1);
            String p2 = request.getParameter("taxa");
            taxa = Double.parseDouble(p2);
            String p3 = request.getParameter("tempo");
            tempo = Double.parseDouble(p3);
            futuro = presente * (1+((taxa/100)*tempo));
        }
    }catch(Exception e){
        errorMessage = e.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Juros Simples JavaApp</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navBar.jspf" %>
              
        <div class="container-fluid">
            <h3>Luiz Miguel Santos Rodrigues</h3>
            <h3>RA: 1290482022031</h3><hr/>
            <h1>Juros Simples</h1>
        </div>
        <div class="container-fluid">
            <form>
                <div class="mb-3">
                  <label for="vp" class="form-label">Valor Presente</label>
                  <input name="presente" type="number" step="any" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                  <label for="tx" class="form-label">Taxa (%)</label>
                  <input name="taxa" type="number" step="any" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                  <label for="tp" class="form-label">Tempo</label>
                  <input name="tempo" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <button type="submit" name="calc" class="btn btn-primary">Calcular</button>
            </form>
        </div>
        <div class="container-fluid">
            <% if (errorMessage != null) {%>
                <h4 style="color:red"><%= errorMessage %></h4>
            <%} else if (hasParameters) {%>
                <hr/>
                <h4> Valor Presente: <%= formatter.format(presente)%> <br>Taxa(%): <%= taxa %> <br>Tempo <%= tempo %> <br>Valor Futuro: <%= formatter.format(futuro) %></u></h4>
                <hr/>
            <%}%>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
