package ExerAula17;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        // Solicita o valor da dívida
        System.out.print("Digite o valor da dívida: R$ ");
        double valorDivida = scanner.nextDouble();

        // Cabeçalho da tabela
        System.out.printf("%-20s %-20s %-20s %-20s%n", "Valor da Dívida", "Valor dos Juros", "Quantidade de Parcelas", "Valor da Parcela");
        System.out.println("--------------------------------------------------------------------------");

        // Calcula e exibe os valores para 1 parcela
        int quantidadeParcelas = 1;
        double percentualJuros = 0.0;
        double valorJuros = valorDivida * percentualJuros;
        double valorTotal = valorDivida + valorJuros;
        double valorParcela = valorTotal / quantidadeParcelas;
        System.out.printf("R$ %-19s R$ %-19s %-19d R$ %-19s%n", format.format(valorTotal), format.format(valorJuros), quantidadeParcelas, format.format(valorParcela));

        // Calcula e exibe os valores para 3 parcelas
        quantidadeParcelas = 3;
        percentualJuros = 0.10;
        valorJuros = valorDivida * percentualJuros;
        valorTotal = valorDivida + valorJuros;
        valorParcela = valorTotal / quantidadeParcelas;
        System.out.printf("R$ %-19s R$ %-19s %-19d R$ %-19s%n", format.format(valorTotal), format.format(valorJuros), quantidadeParcelas, format.format(valorParcela));

        // Calcula e exibe os valores para 6 parcelas
        quantidadeParcelas = 6;
        percentualJuros = 0.15;
        valorJuros = valorDivida * percentualJuros;
        valorTotal = valorDivida + valorJuros;
        valorParcela = valorTotal / quantidadeParcelas;
        System.out.printf("R$ %-19s R$ %-19s %-19d R$ %-19s%n", format.format(valorTotal), format.format(valorJuros), quantidadeParcelas, format.format(valorParcela));

        // Calcula e exibe os valores para 9 parcelas
        quantidadeParcelas = 9;
        percentualJuros = 0.20;
        valorJuros = valorDivida * percentualJuros;
        valorTotal = valorDivida + valorJuros;
        valorParcela = valorTotal / quantidadeParcelas;
        System.out.printf("R$ %-19s R$ %-19s %-19d R$ %-19s%n", format.format(valorTotal), format.format(valorJuros), quantidadeParcelas, format.format(valorParcela));

        // Calcula e exibe os valores para 12 parcelas
        quantidadeParcelas = 12;
        percentualJuros = 0.25;
        valorJuros = valorDivida * percentualJuros;
        valorTotal = valorDivida + valorJuros;
        valorParcela = valorTotal / quantidadeParcelas;
        System.out.printf("R$ %-19s R$ %-19s %-19d R$ %-19s%n", format.format(valorTotal), format.format(valorJuros), quantidadeParcelas, format.format(valorParcela));
    }
}