<%-- 
    Document   : criar-contato
    Created on : 10/12/2018, 23:59:26
    Author     : Roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Criar Novo Contato</h1>
        <form action='/SalvarContato' method="POST">
            
            <label for="nome"> Nome: </label><input id="nome" type="text" name="nome"><br>
            <label for="endereco">Endereço:</label><input id="endereco" type="text" name="endereco"><br>
            <label for="data">Data de Nascimento: </label> <input id="data" type="date" name="data_nascimento"><br>
            <label for="email">Email:</label> <input id="email" type="email" name="email"><br>
            <button type="submit">Criar</button>
        </form>
    </body>
</html>
