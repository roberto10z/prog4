
package br.pucpr.prog4.lojaoldschool.controllers;

import br.pucpr.prog4.lojaoldschool.modells.ClienteManagerImpl;
import br.pucpr.prog4.lojaoldschool.modells.clienteManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "clienteServlet", urlPatterns = {"/cliente/cadastro"})
public class clienteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/cadastroCliente.jsp");
        rd.forward(request, response);
     
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        Pessoa pessoa = new Pessoa();
        pessoa.setNoem(request.getParameter("nome"));
        String cpfAux;
        cpfAux = request.getParameter("cpf");
        Long cpf;
        cpf= Long.parseLong(cpfAux);
        pessoa.setCpf(cpf);
        SimpleDateFormat sdf;
            sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataNascimento = sdf.parse(request.getParameter("dataNasc"));
            pessoa.setDataNasc(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(clienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            pessoa.setSexo(request.getParameter("sex"));
            pessoa.setTipoPessoa(request.getParameter("tipoPessoa"));
            
    }
    clienteManager manager;
    manager = new ClienteManagerImpl();
    manager.cadastrar(pessoa);

}
