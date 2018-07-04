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
public class Cliente extends Pessoa {

    private String email;

    public Cliente(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
