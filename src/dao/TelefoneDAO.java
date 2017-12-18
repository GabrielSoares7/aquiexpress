package dao;

import codigos.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tabelas.Email;
import tabelas.Telefone;

public class TelefoneDAO {
    Conexao conexao;
    public TelefoneDAO() {
        conexao = new Conexao();
    /*Essa classe foi criada no intuito de inserir os telefones tanto dos clientes quanto dos funcionarios*/
    
    public void inserirTelefones(int pesId, ArrayList<Telefone> telefones) {
        for(Telefone telefone : telefones) {
            String insert = "INSERT INTO TB_TELEFONE (TEL_TELEFONE, TEL_PES_ID) VALUES (?, ?)";
            try {
                PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
                stmt.setString(1, telefone.getTelefone());
                stmt.setInt(2, pesId);
                stmt.execute();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro durante o cadastro de telefones: " + ex);
            }
        }
    }
    
    public ArrayList<Telefone> carregarTelefonesPorPessoa(int id) {
        ArrayList <Telefone> telefones = new ArrayList <Telefone>();
        String select = "SELECT * FROM TB_TELEFONE WHERE TEL_PES_ID = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                do {
                    telefones.add(new Telefone(rs.getInt("TEL_ID"), 
                            rs.getString("TEL_TELEFONE"), rs.getInt("TEL_PES_ID")));
                }while(rs.next());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar os números!");
        }
        return telefones;
    }
    
    public void deletarTelefone(int id) {
        String delete = "DELETE FROM TB_TELEFONE WHERE TEL_ID = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(delete);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar os números!");
        }
    }
    
    public void atualizarTelefone(Telefone telefone) {
        String update = "UPDATE TB_TELEFONE SET TEL_TELEFONE = ? WHERE TEL_ID = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(update);
            stmt.setString(1, telefone.getTelefone());
            stmt.setInt(2, telefone.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os números!");
        }
    }
    
    public void inserirTelefone(int pesId, Telefone telefone) {
        String insert = "INSERT INTO TB_TELEFONE (TEL_TELEFONE, TEL_PES_ID) VALUES (?, ?)";
        try {
                PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
                stmt.setString(1, telefone.getTelefone());
                stmt.setInt(2, pesId);
                stmt.execute();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,
                        "Ocorreu um erro durante o cadastro do telefone: " + ex);
            }
    }
}
