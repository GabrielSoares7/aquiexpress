package codigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {//nome da classe para fazer a integração com o banco
    
    private Connection conexao;//abaixo está as variáveis que seram utilizadas para a integração do banco
    private String url;
    private String usuario;
    private String senha;
    
    public Conexao() {
        //trutor será utilzado para fazer a integração com o banco de dados
        conexao = null;
        url = "jdbc:mysql://localhost/DB_ESTOQUE";//Nome da base de dados
        usuario = "root";//Nome do usuario padrão entretanto pode ser alterado de acordo com a vontade do usuario
        senha ="c74387";//senha do usuario
        try {//Estamos utilizando o try porque estamos vamos converter os dados inseridos aqui para ser transportado para o banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);// ira abrir uma conexão com os dados passados acima
        }
        catch(SQLException ex) {//Se caso acontecer algum erro na integração do banco junto com o projeto será mostrado aqui
            JOptionPane.showMessageDialog(null, "Desculpe!\nVocê está desconectado");//Mensagem de erro
            ex.printStackTrace();//Vai mostrar exatamente onde está o erro, no caso a linha do erro
        }
    }

    public Connection getConexao() {// Método para retonar e mostar a conexão
        return conexao;//retornar a conexao
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;// esta referenciando a antiga variavel com o nome conexao com a nova variavel do tipo conexao
    }
    
    
}
