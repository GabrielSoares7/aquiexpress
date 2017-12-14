package dao;

import codigos.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tabelas.Pessoa;

public class PessoaDAO {
    Conexao conexao;
    public PessoaDAO() {
        conexao = new Conexao();
    }
    
    public void inserirPessoa(Pessoa pessoa) {
        PreparedStatement stmt = null;
        String insert = "INSERT INTO TB_PESSOA (PES_NOME, PES_LOGIN, PES_SENHA) VALUES (?, ?, ?)";
        try {
            stmt = conexao.getConexao().prepareStatement(insert);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getLogin());
            stmt.setString(3, pessoa.getSenha());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desculpe!\nNão foi possível inserir os dados.");
        }
    }
    
    public int retornarUltimoCodigo() {
        int cod = 1;
        String select = "SELECT PES_ID FROM TB_PESSOA";
        try {
            PreparedStatement stmt = null;
            stmt = conexao.getConexao().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            if(rs.last())
                cod = rs.getInt("PES_ID");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante o cadastro");
        }
        return cod;
    }
}