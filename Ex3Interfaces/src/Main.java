import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Ligavel> dispositivos = new ArrayList<>();

        int tipo;

        do {
            System.out.print("Tipo (1-Lampada 2-TV 3-Aspirador, 0-Sair): ");
            tipo = scanner.nextInt();
            scanner.nextLine();
            if (tipo == 0) {
                System.out.println("Encerrando");
                break;
            }
            Ligavel dispositivo = null;
            if (tipo == 1) {
                System.out.print("Comodo: ");
                String comodo = scanner.nextLine();
                System.out.print("Estado inicial (1-Ligado 0-Desligado): ");
                int estado = scanner.nextInt();
                dispositivo = new Lampada(comodo, estado == 1);
                dispositivos.add(dispositivo);

            } else if (tipo == 2) {
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Estado inicial (1-Ligado 0-Desligado): ");
                int estado = scanner.nextInt();
                dispositivo = new Televisao(marca, estado == 1);
                dispositivos.add(dispositivo);

            } else if (tipo == 3) {
                System.out.print("Nivel inicial de bateria: ");
                int bateria = scanner.nextInt();
                System.out.print("Estado inicial (1-Ligado 0-Desligado): ");
                int estado = scanner.nextInt();
                dispositivo = new AspiradorRobo(bateria, estado == 1);
                dispositivos.add(dispositivo);
            }

            if (dispositivo != null) {
                int operacao;
                if (tipo == 3) {
                    System.out.print("Operacao (1-Ligar 2-Desligar 3-Estado 4-Recarregar 5-Bateria): ");
                } else {
                    System.out.print("Operacao (1-Ligar 2-Desligar 3-Estado): ");
                }

                operacao = scanner.nextInt();
                if (operacao == 1) {
                    dispositivo.ligar();

                } else if (operacao == 2) {
                    dispositivo.desligar();
                } else if (operacao == 3) {
                    if (tipo == 1) {
                        Lampada lampada = (Lampada) dispositivo;
                        System.out.println("Lampada da " + lampada.getComodo() + ": "+ (lampada.estaLigado() ? "ligada" : "desligada"));
                    } else if (tipo == 2) {
                        Televisao tv = (Televisao) dispositivo;
                        System.out.println("TV " + tv.getMarca() + ": " + (tv.estaLigado() ? "ligada" : "desligada"));
                    } else {
                        System.out.println("Aspirador: "+ (dispositivo.estaLigado() ? "ligado" : "desligado"));
                    }

                } else if (operacao == 4 && tipo == 3) {
                    AspiradorRobo aspirador = (AspiradorRobo) dispositivo;
                    System.out.print("Tempo de recarga em minutos: ");
                    int minutos = scanner.nextInt();
                    aspirador.recarregar(minutos);
                    System.out.println("Bateria do aspirador: " + aspirador.getNivelBateria() + "%");

                } else if (operacao == 5 && tipo == 3) {
                    AspiradorRobo aspirador = (AspiradorRobo) dispositivo;
                    System.out.println("Bateria do aspirador: "+ aspirador.getNivelBateria() + "%");
                }
            }

        } while (tipo != 0);

        scanner.close();
    }
}