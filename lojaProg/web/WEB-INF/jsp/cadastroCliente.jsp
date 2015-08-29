<%-- 
    Document   : cadastroCliente
    Created on : 28/08/2015, 19:54:33
    Author     : roberto.o
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Meu cadastro</h1>
        <form action="cadastro" method="POST">
            <label for="tipoPessoa">Pessoa fisica <input type="radio" name="tipoPessoa" value="PessoaFisica"></ input>
            <label for="tipoPessoa"> Pessoa Juridica <input type="radio" name="tipoPessoa" value="PessoaJuridica"> </ input><br>
            <label for="nome">Nome completo  <input type="text" name="nome"  id="nome"> </ input><br>
           <label for="cpf">cpf  <input type="text" name="cpf"  id="cpf"> </ input><br>
           <label for="dataNasc"> data nascimento  <input type="text" name="dataNasc"  id="dataNasc"></ input> <br>
            <select name="sex">
                <option>
                 Feminino
             </option>
             <option>
                 Masculino
             </option>
            </select>
             <br> <input type="submit" value="enviar">
        </form>
        
    </body>
</html>
