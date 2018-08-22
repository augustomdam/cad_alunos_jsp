<%-- 
    Document   : listar
    Created on : 21/08/2018, 17:29:55
    Author     : augusto
--%>

<%@page import="model.Aluno"%>
<%@page import="dao.AlunoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="facade.FormFacade"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Alunos</title>
    </head>
    <body>
        <h1>Lista de Alunos</h1>
        <%=fac.getListClientes()%>

        [<a href="form_cadastro.jsp"> Cadastrar Aluno </a>] 
        [<a href="index.html">      Home </a>]





    </body>
</html>
