package tabelas;

import tabelas.Pessoa;

public class Cliente extends Pessoa{
    private Data nascimento;
    private Data cadastro;

    public Cliente(int id, Data nascimento, Data cadastro, String nome,
            String login, String senha) {
        super(id, nome, login, senha);
        this.nascimento = nascimento;
        this.cadastro = cadastro;
    }

    public Cliente(Data nascimento, Data cadastro, String nome, String login,
            String senha) {
        super(nome, login, senha);
        this.nascimento = nascimento;
        this.cadastro = cadastro;
    }

    public Data getCadastro() {
        return cadastro;
    }

    public void setCadastro(Data cadastro) {
        this.cadastro = cadastro;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }    
}
