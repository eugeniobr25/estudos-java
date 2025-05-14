package ExerAula19;

import java.util.Scanner;

public class Exer27v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite 10 números inteiros para preencher o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "] = ");
            vetorA[i] = scanner.nextInt();
        }

        // Preenchimento do vetor B de acordo com o enunciado levando em conta o tipo literal dos vetores
        for (int i = 0; i < vetorB.length; i++) {
            int valor = vetorA[i];
            if (valor < 7) {
                vetorB[i] = (int) 'a';
            } else if (valor == 7) {
                vetorB[i] = (int) 'b';
            } else if (valor > 7 && valor < 10) {
                vetorB[i] = (int) 'c';
            } else if (valor == 10) {
                vetorB[i] = (int) 'd';
            } else { // valor > 10
                vetorB[i] = (int) 'e';
            }
        }

        System.out.println("\nVetor A (valores numéricos):");
        for (int num : vetorA) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nVetor B (caracteres correspondentes):");
        for (int num : vetorB) {
            System.out.print((char) num + " ");
        }
        System.out.println();
    }
}
