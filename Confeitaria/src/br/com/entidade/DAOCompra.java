/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;



import java.sql.SQLException;

/**
 *
 * @author Vinic
 */
public class DAOCompra extends DAO {

  
    public boolean registrarCompra(int clienteId, int produtoId) {
        try {
            abrirBanco(); // Abre conexao com o banco
            String sql = "INSERT INTO compras (cliente_id, produto_id) VALUES (?, ?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, clienteId);
            pst.setInt(2, produtoId);
            int linhasAfetadas = pst.executeUpdate(); // Executa o comando SQL

            return linhasAfetadas > 0; // Retorna verdadeiro se a inserção foi bem sucedida
        } catch (SQLException e) {
            System.out.println("Erro ao registrar compra: " + e.getMessage());
            return false;
        } finally {
            try {
                fecharBanco(); // Fecha conexão com o banco
            } catch (Exception e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}