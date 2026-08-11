public class Desenvolvedor extends Funcionario {
    private double salarioBase;
    private double bonus;

    public Desenvolvedor(String nome, int matricula, double salarioBase, double bonus) {
        super(nome, matricula);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioAnual() {
        return (this.salarioBase + this.bonus) * 12;
    }
}
