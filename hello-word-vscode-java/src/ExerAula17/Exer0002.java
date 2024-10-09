package ExerAula17;

import java.util.Scanner;

public class Exer0002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += 1/i;
        }
        System.out.println("Soma: " + soma);
    }
}
