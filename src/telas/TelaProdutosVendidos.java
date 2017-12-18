package telas;

import dao.ProdutoVendidoDAO;
import java.util.ArrayList;
import tabelas.Produto;

public class TelaProdutosVendidos extends javax.swing.JFrame {
    /*Abaixo está sendo criado um construtor de TelaProdutosVendidos;
    *Existe também um set para centralizar a tela;
    *Está sendo criado um objeto do tipo produtoVendidoDAO;
    *Em seguida está sendo criado um arrayList do tipo produtos;
    */
    public TelaProdutosVendidos(int vendId) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        ProdutoVendidoDAO produtoVendidoDAO = new ProdutoVendidoDAO();
        ArrayList<Produto> produtos = produtoVendidoDAO.carregarProdutosVendidos(vendId);
        
        String[] str = new String[produtos.size()];
        for(int i = 0; i < produtos.size(); i++) {
            str[i] = produtos.get(i).getNome() + " - R$ " + produtos.get(i)
                    .getPreco();
        }
        listaProdutos.setListData(str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JList<>();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        listaProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaProdutos;
    // End of variables declaration//GEN-END:variables
}
