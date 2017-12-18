package telas;

import codigos.AcaoTela;
import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import tabelas.Produto;
public class TelaCadastroProdutos extends javax.swing.JFrame {
/*Essa tela como objetivo pedir as informações do produto para que seja devidamente cadastrado.
*Está inserido também um set que irá centralizar a tela.
*Existe também um referenciador que está referenciando a acaoTela para que a tela seja executada
*/
    AcaoTela acaoTela;
    public TelaCadastroProdutos(AcaoTela acaoTela) {
        initComponents();
        setLocationRelativeTo (null);
        this.acaoTela = acaoTela;
    }
    /*O campo só aceita valores númericos*/
    public boolean temValorNumerico(String str) {
        boolean b = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0' 
                    || str.charAt(i) == '1'
                    || str.charAt(i) == '2'
                    || str.charAt(i) == '3'
                    || str.charAt(i) == '4'
                    || str.charAt(i) == '5'
                    || str.charAt(i) == '6'
                    || str.charAt(i) == '7'
                    || str.charAt(i) == '8'
                    || str.charAt(i) == '9') {
                b = true;
                break;
            }
        }
        
        return b;
    }
    /*O usuario só irá poder digitar os números abaixo*/
    public void salvar() {
        String nome = tfNome.getText();
        
        String strPreco = "";
        for(int i = 0; i < tfPreco.getText().length(); i++) {
            if(tfPreco.getText().charAt(i) == ',') 
                strPreco += '.';
            else if (tfPreco.getText().charAt(i) == '1' ||
                    tfPreco.getText().charAt(i) == '2' ||
                    tfPreco.getText().charAt(i) == '3' ||
                    tfPreco.getText().charAt(i) == '4' ||
                    tfPreco.getText().charAt(i) == '5' ||
                    tfPreco.getText().charAt(i) == '6' ||
                    tfPreco.getText().charAt(i) == '7' ||
                    tfPreco.getText().charAt(i) == '8' ||
                    tfPreco.getText().charAt(i) == '9' ||
                    tfPreco.getText().charAt(i) == '0')
                strPreco += tfPreco.getText().charAt(i);
        }
        float preco;
        if(temValorNumerico(strPreco))
            preco = Float.parseFloat(strPreco);
        else
        {
            JOptionPane.showMessageDialog(null, "Digite um preco válido");
            return;
        }
        String strQnt = "";
        for(int j = 0; j < tfQuantidade.getText().length(); j++) {
            if(tfQuantidade.getText().charAt(j) == '1' ||
                    tfQuantidade.getText().charAt(j) == '2' ||
                    tfQuantidade.getText().charAt(j) == '3' ||
                    tfQuantidade.getText().charAt(j) == '4' ||
                    tfQuantidade.getText().charAt(j) == '5' ||
                    tfQuantidade.getText().charAt(j) == '6' ||
                    tfQuantidade.getText().charAt(j) == '7' ||
                    tfQuantidade.getText().charAt(j) == '8' ||
                    tfQuantidade.getText().charAt(j) == '9' ||
                    tfQuantidade.getText().charAt(j) == '0')
                strQnt += tfQuantidade.getText().charAt(j);
                
        }
        
        int quantidade;
        if(temValorNumerico(strQnt))
            quantidade = Integer.parseInt(strQnt);
        else {
            JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
            return;
        }
        int categoria = jComboItens.getSelectedIndex();
        if(!nome.isEmpty()){
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.inserirProduto(new Produto(nome, quantidade, preco, categoria));
            setVisible(false);
            acaoTela.voltar();
        } 
        else {
            JOptionPane.showMessageDialog(null, "Digite informações válidas");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbQuantidade = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        jComboItens = new javax.swing.JComboBox();
        lbCadastrodeProdutos = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JFormattedTextField();
        btCadastrar = new javax.swing.JButton();
        tfPreco = new javax.swing.JFormattedTextField();

        jMenuItem1.setText("jMenuItem1");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(24, 117, 209));
        jPanel1.setToolTipText("CadastroPrduto");

        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome:");

        lbQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        lbQuantidade.setText("Quantidade:");

        lbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lbCategoria.setText("Categoria:");

        lbPreco.setForeground(new java.awt.Color(255, 255, 255));
        lbPreco.setText("Preço: (R$)");

        jComboItens.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tvs, áudio", "Eletrodomésticos", "Informática", "Eletroportátel", "Esporte e lazer", "Bebês e Crianças", "Beleza", " ", " " }));
        jComboItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboItensActionPerformed(evt);
            }
        });

        lbCadastrodeProdutos.setFont(lbCadastrodeProdutos.getFont().deriveFont(lbCadastrodeProdutos.getFont().getStyle() | java.awt.Font.BOLD, lbCadastrodeProdutos.getFont().getSize()-1));
        lbCadastrodeProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lbCadastrodeProdutos.setText("Cadastro de Produtos ");

        tfQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        btCadastrar.setBackground(new java.awt.Color(245, 127, 23));
        btCadastrar.setForeground(new java.awt.Color(254, 254, 254));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        tfPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        tfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecoActionPerformed(evt);
            }
        });
        tfPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPrecoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbQuantidade)
                            .addComponent(lbCategoria)
                            .addComponent(lbPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCadastrodeProdutos)
                            .addComponent(tfNome)
                            .addComponent(jComboItens, 0, 237, Short.MAX_VALUE)
                            .addComponent(tfQuantidade)
                            .addComponent(tfPreco))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbCadastrodeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidade)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(jComboItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboItensActionPerformed

    }//GEN-LAST:event_jComboItensActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        salvar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecoActionPerformed
    }//GEN-LAST:event_tfPrecoActionPerformed

    private void tfPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecoKeyPressed
    }//GEN-LAST:event_tfPrecoKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btCadastrar;
    protected javax.swing.JComboBox jComboItens;
    private javax.swing.JMenuItem jMenuItem1;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JLabel lbCadastrodeProdutos;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbQuantidade;
    protected javax.swing.JTextField tfNome;
    protected javax.swing.JFormattedTextField tfPreco;
    protected javax.swing.JFormattedTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables
}
