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
public class Comprador extends Cliente{
    private int qQuartos,tipo;

    public Comprador(int qQuartos, int tipo, String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        this.qQuartos = qQuartos;
        this.tipo = tipo;
    }



    public int getqQuartos() {
        return qQuartos;
    }

    public void setqQuartos(int qQuartos) {
        this.qQuartos = qQuartos;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
