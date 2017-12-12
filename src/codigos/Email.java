package codigos;


public class Email {
    private int id;
    private String endereco;
    private int pesId;

    public Email(int id, String endereco, int pesId) {
        this.id = id;
        this.endereco = endereco;
        this.pesId = pesId;
    }

    public Email(String endereco, int pesId) {
        this.endereco = endereco;
        this.pesId = pesId;
    }

    public int getPesId() {
        return pesId;
    }

    public void setPesId(int pesId) {
        this.pesId = pesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
