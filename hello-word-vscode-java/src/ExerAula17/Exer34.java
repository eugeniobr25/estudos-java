package ExerAula17;

import java.util.Scanner;

public class Exer34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é um número primo");
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É um numero primo");
        }
    }
}
