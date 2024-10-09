package ExerAula17;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int num = scanner.nextInt();

        boolean primo = true;
        StringBuilder divisores = new StringBuilder();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                divisores.append(i).append(" ");
                primo = false;
            }
        }

        if (primo) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
            System.out.println("Divisível por: " + divisores);
        }
    }
}