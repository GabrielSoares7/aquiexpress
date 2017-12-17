package telas;

import dao.ClienteDAO;
import dao.EmailDAO;
import dao.PessoaDAO;
import dao.TelefoneDAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tabelas.Cliente;
import tabelas.Email;
import tabelas.Telefone;

public class TelaCadastroCliente extends javax.swing.JFrame {

    ArrayList <Email> emails;
    ArrayList <Telefone> telefones;
    
    public TelaCadastroCliente() {
        initComponents();
        setLocationRelativeTo(null);
        
        emails = new ArrayList <Email>();
        telefones = new ArrayList<Telefone>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        lnome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        btAdicionarTelefone = new javax.swing.JButton();
        btAdicionarEmail = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        tfLogin = new javax.swing.JLabel();
        jLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lnome1 = new javax.swing.JLabel();
        tfData = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        jPanel2.setBackground(new java.awt.Color(24, 117, 209));

        lnome.setBackground(new java.awt.Color(255, 255, 255));
        lnome.setForeground(new java.awt.Color(255, 255, 255));
        lnome.setText("Nome:");

        btAdicionarTelefone.setText("Adicionar Telefone");
        btAdicionarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarTelefoneActionPerformed(evt);
            }
        });

        btAdicionarEmail.setText("Adicionar Email");
        btAdicionarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarEmailActionPerformed(evt);
            }
        });

        btCadastrar.setBackground(new java.awt.Color(245, 127, 23));
        btCadastrar.setForeground(new java.awt.Color(254, 254, 254));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        tfLogin.setForeground(new java.awt.Color(255, 255, 255));
        tfLogin.setText("Login:");

        tfSenha.setForeground(new java.awt.Color(255, 255, 255));
        tfSenha.setText("Senha:");

        jSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSenhaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Cliente");

        lnome1.setBackground(new java.awt.Color(255, 255, 255));
        lnome1.setForeground(new java.awt.Color(255, 255, 255));
        lnome1.setText("Data: ");

        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSenha)
                            .addComponent(tfLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnome1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSenha)
                            .addComponent(jLogin)
                            .addComponent(tfData, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                    .addComponent(btCadastrar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btAdicionarTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdicionarEmail))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(lnome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnome1)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLogin)
                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionarTelefone)
                    .addComponent(btAdicionarEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarEmailActionPerformed
        emails.add(new Email(JOptionPane.showInputDialog("Digite o email:"), 0));
    }//GEN-LAST:event_btAdicionarEmailActionPerformed

    private void btAdicionarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarTelefoneActionPerformed
        JFormattedTextField campoTelefone = new JFormattedTextField();
        try {
            campoTelefone.setFormatterFactory(new DefaultFormatterFactory(
                    new MaskFormatter("(**) * ****-****")));
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, campoTelefone, "Digite o telefone", 3);
        telefones.add(new Telefone(campoTelefone.getText(), 0));
    }//GEN-LAST:event_btAdicionarTelefoneActionPerformed

    private void jSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSenhaActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        String nome = tfNome.getText();
        String nascimento = tfData.getText();
        String login = jLogin.getText();
        String senha = jSenha.getText();
        if(!(nome.isEmpty() || nascimento.isEmpty() || login.isEmpty())) {
            Cliente cliente = new Cliente(nascimento, nome, login, senha);
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.inserirCliente(cliente);
            
            PessoaDAO pesDAO = new PessoaDAO();
            int pesId;
            if(!telefones.isEmpty()) {
                pesId = pesDAO.retornarUltimoCodigo();
                TelefoneDAO telDAO = new TelefoneDAO();
                telDAO.inserirTelefones(pesId, telefones);
            }
            if(!emails.isEmpty()) {
                pesId = pesDAO.retornarUltimoCodigo();
                EmailDAO emailDAO = new EmailDAO();
                emailDAO.inserirEmails(pesId, emails);
            }
        }
        setVisible(false);
    }//GEN-LAST:event_btCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarEmail;
    private javax.swing.JButton btAdicionarTelefone;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JLabel lnome;
    private javax.swing.JLabel lnome1;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JLabel tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JLabel tfSenha;
    // End of variables declaration//GEN-END:variables
}
