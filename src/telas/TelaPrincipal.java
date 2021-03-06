package telas;

import outros.AcaoTela;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class TelaPrincipal extends JFrame implements AcaoTela{

    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipoUser = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        tfLogin = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        radioFun = new javax.swing.JRadioButton();
        radioCliente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastros");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(24, 117, 209));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo1.png"))); // NOI18N

        lbLogin.setForeground(new java.awt.Color(254, 254, 254));
        lbLogin.setText("Login");

        lbSenha.setForeground(new java.awt.Color(255, 250, 250));
        lbSenha.setText("Senha");

        tfSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));

        btLogin.setBackground(new java.awt.Color(245, 127, 23));
        btLogin.setForeground(new java.awt.Color(254, 254, 254));
        btLogin.setText("Acessar");
        btLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btCadastro.setBackground(new java.awt.Color(245, 127, 23));
        btCadastro.setForeground(new java.awt.Color(254, 254, 254));
        btCadastro.setText("Cadastrar");
        btCadastro.setBorder(null);
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        tfLogin.setText("gabrielfun");
        tfLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginActionPerformed(evt);
            }
        });
        tfLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfLoginKeyPressed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(24, 117, 209));
        btSair.setForeground(new java.awt.Color(245, 127, 23));
        btSair.setText("Fechar");
        btSair.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        radioFun.setBackground(new java.awt.Color(24, 117, 209));
        grupoTipoUser.add(radioFun);
        radioFun.setForeground(new java.awt.Color(254, 254, 254));
        radioFun.setSelected(true);
        radioFun.setText("Funcionário");

        radioCliente.setBackground(new java.awt.Color(24, 117, 209));
        grupoTipoUser.add(radioCliente);
        radioCliente.setForeground(new java.awt.Color(254, 254, 254));
        radioCliente.setText("Cliente");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbSenha)
                            .addComponent(lbLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(radioFun)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioCliente))
                                .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(16, 16, 16))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(lbLogo)
                .addGap(1, 1, 1)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioFun)
                    .addComponent(radioCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 390, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed

            String senha = "123";
            JPasswordField entradaSenha = new JPasswordField();
            JOptionPane.showMessageDialog(null, entradaSenha, "Administrador, digite a senha!", 1);
            String cmp = entradaSenha.getText();
            if(cmp.equals(senha)) {
                if(radioFun.isSelected()) {
                    TelaCadastroFuncionario cadastroFuncionario 
                            = new TelaCadastroFuncionario(this);
                    setVisible(false);
                }
                else {
                    TelaCadastroCliente telaCadastroCliente =
                        new TelaCadastroCliente();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Acesso Negado!!!", "Alerta", 0);
            }
        
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        if(radioFun.isSelected()) {
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            if(!tfLogin.getText().isEmpty()) {
                int id = funcionarioDAO.retornarIdLogin(tfLogin.getText(), tfSenha.getText());
                if(id != 0) {
                    TelaFuncionario telaFuncionario = new TelaFuncionario(id, this);
                    telaFuncionario.setVisible(true);
                    setVisible(false);
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Digite o login!");
        }
        else {
            ClienteDAO clienteDAO = new ClienteDAO();
            if(!tfLogin.getText().isEmpty()) {
                int id = clienteDAO.retornarIdLogin(tfLogin.getText(), tfSenha.getText());
                if(id != 0) {
                    TelaCliente telaCliente = new TelaCliente(id, this);
                    telaCliente.setVisible(true);
                    setVisible(false);
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Digite o login!");
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void tfLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            btLoginActionPerformed(null);
    }//GEN-LAST:event_tfLoginKeyPressed

    private void tfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLoginActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup grupoTipoUser;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JRadioButton radioCliente;
    private javax.swing.JRadioButton radioFun;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables

    @Override
    public void voltar() {
        setVisible(true);
    }
}
