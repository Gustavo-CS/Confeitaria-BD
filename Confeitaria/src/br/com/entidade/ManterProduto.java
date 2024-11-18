/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;

import br.com.controle.Produto;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author guilhermesouza.gomes
 */
import java.sql.*;

public class ManterProduto extends DAO  {

    private Connection connection;

    // Construtor que inicializa a conexão com o banco de dados
    public ManterProduto(Connection connection) {
        this.connection = connection;
    }

    // Método para inserir um novo produto na tabela
    public void inserirProduto(String nome, double precoPorGrama, double peso) throws SQLException {
        String sql = "INSERT INTO produtos_confeitaria (nome, preco_por_grama, peso) VALUES (?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, precoPorGrama);
            stmt.setDouble(3, peso);
            stmt.executeUpdate();
            System.out.println("Produto inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
            throw e;
        }
    }

    // Método para consultar todos os produtos
    public void consultarProdutos() throws SQLException {
        String sql = "SELECT id, nome, preco_por_grama, peso, preco_final FROM produtos_confeitaria";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double precoPorGrama = rs.getDouble("preco_por_grama");
                double peso = rs.getDouble("peso");
                double precoFinal = rs.getDouble("preco_final");
                
                System.out.printf("ID: %d | Nome: %s | Preço por grama: %.2f | Peso: %.2f | Preço Final: %.2f\n", 
                                  id, nome, precoPorGrama, peso, precoFinal);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar produtos: " + e.getMessage());
            throw e;
        }
    }

    // Método para atualizar o preço e o peso de um produto
    public void atualizarProduto(int id, String novoNome, double novoPrecoPorGrama, double novoPeso) throws SQLException {
        String sql = "UPDATE produtos_confeitaria SET nome = ?, preco_por_grama = ?, peso = ? WHERE id = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setDouble(2, novoPrecoPorGrama);
            stmt.setDouble(3, novoPeso);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            System.out.println("Produto atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
            throw e;
        }
    }

    // Método para excluir um produto pelo ID
    public void excluirProduto(int id) throws SQLException {
        String sql = "DELETE FROM produtos_confeitaria WHERE id = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Produto excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
            throw e;
        }
    }
}
