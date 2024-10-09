package ExerAula17;

import java.util.Scanner;

public class Exer37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double maiorAltura = 0, menorAltura = Double.MAX_VALUE;
        double maiorPeso = 0, menorPeso = Double.MAX_VALUE;

        double somaAlturas = 0, somaPesos = 0;
        int totalClientes = 0;

        while (true) {
            System.out.println("Digite o código do cliente (ou 0 para encerrar): ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.println("Digite a altura do cliente (em metros): ");
            double altura = scanner.nextDouble();

            System.out.println("Digite o peso do cliente (em kg): ");
            double peso = scanner.nextDouble();

            somaAlturas += altura;
            somaPesos += peso;
            totalClientes++;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                codigoMaisAlto = codigo;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                codigoMaisBaixo = codigo;
            }

            if (peso > maiorPeso) {
                maiorPeso = peso;
                codigoMaisGordo = codigo;
            }

            if (peso < menorPeso) {
                menorPeso = peso;
                codigoMaisMagro = codigo;
            }
        }

        if (totalClientes > 0) {
            double mediaAltura = somaAlturas / totalClientes;
            double mediaPeso = somaPesos / totalClientes;

            System.out.println("Resultados do senso da academia:");
            System.out.println("Cliente mais alto (código): " + codigoMaisAlto + " com altura de " + maiorAltura + "m");
            System.out.println("Cliente mais baixo (código): " + codigoMaisBaixo + " com altura de " + menorAltura + "m");
            System.out.println("Cliente mais gordo (código): " + codigoMaisGordo + " com peso de " + maiorPeso + "kg");
            System.out.println("Cliente mais magro (código): " + codigoMaisMagro + " com peso de " + menorPeso + "kg");
            System.out.println("Média de altura: " + mediaAltura + "m");
            System.out.println("Média de peso: " + mediaPeso + "kg");
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }
    }
}