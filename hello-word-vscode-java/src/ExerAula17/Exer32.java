package ExerAula17;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Fatorial de: " + num);

        System.out.print(num + "! = ");

        int fatorial = 1;
        for (int i = num; i > 1; i--) {
            fatorial *= i;
            System.out.print(i + " . ");
        }
        System.out.print("1 = " + fatorial);
    }
}
