package ExerAula19;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }

        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (qtd1 * 100) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porcentagem 0 = " + porc0);
        System.out.println("Porcentagem 1 = " + porc1);
    }
}
