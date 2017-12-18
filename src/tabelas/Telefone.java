package tabelas;

public class Telefone {
    private int id;
    private String telefone;
    private int pesId;
    /* Classe com o objetivo de passar as variáveis que estão 
    *tanto no banco quanto no projeto.
    *Aqui estão resentados, e  inseridos também construtores e métodos getters e setters
    */
    public Telefone(int id, String telefone, int pesId) {
        this.id = id;
        this.telefone = telefone;
        this.pesId = pesId;
    }

    public Telefone(String telefone, int pesId) {
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
