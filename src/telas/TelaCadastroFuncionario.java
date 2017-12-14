package telas;

import codigos.AcaoTela;
import dao.FuncionarioDAO;
import javax.swing.JOptionPane;
import tabelas.Funcionario;

public class TelaCadastroFuncionario extends javax.swing.JFrame {

    AcaoTela acaoTela;
    
    public TelaCadastroFuncionario(AcaoTela acaoTela) {
        this.acaoTela = acaoTela;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public TelaCadastroFuncionario() {
        this.acaoTela = null;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turnoGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tFNome = new javax.swing.JTextField();
        tFRg = new javax.swing.JFormattedTextField();
        tFCpf = new javax.swing.JFormattedTextField();
        lBCpf = new javax.swing.JLabel();
        lBTurno = new javax.swing.JLabel();
        lBNome = new javax.swing.JLabel();
        lBRg = new javax.swing.JLabel();
        radioTurnoVes = new javax.swing.JRadioButton();
        radioTurnoMat = new javax.swing.JRadioButton();
        btCadastro = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbLogin1 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Funciónario");
        setBackground(new java.awt.Color(24, 117, 209));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 117, 209));
        jPanel1.setToolTipText("");
        jPanel1.setName("Cadastro Funcionarios"); // NOI18N

        tFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFNomeActionPerformed(evt);
            }
        });

        try {
            tFRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***.***.**")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***.***.***-**")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lBCpf.setForeground(new java.awt.Color(254, 254, 254));
        lBCpf.setText("CPF:");

        lBTurno.setForeground(new java.awt.Color(254, 254, 254));
        lBTurno.setText("Turno:");

        lBNome.setForeground(new java.awt.Color(254, 254, 254));
        lBNome.setText("Nome:");
        lBNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lBRg.setForeground(new java.awt.Color(254, 254, 254));
        lBRg.setText("RG:");

        radioTurnoVes.setBackground(new java.awt.Color(24, 117, 209));
        turnoGrupo.add(radioTurnoVes);
        radioTurnoVes.setForeground(new java.awt.Color(254, 254, 254));
        radioTurnoVes.setText("Vespertino");
        radioTurnoVes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        radioTurnoVes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTurnoVesActionPerformed(evt);
            }
        });

        radioTurnoMat.setBackground(new java.awt.Color(24, 117, 209));
        turnoGrupo.add(radioTurnoMat);
        radioTurnoMat.setForeground(new java.awt.Color(254, 254, 254));
        radioTurnoMat.setSelected(true);
        radioTurnoMat.setText("Matutino");
        radioTurnoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTurnoMatActionPerformed(evt);
            }
        });

        btCadastro.setBackground(new java.awt.Color(245, 127, 23));
        btCadastro.setForeground(new java.awt.Color(254, 254, 254));
        btCadastro.setText("Cadastrar");
        btCadastro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(254, 254, 254));
        lbTitulo.setText("Cadastrar Funcionários");

        btVoltar.setBackground(new java.awt.Color(24, 117, 209));
        btVoltar.setForeground(new java.awt.Color(245, 127, 23));
        btVoltar.setText("Voltar");
        btVoltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
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

        lbLogin.setForeground(new java.awt.Color(254, 254, 254));
        lbLogin.setText("Login: ");
        lbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbLogin1.setForeground(new java.awt.Color(254, 254, 254));
        lbLogin1.setText("Senha: ");
        lbLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lBRg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lBNome))
                            .addComponent(lBCpf)
                            .addComponent(lBTurno)
                            .addComponent(lbLogin))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogin1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLogin)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tFRg)
                                    .addComponent(tFCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(tFNome)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioTurnoMat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioTurnoVes)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSair))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTitulo)
                        .addGap(64, 64, 64))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBRg)
                    .addComponent(tFRg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTurnoMat)
                    .addComponent(lBTurno)
                    .addComponent(radioTurnoVes))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogin1))
                .addGap(18, 18, 18)
                .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSair))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        String cpf = tFCpf.getText();
        String rg = tFRg.getText();
        String nome = tFNome.getText();
        String login = tfLogin.getText();
        String senha = tfSenha.getText();
        int turno;
        if(radioTurnoMat.isSelected())
            turno = 1;
        else 
            turno = 2;
        
        if(cpf.isEmpty() || cpf.equals("   .   .   -  ") || 
                rg.isEmpty() || rg.equals("   .   .  ") || nome.isEmpty() 
                || login.isEmpty())
            JOptionPane.showMessageDialog(null, "Preencha todas as informações!");
        else {
            FuncionarioDAO fun = new FuncionarioDAO();
            fun.inserirDados(new Funcionario(cpf, rg, turno, nome, login, senha));
            setVisible(false);
            if(acaoTela != null)
                acaoTela.voltar();
        }
    }//GEN-LAST:event_btCadastroActionPerformed

    private void radioTurnoVesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTurnoVesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTurnoVesActionPerformed

    private void radioTurnoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTurnoMatActionPerformed
       
    }//GEN-LAST:event_radioTurnoMatActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
        if(acaoTela != null)
            acaoTela.voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void tFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFNomeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    public javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lBCpf;
    private javax.swing.JLabel lBNome;
    private javax.swing.JLabel lBRg;
    private javax.swing.JLabel lBTurno;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLogin1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton radioTurnoMat;
    private javax.swing.JRadioButton radioTurnoVes;
    private javax.swing.JFormattedTextField tFCpf;
    private javax.swing.JTextField tFNome;
    private javax.swing.JFormattedTextField tFRg;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.ButtonGroup turnoGrupo;
    // End of variables declaration//GEN-END:variables
}
