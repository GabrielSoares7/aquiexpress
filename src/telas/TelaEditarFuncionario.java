package telas;

import codigos.AcaoTela;
import dao.FuncionarioDAO;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import tabelas.Funcionario;

public class TelaEditarFuncionario extends javax.swing.JFrame implements AcaoTela{
    Funcionario funcionario;

    public TelaEditarFuncionario(Funcionario funcionario) {
        initComponents();
        this.funcionario = funcionario;
        
        tfNome.setText(funcionario.getNome());
        tfRg.setText(funcionario.getRg());
        tfCpf.setText(funcionario.getCpf());
        if(funcionario.getTurno() == 1)
            radioMatutino.setSelected(true);
        else
            radio.setSelected(false);
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        lCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfTurno = new javax.swing.JLabel();
        radioMatutino = new javax.swing.JRadioButton();
        radio = new javax.swing.JRadioButton();
        btTelefonesCadastrados = new javax.swing.JButton();
        btEmailsCadastrados = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAlteraSenha = new javax.swing.JButton();
        lbEditarCadastro = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(24, 117, 209));
        jPanel1.setInheritsPopupMenu(true);

        lNome.setForeground(new java.awt.Color(254, 254, 254));
        lNome.setText("Nome:");

        lRg.setForeground(new java.awt.Color(254, 254, 254));
        lRg.setText("RG:");

        lCpf.setForeground(new java.awt.Color(249, 239, 239));
        lCpf.setText("CPF:");

        tfTurno.setForeground(new java.awt.Color(249, 239, 239));
        tfTurno.setText("Turno:");

        radioGrupo.add(radioMatutino);
        radioMatutino.setForeground(new java.awt.Color(247, 233, 233));
        radioMatutino.setText("Matutino");

        radioGrupo.add(radio);
        radio.setForeground(new java.awt.Color(254, 254, 254));
        radio.setText("Vespertino");

        btTelefonesCadastrados.setText("Telefones Cadastrados ");
        btTelefonesCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelefonesCadastradosActionPerformed(evt);
            }
        });

        btEmailsCadastrados.setText("Emails Cadastrados");
        btEmailsCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmailsCadastradosActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(245, 127, 23));
        btVoltar.setForeground(new java.awt.Color(254, 254, 254));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(245, 127, 23));
        btSalvar.setForeground(new java.awt.Color(254, 254, 254));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAlteraSenha.setText("Alterar senha");
        btAlteraSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlteraSenhaActionPerformed(evt);
            }
        });

        lbEditarCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbEditarCadastro.setForeground(new java.awt.Color(254, 254, 254));
        lbEditarCadastro.setText("Editar Cadastro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEditarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lRg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lNome)
                                    .addComponent(lCpf)
                                    .addComponent(tfTurno))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioMatutino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio))
                                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btTelefonesCadastrados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEmailsCadastrados))
                            .addComponent(btAlteraSenha))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEditarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTurno)
                    .addComponent(radioMatutino)
                    .addComponent(radio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTelefonesCadastrados)
                    .addComponent(btEmailsCadastrados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlteraSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTelefonesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelefonesCadastradosActionPerformed
        TelaTelefone telaTelefone = new TelaTelefone(funcionario.getId(), this);
        telaTelefone.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btTelefonesCadastradosActionPerformed

    private void btAlteraSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraSenhaActionPerformed
        JPasswordField senha = new JPasswordField();
        JOptionPane.showMessageDialog(null, senha, "Digite a senha anterior", 1);
        if(senha.getText().equals(funcionario.getSenha())) {
            senha.setText("");
            JOptionPane.showMessageDialog(null, senha, "Digite a nova senha", 1);
            funcionario.setSenha(senha.getText());
        }
        else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
    }//GEN-LAST:event_btAlteraSenhaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
       // if(tfNome.getText().isEmpty())
            funcionario.setNome(tfNome.getText());
       // if(tfRg.getText().isEmpty())
            funcionario.setRg(tfRg.getText());
        //if(tfCpf.getText().isEmpty())
            funcionario.setCpf(tfCpf.getText());
        if(radioMatutino.isSelected())
            funcionario.setTurno(1);
        else
            funcionario.setTurno(2);
        funcionarioDAO.atualizarFuncionario(funcionario);
        setVisible(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEmailsCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmailsCadastradosActionPerformed
        TelaEmail verEmail = new TelaEmail(funcionario.getId(), this);
        verEmail.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btEmailsCadastradosActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    public static void configurarLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlteraSenha;
    private javax.swing.JButton btEmailsCadastrados;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btTelefonesCadastrados;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lRg;
    private javax.swing.JLabel lbEditarCadastro;
    private javax.swing.JRadioButton radio;
    private javax.swing.ButtonGroup radioGrupo;
    private javax.swing.JRadioButton radioMatutino;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRg;
    private javax.swing.JLabel tfTurno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void voltar() {
        setVisible(true);
    }
}
