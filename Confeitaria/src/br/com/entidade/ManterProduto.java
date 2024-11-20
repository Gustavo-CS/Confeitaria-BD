/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;

import br.com.controle.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author guilhermesouza.gomes
 */

public class ManterProduto extends DAO {

    // Método para inserir um novo produto
    public void inserir(Produto produto) throws Exception {
        try {
            abrirBanco(); // Método para abrir a conexão com o banco
            String query = "INSERT INTO produtos_confeitaria (nome, preco_final) VALUES (?, ?)";
            pst = con.prepareStatement(query);

            pst.setString(1, produto.getNome());
            pst.setDouble(2, produto.getPreco());

            pst.executeUpdate(); // Executa o comando SQL

            System.out.println("Produto inserido com sucesso!");
            fecharBanco(); // Método para fechar a conexão com o banco
        } catch (Exception e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
            throw e; // Relança a exceção para tratamento externo
        }
    }

    // Método para consultar todos os produtos
    public ArrayList<Produto> consultar() throws Exception {
        ArrayList<Produto> produtoList = new ArrayList<>();
        try {
            abrirBanco(); // Método para abrir a conexão com o banco
            String query = "SELECT id, nome, preco FROM produtos_confeitaria";
            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produtoList.add(produto);
            }

            fecharBanco(); // Método para fechar a conexão com o banco
        } catch (Exception e) {
            System.out.println("Erro ao consultar produtos: " + e.getMessage());
            throw e; // Relança a exceção para tratamento externo
        }
        return produtoList; // Retorna a lista de produtos encontrados
    }

    // Método para atualizar os dados de um produto
    public void atualizar(Produto produto) throws Exception {
        try {
            abrirBanco(); // Método para abrir a conexão com o banco
            String query = "UPDATE produtos_confeitaria SET nome = ?, preco = ? WHERE id = ?";
            pst = con.prepareStatement(query);

            pst.setString(1, produto.getNome());
            pst.setDouble(2, produto.getPreco());
            pst.setInt(4, produto.getId()); // Identifica o produto pelo ID
            int linhasAfetadas = pst.executeUpdate(); // Executa a atualização

            if (linhasAfetadas > 0) {
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID informado.");
            }

            fecharBanco(); // Método para fechar a conexão com o banco
        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
            throw e; // Relança a exceção para tratamento externo
        }
    }

    // Método para excluir um produto pelo ID
    public void excluir(int id) throws Exception {
        try {
            abrirBanco(); // Método para abrir a conexão com o banco
            String query = "DELETE FROM produtos_confeitaria WHERE id = ?";
            pst = con.prepareStatement(query);

            pst.setInt(1, id); // Define o ID do produto a ser excluído
            int linhasAfetadas = pst.executeUpdate(); // Executa o comando SQL

            if (linhasAfetadas > 0) {
                System.out.println("Produto excluído com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID informado.");
            }

            fecharBanco(); // Método para fechar a conexão com o banco
        } catch (Exception e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
            throw e; // Relança a exceção para tratamento externo
        }
    }
}
