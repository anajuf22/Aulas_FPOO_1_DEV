

import java.util.Scanner;

public class atividade01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar o raio
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Calcular a área do círculo
        double area = calcularAreaCirculo(raio);
        // Exibir o resultado
        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }

    // Método para calcular a área do círculo
    public static double calcularAreaCirculo(double raio) {
        // A fórmula da área do círculo é: área = π * raio^2
        double pi = Math.PI;
        double area = pi * Math.pow(raio, 2);
        return area;
    }

}
