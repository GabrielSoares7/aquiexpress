package telas;

import codigos.AcaoTela;
import dao.FuncionarioDAO;
import dao.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.JList;
import tabelas.Funcionario;
import tabelas.Produto;

public class TelaFuncionario extends javax.swing.JFrame implements AcaoTela{

    Funcionario funcionario;
    AcaoTela acaoTela;
    ArrayList <Produto> produtos;
    /*Abaaixo está sendo criado um contrutos de TelaFuncionario que tem como paramentros id
    e um objeto do tipo acaoTela;
    *Existe um set para centralizar a tela
    */
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
        atualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCadCliente = new javax.swing.JButton();
        lbBoasVindas = new javax.swing.JLabel();
        btCadProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdutos = new javax.swing.JList<>();
        lbProdCad = new javax.swing.JLabel();
        btDeletar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itemCadFun = new javax.swing.JMenuItem();
        itemHistorico = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemEdit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        btCadCliente.setBackground(new java.awt.Color(245, 127, 23));
        btCadCliente.setForeground(new java.awt.Color(254, 254, 254));
        btCadCliente.setText("Cadastrar cliente");
        btCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClienteActionPerformed(evt);
            }
        });

        lbBoasVindas.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbBoasVindas.setForeground(new java.awt.Color(24, 117, 209));
        lbBoasVindas.setText("jLabel1");

        btCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgAdd.png"))); // NOI18N
        btCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadProdutoActionPerformed(evt);
            }
        });

        jListProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListProdutos);

        lbProdCad.setText("Produtos Cadastrados:");

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgDeletar.png"))); // NOI18N
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(245, 127, 23));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadProduto)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btDeletar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBoasVindas)
                            .addComponent(lbProdCad)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCadCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 554, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBoasVindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadCliente)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbProdCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuFile.setText("File");

        itemCadFun.setText("Cadastrar Funcionário");
        itemCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadFunActionPerformed(evt);
            }
        });
        menuFile.add(itemCadFun);

        itemHistorico.setText("Histórico de vendas");
        itemHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHistoricoActionPerformed(evt);
            }
        });
        menuFile.add(itemHistorico);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
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

    private void btCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClienteActionPerformed
        TelaCadastroCliente cadCliente = new TelaCadastroCliente();
        cadCliente.setVisible(true);
    }//GEN-LAST:event_btCadClienteActionPerformed

    private void btCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadProdutoActionPerformed
        TelaCadastroProdutos cadastrarProdutos = new TelaCadastroProdutos(this);
        cadastrarProdutos.setVisible(true);
    }//GEN-LAST:event_btCadProdutoActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            int cod = produtos.get(jListProdutos.getAnchorSelectionIndex()).getId();
            produtoDAO.deletarProduto(cod);
            atualizarLista();
        } catch (ArrayIndexOutOfBoundsException ex){}
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        try {
            int cod = produtos.get(jListProdutos.getAnchorSelectionIndex()).getId();
            TelaEditarProduto editarProduto = new TelaEditarProduto(this, cod);
            editarProduto.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException ex){}
    }//GEN-LAST:event_btEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaVender telaVender = new TelaVender(funcionario.getId(), this);
        telaVender.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHistoricoActionPerformed
       TelaHistoricoVendas telaHistorico = new TelaHistoricoVendas(funcionario.getId());
       telaHistorico.setVisible(true);
    }//GEN-LAST:event_itemHistoricoActionPerformed

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

    public void atualizarLista() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtos = produtoDAO.carregarProdutos();
        String[] produtosVet = new String[produtos.size()];
        for(int i = 0; i < produtos.size(); i++) 
            produtosVet[i] = produtos.get(i).toString();
        jListProdutos.setListData(produtosVet);
       }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCliente;
    private javax.swing.JButton btCadProduto;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JMenuItem itemCadFun;
    private javax.swing.JMenuItem itemEdit;
    private javax.swing.JMenuItem itemHistorico;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jListProdutos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBoasVindas;
    private javax.swing.JLabel lbProdCad;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuFile;
    // End of variables declaration//GEN-END:variables

    @Override
    public void voltar() {
        atualizarLista();
    }
}
