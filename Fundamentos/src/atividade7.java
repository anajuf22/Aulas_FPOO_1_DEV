
import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar a quantidade de KW/h consumido
        System.out.print("Digite a quantidade de KW/h consumido: ");
        double consumoKWh = scanner.nextDouble();

        // Pedir ao usuário para digitar o tipo de instalação elétrica (R para residência, I para indústria e C para comércio)
        System.out.print("Digite o tipo de instalação (R para residência, I para indústria e C para comércio): ");
        char tipoInstalacao = scanner.next().charAt(0);
        tipoInstalacao = Character.toUpperCase(tipoInstalacao); // Converte para maiúscula para evitar problemas com letras minúsculas

        // Calcular o preço a pagar
        double precoPorKWh;
        if (tipoInstalacao == 'R') {
            if (consumoKWh <= 500) {
                precoPorKWh = 0.40;
            } else {
                precoPorKWh = 0.65;
            }
        } else if (tipoInstalacao == 'I') {
            if (consumoKWh <= 1000) {
                precoPorKWh = 0.55;
            } else {
                precoPorKWh = 0.60;
            }
        } else if (tipoInstalacao == 'C') {
            if (consumoKWh <= 5000) {
                precoPorKWh = 0.55;
            } else {
                precoPorKWh = 0.60;
            }
        } else {
            System.out.println("Tipo de instalação inválido. Por favor, digite R para residência, I para indústria ou C para comércio.");
            return;
        }

        double valorPagar = consumoKWh * precoPorKWh;

        // Exibir o resultado
        System.out.println("O valor a pagar pelo fornecimento de energia elétrica é: R$ " + valorPagar);

        scanner.close();
    }
}
