/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Imovel;
import model.Venda;
import model.pessoa.Cliente;
import model.pessoa.Comprador;
import model.pessoa.Corretor;

/**
 *
 * @author alunocomp
 */
public class Controller {
    private ArrayList<Corretor> funcionarios;
    private ArrayList<Comprador> compradores;
    private ArrayList<Cliente> clientes;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Venda> vendas;

    public Controller() {
        super();
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
        imoveis = new ArrayList<>();
    }
    
/*********                 auxiliares                              ********/
    public boolean temNumero(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public boolean temLetra(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public boolean temArroba(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.contains("@")) {
                return true;
            }
        }
        return false;
    } 

/*********                 imoveis                              ********/

    public void addImovel(Imovel imovel) {
        this.imoveis.add(imovel);
    }
    public Imovel findImovel(Imovel i) {
        for (Imovel imovel : imoveis) {
            if (i.getCodigo() == imovel.getCodigo()) {
                return i;
            }
        }
        return null;
    }
    public ArrayList<String> getImoveis() {
        ArrayList<String> lista = new ArrayList<>();
        for (Imovel imovel : imoveis) {
            String nomes = "";

            String s1 = imovel.getCodigo() + "           ";
            String s2 = imovel.getVendedor().getEmail() + "           ";
            String s3 = imovel.getTipo() + "           ";
            String s4 = imovel.getqQuartos() + "           ";
            String s5 = imovel.getValor() + "";
            nomes = nomes.concat(s1);
            nomes = nomes.concat(s4);
            nomes = nomes.concat(s2);
            nomes = nomes.concat(imovel.getEndereço());
            nomes = nomes.concat(s3);
            nomes = nomes.concat(s5);
            lista.add(nomes);
        }
        return lista;
    }
    
/*********                 Clientes                              ********/
    
    
    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
    public void removeClientes(Cliente cliente) {
        clientes.remove(pesquisaClientes(cliente.getNome()));
    }
    public void removeClientes(String nome) {
        clientes.remove(pesquisaClientes(nome));
    }
    public Cliente findCliente(String s) {
        for (Cliente cliente : clientes) {
            if (s.equals(cliente.getEmail())) {
                return cliente;
            }
        }
        return null;
    }
    /**
    ***@return retorna a posição do cliente em questão na lista de clientes
    **/
    public int pesquisaClientes(String nome) {
        for(Cliente cliente:clientes){
            if(cliente.getNome().equals(nome)){
                return clientes.indexOf(cliente);
            }
        }
        return 0;
    }
    public ArrayList<String> getClientes(){
        ArrayList<String> lista = new ArrayList<>();
        for(Cliente cliente:clientes){
            String nomes = " ";
            
            nomes = nomes.concat(cliente.getNome()) + "           ";
            nomes = nomes.concat(cliente.getTelefone())+ "           ";
            nomes = nomes.concat(cliente.getEndereco())+ "           ";
            nomes = nomes.concat(cliente.getEmail());
            lista.add(nomes);
        }
        return lista;
    }

/*********                 Corretor                              ********/
    
    /**
    ***@return retorna a posição do corretor em questão na lista de corretores
    **/
    public int pesquisaCorretor(String nome) {
        for(Corretor funcionario:funcionarios){
            if(funcionario.getNome().equals(nome)){
                return funcionarios.indexOf(funcionario);
            }
        }
        return 0;
    }
    public void addCorretor(Corretor corretor) {
        this.funcionarios.add(corretor);
    }
    public void removeFuncionario(Corretor funcionario) {
        funcionarios.remove(pesquisaCorretor(funcionario.getNome()));
    }
    public void removeCorretor(String nome) {
        clientes.remove(pesquisaCorretor(nome));
    }
    @SuppressWarnings("empty-statement")
    public Corretor findCorretor(Corretor c) {
        for (Corretor corretor : funcionarios) {
            if (c.getTelefone().equals(corretor.getTelefone())) {
                return c;
            }
        }
        return null;
    }
    public ArrayList<String> getCorretor(){
        ArrayList<String> lista = new ArrayList<>();
        for(Corretor funcionario:funcionarios){
            String nomes = "";
            
            nomes = nomes.concat(funcionario.getNome())+ "           ";;
            nomes = nomes.concat(funcionario.getTelefone())+ "           ";;
            nomes = nomes.concat(funcionario.getEndereco())+ "           ";;
            String s = funcionario.getComissao()+"";
            nomes = nomes.concat(s);
            lista.add(nomes);
        }
        return lista;
    }

    
}
