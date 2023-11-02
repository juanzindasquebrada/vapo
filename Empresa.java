public class Empresa {
    private String nome;
    private String sobrenome;
    private float salario;

    public Empresa(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario>1)
            this.salario = salario;
        else
            this.salario = 0;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               = salario;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;

    }

    public void setSalario(float salario) {
        if (salario<1)
            this.salario = 0;
        else
             this.salario = salario;
    }
    public double salarioanual(){
        return salario * 12;
    }
    public void aumento(float porcentagem){
        this.salario = this.salario + (this.salario * 0.10F);
    }

}
