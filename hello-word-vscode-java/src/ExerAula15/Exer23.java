package ExerAula15;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Informe um número: ");
        double numero = scan.nextDouble();

        // Verifica se o número é inteiro ou decimal
        if (numero == Math.floor(numero)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        scan.close();
    }
}
