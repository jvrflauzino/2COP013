import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(numero1, numero2);

        System.out.println("\nEscolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        try {
            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calculadora.somar(numero1, numero2));
                    break;

                case 2:
                    System.out.println("Resultado: " + calculadora.subtrair(numero1, numero2));
                    break;

                case 3:
                    System.out.println("Resultado: " + calculadora.multiplicar(numero1, numero2));
                    break;

                case 4:
                    System.out.println("Resultado: " + calculadora.dividir(numero1, numero2));
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
