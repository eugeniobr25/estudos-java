package ExerAula15;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Entre com a terceira nota:");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        String resultado = "";
        if (media == 10) {
            resultado = "Aprovado com Distinção";
        } else if (media < 10 && media >= 7) {
            resultado = "Aprovado";
        } else if (media < 7) {
            resultado = "Reprovado";
        }

        System.out.println("O aluno obteve media: " + media);
        System.out.println("E esta " + resultado);
    }
}
