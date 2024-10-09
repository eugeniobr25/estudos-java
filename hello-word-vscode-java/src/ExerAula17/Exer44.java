package ExerAula17;

import java.util.Scanner;

public class Exer44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int votosCandidato1 = 0; // José
        int votosCandidato2 = 0; // João
        int votosCandidato3 = 0; // Maria
        int votosCandidato4 = 0; // Ana
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        System.out.println("Votação para a eleição presidencial:");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Encerrar votação");

        while (true) {
            System.out.print("Digite seu voto (0 para encerrar): ");
            int voto = scan.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    totalVotos++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalVotos++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalVotos++;
                    break;
                case 4:
                    votosCandidato4++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Voto inválido! Tente novamente.");
            }
        }

        System.out.println("\nResultados da votação:");
        System.out.println("Total de votos para José: " + votosCandidato1);
        System.out.println("Total de votos para João: " + votosCandidato2);
        System.out.println("Total de votos para Maria: " + votosCandidato3);
        System.out.println("Total de votos para Ana: " + votosCandidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);

        if (totalVotos > 0) {
            double percentualNulos = (double) votosNulos / totalVotos * 100;
            double percentualBrancos = (double) votosBrancos / totalVotos * 100;
            System.out.printf("Porcentagem de votos nulos: %.2f%%%n", percentualNulos);
            System.out.printf("Porcentagem de votos em branco: %.2f%%%n", percentualBrancos);
        } else {
            System.out.println("Nenhum voto foi computado.");
        }
    }
}