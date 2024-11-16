
import br.com.controle.Cliente;
import br.com.entidade.CRUDCliente;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        try {
            dataNascimento = sdf.parse("15/08/1990");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Criar um objeto Cliente
        Cliente cliente = new Cliente("João Silva", "Rua das Flores, 123", "123456789", "123.456.789-00", "joao.silva@email.com", dataNascimento);

        CRUDCliente c = new CRUDCliente();

//        try {
//            c.deletar(6);
//        } catch (Exception e) {
//            System.out.println("Erro ao buscar cliente: " + e.getMessage());
//        }
    }
}
