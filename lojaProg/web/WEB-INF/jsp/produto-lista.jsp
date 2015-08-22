
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <c:forEach var="produto" items="${produtos}">
                <div>
                    <p>${produto.nome} </p>
                    <a href="produto-detalhe?id=$${produto.id}">
                    <img src ="../imagens/0${produto.id}.jpg" 
                    alt = "produto ${produto.id}">
                    </a>
                    <p>R$ ${produto.preco} </p> 
                    
                </div>
            </c:forEach>       
        </div>
    </body>
</html>