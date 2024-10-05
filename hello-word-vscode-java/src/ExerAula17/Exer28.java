package ExerAula17;

import java.util.Scanner;

public class Exer28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número de CD's:");
        int cds = scanner.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1; i <= cds; i++) {
            System.out.println("Informe o valor do CD " + i + ":");
            preco = scanner.nextDouble();

            soma += preco;
        }

        double media = soma/cds;

        System.out.println("Média gasta com cada CD: " + media);
    }
}
