/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadosenac.dao;

import static com.mycompany.supermercadosenac.dao.VendaDAO.login;
import static com.mycompany.supermercadosenac.dao.VendaDAO.senha;
import static com.mycompany.supermercadosenac.dao.VendaDAO.url;
import com.mycompany.supermercadosenac.model.Relatorio;
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
public class RelatorioDAO {

    public static boolean efetuarRelatorio(Relatorio objRelatorio) {
                boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Relatorio (IdVenda,IdProduto, QtdProduto, ValorProduto) VALUES (?,?, ?, ?);", Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setInt(1, objRelatorio.getIdVenda());
            comandoSQL.setInt(2, objRelatorio.getIdProduto());
            comandoSQL.setInt(3, objRelatorio.getQtdProduto());
            comandoSQL.setDouble(4, objRelatorio.getPrecoProduto());

            int rows = comandoSQL.executeUpdate();
            if (rows > 0) {
                retorno = true;

                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objRelatorio.getIdRelatorio(rs.getInt(1));
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
    
}
