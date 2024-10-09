package ExerAula17;

import java.util.Scanner;

public class Exer35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o número: ");
        int num = scanner.nextInt();
        boolean primo;

        for (int i = 1; i <= num; i++) {
            primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}

