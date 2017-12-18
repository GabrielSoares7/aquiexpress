package tabelas;


public class Email {
    private int id;
    private String endereco;
    private int pesId;
    /* Classe com o objetivo de passar as variáveis que estão 
    *tanto no banco quanto no projeto.
    *Aqui estão resentados, e  inseridos também construtores e métodos getters e setters
    */
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
