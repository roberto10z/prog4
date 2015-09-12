/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojavirtual.models.dao;

import br.pucpr.prog4.lojaoldschool.controllers.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author roberto.o
 */
public class JdbcPessoaDAO implements PessoaDAO {
   private Connection conexao;
    public void setConexao (Connection conexao)
    {
        this.conexao = conexao;
    }

    @Override
    public Pessoa inserir(Pessoa pessoa) {
        String sql;
                sql="INSERT INTO Pessoa { "
                    +"nome,"
                    +"dataNasc,"
                    +"tipoPessoa,"
                    +"sexo,"
                    +"cpf)"
                    +"VALUE(?,?,?,?,?)";
        PreparedStatement ps;
        try
        {
            ps=conexao.prepareStatement(sql);
            ps.setString(1, pessoa.getNoem());
            ps.setDate(2, new java.sql.Date(pessoa.getDataNasc().getTime()));
            ps.setString(3, pessoa.getTipoPessoa());
            ps.setString(4, pessoa.getSexo());
            ps.setLong(5, pessoa.getCpf());
            ps.executeQuery();
             return pessoa;
        }catch(Exception ex){
            throw new DaoException("sei la"+ex.getMessage());
        }
       
    }

   
    
    
}
