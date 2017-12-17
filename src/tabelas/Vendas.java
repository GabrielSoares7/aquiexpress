package tabelas;

public class Vendas {
    private int id;
    private int funPesId;
    private int cliPesId;
    private String data;

    public Vendas(int id, int funPesId, int cliPesId, String data) {
        this.id = id;
        this.funPesId = funPesId;
        this.cliPesId = cliPesId;
        this.data = data;
    }

    public Vendas(int funPesId, int cliPesId, String data) {
        this.funPesId = funPesId;
        this.cliPesId = cliPesId;
        this.data = data;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
