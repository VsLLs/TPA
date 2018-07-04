/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

/**
 *
 * @author alunoComp
 */
public class Corretor extends Pessoa {

    private float comissao;

    public Corretor(float comissao, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }
    

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

}
