package codigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    
    private Connection conexao;
    private String url;
    private String usuario;
    private String senha;
    
    public Conexao() {
        conexao = null;
        url = "jdbc:mysql://localhost/DB_ESTOQUE";
        usuario = "root";
        senha ="c74387";
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desculpe!\nVocê está desconectado");  
            ex.printStackTrace();
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
    
    
}
