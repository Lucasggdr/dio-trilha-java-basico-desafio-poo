// ContaTerminal.java
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar os dados do usuário via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e captura o número da conta
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        // Solicita e captura a agência
        System.out.println("Por favor, digite o número da Agência (com o dígito):");
        String agencia = scanner.next();

        // Solicita e captura o nome do cliente
        System.out.println("Por favor, digite o seu nome:");
        scanner.nextLine();  // Consumir o \n deixado pelo nextInt ou next
        String nomeCliente = scanner.nextLine();

        // Solicita e captura o saldo
        System.out.println("Por favor, digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados coletados
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}