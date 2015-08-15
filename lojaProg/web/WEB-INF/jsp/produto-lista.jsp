<%-- 
    Document   : produto-lista
    Created on : 14/08/2015, 21:08:53
    Author     : roberto.o
--%>

<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.lojaoldschool.modells.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        <%

            List<Produto> produtos;
            produtos = (List<Produto>) request.getAttribute("produto");
            for(Produto produto : produtos){
         %>   
        <div> <p> 
                < % 
                = produto.getNome() 
                 % >   
              </p>

                 <a href ="produto-detalhe?id =< % = produto.getId() % > "
                    <img src="imagens/0 <%=produto.getID() %>.jpg "
                      
            </div>
        
        
        
    </body>
</html>
