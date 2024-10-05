package ExerAula17;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de turmas: ");
        int numTurmas = scanner.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i <= numTurmas; i++) {
            invalido = true;
            do {
                System.out.println("Entre com o numero de alunos da turma " + i);
                numAlunos = scanner.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Número de alunos invalido.");
                }
            } while (invalido);

            soma += numAlunos;
        }

        double media = soma / numTurmas;

        System.out.println("Média: " + media);
    }
}

