public class Estagiario extends Funcionario {
    private double bolsa;

    public Estagiario(String nome, int matricula, double bolsa) {
        super(nome, matricula);
        this.bolsa = bolsa;
    }

    @Override
    public double calcularSalarioAnual(){
        return this.bolsa * 12;
    }
}
