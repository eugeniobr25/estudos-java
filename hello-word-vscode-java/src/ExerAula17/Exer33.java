package ExerAula17;

import java.util.Scanner;

public class Exer33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade de temperaturas: ");
        int qtdTemperaturas = scanner.nextInt();

        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= qtdTemperaturas; i++) {
            System.out.println("Entre com a temperatura " + i);
            temp = scanner.nextDouble();
            soma += temp;

            if (temp > maior) {
                maior = temp;
            }
            if (temp < menor) {
                menor = temp;
            }
        }
        System.out.println("Média: " + (soma / qtdTemperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}
