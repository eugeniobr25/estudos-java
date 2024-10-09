package ExerAula17;

import java.util.Scanner;

public class Exer44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = scanner.nextInt();
        double soma = 0;

        for (int i=1, j=1; i <= n; i++, j+=2) {
            System.out.print(i + "/" + j + " + ");
            soma += i/j;
        }
        System.out.println("\nSoma: " + soma);
    }
}
