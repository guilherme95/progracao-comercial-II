package br.ufsm.guilherme.view;

import br.ufsm.guilherme.controller.CategoriaController;
import br.ufsm.guilherme.controller.ProdutoController;
import br.ufsm.guilherme.model.bean.Categoria;
import br.ufsm.guilherme.model.bean.Produto;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ProdutoView extends javax.swing.JFrame {

    ProdutoController produtoController = new ProdutoController();
    CategoriaController categoriaController = new CategoriaController();
  
    public ProdutoView() {
        initComponents();
        this.btnGroupBusca.add(this.radioBtnCategoria);
        this.btnGroupBusca.add(this.radioBtnProduto);
        DefaultTableModel modeloTabelaproduto = (DefaultTableModel) tabelaProduto.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupBusca = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldDescricao = new javax.swing.JTextField();
        txtFieldQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldPreco = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        radioBtnProduto = new javax.swing.JRadioButton();
        radioBtnCategoria = new javax.swing.JRadioButton();
        txtFieldBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cadastro de Produtos");

        jLabel2.setText("Descri????o:");

        jLabel3.setText("Quantidade:");

        txtFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDescricaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Pre??o:");

        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descri????o", "Quantidade", "Pre??o", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        comboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel6.setText("Categoria:");

        radioBtnProduto.setText("Descri????o Produto");

        radioBtnCategoria.setText("Categoria");

        jLabel7.setText("Buscar por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBtnProduto)
                                .addGap(34, 34, 34)
                                .addComponent(radioBtnCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(txtFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastro)
                                .addGap(46, 46, 46)
                                .addComponent(btnAtualizar)
                                .addGap(62, 62, 62)
                                .addComponent(btnExcluir)
                                .addGap(192, 192, 192))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxCategoria, 0, 206, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFieldDescricao)))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnCategoria)
                    .addComponent(radioBtnProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getListaProduto() {
        DefaultTableModel modeloTabelaProduto = (DefaultTableModel) this.tabelaProduto.getModel();
        modeloTabelaProduto.setNumRows(0);
        
        for (Produto produto : produtoController.read()) {
            modeloTabelaProduto.addRow(
                new Object[]{
                    produto.getIdProduto(),
                    produto.getDescricao(),
                    produto.getQuantidade(),
                    produto.getPreco(), 
                    produto.getCategoria().getDescricao()
                }
            );
        }
    }

    private void popularComboBoxCategoria() {
        for (Categoria categoria : categoriaController.read()) {
            this.comboBoxCategoria.addItem(categoria);
        }
    }
    
    private void txtFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDescricaoActionPerformed
        
    }//GEN-LAST:event_txtFieldDescricaoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        if(
            comboBoxCategoria.getSelectedItem() != null 
            && !txtFieldDescricao.getText().equals("")
            && !txtFieldPreco.getText().equals("")
            && !txtFieldQuantidade.getText().equals("")
        ) {
            
            Categoria categoria = (Categoria) comboBoxCategoria.getSelectedItem();
            
            if(
                produtoController.update(
                    (int) this.tabelaProduto.getValueAt(this.tabelaProduto.getSelectedRow(), 0), 
                    txtFieldDescricao.getText(),
                    Integer.parseInt(txtFieldQuantidade.getText()),
                    Double.parseDouble(txtFieldPreco.getText()),
                    categoria
                )
            ){
                JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!", "Info", JOptionPane.INFORMATION_MESSAGE);            
                this.limparCampos();
                this.getListaProduto();  
            } else {
                JOptionPane.showMessageDialog(this, "N??o foi poss??vel atualizar produto", "Erro", JOptionPane.ERROR_MESSAGE);
            }            
        }      
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(this.tabelaProduto.getSelectedRow() != -1) {
            if(
                produtoController.delete((int) this.tabelaProduto.getValueAt(this.tabelaProduto.getSelectedRow(), 0))
            ) {
                JOptionPane.showMessageDialog(this, "Produto exclu??do com sucesso!", "Info", JOptionPane.INFORMATION_MESSAGE);            
            }else{
                JOptionPane.showMessageDialog(this, "N??o foi poss??vel excluir produto!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
       this.limparCampos();
       this.getListaProduto();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        
        if(
            comboBoxCategoria.getSelectedItem() != null 
            && !txtFieldDescricao.getText().equals("")
            && !txtFieldPreco.getText().equals("")
            && !txtFieldQuantidade.getText().equals("")
        ) {
        
            Categoria categoria = (Categoria) comboBoxCategoria.getSelectedItem();
            
            if(
                produtoController.create(
                    txtFieldDescricao.getText(),
                    Integer.parseInt(txtFieldQuantidade.getText()),
                    Double.parseDouble(txtFieldPreco.getText()), 
                    categoria
                )
            ){
                JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!", "Info", JOptionPane.INFORMATION_MESSAGE);
                this.limparCampos();
                this.getListaProduto();
            }else {
                JOptionPane.showMessageDialog(this, "N??o foi poss??vel salvar produto", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        if(this.tabelaProduto.getSelectedRow() != -1) {
            txtFieldDescricao.setText(this.tabelaProduto.getValueAt(this.tabelaProduto.getSelectedRow(), 1).toString());
            txtFieldQuantidade.setText(this.tabelaProduto.getValueAt(this.tabelaProduto.getSelectedRow(), 2).toString());
            txtFieldPreco.setText(this.tabelaProduto.getValueAt(this.tabelaProduto.getSelectedRow(), 3).toString());
            String categoriaSelecionada = (String) this.tabelaProduto.getValueAt(this.tabelaProduto.getSelectedRow(), 4);
            for(int i=0; i<this.comboBoxCategoria.getItemCount(); i++) {
                Categoria categoria = (Categoria) this.comboBoxCategoria.getItemAt(i);
                if(categoria.getDescricao().equals(categoriaSelecionada)){
                    this.comboBoxCategoria.setSelectedIndex(i);
                }
            }
        }
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed

    }//GEN-LAST:event_comboBoxCategoriaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getListaProduto();
        this.popularComboBoxCategoria();
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modeloTabelaProduto = (DefaultTableModel) this.tabelaProduto.getModel();
        modeloTabelaProduto.setNumRows(0);
        
        Collection<Produto> produtos = new ArrayList();
        
        if(this.radioBtnProduto.isSelected()){
            produtos = produtoController.listarProdutoPorDescricao(this.txtFieldBusca.getText());
        }else if(this.radioBtnCategoria.isSelected()) {
            produtos = produtoController.listarCategoriaPorDescricao(this.txtFieldBusca.getText());
        }
        
        for (Produto produto : produtos) {
            modeloTabelaProduto.addRow(
                new Object[]{
                    produto.getIdProduto(),
                    produto.getDescricao(),
                    produto.getQuantidade(),
                    produto.getPreco(), 
                    produto.getCategoria().getDescricao()
                }
            );
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void limparCampos() {
        txtFieldDescricao.setText("");
        txtFieldQuantidade.setText("");
        txtFieldPreco.setText("");
        
        comboBoxCategoria.setSelectedIndex(-1);
        
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
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGroupBusca;
    private javax.swing.JComboBox<Object> comboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBtnCategoria;
    private javax.swing.JRadioButton radioBtnProduto;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtFieldBusca;
    private javax.swing.JTextField txtFieldDescricao;
    private javax.swing.JTextField txtFieldPreco;
    private javax.swing.JTextField txtFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
