package ExerAula15;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ente com o lado 1 do triangulo");
        double lado1 = scan.nextDouble();

        System.out.println("Ente com o lado 2 do triangulo");
        double lado2 = scan.nextDouble();

        System.out.println("Ente com o lado 3 do triangulo");
        double lado3 = scan.nextDouble();

        if (((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2) ||
                ((lado1 + lado3) > lado2)) {
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triangulo Equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triangulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo Isosceles");
            }
        } else {
            System.out.println("Não forma um triangulo");
        }

    }
}
