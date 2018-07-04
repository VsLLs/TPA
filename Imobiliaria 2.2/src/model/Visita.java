/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author alunoComp
 */
public class Visita {
    private Imovel imovel;
    private Date data;
    private float gasto;

    public Visita(Imovel imovel, Date data, float gasto) {
        this.imovel = imovel;
        this.data = data;
       
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Date getData() {
        return data;
    }

    public float getGasto() {
        return Imovel.getGasto();
    }
    
}
