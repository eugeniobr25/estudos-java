package ExerAula15;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Entre com um número");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
