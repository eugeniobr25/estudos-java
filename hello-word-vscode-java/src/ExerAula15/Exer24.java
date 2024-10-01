package ExerAula15;

import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com a operação (+, -, *, /):");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação invalida");
                valida = false;
        }

        if (valida) {

            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
                System.out.println("Resultado positivo (+) ");
            } else {
                System.out.println("Resultado negativo (-) ");
            }

            if (resultado % 2 == 0) {
                System.out.println("Resultado é par");
            } else {
                System.out.println("Resultado é impar");
            }
        }
    }
}
