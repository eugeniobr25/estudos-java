package ExerAula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 1000;
        double percentual = 1.5;

        salario += (salario /100) * percentual;

        DecimalFormat format = new DecimalFormat("###,###.00");

        for (int i=1997; i<=2024; i++){
            percentual *= 2;
            salario += (salario /100) * percentual;
            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }
    }
}
