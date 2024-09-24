package ExerAula15;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo:");            
        } else { 
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
}