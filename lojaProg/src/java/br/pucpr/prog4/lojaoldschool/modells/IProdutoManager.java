/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaoldschool.modells;

import java.util.List;

/**
 *
 * @author roberto.o
 */
public interface IProdutoManager {
    
    List<Produto> obterTdos();
    Produto obterPorId(int id);
}
