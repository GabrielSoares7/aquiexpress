package telas;

import outros.AcaoTela;
import dao.EmailDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tabelas.Email;

public class TelaEmail extends javax.swing.JFrame {
    /*Abaixo está sendo criado um arrayList para email;
    *Um objeto foi criado do tipo emailDAO;
    *uma variável foi criada do tipo pesId;
    *Um objeto do tipo acaoTela;
    */
    ArrayList <Email> emails;
    EmailDAO emailDAO;
    int pesId;
    AcaoTela acaoTela;
    /*Abaixo existe um método de nome TelaEmail que tem como parametros
    pesId do tipo int, e um objeto do tipo acaoTela;
    *Visto que também foi criado um referenciador que está referenciando um antigo pesId com 
    o criado na classe;
    *Foi criado um set para centralizar a tela;
    *Está chamndo o método atualizar a lista após isso;
    *Existe e seguida um referenciador que está referenciando o novo acaoTela criado como paramentro do método TelaEmail
    */
    public TelaEmail(int pesId, AcaoTela acaoTela) {
        initComponents();
        this.pesId = pesId;
        emailDAO = new EmailDAO();
        setLocationRelativeTo(null);
        atualizarLista();
        this.acaoTela = acaoTela;
    }
    public void atualizarLista() {
        emails = emailDAO.carregarEnderecosPorPessoa(pesId);
        String emailVet[] = new String [emails.size()];
        for(int i = 0; i < emails.size(); i++) {
            emailVet[i] = emails.get(i).getEndereco();
        }
        jList.setListData(emailVet);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbEmailCad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        btEditar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        lbEmailCad.setText("Endereços cadastrados:");

        jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btDel.setText("Deletar");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEmailCad)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEmailCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEditar)
                        .addComponent(btDel)
                        .addComponent(btAdd)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);
        acaoTela.voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        if(jList.isFocusable()) {
            emailDAO.deletarEmail(emails.get(jList.getSelectedIndex()).getId());
            atualizarLista();
        }
    }//GEN-LAST:event_btDelActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        String email = JOptionPane.showInputDialog(this, "Digite o endereço: ");
        if(email != null) {
            if(!email.isEmpty()) {
                emailDAO.inserirEmail(pesId, new Email(email, 0));
                atualizarLista();
            }
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        JTextField entrada = new JTextField();
        entrada.setText(emails.get(jList.getSelectedIndex()).getEndereco());
        JOptionPane.showMessageDialog(this, entrada, "Editar endereço de email", 3);
        if(entrada.getText() != null) {
            if(!entrada.getText().isEmpty()) {
                Email email = emails.get(jList.getSelectedIndex());
                email.setEndereco(entrada.getText());
                emailDAO.atualizarEmail(email);
                atualizarLista();
            }
        }
    }//GEN-LAST:event_btEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmailCad;
    // End of variables declaration//GEN-END:variables
}
