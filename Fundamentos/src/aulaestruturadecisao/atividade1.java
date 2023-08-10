import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o cargo do funcionário (Gerente, Supervisor, Técnico ou Auxiliar):");
        String cargo = scanner.nextLine();

        double salarioBase = 0;
        double inssPercent = 0;
        double convenio = 0;

        switch (cargo.toLowerCase()) {
            case "gerente":
                salarioBase = 5590.00;
                inssPercent = 8;
                convenio = 289.00;
                break;
            case "supervisor":
                salarioBase = 4128.00;
                inssPercent = 7;
                convenio = 239.00;
                break;
            case "técnico":
                salarioBase = 3789.00;
                inssPercent = 4;
                convenio = 189.00;
                break;
            case "auxiliar":
                salarioBase = 2345.00;
                inssPercent = 2;
                convenio = 156.00;
                break;
            default:
                System.out.println("Cargo inválido.");
                scanner.close();
                return;
        }

        double inss = salarioBase * (inssPercent / 100);
        double salarioLiquido = salarioBase - inss - convenio;

        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Desconto INSS: R$ " + inss);
        System.out.println("Desconto Convênio: R$ " + convenio);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
