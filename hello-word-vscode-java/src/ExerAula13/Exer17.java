package ExerAula13;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double baldeTinta = 18.00;
        double valorBaldeTinta = 80.00;
        double galaoTinta = 3.6;
        double valorGalaoTinta = 25.00;

        System.out.println("Você quer pintar quantos metros quadrados?");
        double area = scan.nextDouble();
        double quantTinta = area / 3;
        double quantBaldeTinta = Math.ceil(quantTinta / baldeTinta);
        double quantGalaoTinta = Math.ceil(quantTinta / galaoTinta);
        double valorTotalBalde = quantBaldeTinta * valorBaldeTinta;
        double valorTotalGalao = quantGalaoTinta * valorGalaoTinta;

        
        System.out.println("A quantidade em baldes é " + quantBaldeTinta + " e o valor é R$ " + valorTotalBalde);
        System.out.println("A quantidade em galões é " + quantGalaoTinta + " e o valor é R$ " + valorTotalGalao);
        
    }
}
