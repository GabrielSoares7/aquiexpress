package codigos;

public class Funcionario extends Pessoa{
    private String cpf;
    private String rg;
    private String turno;

    public Funcionario(int id, String cpf, String rg, String turno, String nome) {
        super(id, nome);
        this.cpf = cpf;
        this.rg = rg;
        this.turno = turno;
    }

    public Funcionario(String cpf, String rg, String turno, String nome) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
        this.turno = turno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
