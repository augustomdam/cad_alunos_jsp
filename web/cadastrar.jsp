<%-- 
    Document   : cadastrar
    Created on : 21/08/2018, 16:24:46
    Author     : augusto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="facade.FormFacade"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrando Aluno</title>
    </head>
    <body>
        <h1>Resultado da Inscrição</h1>
        <hr>
        <h2><%=fac.salvarAluno(request)%></h2>
        <br>
        <br>
        [<a href="form_cadastro.jsp"> Cadastrar outro Aluno </a>] 
        [<a href="index.html">      Home </a>]

    </body>
</html>
