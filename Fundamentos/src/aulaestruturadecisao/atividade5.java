import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados dos veículos
        String[] veiculos = {"Fiat Argo", "Fiat Mobi", "Hyundai Hb20"};
        double[] valorDiaria = {98.0, 79.0, 102.0};
        double[] valorPorKmRodado = {2.39, 1.99, 2.99};

        System.out.println("Escolha o veículo desejado:");
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println((i + 1) + " - " + veiculos[i]);
        }

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        if (opcao < 1 || opcao > veiculos.length) {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        System.out.print("Informe a quantidade de dias de aluguel: ");
        int quantidadeDias = scanner.nextInt();

        System.out.print("Informe a quantidade de quilômetros rodados: ");
        double quilometrosRodados = scanner.nextDouble();

        double valorTotalDiaria = valorDiaria[opcao - 1] * quantidadeDias;
        double valorTotalKmRodado = valorPorKmRodado[opcao - 1] * quilometrosRodados;
        double valorTotalAluguel = valorTotalDiaria + valorTotalKmRodado;

        System.out.println("Valor total do aluguel: R$ " + valorTotalAluguel);

        scanner.close();
    }
}

