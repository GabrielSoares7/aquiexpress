package codigos;

public class ProdutoVendido {
    private int proId;
    private int vendId;

    public ProdutoVendido(int proId, int vendId) {
        this.proId = proId;
        this.vendId = vendId;
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
    
    
}
