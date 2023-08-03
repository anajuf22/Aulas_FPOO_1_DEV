
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar a velocidade do carro
        System.out.print("Digite a velocidade do carro (em km/h): ");
        int velocidade = scanner.nextInt();

        // Verificar se o carro ultrapassou 80 km/h
        if (velocidade > 80) {
            int velocidadeExcedente = velocidade - 80;
            double valorMulta = velocidadeExcedente * 5.0;

            System.out.println("Você foi multado!");
            System.out.println("Valor da multa: R$ " + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido. Dirija com segurança!");
        }

        scanner.close();
    }
}
