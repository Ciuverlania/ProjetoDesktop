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
public class Cliente {
    
    // Variavel da class
    private static String clientes;
    
    // atributos
    private String nomeCliente;
    private String CPFCliente;
    private int idCliente;
    private String enderecoCliente;
    private String dataNascimento;
    private String emailCliente;
    private String sexoCliente;
    private String estadoCivil;
    
    public Cliente(String nomeCliente, String CPFCliente, int idCliente, String enderecoCliente, String dataNascimento, String emailCliente, String sexoCliente, String estadoCivil) {
        this.nomeCliente = nomeCliente;
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
        Cliente.clientes = clientes;
    }

    public Cliente() {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
        public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
