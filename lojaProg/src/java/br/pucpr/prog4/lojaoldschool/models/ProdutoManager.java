/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaoldschool.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roberto.o
 */
public class ProdutoManager implements IProdutoManager{
private static List<Produto> produtos;
    @Override
    public List<Produto> obterTdos() {
       
    List<Produto> produtos;
    Produto p = new Produto();
    produtos = new ArrayList<>();
    Produto p1 = new Produto();
    p1.setId(1);
    p1.setNome("cafeteira");
    p1.setPreco(new Double(1999.0f));
    produtos.add(p1);
    
    Produto p2 = new Produto();
    p2.setId(2);
    p2.setNome("TV");
    p2.setPreco(new Double(1999.0f));
    
    produtos.add(p2);
    
     Produto p3= new Produto();
    p3.setId(3);
    p3.setNome("cafeteira");
    p3.setPreco(new Double(1999.0f));
    
    produtos.add(p3);
    
    
    
    
    return produtos;
    
    }

    @Override
    public Produto obterPorId(int id) {
        for(Produto produto : produtos)
        {
            if(produto.getId()== id){
                return produto;
            }
        }
        return null;
    }
    
}
