/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.Cliente;
import br.com.controle.Produto;
import br.com.entidade.CRUDCliente;
import br.com.entidade.ManterProduto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import br.com.entidade.DAOCompra;


/**
 *
 * @author Vinic
 */
public class TelaComprarProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaComprarProduto
     */
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    public TelaComprarProduto() {
        initComponents();
        carregarClientes();
        carregarProdutos();
    }
    private void carregarClientes() {
        try {
            CRUDCliente crudCliente = new CRUDCliente();
            clientes = crudCliente.lerTodos(); 
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Cliente cliente : clientes) {
                model.addElement(cliente.getNome()); // adiciona o nome do cliente ao modelo do JComboBox
            }
            jCCliente.setModel(model); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar clientes: " + e.getMessage());
        }
    }
      private void carregarProdutos() {
        try {
            ManterProduto manterProduto = new ManterProduto();
            produtos = manterProduto.consultar(); // Obtém a lista de produtos do banco
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Produto produto : produtos) {
                model.addElement(produto.getNome()); // Adiciona o nome do produto ao modelo do JComboBox
            }
            jCProduto.setModel(model); // Atualiza o JComboBox2 com os produtos
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar produtos: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCCliente = new javax.swing.JComboBox<>();
        jCProduto = new javax.swing.JComboBox<>();
        jBComprar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBComprar.setText("COMPRAR");
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jBComprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jCProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jBComprar)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
        // TODO add your handling code here:
         int indiceCliente = jCCliente.getSelectedIndex(); 
    int indiceProduto = jCProduto.getSelectedIndex(); 

    // Obtém os objetos Cliente e Produto selecionados
    Cliente clienteSelecionado = clientes.get(indiceCliente);
    Produto produtoSelecionado = produtos.get(indiceProduto);

    // Captura a quantidade inserida pelo usuário
    int quantidade = Integer.parseInt(jTQuantidade.getText());

    // Registro da compra no banco
    DAOCompra daoCompra = new DAOCompra();
    boolean sucesso = daoCompra.registrarCompra(clienteSelecionado.getId(), produtoSelecionado.getId(), quantidade);

    // Exibe mensagens de feedback para o usuário
    if (sucesso) {
        JOptionPane.showMessageDialog(this, 
            "Compra realizada com sucesso!\n" +
            "Cliente: " + clienteSelecionado.getNome() + "\n" +
            "Produto: " + produtoSelecionado.getNome() + "\n" +
            "Quantidade: " + quantidade); 
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao registrar a compra. Tente novamente.");
    }
    }//GEN-LAST:event_jBComprarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaComprarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComprarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComprarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComprarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComprarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComprar;
    private javax.swing.JComboBox<String> jCCliente;
    private javax.swing.JComboBox<String> jCProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTQuantidade;
    // End of variables declaration//GEN-END:variables
}
