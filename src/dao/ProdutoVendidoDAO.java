package dao;

import codigos.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tabelas.Produto;

public class ProdutoVendidoDAO {
    
    Conexao conexao;
    
    public ProdutoVendidoDAO() {
        conexao = new Conexao();
    }
    
    public void inserirProdutoVendido(int proId, int vendId, float preco) {
        String insert = "INSERT INTO TB_PRODUTO_VENDIDO (PV_PRO_ID, PV_VEND_ID, PV_VEND_PRECO) "
                + "VALUES (?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
            stmt.setInt(1, proId);
            stmt.setInt(2, vendId);
            stmt.setFloat(3, preco);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar a nota: " + ex);
        }
    }
    
    public ArrayList<Produto> carregarProdutosVendidos(int vendId) {
        String select="select * from TB_PRODUTO JOIN TB_PRODUTO_VENDIDO"
                + " WHERE PRO_ID = PV_PRO_ID AND PV_VEND_ID = ?;";
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, vendId);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                do {
                    produtos.add(new Produto(rs.getString("PRO_NOME"), 0,
                            rs.getFloat("PV_VEND_PRECO"), 0));
                }while(rs.next());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar a nota: " + ex);
        }
        return produtos;
    }
}
