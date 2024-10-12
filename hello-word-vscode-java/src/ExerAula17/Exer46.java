package ExerAula17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Informe o nome do atleta (ou pressione ENTER para encerrar): ");
            String nomeAtleta = scanner.nextLine();

            if (nomeAtleta.isEmpty()) {
                break;
            }

            ArrayList<Double> saltos = new ArrayList<>();

            System.out.print("Primeiro Salto: ");
            saltos.add(scanner.nextDouble());

            System.out.print("Segundo Salto: ");
            saltos.add(scanner.nextDouble());

            System.out.print("Terceiro Salto: ");
            saltos.add(scanner.nextDouble());

            System.out.print("Quarto Salto: ");
            saltos.add(scanner.nextDouble());

            System.out.print("Quinto Salto: ");
            saltos.add(scanner.nextDouble());

            scanner.nextLine();

            System.out.println("Atleta: " + nomeAtleta);
            System.out.println("Primeiro Salto: " + saltos.get(0) + " m");
            System.out.println("Segundo Salto: " + saltos.get(1) + " m");
            System.out.println("Terceiro Salto: " + saltos.get(2) + " m");
            System.out.println("Quarto Salto: " + saltos.get(3) + " m");
            System.out.println("Quinto Salto: " + saltos.get(4) + " m");

            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);

            saltos.remove(melhorSalto);
            saltos.remove(piorSalto);

            double somaSaltos = 0;
            for (double salto : saltos) {
                somaSaltos += salto;
            }
            double mediaSaltos = somaSaltos / saltos.size();

            System.out.println("Melhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.printf("Média dos demais saltos: %.2f m\n", mediaSaltos);
            System.out.println("Resultado final:");
            System.out.printf("%s: %.2f m\n", nomeAtleta, mediaSaltos);
            System.out.println();
        }
    }
}