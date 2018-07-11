package telas;

import outros.AcaoTela;
import dao.ClienteDAO;
import dao.ProdutoDAO;
import dao.ProdutoVendidoDAO;
import dao.VendasDAO;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tabelas.Cliente;
import tabelas.Produto;
import tabelas.ProdutoVendido;
import tabelas.Vendas;

public class TelaVender extends javax.swing.JFrame {
    /*Abaixo está sendo criado variaveis e arrayList de produto, cliente, produtovendido
    *Existe também uma variável do tipo float de nome precoTotal;
    *Abaixo está sendo criado um construtor de nome telaVender onde tem um set para centralizar a  tela; 
    */
    int codFun;
    AcaoTela acaoTela;
    ArrayList <Produto> produtos; 
    ArrayList <Cliente> clientes;
    ArrayList <ProdutoVendido> produtosVendidos;
    float precoTotal;
    
    public TelaVender(int codFun, AcaoTela acaoTela) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        this.codFun = codFun;
        this.acaoTela = acaoTela;
        /*Abaixo está sendo criado dois objetos um do tipo ProdutoDAO, e outro do tipo produtos*/
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtos = produtoDAO.carregarProdutos();
        
        clientes = new ClienteDAO().retornarClientes();
        if(clientes.isEmpty())  {
            JOptionPane.showMessageDialog(null, "Só é possível vender se existir"
                    + " um cliente cadastrado");
            fechar();
        }
        comboCliente.setModel(new DefaultComboBoxModel<>(
                gerarVetor(clientes)));
        
        produtosVendidos = new ArrayList<ProdutoVendido>();
        atualizarLista();
        if(produtos.isEmpty())  {
            JOptionPane.showMessageDialog(null, "Só é possível vender se existir"
                    + " um produto cadastrado");
            fechar();
        }
    }
    
    public void fechar() {
        acaoTela.voltar();
        dispose();
    }
    
    public String[] gerarVetor (ArrayList array) {
        String strings[] = new String[array.size()];
        int i;
        for(i = 0; i < array.size(); i++) {
            strings[i] = array.get(i).toString(); 
        }
        return strings;
    }

    public void atualizarLista() {
        lbTotal.setText(String.format("R$ %.2f", precoTotal));
        listaProdutos.setListData(gerarVetor(produtosVendidos));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbVender = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JList<>();
        btAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btVender = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lbTotal = new javax.swing.JLabel();
        campoPesquisaCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        lbVender.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbVender.setForeground(new java.awt.Color(245, 127, 23));
        lbVender.setText("Vender");

        lbCliente.setText("Cliente: ");

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zé", "Zeza" }));

        listaProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Livro" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaProdutos);

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgAdd.png"))); // NOI18N
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        jLabel3.setText("Produtos:");

        btVender.setText("Vender");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgDeletar.png"))); // NOI18N
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        lbTotal.setForeground(new java.awt.Color(24, 117, 209));
        lbTotal.setText("Total: R$ 0.00");

        campoPesquisaCliente.setToolTipText("");
        campoPesquisaCliente.setName(""); // NOI18N
        campoPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaClienteKeyPressed(evt);
            }
        });

        jLabel1.setText("Pesquisar cliente...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btVender))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVender)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 185, Short.MAX_VALUE)
                                .addComponent(lbTotal))
                            .addComponent(campoPesquisaCliente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAdd)
                                    .addComponent(btDel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVender)
                    .addComponent(lbTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVender)
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

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        JComboBox comboProdutos = new JComboBox();
        comboProdutos.setModel(new DefaultComboBoxModel<>(
                gerarVetor(produtos)));
        JFormattedTextField campoQnt = new JFormattedTextField();
        try {
            campoQnt.setFormatterFactory(new DefaultFormatterFactory(
                    new MaskFormatter("***")));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro na mascara: " + ex);
        }
        JOptionPane.showMessageDialog(null, comboProdutos, "Escolher produto", 3);
        JOptionPane.showMessageDialog(null, campoQnt, "Escolher quantidade", 3);
        String convertQnt = "0";
        int i, qnt;
        for(i = 0; i < campoQnt.getText().length(); i++) {
            if(campoQnt.getText().charAt(i) != ' ')
                convertQnt += campoQnt.getText().charAt(i);
        }
        qnt = Integer.parseInt(convertQnt);
        if(qnt > produtos.get(comboProdutos.getSelectedIndex()).getQnt())
            qnt = produtos.get(comboProdutos.getSelectedIndex()).getQnt();
        for(i = 0; i < qnt; i++) {
            produtosVendidos.add(new ProdutoVendido(produtos
                    .get(comboProdutos.getSelectedIndex())));
            produtos.get(comboProdutos.getSelectedIndex()).setQnt(produtos
                    .get(comboProdutos.getSelectedIndex()).getQnt() - 1);
        }
        precoTotal += produtos.get(comboProdutos.getSelectedIndex()).getPreco() * qnt;
        atualizarLista();
    }//GEN-LAST:event_btAddActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        try {
            precoTotal -= produtosVendidos.get(listaProdutos.getSelectedIndex())
                    .getProduto().getPreco();
            produtosVendidos.remove(listaProdutos.getSelectedIndex());
            atualizarLista();
        } catch (ArrayIndexOutOfBoundsException ex) {}
    }//GEN-LAST:event_btDelActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        if(!produtosVendidos.isEmpty()) {
            VendasDAO vendasDAO = new VendasDAO();
            int id = clientes.get(comboCliente.getSelectedIndex()).getId();
            Calendar c = Calendar.getInstance();
            String data = c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) 
                    + "/" + c.get(Calendar.YEAR);
            boolean vendaInserida = vendasDAO.inserirVenda(new Vendas(codFun, id, data));
            int codVend = vendasDAO.carregarUltimaVenda();
            ProdutoVendidoDAO pvDAO = new ProdutoVendidoDAO();
            ProdutoDAO pd = new ProdutoDAO();
            System.out.println(codVend);
            if(vendaInserida && codVend != 0) {
                for(int i = 0; i < produtosVendidos.size(); i++) {
                    pvDAO.inserirProdutoVendido(produtosVendidos.get(i).getProduto().getId(),
                            codVend, produtosVendidos.get(i).getPreco());
                    pd.atualizarQnt(produtosVendidos.get(i).getProduto().getId(), 
                            produtosVendidos.get(i).getProduto().getQnt());
                }
                setVisible(false);
                acaoTela.voltar();
            }
        }
        else {
            setVisible(false);
            acaoTela.voltar();
        }
        
    }//GEN-LAST:event_btVenderActionPerformed

    private void campoPesquisaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER && !campoPesquisaCliente.getText().isEmpty()) {
            String nome = campoPesquisaCliente.getText();
            for(int i = 0; i < clientes.size(); i++) {
                if(clientes.get(i).getNome().toLowerCase().contains(nome.toLowerCase())) {
                    comboCliente.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_campoPesquisaClienteKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btVender;
    private javax.swing.JTextField campoPesquisaCliente;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbVender;
    private javax.swing.JList<String> listaProdutos;
    // End of variables declaration//GEN-END:variables
}
