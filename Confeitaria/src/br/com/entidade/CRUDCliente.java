/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;

import br.com.controle.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gustavo.santos2023
 */
public class CRUDCliente extends DAO {

//    public void inserir(Cliente cliente) throws Exception {
//        try {
//            abrirBanco();
//            String query = "INSERT INTO alunos(codigo, nome, email) " + "values(null,?,?)";
//            pst = (PreparedStatement) con.prepareStatement(query);
//            pst.setString(1, cliente.getNome());
//            pst.setString(2, cliente.getEmail());
//            pst.execute();
//            fecharBanco();
//        } catch (Exception e) {
//            System.out.println("Erro " + e.getMessage());
//        }
//    }
    public void inserir(Cliente cliente) throws Exception {
        try {
            abrirBanco(); // Método para abrir a conexão com o banco
            String query = "INSERT INTO clientes (nome, email, telefone, endereco, data_nascimento, cpf) VALUES (?, ?, ?, ?, ?, ?)";
            String query2 = "select id from clientes where id = last_insert_id()";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEmail());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getEndereco());
            pst.setDate(5, new java.sql.Date(cliente.getDataNascimento().getTime()));
            pst.setString(6, cliente.getCpf());

            pst.executeUpdate(); // Executa o comando SQL

            pst = con.prepareStatement(query2);
            ResultSet tr = pst.executeQuery();
            tr.next();
            int id = tr.getInt("id");
            cliente.setId(id);
            System.out.println("\n" + id);
            System.out.println("\n" + cliente.getId());
            fecharBanco(); // Método para fechar a conexão com o banco
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            throw e; // Relança a exceção para tratamento externo
        }
    }

//    public Cliente ler(int id) throws Exception {
//        Cliente cliente = null; // Objeto para armazenar o cliente retornado
//        try {
//            abrirBanco(); // Método para abrir a conexão com o banco
//            String query = "SELECT * FROM clientes WHERE id = ?";
//            pst = (PreparedStatement) con.prepareStatement(query);
//            pst.setInt(1, id); // Define o ID do cliente a ser buscado
//
//            rs = pst.executeQuery(); // Executa a consulta SQL
//
//            if (rs.next()) {
//                cliente = new Cliente();
//                cliente.setId(rs.getInt("id"));
//                cliente.setNome(rs.getString("nome"));
//                cliente.setEmail(rs.getString("email"));
//                cliente.setTelefone(rs.getString("telefone"));
//                cliente.setEndereco(rs.getString("endereco"));
//                cliente.setDataNascimento(rs.getDate("data_nascimento"));
//                cliente.setCpf(rs.getString("cpf"));
//            } else {
//                System.out.println("Nenhum cliente encontrado com o ID informado.");
//            }
//
//            fecharBanco(); // Método para fechar a conexão com o banco
//        } catch (Exception e) {
//            System.out.println("Erro ao buscar cliente: " + e.getMessage());
//            throw e; // Relança a exceção para tratamento externo
//        }
//        return cliente; // Retorna o cliente encontrado ou null
//    }
    public ArrayList<Cliente> ler() throws Exception {
        ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
        try {
            abrirBanco();
            String query = "select * FROM clientes order by id";
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            Cliente cliente;
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setDataNascimento(rs.getDate("data_nascimento"));
                cliente.setCpf(rs.getString("cpf"));
                clienteList.add(cliente);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return clienteList;
    }

    public void atualizar(Cliente cliente) throws Exception {
        try {
            abrirBanco(); // Método para abrir a conexão com o banco
            String query = "UPDATE clientes SET nome = ?, email = ?, telefone = ?, endereco = ?, "
                    + "data_nascimento = ?, cpf = ? WHERE id = ?";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEmail());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getEndereco());
            pst.setDate(5, new java.sql.Date(cliente.getDataNascimento().getTime()));
            pst.setString(6, cliente.getCpf());
            System.out.println("" + cliente.getId());
            pst.setInt(7, cliente.getId()); // Identifica o cliente pelo ID

            int linhasAfetadas = pst.executeUpdate(); // Executa a atualização

            if (linhasAfetadas > 0) {
                System.out.println("Cliente atualizado com sucesso!");
            } else {
                System.out.println("Nenhum cliente encontrado com o ID informado.");
            }

            fecharBanco(); // Método para fechar a conexão com o banco
        } catch (Exception e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
            throw e; // Relança a exceção para tratamento externo
        }
    }

    public void deletar(String cpf) throws Exception {
        try {
            abrirBanco(); // Método para abrir a conexão com o banco
            String query = "DELETE FROM clientes WHERE cpf = ?";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, cpf); // Define o ID do cliente a ser excluído

            int linhasAfetadas = pst.executeUpdate(); // Executa o comando SQL

            if (linhasAfetadas > 0) {
                System.out.println("Cliente excluído com sucesso!");
            } else {
                System.out.println("Nenhum cliente encontrado com o ID informado.");
            }

            fecharBanco(); // Método para fechar a conexão com o banco
        } catch (Exception e) {
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
            throw e; // Relança a exceção para tratamento externo
        }
    }
}
