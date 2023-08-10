import java.util.Scanner;

public class atividade4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados dos itens
        String[] itens = {"Notebook Lenovo", "Celular MotoG22", "Carro Hb20", "Apartamento"};
        double[] valores = {3299.0, 1789.0, 68000.0, 180000.0};
        double[] percentuaisEconomia = {0.05, 0.10, 0.02, 0.01};

        for (int i = 0; i < itens.length; i++) {
            System.out.println("Item: " + itens[i]);
            System.out.println("Valor total: R$ " + valores[i]);
            System.out.println("Percentual a economizar: " + (percentuaisEconomia[i] * 100) + "%");

            System.out.print("Informe o valor que você pode economizar por mês: R$ ");
            double valorEconomizadoPorMes = scanner.nextDouble();

            int mesesNecessarios = (int) Math.ceil(valores[i] / (valorEconomizadoPorMes * (1 - percentuaisEconomia[i])));

            System.out.println("Você precisará economizar por " + mesesNecessarios + " meses para comprar o(a) " + itens[i] + ".");
            System.out.println();
        }

        scanner.close();
    }
}
