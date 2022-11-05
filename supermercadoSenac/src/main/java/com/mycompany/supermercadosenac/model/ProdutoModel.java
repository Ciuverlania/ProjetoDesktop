/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercadosenac.model;

/**
 *
 * @author henrick.afcamara
 */
public class ProdutoModel {

// Variavel da class
    private static String produtos;
    
// atributos
    private String descricaoProduto; // Descreve por extenso todas as informações do produto.
    private String nomeProduto;
    private int codProduto;
    private int idProduto;
    private int pesoProduto;
    private int quantidadeProduto;
    private double precoProduto;

    // Ações

    public ProdutoModel(String descricaoProduto, String nomeProduto, int codProduto, int idProduto, int pesoProduto, int quantidadeProduto, double precoProduto) {
        this.descricaoProduto = descricaoProduto;
        this.nomeProduto = nomeProduto;
        this.codProduto = codProduto;
        this.idProduto = idProduto;
        this.pesoProduto = pesoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
    }


    public static String getProdutos() {
        return produtos;
    }

    public static void setProdutos(String produtos) {
        ProdutoModel.produtos = produtos;
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

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(int pesoProduto) {
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

    public void setPrecoProduto(int precoProduto) {
        this.precoProduto = precoProduto;
    }
}
