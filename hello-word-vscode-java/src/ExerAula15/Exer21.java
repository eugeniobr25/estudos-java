package ExerAula15;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao Caixa Eletronico");
        System.out.println("Limites mínimo de saque R$ 10,00 e máximo R$ 600,00");
        System.out.println("Informe o valor do saque:");
        int valorSaque = scan.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor informado invalido");
        } else {
            int notas100 = valorSaque / 100;
            valorSaque %= 100;

            int notas50 = valorSaque / 50;
            valorSaque %= 50;

            int notas10 = valorSaque / 10;
            valorSaque %= 10;

            int notas5 = valorSaque / 5;
            valorSaque %= 5;

            int notas1 = valorSaque;
            if (notas100 > 0) {
                System.out.println("Notas de 100: " + notas100);
            }
            if (notas50 > 0) {
                System.out.println("Notas de 50: " + notas50);
            }
            if (notas10 > 0) {
                System.out.println("Notas de 10: " + notas10);
            }
            if (notas5 > 0) {
                System.out.println("Notas de 5: " + notas5);
            }
            if (notas1 > 0) {
                System.out.println("Notas de 1: " + notas1);
            }
        }
    }
}
