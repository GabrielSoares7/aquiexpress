package tabelas;

public class Produto {
    private String nome;
    private int qnt;
    private float preco;
    private int id;
    private int categoria;
    /* Classe com o objetivo de passar as variáveis que estão 
    *tanto no banco quanto no projeto.
    *Aqui estão resentados, e  inseridos também construtores e métodos getters e setters
    */
    public Produto(String nome, int qnt, float preco, int categoria) {
        this.nome = nome;
        this.qnt = qnt;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Produto(int id, String nome, int qnt, float preco, int categoria) {
        this.nome = nome;
        this.qnt = qnt;
        this.preco = preco;
        this.id = id;
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    @Override
    public String toString() {
        return nome + ", " + "Quant: " + qnt + ", R$" + preco;
    }
}
