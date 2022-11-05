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
public class ClienteModel {
    
    // Variavel da class
    private static String clientes;
    
    // atributos
    private String nomeCliente;
    private String sobrenomeCliente;// Descreve por extenso todas as informações do produto.
    private String CPFCliente;
    private int idCliente;
    private String enderecoCliente;
    private int dataNascimento;
    private String emailCliente;
    private char sexoCliente;
    private String estadoCivil;
    
    public ClienteModel(String nomeCliente, String sobrenomeCliente, String CPFCliente, int idCliente, String enderecoCliente, int dataNascimento, String emailCliente, char sexoCliente, String estadoCivil) {
        this.nomeCliente = nomeCliente;
        this.sobrenomeCliente = sobrenomeCliente;
        this.CPFCliente = CPFCliente;
        this.idCliente = idCliente;
        this.enderecoCliente = enderecoCliente;
        this.dataNascimento = dataNascimento;
        this.emailCliente = emailCliente;
        this.sexoCliente = sexoCliente;
        this.estadoCivil = estadoCivil;
    }
    

    public static String getClientes() {
        return clientes;
    }

    public static void setClientes(String clientes) {
        ClienteModel.clientes = clientes;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
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
        public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    public char getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(char sexoCliente) {
        this.sexoCliente = sexoCliente;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
