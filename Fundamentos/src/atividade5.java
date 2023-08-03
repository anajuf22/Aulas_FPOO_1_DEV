import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar a distância da viagem em km
        System.out.print("Digite a distância da viagem (em km): ");
        double distancia = scanner.nextDouble();

        // Calcular o preço da passagem
        double precoPorKm;
        if (distancia <= 200) {
            precoPorKm = 0.50;
        } else {
            precoPorKm = 0.45;
        }

        double precoPassagem = distancia * precoPorKm;

        // Exibir o resultado
        System.out.println("Preço da passagem: R$ " + precoPassagem);

        scanner.close();
    }
}
