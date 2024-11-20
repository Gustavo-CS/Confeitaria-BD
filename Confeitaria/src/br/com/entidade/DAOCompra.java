/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;


import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Vinic
 */
public class DAOCompra extends DAO {

  
  public boolean registrarCompra(int clienteId, int produtoId, int quantidade) {
    try {
        abrirBanco(); 
        // Agora a consulta inclui a coluna quantidade
        String sql = "INSERT INTO compras (cliente_id, produto_id, quantidade) VALUES (?, ?, ?)";
        pst = con.prepareStatement(sql);
        
        pst.setInt(1, clienteId);   
        pst.setInt(2, produtoId);   
        pst.setInt(3, quantidade);  

        int linhasAfetadas = pst.executeUpdate(); // Executa o comando SQL

        return linhasAfetadas > 0; // Retorna verdadeiro se a inserção foi bem-sucedida
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
            clientes.nome AS Cliente,
            clientes.cpf AS CPF,
            produtos_confeitaria.nome AS Produto,
            compras.quantidade AS Quantidade,
            produtos_confeitaria.preco_final * compras.quantidade AS Total_Compra
        FROM 
            compras
        JOIN 
            clientes ON compras.cliente_id = clientes.id
        JOIN 
            produtos_confeitaria ON compras.produto_id = produtos_confeitaria.id;
    """;

    try {
        abrirBanco();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        while (rs.next()) {
            Object[] compra = new Object[5];  
            compra[0] = rs.getString("Cliente");  
            compra[1] = rs.getString("CPF");      
            compra[2] = rs.getString("Produto");  
            compra[3] = rs.getInt("Quantidade"); 
            compra[4] = formatoMoeda.format(rs.getDouble("Total_Compra")); 
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