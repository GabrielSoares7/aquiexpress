package telas;

import codigos.AcaoTela;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.VendasDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tabelas.Cliente;
import tabelas.Funcionario;
import tabelas.Vendas;

public class TelaCliente extends javax.swing.JFrame {
    /*Abaixo tem um objeto sendo criado do tipo acaoTela;]
    *Existe também um arrayList do tipo vendas;
    *Há também um objeto do tipo vendasDAO;
    */
    AcaoTela acaoTela;
    int cliId;
    ArrayList <Vendas> vendas;
    Cliente cliente;
    VendasDAO vendasDAO;
    
    public TelaCliente(int cliId, AcaoTela acaoTela) {
        configurarLookAndFeel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        this.cliId = cliId;
        this.acaoTela = acaoTela;
        ClienteDAO clienteDAO = new ClienteDAO();
        cliente = clienteDAO.retornarCliente(cliId);
        lbBoasVindas.setText("Bem-vindo(a), " + cliente.getNome());
        
        vendasDAO = new VendasDAO();
        vendas = vendasDAO.carregarVendasPorCliente(cliId);
        atualizarLista();
    }
    
    public void atualizarLista() {
        String [] itens = new String[vendas.size()];
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        for(int i = 0; i < vendas.size(); i++) {
            try {
            itens[i] = vendas.get(i).getData() + " - Vendedor: "
                    + funcionarioDAO.carregarInfo(vendas.get(i)
                    .getFunPesId()).getNome() + String.format("- R$ %.2f", vendasDAO
                    .carregarTotalDaVenda(vendas.get(i).getId()));
            }catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            }
        }
        listaCompras.setListData(itens);
    }
    
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbBoasVindas = new javax.swing.JLabel();
        btAbrir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCompras = new javax.swing.JList<>();
        lbCompras = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        lbBoasVindas.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbBoasVindas.setForeground(new java.awt.Color(24, 117, 209));
        lbBoasVindas.setText("Bem-vindo, Cliente");

        btAbrir.setText("Abrir");
        btAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaCompras);

        lbCompras.setText("Suas compras");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbBoasVindas)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAbrir)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCompras))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBoasVindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btAbrir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        setVisible(false);
        acaoTela.voltar();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirActionPerformed
        try {
            TelaProdutosVendidos tela = new TelaProdutosVendidos(vendas
                    .get(listaCompras.getSelectedIndex()).getId());
            tela.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException ex) {
            
        }
    }//GEN-LAST:event_btAbrirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrir;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBoasVindas;
    private javax.swing.JLabel lbCompras;
    private javax.swing.JList<String> listaCompras;
    // End of variables declaration//GEN-END:variables
}
