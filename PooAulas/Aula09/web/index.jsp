<%-- 
    Document   : index
    Created on : 11 de abr. de 2022, 13:50:33
    Author     : rlarg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if(request.getParameter("request-form")!=null){
    request.setAttribute("userName", request.getParameter("name"));
}
//application - ServletContext
if(request.getParameter("application-form")!=null){
    application.setAttribute("userName", request.getParameter("name"));
}
if(request.getParameter("application-form-remove")!=null){
    application.removeAttribute("userName");
}
//session - HttpSession
if(request.getParameter("session-form")!=null){
    session.setAttribute("userName", request.getParameter("name"));
}
if(request.getParameter("session-form-remove")!=null){
    session.removeAttribute("userName");
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attributos - JavaEE</title>
    </head>
    <body>
        <a href="index.jsp">INDEX</a>
        <h1>JavaEE</h1>
        <h2>Atributos de requisição (HttpRequest)</h2>
        <%if(request.getAttribute("userName")!=null){%>
            userName: <%= request.getAttribute("userName") %>
        <%}else{%>
            <form>
                Nome: <input type="text" name="name"/>
                <input type="submit" name="request-form"/>
            </form>
        <%}%>
        <h2>Atributos de contexto (ServletContext)</h2>
        <%if(application.getAttribute("userName")!=null){%>
            userName: <%= application.getAttribute("userName") %>
            <form>
                <input type="submit" 
                       name="application-form-remove" 
                       value="Remover"/>
            </form>
        <%}else{%>
            <form>
                Nome: <input type="text" name="name"/>
                <input type="submit" name="application-form"/>
            </form>
        <%}%>
        <h2>Atributos de sessão (HttpSession)</h2>
        <%if(session.getAttribute("userName")!=null){%>
            userName: <%= session.getAttribute("userName") %>
            <form>
                <input type="submit" 
                       name="session-form-remove" 
                       value="Remover"/>
            </form>
        <%}else{%>
            <form>
                Nome: <input type="text" name="name"/>
                <input type="submit" name="session-form"/>
            </form>
        <%}%>
    </body>
</html>