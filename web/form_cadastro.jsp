<%-- 
    Document   : index
    Created on : 21/08/2018, 14:57:49
    Author     : augusto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Alunos</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <h1>Cadastro de Alunos</h1>
        <strong>Formulario de Cadastro de Alunos <br/></strong><br/>
        <form action="cadastrar.jsp" method="post" class="form-horizontal" onsubmit="return valida()">
            <div class="form-group-lg">
                Nome: <input type="text" name="nome" id="nome" placeholder="Nome"/>
                Idade: <input type="number" name="idade" id="idade" placeholder="Idade"/>
                CPF: <input type="text" name="cpf" id="cpf" placeholder="CPF" patern
                            pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"title="Digite o CPF no formato nnn.nnn.nnn-nn"/>
                <input type="submit" value="Cadastrar Cliente" class="btn btn-primary"/>  <input type="reset" value="Limpar campos" class="btn btn-warning"/>
            <div/>
            
        </form>




        <script>
            function valida() {
                if (document.cadastro3.cpf.validity.patternMismatch) {
                    alert("O CPF está incorreto");
                } else {
                    alert("O CPF está correto");
                }
                return false;
            }
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js">
	</script>
	<script src="bootstrap/js/bootstrap.min.js"></script>

    </body>
</html>
