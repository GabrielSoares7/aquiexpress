package tabelas;

import tabelas.Pessoa;

public class Cliente extends Pessoa{
    private String nascimento;

    public Cliente(int id, String nascimento, String nome,
            String login, String senha) {
        super(id, nome, login, senha);
        this.nascimento = nascimento;
    }

    public Cliente(String nascimento, String nome, String login,
            String senha) {
        super(nome, login, senha);
        this.nascimento = nascimento;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }    
    
    @Override
    public String toString() {
        return getNome();
    }
}
