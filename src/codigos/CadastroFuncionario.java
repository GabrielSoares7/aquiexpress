package codigos;

public class CadastroFuncionario extends javax.swing.JFrame {

    AcaoTela acaoTela;
    
    public CadastroFuncionario(AcaoTela acaoTela) {
        this.acaoTela = acaoTela;
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
        tFTurnoVes = new javax.swing.JRadioButton();
        tFTurnoMat = new javax.swing.JRadioButton();
        btCadastro = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btSair1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Funciónario");
        setBackground(new java.awt.Color(24, 117, 209));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 117, 209));
        jPanel1.setToolTipText("");
        jPanel1.setName("Cadastro Funcionarios"); // NOI18N

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

        tFTurnoVes.setBackground(new java.awt.Color(24, 117, 209));
        turnoGrupo.add(tFTurnoVes);
        tFTurnoVes.setForeground(new java.awt.Color(254, 254, 254));
        tFTurnoVes.setText("Vespertino");
        tFTurnoVes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tFTurnoVes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFTurnoVesActionPerformed(evt);
            }
        });

        tFTurnoMat.setBackground(new java.awt.Color(24, 117, 209));
        turnoGrupo.add(tFTurnoMat);
        tFTurnoMat.setForeground(new java.awt.Color(254, 254, 254));
        tFTurnoMat.setSelected(true);
        tFTurnoMat.setText("Matutino");
        tFTurnoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFTurnoMatActionPerformed(evt);
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

        btSair1.setBackground(new java.awt.Color(24, 117, 209));
        btSair1.setForeground(new java.awt.Color(245, 127, 23));
        btSair1.setText("Fechar");
        btSair1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lBRg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lBNome))
                            .addComponent(lBCpf)
                            .addComponent(lBTurno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tFRg)
                            .addComponent(tFCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(tFNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tFTurnoMat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tFTurnoVes))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
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
                    .addComponent(tFTurnoMat)
                    .addComponent(lBTurno)
                    .addComponent(tFTurnoVes))
                .addGap(18, 18, 18)
                .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSair1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        System.out.println("Usuário cadastrado");
    }//GEN-LAST:event_btCadastroActionPerformed

    private void tFTurnoVesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFTurnoVesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFTurnoVesActionPerformed

    private void tFTurnoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFTurnoMatActionPerformed
       
    }//GEN-LAST:event_tFTurnoMatActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
        acaoTela.voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSair1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSair1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btSair1;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBCpf;
    private javax.swing.JLabel lBNome;
    private javax.swing.JLabel lBRg;
    private javax.swing.JLabel lBTurno;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JFormattedTextField tFCpf;
    private javax.swing.JTextField tFNome;
    private javax.swing.JFormattedTextField tFRg;
    private javax.swing.JRadioButton tFTurnoMat;
    private javax.swing.JRadioButton tFTurnoVes;
    private javax.swing.ButtonGroup turnoGrupo;
    // End of variables declaration//GEN-END:variables
}
