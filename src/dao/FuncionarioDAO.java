package dao;

import codigos.Conexao;
import tabelas.Funcionario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            JOptionPane.showMessageDialog(null, "Desculpe!\n"
                    + "Não foi possível inserir os dados: \n" + ex);
        }
    }
   
    public int retornarIdLogin(String login, String senha) {
        int id = 1;
        String select = "SELECT PES_ID FROM TB_PESSOA "
                + "WHERE PES_LOGIN = ? AND PES_SENHA = ?";
        try {
            PreparedStatement stmt = null;
            stmt = conexao.getConexao().prepareStatement(select);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if(rs.last()) {
                id = rs.getInt("PES_ID");
            }
            else {
                JOptionPane.showMessageDialog(null, "Acesso Negado!!!", "Alerta", 0);
                id = 0;
            }
            stmt.close();
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer login: \n" + ex);
        }
        return id;
    }
    
    public Funcionario carregarInfo(int id) {
        Funcionario funcionario = null;
        String select = "select * from TB_FUNCIONARIO JOIN TB_PESSOA WHERE FUN_PES_ID = PES_ID"
                + " AND PES_ID = ?";
        try {
            PreparedStatement stmt = null;
            stmt = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()){
                funcionario = new Funcionario(rs.getInt("PES_ID"), rs.getString("FUN_CPF"), 
                rs.getString("FUN_RG"), rs.getInt("FUN_TURNO"), rs.getString("PES_NOME"), 
                        rs.getString("PES_LOGIN"), rs.getString("PES_SENHA"));
            }
            stmt.close();
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as informações: " + ex);
        }
        return funcionario;
    }
    
    public void atualizarFuncionario(Funcionario funcionario) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.atualizarPessoa(funcionario);
        String update = "UPDATE TB_FUNCIONARIO SET FUN_CPF = ?, FUN_RG = ?, "
               + "FUN_TURNO = ? WHERE FUN_PES_ID = ?";
        try {
           PreparedStatement stmt = conexao.getConexao().prepareStatement(update);
           stmt.setString(1, funcionario.getCpf());
           stmt.setString(2, funcionario.getRg());
           stmt.setInt(3, funcionario.getTurno());
           stmt.setInt(4, funcionario.getId());
           stmt.execute();
           stmt.close();
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a atualização");
        }
    }
            
    public void deletarFuncionario(int id) {
        String delete = "DELETE FROM TB_FUNCIONARIO WHERE FUN_PES_ID = ?";
        
        PreparedStatement stmt;
        try {
            stmt = conexao.getConexao().prepareStatement(delete);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro enquanto o "
                    + "arquivo estava sendo deletado: " + ex);
        }
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.deletarPessoa(id);
        
    }       
}
