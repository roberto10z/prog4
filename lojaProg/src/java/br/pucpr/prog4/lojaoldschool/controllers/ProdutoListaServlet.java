package br.pucpr.prog4.lojaoldschool.controllers;


import br.pucpr.prog4.lojaoldschool.modells.IProdutoManager;
import br.pucpr.prog4.lojaoldschool.modells.Produto;
import br.pucpr.prog4.lojaoldschool.modells.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/produto/lista"})
public class ProdutoListaServlet extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        IProdutoManager manager;
        manager = new ProdutoManager();
        List<Produto> produtos;
        produtos = manager.obterTdos();
        
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produto-lista.jsp");
        rd.forward(request, response);
    }

 
  @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
