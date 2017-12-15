package dao;

import codigos.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tabelas.Telefone;

public class TelefoneDAO {
    Conexao conexao;
    public TelefoneDAO() {
        conexao = new Conexao();
    }
    
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
}
