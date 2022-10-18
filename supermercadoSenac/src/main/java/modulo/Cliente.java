/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

/**
 *
 * @author henrick.afcamara
 */
public class Cliente {
    
    // Variavel da class
    private static String clientes;
    
    // atributos
    private String nomeCliente; // Descreve por extenso todas as informações do produto.
    private String CPFCliente;
    private int idCliente;
    private String enderecoCliente;
    private int dataNascimento;

    public Cliente(String nomeCliente, String CPFCliente, int idCliente, String enderecoCliente, int dataNascimento) {
        this.nomeCliente = nomeCliente;
        this.CPFCliente = CPFCliente;
        this.idCliente = idCliente;
        this.enderecoCliente = enderecoCliente;
        this.dataNascimento = dataNascimento;
    }
    

    public static String getClientes() {
        return clientes;
    }

    public static void setClientes(String clientes) {
        Cliente.clientes = clientes;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
