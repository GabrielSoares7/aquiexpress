package dao;

import codigos.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tabelas.Cliente;

public class ClienteDAO {
    Conexao conexao;
    
    public ClienteDAO() {
        this.conexao = new Conexao();
    }
    
    public void inserirCliente(Cliente cliente) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.inserirPessoa(cliente);
        cliente.setId(pessoaDAO.retornarUltimoCodigo());
        String insert = "INSERT INTO TB_CLIENTE (CLI_PES_ID, CLI_DATA_NASCIMENTO) VALUES (?, ?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
            stmt.setInt(1, cliente.getId());
            stmt.setString(2,cliente.getNascimento() );
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                "Ocorreu um erro durante o cadastro do cliente: " + ex);
        }
    }
}
