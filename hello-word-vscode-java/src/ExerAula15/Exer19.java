package ExerAula15;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro menor que 1000: ");
        int num = scan.nextInt();

        if (num >= 1000 || num < 0) {
            System.out.println("Numero invalido.");
        } else {
            int centenas = num / 100;
            int dezenas = (num % 100) / 10;
            int unidades = num % 10;

            StringBuilder resultado = new StringBuilder();

            if (centenas > 0) {
                resultado.append(centenas).append(" ").append(centenas > 1 ? "centenas" : "centena");
            }
            if (dezenas > 0) {
                if (resultado.length() > 0) {
                    resultado.append(centenas > 0 && unidades == 0 ? " e " : ", ");
                }
                resultado.append(dezenas).append(" ").append(dezenas > 1 ? "dezenas" : "dezena");
            }
            if (unidades > 0) {
                if (resultado.length() > 0) {
                    resultado.append(" e ");
                }
                resultado.append(unidades).append(" ").append(unidades > 1 ? "unidade" : "unidade");
            }
            System.out.println(num + " = " + resultado);
        }
    }
}
