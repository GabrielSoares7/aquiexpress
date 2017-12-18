package tabelas;

public abstract class Pessoa {
    private String nome;
    private String login;
    private String senha;
    private int id;
    /* Classe com o objetivo de passar as variáveis que estão 
    *tanto no banco quanto no projeto.
    *Aqui estão resentados, e  inseridos também construtores e métodos getters e setters
    */
    public Pessoa(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Pessoa(int id, String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
