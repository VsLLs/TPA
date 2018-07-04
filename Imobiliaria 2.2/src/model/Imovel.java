/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.pessoa.Cliente;

/**
 *
 * @author alunocomp
 */
public class Imovel {

    private int codigo;
    private Cliente vendedor;
    private String endereço;
    private int tipo;
    private int qQuartos;
    private float valor;
    private static float gasto;

    public Imovel(int codigo, Cliente vendedor, String endereço, int tipo, int qQuartos, float valor) {
        //implementar seguranca na criação do codigo(existente?)
        this.codigo = codigo;
        this.vendedor = vendedor;
        this.endereço = endereço;
        this.tipo = tipo;
        this.qQuartos = qQuartos;
        this.valor = valor;
    }

    public static float getGasto() {
        return gasto;
    }

    public static void setGasto(float gasto) {
        Imovel.gasto = gasto;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the vendedor
     */
    public Cliente getVendedor() {

        return vendedor;
    }

    /**
     * @return the endereço
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @return the qQuartos
     */
    public int getqQuartos() {
        return qQuartos;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

}
