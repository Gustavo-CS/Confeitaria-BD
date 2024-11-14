/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;

import br.com.controle.Cliente;
import java.sql.PreparedStatement;

/**
 *
 * @author gustavo.santos2023
 */
public class CRUDCliente extends DAO {
    public void inserir(Cliente cliente) throws Exception {
        try {
            abrirBanco();
            String query = "INSERT INTO alunos(codigo, nome, email) " +"values(null,?,?)";
            pst=(PreparedStatement) con.prepareStatement(query);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEmail());
            pst.execute();
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
