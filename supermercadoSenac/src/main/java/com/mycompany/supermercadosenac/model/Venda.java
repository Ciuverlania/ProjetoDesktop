/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadosenac.model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author KINOO
 */
public class Venda {

    private int idVenda;
    private int idCliente;
    private double valorTotalVenda; 
    private Date dataVenda;
    
    private ArrayList<ItemVenda> listaItens = null;

    public Venda() {
    }

    public Venda(int idVenda, int idCliente, double valorTotalVenda, Date dataVenda) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.valorTotalVenda = valorTotalVenda;
        this.dataVenda = dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ArrayList<ItemVenda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemVenda> listaItens) {
        this.listaItens = listaItens;
    }
    
    

}
