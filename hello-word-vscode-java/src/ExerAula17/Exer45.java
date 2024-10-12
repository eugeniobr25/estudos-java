package ExerAula17;
import java.util.Scanner;

public class Exer45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char gabarito1 = 'A', gabarito2 = 'B', gabarito3 = 'C', gabarito4 = 'D', gabarito5 = 'E';
        char gabarito6 = 'E', gabarito7 = 'D', gabarito8 = 'C', gabarito9 = 'B', gabarito10 = 'A';

        int totalAlunos = 0;
        int totalNotas = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;
        String continuar;

        do {
            char resposta1, resposta2, resposta3, resposta4, resposta5;
            char resposta6, resposta7, resposta8, resposta9, resposta10;

            System.out.println("Aluno, responda as 10 questões da prova (A, B, C, D ou E):");
            System.out.print("Questão 01: ");
            resposta1 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 02: ");
            resposta2 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 03: ");
            resposta3 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 04: ");
            resposta4 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 05: ");
            resposta5 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 06: ");
            resposta6 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 07: ");
            resposta7 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 08: ");
            resposta8 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 09: ");
            resposta9 = scanner.next().toUpperCase().charAt(0);
            System.out.print("Questão 10: ");
            resposta10 = scanner.next().toUpperCase().charAt(0);

            int acertos = 0;
            if (resposta1 == gabarito1) acertos++;
            if (resposta2 == gabarito2) acertos++;
            if (resposta3 == gabarito3) acertos++;
            if (resposta4 == gabarito4) acertos++;
            if (resposta5 == gabarito5) acertos++;
            if (resposta6 == gabarito6) acertos++;
            if (resposta7 == gabarito7) acertos++;
            if (resposta8 == gabarito8) acertos++;
            if (resposta9 == gabarito9) acertos++;
            if (resposta10 == gabarito10) acertos++;

            totalAlunos++;
            totalNotas += acertos;
            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            System.out.println("Total de acertos: " + acertos + "/10");

            System.out.println("Outro aluno vai utilizar o sistema? (S/N)");
            continuar = scanner.next().toUpperCase();
        } while (continuar.equals("S"));

        double mediaNotas = (double) totalNotas / totalAlunos;

        System.out.println("Resultados Finais:");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Maior número de acertos: " + maiorAcerto);
        System.out.println("Menor número de acertos: " + menorAcerto);
        System.out.printf("Média da turma: %.2f\n", mediaNotas);
    }
}
