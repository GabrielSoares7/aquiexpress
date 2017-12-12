package codigos;

public class Produto {
   private String nome;
   private int qnt;
   private float preco;
   private int id;
   private String imagem;

    public Produto(String nome, int qnt, float preco, String imagem) {
        this.nome = nome;
        this.qnt = qnt;
        this.preco = preco;
        this.imagem = imagem;
    }

    public Produto(int id, String nome, int qnt, float preco, String imagem) {
        this.nome = nome;
        this.qnt = qnt;
        this.preco = preco;
        this.id = id;
        this.imagem = imagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
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
   
   
}
