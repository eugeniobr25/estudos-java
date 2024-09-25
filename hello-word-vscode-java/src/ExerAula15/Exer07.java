package ExerAula15;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primero número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número:");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior: " + num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("O terceiro número é maior:" + num3);
        }


        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro número é o menor: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O segundo número é o menor: " + num2);
        } else if (num3 < num1 && num3 < num2){
            System.out.println("O terceiro número é menor:" + num3);
        }
    }

}