 import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o prato desejado:");
        System.out.println("1 - Arroz, feijão, bife acebolado - R$ 19,99");
        System.out.println("2 - Arroz, feijão, filé de frango - R$ 18,99");
        System.out.println("3 - Arroz, feijão, brajola");

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double valorPrato = 0;
        
        switch (opcao) {
            case 1:
                valorPrato = 19.99;
                break;
            case 2:
                valorPrato = 18.99;
                break;
            case 3:
                // Define o valor do prato caso a opção 3 seja escolhida
                // Como não foi fornecido um valor para essa opção na tabela, você pode inserir o valor correspondente.
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.print("Informe a quantidade de pratos desejados: ");
        int quantidade = scanner.nextInt();

        double precoTotal = valorPrato * quantidade;

        System.out.println("Valor total a ser pago: R$ " + precoTotal);

        scanner.close();
    }
}


