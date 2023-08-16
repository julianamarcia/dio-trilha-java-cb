import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = scn.nextInt();
        System.out.println();

        System.out.print("Por favor, digite a Agência: ");
        String agencia = scn.next();
        System.out.println();

        scn.nextLine();
        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scn.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scn.nextDouble();
        System.out.println();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.\n",
                nomeCliente,
                agencia,
                numeroAgencia,
                saldo);

        scn.close();
    }
}