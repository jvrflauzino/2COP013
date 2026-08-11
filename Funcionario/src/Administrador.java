public class Administrador extends Funcionario {
    private double salarioMensal;

    public Administrador(String nome, int matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalarioAnual() {
        return this.salarioMensal * 12;
    }
}
