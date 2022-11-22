/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadosenac.dao;

import com.mycompany.supermercadosenac.TelaVenda;
import com.mycompany.supermercadosenac.model.Produto;
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
public class ProdutoDAO {
    
     
    public static String url = "jdbc:mysql://localhost:3306/supersenac";
    public static String login = "root";
    public static String senha = "";


    public static boolean cadastrar(Produto objProduto) {
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("insert into produto (codigo,nome,descricao,quantidade,peso,preco) values (?,?,?,?,?,?);"
                    , Statement.RETURN_GENERATED_KEYS );
            
            comandoSQL.setString(1, objProduto.getCodProduto());
            comandoSQL.setString(2, objProduto.getNomeProduto());
            comandoSQL.setString(3, objProduto.getDescricaoProduto());
            comandoSQL.setInt   (4, objProduto.getQuantidadeProduto());
            comandoSQL.setDouble(5, objProduto.getPesoProduto());
            comandoSQL.setDouble(6, objProduto.getPrecoProduto());
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
                
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if(rs != null){
                    if(rs.next()){
                        objProduto.setIdProduto(rs.getInt(1));
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

    public static boolean alterar(Produto objProduto) {

        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("UPDATE produto SET codigo=? ,nome=? ,descricao=? ,quantidade=? ,peso=? ,preco=?  WHERE id =?; ");
            
            comandoSQL.setString(1, objProduto.getCodProduto());
            comandoSQL.setString(2, objProduto.getNomeProduto());
            comandoSQL.setString(3, objProduto.getDescricaoProduto());
            comandoSQL.setInt   (4, objProduto.getQuantidadeProduto());
            comandoSQL.setDouble(5, objProduto.getPesoProduto());
            comandoSQL.setDouble(6, objProduto.getPrecoProduto());
            comandoSQL.setInt   (7, objProduto.getIdProduto());
            
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

    public static ArrayList<Produto> listar() {

        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("SELECT * FROM produto;");
            
            //4º passo - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Produto objNovo = new Produto();
                    objNovo.setIdProduto(rs.getInt("id"));
                    objNovo.setCodProduto(rs.getString("codigo"));
                    objNovo.setNomeProduto(rs.getString("nome"));
                    objNovo.setDescricaoProduto(rs.getString("descricao"));
                    objNovo.setQuantidadeProduto(rs.getInt("quantidade"));
                    objNovo.setPesoProduto(rs.getDouble("peso"));
                    objNovo.setPrecoProduto(rs.getDouble("preco"));                   
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

    public static ArrayList<Produto> buscarPorNome(String nome) {
        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("SELECT * FROM produto WHERE nome LIKE ?;");
            comandoSQL.setString(1, nome);
            
            //4º passo - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Produto objNovo = new Produto();
                    objNovo.setIdProduto(rs.getInt("id"));
                    objNovo.setCodProduto(rs.getString("codigo"));
                    objNovo.setNomeProduto(rs.getString("nome"));
                    objNovo.setDescricaoProduto(rs.getString("descricao"));
                    objNovo.setQuantidadeProduto(rs.getInt("quantidade"));
                    objNovo.setPesoProduto(rs.getDouble("peso"));
                    objNovo.setPrecoProduto(rs.getDouble("preco"));                   
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

    public static ArrayList<Produto> buscarPorCodigo(String codigo) {

        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("SELECT * FROM produto WHERE codigo LIKE ?;");
            comandoSQL.setString(1, codigo);
            
            //4º passo - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
               
                while(rs.next()){
                    Produto objNovo = new Produto();
                    objNovo.setIdProduto(rs.getInt("id"));
                    objNovo.setCodProduto(rs.getString("codigo"));
                    objNovo.setNomeProduto(rs.getString("nome"));
                    objNovo.setDescricaoProduto(rs.getString("descricao"));
                    objNovo.setQuantidadeProduto(rs.getInt("quantidade"));
                    objNovo.setPesoProduto(rs.getDouble("peso"));
                    objNovo.setPrecoProduto(rs.getDouble("preco"));                   
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
            conexao.prepareStatement("DELETE FROM produto WHERE id = ?; ");
            
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

    public static ArrayList<Produto> carrinho(int quantidade, int id) {
        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("SELECT id, nome, preco FROM produto where id = ?;");
            
            comandoSQL.setInt(1, id);
            
            //4º passo - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            

            
            if(rs!=null){
               
                while(rs.next()){
                    Produto objNovo = new Produto();
                    objNovo.setIdProduto(rs.getInt("id"));
                    objNovo.setNomeProduto(rs.getString("nome"));
                    objNovo.setPrecoProduto(rs.getDouble("preco"));                   
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
    
    
    
}
