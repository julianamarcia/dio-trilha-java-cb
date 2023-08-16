import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int contador;
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            // Chama o método para pegar o contador
            contador = getContador(parametroUm, parametroDois);

            for (int i = 1; i <= contador; ++i) {
                System.out.printf("Imprimindo o número %s\n", i);
            }

            terminal.close();

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    static int getContador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é MAIOR que parametroDois e lança a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        return parametroDois - parametroUm;
    }
}