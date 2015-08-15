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


@WebServlet(urlPatterns = {"/ProdutoListaServlet"})
public class ProdutoListaServlet extends HttpServlet {

 
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProdutoListaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProdutoListaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        IProdutoManager manager;
        manager = new ProdutoManager();
        List<Produto> produtos;
        produtos = manager.obterTdos();
        
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produtos-lista.jsp");
        rd.forward(request, response);
    }

 
  @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
