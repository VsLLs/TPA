/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.pessoa.Comprador;
import model.pessoa.Corretor;

/**
 *
 * @author alunoComp
 */
public class Venda {
    private Imovel imovel;
    private Corretor corretor;
    private Comprador comprador;
    private float desconto;

    public Venda(Imovel imovel, Corretor corretor, Comprador comprador, float desconto) {
        this.imovel = imovel;
        this.corretor = corretor;
        this.comprador = comprador;
        this.desconto = desconto;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public float getDesconto() {
        return desconto;
    }
    
}
