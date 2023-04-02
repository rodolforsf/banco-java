import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine(); // limpa a quebra de linha pendente

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        scanner.nextLine(); // limpa a quebra de linha pendente

        System.out.print("Por favor, digite o saldo da conta: ");
        String saldoContaString = scanner.nextLine();
        float saldoConta = Float.parseFloat(saldoContaString);

        scanner.close();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo é R$" + saldoConta + ".");
        System.out.println("Seu saldo já está disponível para saque.\n");
    }
}
