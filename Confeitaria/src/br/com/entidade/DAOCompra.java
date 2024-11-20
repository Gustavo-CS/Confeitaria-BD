/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;


import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Vinic
 */
public class DAOCompra extends DAO {

  
    public boolean registrarCompra(int clienteId, int produtoId) {
        try {
            abrirBanco(); 
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
                fecharBanco(); 
            } catch (Exception e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
public List<Object[]> lerCompra() {
    List<Object[]> listaCompras = new ArrayList<>();
    String sql = """
        SELECT 
            clientes.nome AS cliente_nome, 
            clientes.cpf AS cliente_cpf, 
            produtos_confeitaria.nome AS produto_nome, 
            produtos_confeitaria.preco_final AS produto_preco
        FROM compras
        JOIN clientes ON compras.cliente_id = clientes.id
        JOIN produtos_confeitaria ON compras.produto_id = produtos_confeitaria.id
    """;

    try {
        abrirBanco();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        while (rs.next()) {
            Object[] compra = new Object[4];
            compra[0] = rs.getString("cliente_nome");  
            compra[1] = rs.getString("cliente_cpf");   
            compra[2] = rs.getString("produto_nome");  
            compra[3] = rs.getDouble("produto_preco"); 
            listaCompras.add(compra);
        }
    } catch (SQLException e) {
        System.out.println("Erro ao ler compras: " + e.getMessage());
    } finally {
        try {
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }
    return listaCompras;
}
}