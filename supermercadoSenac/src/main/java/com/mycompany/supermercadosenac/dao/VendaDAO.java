/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadosenac.dao;

import com.mycompany.supermercadosenac.model.ItemVenda;
import com.mycompany.supermercadosenac.model.Venda;
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
public class VendaDAO {
    
    public static String url = "jdbc:mysql://localhost:3306/supersenac";
    public static String login = "root";
    public static String senha = "";
    
//    public static boolean finalizarCompra(Venda obj) {
//        
//        boolean retorno = false;
//        
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conexao = DriverManager.getConnection(url, login, senha);
//            
//            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Venda (id,fk_idCliente, valor, dataVenda) VALUES (?, ?,?,?)", Statement.RETURN_GENERATED_KEYS);
//            comandoSQL.setInt(1, obj.getIdVenda());
//            comandoSQL.setInt(2, obj.getIdCliente());
//            comandoSQL.setDouble(3, obj.getValorTotalVenda());
//            comandoSQL.setString(4, obj.getDataVenda());
//            
//            int linhasAfetadas = comandoSQL.executeUpdate();
//            if (linhasAfetadas > 0) {
//                ResultSet rs = comandoSQL.getGeneratedKeys();
//                if (rs .next()) {
//                    int idVenda = rs.getInt(1);
//                    for (ItemVenda item : obj.getListaItens()) {
//                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO ItemVenda (idVenda,idProduto, nomeProduto, qtdProduto,precoProduto) VALUES (?,?,?,?,?)");
//                        comandoSQLItem.setInt(1, idVenda);
//                        comandoSQLItem.setInt(2, item.getIdProduto());
//                        comandoSQLItem.setString(3, item.getNomeProduto());
//                        comandoSQLItem.setInt(4, item.getQtdProduto());
//                        comandoSQLItem.setDouble(5,item.getPrecoProduto());
//
//                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
//                        if(linhasAfetadasItem>0){
//                            retorno = true;
//                        }
//                    }
//                }
//            }
//            
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        
//        return retorno;
//        
//    }

    public static int fazerCompra(Venda objVenda) {
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Venda (idCliente, Valor_Total, Data_Venda) VALUES (?, ?, ?);", Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setInt(1, objVenda.getIdCliente());
            comandoSQL.setDouble(2, objVenda.getValorTotalVenda());
            comandoSQL.setString(3, objVenda.getDataVenda());

            int rows = comandoSQL.executeUpdate();
            if (rows > 0) {

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objVenda.setIdVenda(rs.getInt(1));
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return objVenda.getIdVenda();
    }

    public static ArrayList<Venda> listarVendasPorPeriodo(String dataInicio, String dataFim) {
    ArrayList<Venda> listaDeVendas = new ArrayList<Venda>();

        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT cliente.ID, Data_Venda, Nome, Valor_Total FROM Venda INNER JOIN Cliente ON cliente.ID =idCliente WHERE Data_venda BETWEEN ? AND ?;");

            comandoSQL.setString(1, dataInicio);
            comandoSQL.setString(2, dataFim);

            ResultSet rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Venda venda = new Venda();

                    venda.setIdVenda(rs.getInt(1));
                    venda.setDataVenda(rs.getString(2));
                    venda.setNomeCliente(rs.getString(3));
                    venda.setValorTotalVenda(rs.getDouble(4));

                    listaDeVendas.add(venda);
                }
            } else {
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaDeVendas;
    }
    
}
