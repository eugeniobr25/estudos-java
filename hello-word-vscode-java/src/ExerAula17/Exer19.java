package ExerAula17;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int N = scanner.nextInt();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int numero;

            do {
                System.out.print("Digite o número " + (i + 1) + " (entre 0 e 1000): ");
                numero = scanner.nextInt();

                if (numero < 0 || numero > 1000) {
                    System.out.println("Número inválido! Insira um valor entre 0 e 1000.");
                }
            } while (numero < 0 || numero > 1000);

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }

            soma += numero;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

    }
}