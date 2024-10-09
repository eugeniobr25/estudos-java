package ExerAula17;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ", vote em 1, 2 ou 3 para os candidatos:");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido! Vote apenas em 1, 2 ou 3.");
                    i--;
                    break;
            }
        }
        System.out.println("Resultado da votação:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
    }
}
