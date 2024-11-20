/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.entidade.CRUDCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.fiuza
 */
public class TeladeDeletarCliente extends javax.swing.JFrame {

    /**
     * Creates new form TeladeDeletar
     */
    public TeladeDeletarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTCPF = new javax.swing.JTextField();
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

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confeitaria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Digite o CPF da conta a ser deletada:");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Essa ação é irreversivel, depois de deletada não será mais possivel a recuperação da conta !!!");

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Deletar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("CPF:");

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jButton1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cpf = jTCPF.getText();
        CRUDCliente c = new CRUDCliente();
        if (!cpf.isEmpty()) {
            try {
                if (c.deletar(jTCPF.getText())) {
                    JOptionPane.showMessageDialog(null, "cliente deletado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "erro ao deletar cliente");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erro ao no sistema");
            }
        } else {
            JOptionPane.showMessageDialog(null, "preencha o cpf do cliente a ser deletado");
        }

        jTCPF.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TeladeDeletarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeDeletarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeDeletarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeDeletarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeDeletarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField jTCPF;
    // End of variables declaration//GEN-END:variables
}
