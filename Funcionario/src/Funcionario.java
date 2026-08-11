abstract class Funcionario {
    private String nome;
    private int matricula;

    public Funcionario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public abstract double calcularSalarioAnual();
}
