package ExerAula17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o nome do ginasta (ou pressione ENTER para encerrar): ");
            String nomeAtleta = scanner.nextLine();

            if (nomeAtleta.isEmpty()) {
                break;
            }

            ArrayList<Double> notas = new ArrayList<>();

            for (int i = 1; i <= 7; i++) {
                System.out.print("Nota " + i + ": ");
                notas.add(scanner.nextDouble());
            }

            scanner.nextLine();

            System.out.println("Atleta: " + nomeAtleta);
            for (int i = 0; i < notas.size(); i++) {
                System.out.println("Nota: " + notas.get(i));
            }

            double melhorNota = Collections.max(notas);
            double piorNota = Collections.min(notas);

            notas.remove(melhorNota);
            notas.remove(piorNota);

            double somaNotas = 0;
            for (double nota : notas) {
                somaNotas += nota;
            }
            double mediaNotas = somaNotas / notas.size();

            System.out.println("Resultado final:");
            System.out.println("Atleta: " + nomeAtleta);
            System.out.println("Melhor nota: " + melhorNota);
            System.out.println("Pior nota: " + piorNota);
            System.out.printf("Média: %.2f\n", mediaNotas);
            System.out.println();
        }
    }
}