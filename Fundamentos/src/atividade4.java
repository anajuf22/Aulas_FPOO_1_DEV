import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar o salário do funcionário
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        // Calcular o valor do aumento salarial
        double percentualAumento;
        if (salario > 1350.00) {
            percentualAumento = 0.10; // 10% de aumento
        } else {
            percentualAumento = 0.15; // 15% de aumento
        }

        double aumento = salario * percentualAumento;
        double novoSalario = salario + aumento;

        // Exibir o resultado
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        scanner.close();
    }
}
