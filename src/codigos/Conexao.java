package codigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    Connection conexao;
    String url;
    String usuario;
    String senha;
    public Conexao() {
        conexao = null;
        url = "jdbc:mysql://localhost/DB_ESTOQUE";
        usuario = "root";
        senha ="c74387";
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado");
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desculpe!\nVocê está desconectado");        
        }
    }
}
