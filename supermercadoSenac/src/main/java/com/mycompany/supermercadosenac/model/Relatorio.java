
package com.mycompany.supermercadosenac.model;

public class Relatorio {

    private int IdRelatorio;
    private int IdVenda;
    private int IdProduto;
    private int IdCliente;
    private String NomeProduto;
    private int QtdProduto;
    private double PrecoProduto;
    private double ValorTotalProduto;
    


    public Relatorio() {

    }

    public Relatorio(int IDVenda,int IDProduto, int QuantidadeProduto, double ValorProduto) {
        this.IdVenda = IDVenda;
        this.IdProduto = IDProduto;
        this.QtdProduto = QuantidadeProduto;
        this.PrecoProduto = ValorProduto;
    }

    public Relatorio(int IDProduto, String NomeProduto, int QuantidadeProduto, double ValorProduto) {
        this.IdProduto = IDProduto;
        this.NomeProduto = NomeProduto;
        this.QtdProduto = QuantidadeProduto;
        this.PrecoProduto = ValorProduto;
        this.ValorTotalProduto = QuantidadeProduto * ValorProduto;
    }

    /**
     * Getter e Setters (Retornos e Definições) para os atributos
     */
    public int getIdRelatorio(int IdRelatorio) {
        return IdRelatorio;
    }

    public void setIdRelatorio(int IdRelatorio) {
        this.IdRelatorio = IdRelatorio;
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public int getQtdProduto() {
        return QtdProduto;
    }

    public void setQtdProduto(int QtdProduto) {
        this.QtdProduto = QtdProduto;
    }

    public double getPrecoProduto() {
        return PrecoProduto;
    }

    public void setPrecoProduto(double PrecoProduto) {
        this.PrecoProduto = PrecoProduto;
    }

    public double getValorTotalProduto() {
        return ValorTotalProduto;
    }

    public void setValorTotalProduto(double ValorTotalProduto) {
        this.ValorTotalProduto = ValorTotalProduto;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    
    
}
