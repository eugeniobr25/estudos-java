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

        // Acrescenta 10% de folga na área a ser pintada
        area = area * 1.10;

        double quantTinta = area / 3;

        // 1. Situação: Apenas latas de 18 litros
        double quantBaldeTinta = Math.ceil(quantTinta / baldeTinta);
        double valorTotalBalde = quantBaldeTinta * valorBaldeTinta;

        // 2. Situação: Apenas galões de 3,6 litros
        double quantGalaoTinta = Math.ceil(quantTinta / galaoTinta);        
        double valorTotalGalao = quantGalaoTinta * valorGalaoTinta;

        // 3. Situação: Misturar latas e galões para minimizar o custo
        // Calcula quantas latas de 18L são necessárias
        int latasNecessarias = (int) (quantTinta / baldeTinta);
        double restoTinta = quantTinta % baldeTinta;

        // Calcula quantos galões serão necessários para o resto
        double galaoParaRestante = Math.ceil(restoTinta / galaoTinta);

        // Custo da combinação de latas e galões
        double valorTotalMisto = (latasNecessarias * valorBaldeTinta) + (galaoParaRestante * valorGalaoTinta);


        
        System.out.println("A quantidade em baldes é " + quantBaldeTinta + " | Valor: R$ " + valorTotalBalde);
        System.out.println("A quantidade em galões é " + quantGalaoTinta + " | Valor: R$ " + valorTotalGalao);
        System.out.println("Quantidade de latas: " + latasNecessarias + " | Quantidade de galões: " + galaoParaRestante);
        System.out.println("Valor total da combinação: R$ " + valorTotalMisto);
        
    }
}
