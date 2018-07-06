/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Imovel;
import model.Venda;
import model.Visita;
import model.pessoa.Cliente;
import model.pessoa.Comprador;
import model.pessoa.Corretor;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author alunocomp
 */
public class Controller {

    private final ArrayList<Corretor> funcionarios;
    private final ArrayList<Comprador> compradores;
    private final ArrayList<Cliente> clientes;
    private final ArrayList<Imovel> imoveis;
    private final ArrayList<Venda> vendas;
    private final ArrayList<Visita> visitas;

    public Controller() {
        super();
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
        imoveis = new ArrayList<>();
        compradores = new ArrayList<>();
        visitas = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    /**
     * ******* auxiliares                              *******
     * @param texto
     * @return 
     */
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

    /**
     * ******* imoveis                              *******
     * @param imovel
     */
    public void addImovel(Imovel imovel) {
        this.imoveis.add(imovel);
    }

    public Imovel findImovel(String s) {
        int cod = Integer.parseInt(s);
        for (Imovel imovel : imoveis) {
            if (cod == imovel.getCodigo()) {
                return imovel;
            }
        }
        return null;
    }

    public ArrayList<String> getImoveis() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Código       Quartos       Email Vendedor       Endereço       Valor       Tipo");
        for (Imovel imovel : imoveis) {
            String nomes = "";

            String s1 = imovel.getCodigo() + "           ";
            String s2 = imovel.getqQuartos() + "           ";
            String s3 = imovel.getVendedor().getEmail() + "           ";
            String s4 = imovel.getEndereço() + "           ";
            String s5 = imovel.getValor() + "           ";
            String s6 = imovel.getTipo() + "";
            nomes = nomes + s1;
            nomes = nomes + s2;
            nomes = nomes + s3;
            nomes = nomes + s4;
            nomes = nomes + s5;
            nomes = nomes + s6;
            lista.add(nomes);
        }
        return lista;
    }

    /**
     * ******* Clientes                              *******
     * @param cliente
     */
    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public void addComprador(Comprador comprador) {
        this.compradores.add(comprador);
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
    
    public Comprador findComprador(String s) {
        for (Comprador comprador : compradores) {
            if (s.equals(comprador.getEmail())) {
                return comprador;
            }
        }
        return null;
    }

    /**
     * @param email
     ***@return retorna a posição do cliente em questão na lista de clientes
    *
     */
    public int pesquisaClientes(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return clientes.indexOf(cliente);
            }
        }
        return 0;
    }

    public ArrayList<String> getClientes() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("V/C     Nome               Telefone               Endereço                "
                + "Email               Quartos    Tipo Imóvel");
        for (Cliente cliente : clientes) {
            String nomes = "  V     ";
            nomes = nomes.concat(cliente.getNome()) + "             ";
            nomes = nomes.concat(cliente.getTelefone()) + "                ";
            nomes = nomes.concat(cliente.getEndereco()) + "           ";
            nomes = nomes.concat(cliente.getEmail());
            lista.add(nomes);
        }
        
        for (Comprador comprador : compradores) {
            String nomes = "  C     ";
            String s1 = comprador.getqQuartos() + "           ";
            String s2 = comprador.getTipo() + "";
            nomes = nomes.concat(comprador.getNome()) + "           ";
            nomes = nomes.concat(comprador.getTelefone()) + "           ";
            nomes = nomes.concat(comprador.getEndereco()) + "           ";
            nomes = nomes.concat(comprador.getEmail()) + "           ";
            nomes = nomes.concat(s1);
            nomes = nomes.concat(s2);
            lista.add(nomes);
        }
        
        return lista;
    }
    

    /**
     * ******* Corretor                              *******
     */
    /**
     * @param nome
     ***@return retorna a posição do corretor em questão na lista de corretores
    *
     */
    public int pesquisaCorretor(String nome) {
        for (Corretor funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
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
    public Corretor findCorretor(String s) {
        for (Corretor corretor : funcionarios) {
            if (s.equals(corretor.getTelefone())) {
                return corretor;
            }
        }
        return null;
    }

    @SuppressWarnings("empty-statement")
    public ArrayList<String> getCorretor() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(" Nome                 Telefone               Endereço             Comissão");
        for (Corretor funcionario : funcionarios) {
            String nomes = "  ";

            nomes = nomes.concat(funcionario.getNome()) + "           ";;
            nomes = nomes.concat(funcionario.getTelefone()) + "           ";;
            nomes = nomes.concat(funcionario.getEndereco()) + "           ";;
            String s = funcionario.getComissao() + "";
            nomes = nomes.concat(s);
            lista.add(nomes);
        }
        return lista;
    }

    /**
     * ******* Visita                              *******
     * @param v
     */
    public void addVisita(Visita v) {
        this.visitas.add(v);
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getVisita() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(" Código Imóvel       Data          Gasto           Email Comprador           Telefone Corretor");
        for (Visita visita : visitas) {
            String nomes = " ";
            String s1 = visita.getImovel().getCodigo() + "           ";
            Date data = visita.getData().getTime();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String s2 = formato.format(data) + "           ";
            String s3 = visita.getGasto() + "           ";
            String s4 = visita.getComprador().getEmail() + "           ";
            String s5 = visita.getCorretor().getTelefone() + "";
            nomes = nomes.concat(s1);
            nomes = nomes.concat(s2);
            nomes = nomes.concat(s3);
            nomes = nomes.concat(s4);
            nomes = nomes.concat(s5);
            lista.add(nomes);
        }
        return lista;
    }
    
    /*****                   Venda
     * @param v *******/
    
    public void addVenda(Venda v) {
        this.vendas.add(v);
    }
    
    public ArrayList<String> getVenda() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(" Código Imóvel             Email Comprador             Valor            Telefone Corretor");
        for (Venda venda : vendas) {
            String nomes = " ";
            String s1 = venda.getImovel().getCodigo() + "           ";
            String s2 = venda.getComprador().getEmail() + "           ";
            String s3 = venda.getValor() + "           ";
            String s4 = venda.getCorretor().getTelefone() + "";
            
            nomes = nomes.concat(s1);
            nomes = nomes.concat(s2);
            nomes = nomes.concat(s3);
            nomes = nomes.concat(s4);
            lista.add(nomes);

        }
        return lista;
    }

}
