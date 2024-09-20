package ExerAula13;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double baldeTinta = 18.00;
        double valorTinta = 80.00;

        System.out.println("Você quer pintar quantos metros quadrados?");
        double area = scan.nextDouble();
        double quantTinta = area / 3;
        double quantBaldeTinta = Math.ceil(quantTinta / baldeTinta);
        double valorTotal = quantBaldeTinta * valorTinta;

        System.out.println("Quantidade de baldes de tinta: " + quantBaldeTinta);
        System.out.println("Valor total: R$ " + valorTotal);
    }

}
