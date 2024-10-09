package ExerAula17;

import java.util.Scanner;

public class Exer39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunoMaisAlto = 0, alunoMaisBaixo = 0;
        double maiorAltura = 0, menorAltura = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o número do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();

            System.out.println("Digite a altura do aluno " + i + " (em cm): ");
            double alturaAluno = scanner.nextDouble();

            if (alturaAluno > maiorAltura) {
                maiorAltura = alturaAluno;
                alunoMaisAlto = numeroAluno;
            }

            if (alturaAluno < menorAltura) {
                menorAltura = alturaAluno;
                alunoMaisBaixo = numeroAluno;
            }
        }

        System.out.println("Aluno mais alto: Número " + alunoMaisAlto + " com altura de " + maiorAltura + " cm");
        System.out.println("Aluno mais baixo: Número " + alunoMaisBaixo + " com altura de " + menorAltura + " cm");
    }
}