
package br.pucpr.prog4.lojaoldschool.modells;

import br.pucpr.prog4.lojaoldschool.controllers.Pessoa;
import br.pucpr.prog4.lojavirtual.models.dao.IDaoManager;
import br.pucpr.prog4.lojavirtual.models.dao.JdbcDaoManager;
import br.pucpr.prog4.lojavirtual.models.dao.PessoaDAO;

public class ClienteManagerImpl implements clienteManager {

    @Override
    public Pessoa cadastrar(Pessoa pessoa) {
      IDaoManager manager;
      manager  = new JdbcDaoManager();
      try{
          manager.iniciar();
          PessoaDAO dao = manager.getPessoaDAO();
          Pessoa p;
          p = dao.inserir(pessoa);
          manager.confirmarTransação();
          manager.encerrar();
          return p;
      }catch (Exception ex){
          manager.abortarTransação();
          throw ex;
      }
    }
    
    
}
