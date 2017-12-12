package codigos;

public class Vendas {
    private int id;
    private int funPesId;
    private int cliPesId;

    public Vendas(int id, int funPesId, int cliPesId) {
        this.id = id;
        this.funPesId = funPesId;
        this.cliPesId = cliPesId;
    }

    public Vendas(int funPesId, int cliPesId) {
        this.funPesId = funPesId;
        this.cliPesId = cliPesId;
    }

    public int getCliPesId() {
        return cliPesId;
    }

    public void setCliPesId(int cliPesId) {
        this.cliPesId = cliPesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFunPesId() {
        return funPesId;
    }

    public void setFunPesId(int funPesId) {
        this.funPesId = funPesId;
    }
}
