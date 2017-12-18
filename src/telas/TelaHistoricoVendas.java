package telas;

import dao.VendasDAO;
import java.util.ArrayList;
import tabelas.Vendas;

public class TelaHistoricoVendas extends javax.swing.JFrame {
    /*Abaixo está sendo criado um construtor na classe TelHistoricoVendas;
    *Criado também um set para centralizar a tela;
    * E um objeto do tipo VendasDAO;
    *Em seguida está sendo criado um arrayList do tipo vendas;
    */
    public TelaHistoricoVendas(int idFun) {
        initComponents();
        setLocationRelativeTo(null);
        
        VendasDAO vendasDAO = new VendasDAO();

        ArrayList <Vendas> vendas = vendasDAO.carregarVendasPorFuncionario(idFun);
        int i;
        String[] str = new String[vendas.size()];
        for(i = 0; i < vendas.size(); i++) {
            str[i] = vendas.get(i).getData() + String.format(" - R$ %.2f", 
                    vendasDAO.carregarTotalDaVenda(vendas.get(i).getId()));
        }
        listaVendas.setListData(str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaVendas = new javax.swing.JList<>();

        listaVendas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaVendas;
    // End of variables declaration//GEN-END:variables
}
