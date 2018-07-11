package dao;

import outros.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.Email;

public class EmailDAO {
    Conexao conexao;
 /*Essa classe tem como objetivo receber os e-mails tanto do funcionario quanto do cliente*/   
    public EmailDAO() {
      
        conexao = new Conexao();
    }
    
    public void inserirEmails(int pesId, ArrayList<Email> emails) {
        /* Será inserido em um arrayList os e-mails dos funcionários e clientes*/
        String insert = "INSERT INTO TB_EMAIL (EMAIL_ENDERECO, EMAIL_PES_ID) VALUES (?, ?)";
        for(Email email: emails) {
            try {
                PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
                stmt.setString(1, email.getEndereco());
                stmt.setInt(2, pesId);
                stmt.execute();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,
                        "Ocorreu um erro durante o cadastro do email: " + ex);
            }
            
        }
    }
    
    public void inserirEmail(int pesId, Email email) {
        String insert = "INSERT INTO TB_EMAIL (EMAIL_ENDERECO, EMAIL_PES_ID) VALUES (?, ?)";
        try {
                PreparedStatement stmt = conexao.getConexao().prepareStatement(insert);
                stmt.setString(1, email.getEndereco());
                stmt.setInt(2, pesId);
                stmt.execute();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,
                        "Ocorreu um erro durante o cadastro do email: " + ex);
            }
    }
    
    public ArrayList<Email> carregarEnderecosPorPessoa(int id) {
        ArrayList <Email> emails = new ArrayList <Email>();
        String select = "SELECT * FROM TB_EMAIL WHERE EMAIL_PES_ID = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(select);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.first()) {
                do {
                    emails.add(new Email(rs.getInt("EMAIL_ID"), 
                            rs.getString("EMAIL_ENDERECO"), rs.getInt("EMAIL_PES_ID")));
                }while(rs.next());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar os endereços!");
        }
        return emails;
    }
    
    public void deletarEmail(int id) {
        String delete = "DELETE FROM TB_EMAIL WHERE EMAIL_ID = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(delete);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar os endereços!");
        }
    }
    
    public void atualizarEmail(Email email) {
        String update = "UPDATE TB_EMAIL SET EMAIL_ENDERECO = ? WHERE EMAIL_ID = ?";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(update);
            stmt.setString(1, email.getEndereco());
            stmt.setInt(2, email.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os endereços!");
        }
    }
}
