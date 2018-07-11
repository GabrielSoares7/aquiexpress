package dao;

import outros.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.Cliente;

public class ClienteDAO {
    Conexao conexao;
    
    /*
    * Classe que gerencia a tabela cliente
    */
    
    public ClienteDAO() {
        this.conexao = new Conexao();
    }
    
    public void inserirCliente(Cliente cliente) {
        // Método que insere um cliente na base de dados
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.inserirPessoa(cliente);
        cliente.setId(pessoaDAO.retornarUltimoCodigo());
        String insert = "INSERT INTO TB_CLIENTE (CLI_PES_ID, CLI_DATA_NASCIMENTO) VALUES (?, ?)";
        /*Uma variável do tipo String onde vai pega as informações que o úsuario passar e colocar no data base
        */
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
            /*Para inserir de forma mais segura no banco de dados*/
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
    
    public ArrayList<Cliente> retornarClientes() {
        /*Método para adicionar clientes na tabela*/
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        String select = "SELECT * FROM TB_CLIENTE JOIN TB_PESSOA "//
                + "WHERE CLI_PES_ID = PES_ID ORDER BY PES_NOME";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                do {
                    clientes.add(new Cliente(rs.getInt("CLI_PES_ID"),
                            rs.getString("CLI_DATA_NASCIMENTO"), rs.getString("PES_NOME"),
                            rs.getString("PES_LOGIN"), rs.getString("PES_SENHA")));
                } while (rs.next());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                "Ocorreu um erro durante o carregamento: " + ex);
        }
        return clientes;
    }
    
    public Cliente retornarCliente(int id) {
        /*Método para retornar os nomes dos clientes*/
        Cliente cliente = null;
        String select = "SELECT * FROM TB_CLIENTE JOIN TB_PESSOA "
                + "WHERE CLI_PES_ID = PES_ID AND CLI_PES_ID = ?";//Para receber o nome que o usuário passou as informações no caso ira mostrar o nome dos clientes
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.last()) {
                cliente = new Cliente(rs.getInt("CLI_PES_ID"), 
                        rs.getString("CLI_DATA_NASCIMENTO"), rs.getString("PES_NOME"),
                        rs.getString("PES_LOGIN"), rs.getString("PES_SENHA"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                "Ocorreu um erro durante o carregamento: " + ex);
        }
        return cliente;
    }
    
    public int retornarIdLogin(String login, String senha) {
        /*Método para retornar o IdLogin */
        int id = 1;
        String select = "SELECT CLI_PES_ID FROM TB_CLIENTE JOIN TB_PESSOA "
                + "WHERE PES_LOGIN = ? AND PES_SENHA = ? AND CLI_PES_ID = PES_ID";
        /*Vai mostrar a tabela id da pessoa e inserir na tabela pessoa login senha */
        try {
            PreparedStatement stmt = null;
            stmt = conexao.getConexao().prepareStatement(select);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if(rs.last()) {
                id = rs.getInt("CLI_PES_ID");
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
}
