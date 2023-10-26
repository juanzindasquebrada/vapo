import java.util.Date;

public class Objetor {
    private String nome;
    private String endereco;
    private float renda;
    private Date dataNascimento;


    public Objetor(String nome, String endereco, float renda, Date dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
