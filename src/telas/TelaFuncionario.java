package telas;

import codigos.AcaoTela;
import dao.FuncionarioDAO;
import tabelas.Funcionario;

public class TelaFuncionario extends javax.swing.JFrame {

    Funcionario funcionario;
    AcaoTela acaoTela;
    
    public TelaFuncionario(int id, AcaoTela acaoTela) {
        configurarLookAndFeel();
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionario = funcionarioDAO.carregarInfo(id);
        if(funcionario == null)
            setVisible(false);
        lbBoasVindas.setText("Bem-vindo(a) " + funcionario.getNome() + "!");
        
        this.acaoTela = acaoTela; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCadCliente = new javax.swing.JButton();
        lbBoasVindas = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itemCadFun = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemEdit = new javax.swing.JMenuItem();
        itemDel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        btCadCliente.setText("Cadastrar cliente");
        btCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClienteActionPerformed(evt);
            }
        });

        lbBoasVindas.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbBoasVindas.setForeground(new java.awt.Color(24, 117, 209));
        lbBoasVindas.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBoasVindas)
                    .addComponent(btCadCliente))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBoasVindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadCliente)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        menuFile.setText("File");

        itemCadFun.setText("Cadastrar Funcionário");
        itemCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadFunActionPerformed(evt);
            }
        });
        menuFile.add(itemCadFun);

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuFile.add(itemSair);

        menuBar.add(menuFile);

        menuEditar.setText("Editar");

        itemEdit.setText("Editar dados");
        itemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditActionPerformed(evt);
            }
        });
        menuEditar.add(itemEdit);

        itemDel.setText("Deletar");
        itemDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDelActionPerformed(evt);
            }
        });
        menuEditar.add(itemDel);

        menuBar.add(menuEditar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        setVisible(false);
        acaoTela.voltar();
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadFunActionPerformed
        TelaCadastroFuncionario telaCadastro = new TelaCadastroFuncionario();
        telaCadastro.btSair.setVisible(false);
    }//GEN-LAST:event_itemCadFunActionPerformed

    private void itemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditActionPerformed
        TelaEditarFuncionario telaEditarFuncionario 
                = new TelaEditarFuncionario(funcionario);
        telaEditarFuncionario.setVisible(true);
    }//GEN-LAST:event_itemEditActionPerformed

    private void itemDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDelActionPerformed
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.deletarFuncionario(funcionario.getId()
        );
        setVisible(false);
    }//GEN-LAST:event_itemDelActionPerformed

    private void btCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClienteActionPerformed
        TelaCadastroCliente cadCliente = new TelaCadastroCliente();
        cadCliente.setVisible(true);
    }//GEN-LAST:event_btCadClienteActionPerformed

    public static void configurarLookAndFeel() {
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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCliente;
    private javax.swing.JMenuItem itemCadFun;
    private javax.swing.JMenuItem itemDel;
    private javax.swing.JMenuItem itemEdit;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBoasVindas;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuFile;
    // End of variables declaration//GEN-END:variables
}
