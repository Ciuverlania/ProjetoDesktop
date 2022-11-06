/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercadosenac.model;

import java.util.ArrayList;

/**
 *
 * @author henrick.afcamara
 */
public class Produto {

// Variavel da class
    private static String produtos;

    
// atributos
    private int idProduto;
    private String codProduto;
    private String nomeProduto;
    private String descricaoProduto; // Descreve por extenso todas as informações do produto.
    private int quantidadeProduto;
    private double pesoProduto;
    private double precoProduto;

    // Ações

    public Produto(int idProduto, String codProduto, String nomeProduto, String descricaoProduto, int quantidadeProduto, double pesoProduto, double precoProduto) {
        this.idProduto = idProduto;
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.pesoProduto = pesoProduto;
        this.precoProduto = precoProduto;
    }


    public static String getProdutos() {
        return produtos;
    }

    public static void setProdutos(String produtos) {
        Produto.produtos = produtos;
    }

    public Produto() {
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(double pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
