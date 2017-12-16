package dao;

import codigos.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tabelas.Produto;

public class ProdutoDAO {
    Conexao conexao;
    public ProdutoDAO() {
        this.conexao = new Conexao();
    }
    
    public void inserirProduto(Produto produto) {
        String insert = "INSERT INTO TB_PRODUTO (PRO_NOME,PRO_QNT, PRO_CATEGORIA,"
                + " PRO_PRECO) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQnt());
            stmt.setInt(3, produto.getCategoria());
            stmt.setFloat(4, produto.getPreco());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro: " + ex);
        }
    }
    
    public ArrayList<Produto> carregarProdutos() {
        ArrayList <Produto> produtos = new ArrayList<>();
        
        String select = "SELECT * FROM TB_PRODUTO";
        
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                do {
                    produtos.add(new Produto(rs.getInt("PRO_ID"), 
                            rs.getString("PRO_NOME"), rs.getInt("PRO_QNT"),
                            rs.getFloat("PRO_PRECO"), rs.getInt("PRO_CATEGORIA")));
                }while(rs.next());
                stmt.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro durante a execução: " + ex);
        }
        
        return produtos;
    }
    
    public Produto carregarProduto(int id) {
        Produto produto = null;
        String select = "SELECT * FROM TB_PRODUTO WHERE PRO_ID = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                produto = new Produto(rs.getInt("PRO_ID"), rs.getString("PRO_NOME"),
                        rs.getInt("PRO_QNT"), rs.getFloat("PRO_PRECO"),
                        rs.getInt("PRO_CATEGORIA"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro durante a execução: " + ex);
        } 
        return produto;
    }
    
    public void deletarProduto(int id) {
        String delete = "DELETE FROM TB_PRODUTO WHERE PRO_ID = ?";
        
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(delete);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro durante a execução: " + ex);
        }
    }
    
    public void atualizarProduto(Produto produto) {
        String update = "UPDATE TB_PRODUTO SET PRO_NOME = ?, PRO_CATEGORIA = ?, "
                + "PRO_QNT = ?, PRO_PRECO = ? WHERE PRO_ID = ?";
        
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(update);
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getCategoria());
            stmt.setInt(3, produto.getQnt());
            stmt.setFloat(4, produto.getPreco());
            stmt.setInt(5, produto.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro durante a atualização: " + ex);
        }
    }
}
