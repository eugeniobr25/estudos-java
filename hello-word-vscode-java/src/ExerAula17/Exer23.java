package ExerAula17;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        int totalDivisoes = 0; // Para contar o número total de divisões

        System.out.println("Números primos entre 1 e " + num + ":");

        // Loop para verificar todos os números de 2 até num
        for (int n = 2; n <= num; n++) {
            boolean primo = true;

            // Verifica se o número atual é primo
            for (int i = 2; i <= Math.sqrt(n); i++) {
                totalDivisoes++; // Conta o número de divisões
                if (n % i == 0) {
                    primo = false;
                    break; // Não precisa verificar mais, já sabemos que não é primo
                }
            }

            // Se for primo, exibe o número
            if (primo) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\nTotal de divisões executadas: " + totalDivisoes);

        scan.close();
    }
}
