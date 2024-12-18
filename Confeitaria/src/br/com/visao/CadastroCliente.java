/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.Cliente;
import br.com.entidade.CRUDCliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.fiuza
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNomeCad = new javax.swing.JTextField();
        jTEnderecocad = new javax.swing.JTextField();
        jTcpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTdatadenascimento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTtelefoneCad = new javax.swing.JTextField();
        jBcadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
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
        setBackground(new java.awt.Color(255, 51, 255));

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
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Cadastro de Cliente:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");

        jNomeCad.setColumns(20);
        jNomeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeCadActionPerformed(evt);
            }
        });

        jTEnderecocad.setColumns(20);

        jTcpf.setColumns(20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Email:");

        jTemail.setColumns(20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Data de Nascimento:");

        jTdatadenascimento.setColumns(20);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Telefone:");

        jTtelefoneCad.setColumns(20);

        jBcadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jLabel9.setText("ex:(01/01/2001)");

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
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBcadastrar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTcpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdatadenascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7))
                            .addGap(279, 279, 279)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTtelefoneCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTEnderecocad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEnderecocad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtelefoneCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdatadenascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(jBcadastrar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeCadActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jNomeCadActionPerformed

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        // TODO add your handling code here:
        // Coletar os valores dos campos
        String nome = jNomeCad.getText();
        String endereco = jTEnderecocad.getText();
        String telefone = jTtelefoneCad.getText();
        String cpf = jTcpf.getText();
        String email = jTemail.getText();
        String dataNascimento = jTdatadenascimento.getText();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        if (!nome.isEmpty() && !endereco.isEmpty() && !telefone.isEmpty() && !cpf.isEmpty() && !email.isEmpty() && !dataNascimento.isEmpty()) {
            try {
                // Converter String para Date
                Date data = formato.parse(dataNascimento);
                // Criar objeto da classe Cliente
                Cliente cliente = new Cliente(nome, endereco, telefone, cpf, email, data);
                CRUDCliente c = new CRUDCliente();

                try {
                    if (c.inserir(cliente)) {
                        JOptionPane.showMessageDialog(null, "cliente cadastrado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "erro ao cadastrar cliente");
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "erro ao no sistema");
                }

            } catch (ParseException e2) {
                // Tratar erro de conversão
                JOptionPane.showMessageDialog(null, "data formatada errada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "preencha todos os campos");
        }

        // Limpar os campos após cadastro (opcional)
        jNomeCad.setText("");
        jTEnderecocad.setText("");
        jTcpf.setText("");
        jTemail.setText("");
        jTdatadenascimento.setText("");
        jTtelefoneCad.setText("");
    }//GEN-LAST:event_jBcadastrarActionPerformed

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

    private void jMIDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeletarProdutoActionPerformed
        // TODO add your handling code here:
        new TelaDeletarProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIDeletarProdutoActionPerformed

    private void jMIBuscarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarProdutosActionPerformed
        // TODO add your handling code here:
        new TelaReadProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIBuscarProdutosActionPerformed

    private void jMIAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAtualizarProdutoActionPerformed
        // TODO add your handling code here:
        new FormUpdateProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMIAtualizarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField jNomeCad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTEnderecocad;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTdatadenascimento;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTtelefoneCad;
    // End of variables declaration//GEN-END:variables
}
