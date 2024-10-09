package ExerAula17;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int num;

            do {
                System.out.println("Digite um número inteiro positivo menor que 16: ");
                num = scanner.nextInt();

                if (num < 1 || num >= 16) {
                    System.out.println("Número inválido! Digite um valor entre 1 e 15.");
                }
            } while (num < 1 || num >= 16);

            int fatorial = 1;
            System.out.print(num + "! = ");
            for (int i = num; i > 0; i--) {
                fatorial *= i;
                System.out.print(i + (i > 1 ? " x " : " = "));
            }

            System.out.println(fatorial);

            System.out.println("Deseja calcular o fatorial de outro número? (S/N)");
            String resposta = scanner.next().toLowerCase();

            continuar = resposta.equals("s");
        }
    }
}