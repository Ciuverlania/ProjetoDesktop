/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadosenac.dao;

import com.mycompany.supermercadosenac.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author KINOO
 */
public class ClienteDAO {
    
     public static String url = "jdbc:mysql://localhost:3306/supersenac";
    public static String login = "root";
    public static String senha = "";

    public static boolean cadastrar(Cliente objCliente) {
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("INSERT INTO cliente (CPFCliente, nomeCliente,enderecoCliente,dataNascimento,emailCliente,sexoCliente,estadoCivil) VALUES(?,?,?,?,?,?,?); "
                    , Statement.RETURN_GENERATED_KEYS );
            
            comandoSQL.setString(1, objCliente.getCPFCliente());
            comandoSQL.setString(2, objCliente.getNomeCliente());
            comandoSQL.setString(3, objCliente.getEnderecoCliente());
            comandoSQL.setString(4, objCliente.getDataNascimento());
            comandoSQL.setString(5, objCliente.getEmailCliente());
            comandoSQL.setString(6, objCliente.getSexoCliente());
            comandoSQL.setString(7, objCliente.getEstadoCivil());
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
                
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if(rs != null){
                    if(rs.next()){
                        objCliente.setIdCliente(rs.getInt(1));
                    }
                }
                
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }

    public static boolean alterar(Cliente objCliente) {
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("UPDATE cliente SET CPFCliente=?, nomeCliente=?,enderecoCliente=?,dataNascimento=?,emailCliente=?,sexoCliente=?,estadoCivil=?  WHERE idCliente =?; ");
            
            comandoSQL.setString(1, objCliente.getCPFCliente());
            comandoSQL.setString(2, objCliente.getNomeCliente());
            comandoSQL.setString(3, objCliente.getEnderecoCliente());
            comandoSQL.setString(4, objCliente.getDataNascimento());
            comandoSQL.setString(5, objCliente.getEmailCliente());
            comandoSQL.setString(6, objCliente.getSexoCliente());
            comandoSQL.setString(7, objCliente.getEstadoCivil());
            comandoSQL.setInt   (8, objCliente.getIdCliente());
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
                
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }

    public static ArrayList<Cliente> listar() {
        Connection conexao = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("SELECT * FROM cliente;");
            
            //4º passo - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Cliente objNovo = new Cliente();
                    objNovo.setIdCliente(rs.getInt("idCliente"));
                    objNovo.setCPFCliente(rs.getString("CPFCliente"));
                    objNovo.setNomeCliente(rs.getString("nomeCliente"));
                    objNovo.setDataNascimento(rs.getString("dataNascimento"));
                    objNovo.setEnderecoCliente(rs.getString("enderecoCliente"));
                    objNovo.setEmailCliente(rs.getString("emailCliente"));
                    objNovo.setSexoCliente(rs.getString("sexoCliente"));
                    objNovo.setEstadoCivil(rs.getString("estadoCivil"));                    
                    lista.add(objNovo);
                
                }
                
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }

    public static ArrayList<Cliente> buscarPorNome(String nome) {
        Connection conexao = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("SELECT * FROM cliente WHERE nomeCliente LIKE ?;");
            comandoSQL.setString(1, nome);
            
            //4º passo - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Cliente objNovo = new Cliente();
                    objNovo.setIdCliente(rs.getInt("idCliente"));
                    objNovo.setCPFCliente(rs.getString("CPFCliente"));
                    objNovo.setNomeCliente(rs.getString("nomeCliente"));
                    objNovo.setDataNascimento(rs.getString("dataNascimento"));
                    objNovo.setEnderecoCliente(rs.getString("enderecoCliente"));
                    objNovo.setEmailCliente(rs.getString("emailCliente"));
                    objNovo.setSexoCliente(rs.getString("sexoCliente"));
                    objNovo.setEstadoCivil(rs.getString("estadoCivil")); ;
                    lista.add(objNovo);
                
                }
                
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
        
    }

    public static ArrayList<Cliente> buscarPorCpf(String cpf) {
        Connection conexao = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("SELECT * FROM cliente WHERE cpfCliente LIKE ?;");
            comandoSQL.setString(1, cpf);
            
            //4º passo - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Cliente objNovo = new Cliente();
                    objNovo.setIdCliente(rs.getInt("idCliente"));
                    objNovo.setCPFCliente(rs.getString("CPFCliente"));
                    objNovo.setNomeCliente(rs.getString("nomeCliente"));
                    objNovo.setDataNascimento(rs.getString("dataNascimento"));
                    objNovo.setEnderecoCliente(rs.getString("enderecoCliente"));
                    objNovo.setEmailCliente(rs.getString("emailCliente"));
                    objNovo.setSexoCliente(rs.getString("sexoCliente"));
                    objNovo.setEstadoCivil(rs.getString("estadoCivil")); ;
                    lista.add(objNovo);
                
                }
                
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }

    public static boolean excluir(int id) {

        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("DELETE FROM cliente WHERE idCliente = ?; ");
            
            comandoSQL.setInt(1, id);
            
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
                
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
        
    }
    
}
