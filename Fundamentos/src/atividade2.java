
import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para digitar o nome, valor e quantidade do produto
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        // Calcular o valor total do produto
        double valorTotal = valorUnitario * quantidade;

        // Pedir ao usuário a forma de pagamento (D para débito, C para crédito)
        System.out.print("Digite a forma de pagamento (D para débito, C para crédito): ");
        scanner.nextLine(); // Limpar o buffer após o nextInt() anterior
        String formaPagamento = scanner.nextLine().toUpperCase();

        // Verificar a forma de pagamento e aplicar os descontos, se necessário
        double valorComDesconto;
        if (formaPagamento.equals("D")) {
            if (valorTotal <= 100.00) {
                valorComDesconto = valorTotal * 0.95; // 5% de desconto
            } else {
                valorComDesconto = valorTotal * 0.97; // 3% de desconto
            }
            System.out.println("Valor com desconto (à vista): R$ " + valorComDesconto);
        } else if (formaPagamento.equals("C")) {
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            double valorParcela = valorTotal / numeroParcelas;
            System.out.println("Valor da parcela: R$ " + valorParcela);
        } else {
            System.out.println("Forma de pagamento inválida. Por favor, digite D para débito ou C para crédito.");
        }

        // Exibir as informações do produto
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário: R$ " + valorUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}

    
