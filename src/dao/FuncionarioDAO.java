package dao;

import codigos.Conexao;
import tabelas.Funcionario;
import java.sql.*;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    
    Conexao conexao;
    
    public FuncionarioDAO () {
        conexao = new Conexao();
    }
    
    public void inserirDados(Funcionario funcionario) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.inserirPessoa(funcionario);
        int id = pessoaDAO.retornarUltimoCodigo();
        PreparedStatement stmt = null;
        String insert = "INSERT INTO TB_FUNCIONARIO (FUN_CPF, FUN_RG, FUN_TURNO, FUN_PES_ID)"
                + " VALUES (?, ?, ?, ?)";
        try {
            stmt = conexao.getConexao().prepareStatement(insert);
            stmt.setString(1, funcionario.getCpf());
            stmt.setString(2, funcionario.getRg());
            stmt.setInt(3, funcionario.getTurno());
            stmt.setInt(4, id);
            stmt.execute();
            stmt.close();
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desculpe!\nNão foi possível inserir os dados.");
        }
    }
}
