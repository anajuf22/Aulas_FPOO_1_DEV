import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar o valor da casa, salário e quantidade de anos a pagar
        System.out.print("Digite o valor da casa a comprar: R$ ");
        double valorCasa = scanner.nextDouble();

        System.out.print("Digite o salário da pessoa: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos a pagar: ");
        int anosPagamento = scanner.nextInt();

        // Calcular o valor da prestação mensal
        int mesesPagamento = anosPagamento * 12;
        double prestacaoMensal = valorCasa / mesesPagamento;

        // Verificar se a prestação mensal não ultrapassa 30% do salário
        double limitePrestacao = salario * 0.30;

        if (prestacaoMensal <= limitePrestacao) {
            System.out.println("Empréstimo aprovado!");
            System.out.println("Valor da prestação mensal: R$ " + prestacaoMensal);
        } else {
            System.out.println("Empréstimo negado. O valor da prestação mensal ultrapassa 30% do salário.");
        }

        scanner.close();
    }
}

