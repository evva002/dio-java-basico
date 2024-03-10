import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, dgite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Parebéns " + nomeCliente + ", agencia " + agencia + ", conta " + conta +
        " seu saldo é de: " + saldo );
    }
}
