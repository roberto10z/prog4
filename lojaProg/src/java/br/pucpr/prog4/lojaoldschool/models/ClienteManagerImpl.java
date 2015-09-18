
package br.pucpr.prog4.lojaoldschool.models;

import br.pucpr.prog4.lojaoldschool.controllers.Pessoa;
import br.pucpr.prog4.lojavirtual.models.dao.IDaoManager;
import br.pucpr.prog4.lojavirtual.models.dao.JdbcDaoManager;
import br.pucpr.prog4.lojavirtual.models.dao.PessoaDAO;

public class ClienteManagerImpl implements ClienteManager {

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
