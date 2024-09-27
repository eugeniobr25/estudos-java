package ExerAula15;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com as horas trabalhada no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        
        int percentualIR = 0;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100 ) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDeDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDeDescontos;

        System.out.println("Salario bruto: (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto );
        System.out.println("(-)  IR  (" + percentualIR + "%):" + ir);
        System.out.println("(-)  Inss (10%):" + inss);
        System.out.println("FGTS (11%):" + fgts);
        System.out.println("Total de Descontos: " + totalDeDescontos);
        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}
