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
        jCProduto.setModel(model); // Atualiza o JComboBox com os produtos
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMICadastrarCliente = new javax.swing.JMenuItem();
        jMIAtualizarCliente = new javax.swing.JMenuItem();
        jMIBuscarClientes = new javax.swing.JMenuItem();
        jMIDeletarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMICadastrarProduto = new javax.swing.JMenuItem();
        jMIAtualizarProduto = new javax.swing.JMenuItem();
        jMIBuscarProdutos = new javax.swing.JMenuItem();
        jMIDeletarProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMIComprar = new javax.swing.JMenuItem();
        jMIBuscarCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBComprar.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jBComprar.setText("COMPRAR");
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade:");

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 54)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confeitaria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );

        jLabel3.setText("Clientes:");

        jLabel4.setText("Produtos:");

        jMenu1.setText("Clientes");

        jMICadastrarCliente.setText("Cadastrar cliente");
        jMICadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMICadastrarCliente);

        jMIAtualizarCliente.setText("Atualizar cliente");
        jMIAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAtualizarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMIAtualizarCliente);

        jMIBuscarClientes.setText("Buscar clientes");
        jMIBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuscarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMIBuscarClientes);

        jMIDeletarCliente.setText("Deletar cliente");
        jMIDeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeletarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMIDeletarCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Produtos");

        jMICadastrarProduto.setText("Cadastrar produto");
        jMICadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMICadastrarProduto);

        jMIAtualizarProduto.setText("Atualizar produto");
        jMIAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAtualizarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMIAtualizarProduto);

        jMIBuscarProdutos.setText("Buscar produtos");
        jMIBuscarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuscarProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(jMIBuscarProdutos);

        jMIDeletarProduto.setText("Deletar produto");
        jMIDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeletarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMIDeletarProduto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Compras");

        jMIComprar.setText("Comprar");
        jMIComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIComprarActionPerformed(evt);
            }
        });
        jMenu3.add(jMIComprar);

        jMIBuscarCompras.setText("Buscar compras");
        jMIBuscarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuscarComprasActionPerformed(evt);
            }
        });
        jMenu3.add(jMIBuscarCompras);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jCProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(63, 63, 63)
                .addComponent(jBComprar)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
        // TODO add your handling code here:
    int indiceCliente = jCCliente.getSelectedIndex(); 
int indiceProduto = jCProduto.getSelectedIndex(); 

// Verifica se um cliente foi selecionado
if (indiceCliente < 0) {
    JOptionPane.showMessageDialog(this, "Por favor, selecione um cliente.");
    return; // Interrompe a execução se o cliente não for selecionado
}

// Verifica se um produto foi selecionado
if (indiceProduto < 0) {
    JOptionPane.showMessageDialog(this, "Por favor, selecione um produto.");
    return; // Interrompe a execução se o produto não for selecionado
}

// Obtém os objetos Cliente e Produto selecionados
Cliente clienteSelecionado = clientes.get(indiceCliente);
Produto produtoSelecionado = produtos.get(indiceProduto);

// Captura a quantidade inserida pelo usuário e verifica se é válida
int quantidade = 1;
try {
    quantidade = Integer.parseInt(jTQuantidade.getText());
    if (quantidade <= 0) {
        throw new NumberFormatException("A quantidade deve ser maior que zero.");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, insira uma quantidade válida.");
    return; // Interrompe a execução se a quantidade for inválida
}

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

    private void jMICadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarClienteActionPerformed
        // TODO add your handling code here:
        new CadastroCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMICadastrarClienteActionPerformed

    private void jMIAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAtualizarClienteActionPerformed
        // TODO add your handling code here:
        new CadastroClienteEditar().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIAtualizarClienteActionPerformed

    private void jMIBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarClientesActionPerformed
        // TODO add your handling code here:
        new TelaReadCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIBuscarClientesActionPerformed

    private void jMIDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeletarClienteActionPerformed
        // TODO add your handling code here:
        new TeladeDeletarCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIDeletarClienteActionPerformed

    private void jMICadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarProdutoActionPerformed
        // TODO add your handling code here:
        new FormProdutoCadastro().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMICadastrarProdutoActionPerformed

    private void jMIAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAtualizarProdutoActionPerformed
        // TODO add your handling code here:
        new FormUpdateProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIAtualizarProdutoActionPerformed

    private void jMIBuscarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarProdutosActionPerformed
        // TODO add your handling code here:
        new TelaReadProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIBuscarProdutosActionPerformed

    private void jMIDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeletarProdutoActionPerformed
        // TODO add your handling code here:
        new TelaDeletarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIDeletarProdutoActionPerformed

    private void jMIComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIComprarActionPerformed
        // TODO add your handling code here:
        new TelaComprarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIComprarActionPerformed

    private void jMIBuscarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarComprasActionPerformed
        // TODO add your handling code here:
        new LerCompra().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIBuscarComprasActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMIAtualizarCliente;
    private javax.swing.JMenuItem jMIAtualizarProduto;
    private javax.swing.JMenuItem jMIBuscarClientes;
    private javax.swing.JMenuItem jMIBuscarCompras;
    private javax.swing.JMenuItem jMIBuscarProdutos;
    private javax.swing.JMenuItem jMICadastrarCliente;
    private javax.swing.JMenuItem jMICadastrarProduto;
    private javax.swing.JMenuItem jMIComprar;
    private javax.swing.JMenuItem jMIDeletarCliente;
    private javax.swing.JMenuItem jMIDeletarProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTQuantidade;
    // End of variables declaration//GEN-END:variables
}
