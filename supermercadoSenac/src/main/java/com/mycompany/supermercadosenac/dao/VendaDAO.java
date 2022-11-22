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

/**
 *
 * @author KINOO
 */
public class VendaDAO {
    
    public static String url = "jdbc:mysql://localhost:3306/supersenac";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean finalizarCompra(Venda obj) {
        
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Venda (id,fk_idCliente, valor, dataVenda) VALUES (?, ?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, obj.getIdVenda());
            comandoSQL.setInt(2, obj.getIdCliente());
            comandoSQL.setDouble(3, obj.getValorTotalVenda());
            comandoSQL.setString(4, obj.getDataVenda());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs .next()) {
                    int idVenda = rs.getInt(1);
                    for (ItemVenda item : obj.getListaItens()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO ItemVenda (idVenda,idProduto, nomeProduto, qtdProduto,precoProduto) VALUES (?,?,?,?,?)");
                        comandoSQLItem.setInt(1, idVenda);
                        comandoSQLItem.setInt(2, item.getIdProduto());
                        comandoSQLItem.setString(3, item.getNomeProduto());
                        comandoSQLItem.setInt(4, item.getQtdProduto());
                        comandoSQLItem.setDouble(5,item.getPrecoProduto());

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if(linhasAfetadasItem>0){
                            retorno = true;
                        }
                    }
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return retorno;
        
    }
    
}
