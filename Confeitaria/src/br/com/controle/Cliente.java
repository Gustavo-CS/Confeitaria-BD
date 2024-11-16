/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.util.Date;

/**
 *
 * @author gustavo.santos2023
 */

public class Cliente {

    private int id;                     // Identificador único do cliente
    private String nome;                // Nome completo do cliente
    private String email;               // E-mail do cliente
    private String telefone;            // Número de telefone do cliente
    private String endereco;            // Endereço completo do cliente
    private Date dataNascimento;        // Data de nascimento do cliente
    private String cpf;                 // CPF do cliente

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String telefone, String cpf, String email, Date dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método toString para exibir os dados do cliente de forma amigável
    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', email='" + email + "', telefone='" + telefone
                + "', endereco='" + endereco + "', dataNascimento=" + dataNascimento + ", cpf='" + cpf
                + "', dataCadastro=" + "'}";
    }
}
