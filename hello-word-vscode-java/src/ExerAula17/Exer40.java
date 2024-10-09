package ExerAula17;

import java.util.Scanner;

public class Exer40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidadeMaisAlto = 0;
        int codigoCidadeMaisBaixo = 0;
        double maiorIndice = 0;
        double menorIndice = Double.MAX_VALUE;
        double totalVeiculos = 0;
        double totalAcidentesMenos2000 = 0;
        int cidadesMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o código da cidade " + i + ": ");
            int codigoCidade = scanner.nextInt();

            System.out.println("Digite o número de veículos de passeio na cidade " + codigoCidade + " (em 1999): ");
            int numVeiculos = scanner.nextInt();

            System.out.println("Digite o número de acidentes de trânsito com vítimas na cidade " + codigoCidade + " (em 1999): ");
            int numAcidentes = scanner.nextInt();

            double indiceAcidente = (double) numAcidentes / numVeiculos;

            totalVeiculos += numVeiculos;

            if (indiceAcidente < menorIndice) {
                menorIndice = indiceAcidente;
                codigoCidadeMaisBaixo = codigoCidade;
            }
            if (indiceAcidente > maiorIndice) {
                maiorIndice = indiceAcidente;
                codigoCidadeMaisAlto = codigoCidade;
            }

            if (numVeiculos < 2000) {
                totalAcidentesMenos2000 += numAcidentes;
                cidadesMenos2000++;
            }
        }

        double mediaVeiculos = totalVeiculos / 5;
        double mediaAcidentesMenos2000 = cidadesMenos2000 > 0 ? totalAcidentesMenos2000 / cidadesMenos2000 : 0;

        System.out.println("Maior índice de acidentes: " + maiorIndice + " na cidade " + codigoCidadeMaisAlto);
        System.out.println("Menor índice de acidentes: " + menorIndice + " na cidade " + codigoCidadeMaisBaixo);
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
        System.out.println("Média de acidentes nas cidades com menos de 2.000 veículos: " + mediaAcidentesMenos2000);
    }
}