
import br.com.controle.Cliente;
import br.com.entidade.CRUDCliente;
import br.com.entidade.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 55619
 */
public class Teste {

    public static void main(String[] args)  {
        // Criar uma data de nascimento
        
        DAO d = new DAO();
        try {
            d.abrirBanco();
        } catch(SQLException e) {//tratamento de erro de SQL
            System.out.println(e);
       }
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date dataNascimento = null;
//        try {
//            dataNascimento = sdf.parse("15/08/1990");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Criar um objeto Cliente
//        Cliente cliente = new Cliente("João Silva", "Rua das Flores, 123", "123456789", "123.456.789-00", "joao.silva@email.com", dataNascimento);
//
//        CRUDCliente c = new CRUDCliente();

//        try {
//            c.deletar(6);
//        } catch (Exception e) {
//            System.out.println("Erro ao buscar cliente: " + e.getMessage());
//        }
    }
}
