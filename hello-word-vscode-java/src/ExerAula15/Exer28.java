package ExerAula15;

import java.util.Scanner;

public class Exer28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade (kg):");
        double quantidade = scan.nextDouble();

        double precoKg = 0;

        if (tipo == 1) {
            System.out.println(quantidade + " kg - Filé Duplo");
            if (quantidade < 5) {
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }
        } else if (tipo == 2) {
            System.out.println(quantidade + " kg - Alcatra");
            if (quantidade < 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipo == 3) {
            System.out.println(quantidade + " kg - Picanha");
            if (quantidade < 5) {
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }
        double total = precoKg * quantidade;
        System.out.println(quantidade + " kg * " + precoKg + " = R$ " + total);

        System.out.println("Qual a forma de pagamento?");
        System.out.println("1 - Cartão");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Deconto de: R$ " + desconto);
            System.out.println("Valor a pagar: R$ " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: R$ " + total);
        }
    }
}