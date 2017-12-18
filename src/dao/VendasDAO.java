package dao;

import codigos.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.Vendas;

public class VendasDAO {
    Conexao conexao;
    
    public VendasDAO () {
        this.conexao = new Conexao();
    }
    /*Essa classe tem como foco principal inserir dados na tb_vendas no banco de dados para que possa ser mostrado posteriormente no projeto*/
    
    public boolean inserirVenda(Vendas venda) {
        String insert = "INSERT INTO TB_VENDAS (VEND_FUN_PES_ID, VEND_CLI_PES_ID, VEND_DATA)"
                + " VALUES (?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
            stmt.setInt(1, venda.getFunPesId());
            stmt.setInt(2, venda.getCliPesId());
            stmt.setString(3, venda.getData());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Venda não foi realizada: " + ex);
            return false;
        }
        return true;
    }
    
    public int carregarUltimaVenda() {
        String select = "SELECT * FROM TB_VENDAS ORDER BY VEND_ID";
        int i = 0;
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            if(rs.last())
                i = rs.getInt("VEND_ID");
        } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public ArrayList<Vendas> carregarVendasPorCliente(int id) {
        ArrayList <Vendas> vendas = new ArrayList<>();
        
        String select = "SELECT * FROM TB_VENDAS WHERE VEND_CLI_PES_ID = ?";
        
        try {
            PreparedStatement stmt  = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                do {
                    vendas.add(new Vendas(rs.getInt("VEND_ID"), 
                            rs.getInt("VEND_FUN_PES_ID"), rs.getInt("VEND_CLI_PES_ID"), 
                            rs.getString("VEND_DATA")));
                }while(rs.next());
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar as"
                    + " compras do cliente");
        }
        
        
        return vendas;
    }

    public ArrayList<Vendas> carregarVendasPorFuncionario(int idFun) {
        ArrayList <Vendas> vendas = new ArrayList<>();
        
        String select = "SELECT * FROM TB_VENDAS WHERE VEND_FUN_PES_ID = ?";
        
        try {
            PreparedStatement stmt  = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, idFun);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                do {
                    vendas.add(new Vendas(rs.getInt("VEND_ID"), 
                            rs.getInt("VEND_FUN_PES_ID"), rs.getInt("VEND_CLI_PES_ID"), 
                            rs.getString("VEND_DATA")));
                }while(rs.next());
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar as"
                    + " vendas do funcionário");
        }
        
        
        return vendas;
    }

    public float carregarTotalDaVenda(int id) {
        String select = "SELECT SUM(PV_VEND_PRECO) AS SOMATOTAL FROM TB_PRODUTO_VENDIDO WHERE PV_VEND_ID = ?;";
        float total = 0;
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.first())
                total = rs.getFloat("SOMATOTAL");
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a soma:\n" + ex);
        }
        return total;
    }
}
