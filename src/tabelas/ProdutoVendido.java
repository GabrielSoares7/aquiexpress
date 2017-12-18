package tabelas;

public class ProdutoVendido {
    private int id;
    private int proId;
    private int vendId;
    private float preco;
    private Produto produto;
    /* Classe com o objetivo de passar as variáveis que estão 
    *tanto no banco quanto no projeto.
    *Aqui estão resentados, e  inseridos também construtores e métodos getters e setters
    */
    public ProdutoVendido(int id, int proId, int vendId, float preco) {
        this.id = id;
        this.proId = proId;
        this.vendId = vendId;
        this.preco = preco;
    }
    
    public ProdutoVendido(int proId, int vendId, float preco) {
        this.proId = proId;
        this.vendId = vendId;
        this.preco = preco;
    }

    public ProdutoVendido(Produto produto) {
        this.produto = produto;
        proId = produto.getId();
        preco = produto.getPreco();
    }
    
    public int getVendId() {
        return vendId;
    }

    public void setVendId(int vendId) {
        this.vendId = vendId;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }
    
    @Override
    public String toString() {
        return produto.getNome() + " - R$ " + produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getId() {
        return id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
