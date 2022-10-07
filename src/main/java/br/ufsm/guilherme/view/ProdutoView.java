/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ufsm.guilherme.view;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import br.ufsm.guilherme.controller.ProdutoController;
import br.ufsm.guilherme.model.bean.Produto;

import javax.swing.table.DefaultTableModel;
import java.util.Collection;
import java.util.stream.Collectors;

public class ProdutoView extends javax.swing.JFrame {

    ProdutoController produtoController = new ProdutoController();
  
    public ProdutoView() {
        initComponents();
        DefaultTableModel modeloTabelaproduto = (DefaultTableModel) tabelaProduto.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        txtFieldDescricao = new JTextField();
        txtFieldQuantidade = new JTextField();
        jLabel4 = new JLabel();
        txtFieldPreco = new JTextField();
        btnCadastro = new JButton();
        btnAtualizar = new JButton();
        btnExcluir = new JButton();
        jScrollPane1 = new JScrollPane();
        tabelaProduto = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //---- jLabel1 ----
        jLabel1.setText("Cadastro de Produtos");

        //---- jLabel2 ----
        jLabel2.setText("Descri\u00e7\u00e3o:");

        //---- jLabel3 ----
        jLabel3.setText("Quantidade:");

        //---- txtFieldDescricao ----
        txtFieldDescricao.addActionListener(e -> txtFieldDescricaoActionPerformed(e));

        //---- jLabel4 ----
        jLabel4.setText("Pre\u00e7o:");

        //---- btnCadastro ----
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(e -> btnCadastroActionPerformed(e));

        //---- btnAtualizar ----
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(e -> btnAtualizarActionPerformed(e));

        //---- btnExcluir ----
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(e -> btnExcluirActionPerformed(e));

        //======== jScrollPane1 ========
        {

            //---- tabelaProduto ----
            tabelaProduto.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "Id", "Descri\u00e7\u00e3o", "Quantidade", "Pre\u00e7o"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, Integer.class, Double.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            jScrollPane1.setViewportView(tabelaProduto);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(btnCadastro)
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(jLabel1)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(btnAtualizar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnExcluir)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFieldDescricao, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFieldQuantidade, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFieldPreco, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26))))
                        .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel1)
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtFieldDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtFieldPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastro)
                        .addComponent(btnAtualizar)
                        .addComponent(btnExcluir))
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDescricaoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        //FIXME: id do produto está mockado
        produtoController.update(1, txtFieldDescricao.getText(),
                Integer.parseInt(txtFieldQuantidade.getText()),
                Double.parseDouble(txtFieldPreco.getText()));
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //FIXME: id do produto está mockado
        produtoController.delete(1);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        
        produtoController.create(
            txtFieldDescricao.getText(),
            Integer.parseInt(txtFieldQuantidade.getText()),
            Double.parseDouble(txtFieldPreco.getText()));
        
        limparCampos();
    }//GEN-LAST:event_btnCadastroActionPerformed

    public void limparCampos() {
        txtFieldDescricao.setText("");
        txtFieldQuantidade.setText("");
        txtFieldPreco.setText("");
        
        txtFieldDescricao.requestFocus();
    }
    
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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }
//System.out.println(96478057);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField txtFieldDescricao;
    private JTextField txtFieldQuantidade;
    private JLabel jLabel4;
    private JTextField txtFieldPreco;
    private JButton btnCadastro;
    private JButton btnAtualizar;
    private JButton btnExcluir;
    private JScrollPane jScrollPane1;
    private JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
