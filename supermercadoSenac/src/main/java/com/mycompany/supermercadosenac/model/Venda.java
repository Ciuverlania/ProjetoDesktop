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
    private String NomeCliente;
    private double valorTotalVenda; 
    private String dataVenda;

    public Venda() {
    }

    public Venda(int idVenda, int idCliente, ArrayList<ItemVenda> listaItens,double valorTotalVenda, String dataVenda) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.valorTotalVenda = valorTotalVenda;
        this.dataVenda = dataVenda;
    }

    public Venda(int idCliente, double valorTotal, String dataVenda) {
        this.idCliente = idCliente;
        this.valorTotalVenda = valorTotal;
        this.dataVenda = dataVenda;
    }
    
        public Venda(int idVenda, String dataVenda,String nomeCliente,double valorTotal) {
        this.idCliente = idCliente;
        this.NomeCliente = nomeCliente;
        this.valorTotalVenda = valorTotal;
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

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }
    
    

}
