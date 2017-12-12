package codigos;

public abstract class Pessoa {
    private String nome;
    private int id;

    public Pessoa(int id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    public Pessoa(String nome) {
        this.nome = nome;
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
