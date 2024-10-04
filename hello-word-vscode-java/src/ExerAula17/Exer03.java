package ExerAula17;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo de 3 caracteres!");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa entre 0 e 150!");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();
            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0!");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu sexo: ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'F' ou 'M'!");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu estado civil: ");
            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("Solteiro") ||
                    estadoCivil.equalsIgnoreCase("Casado") ||
                    estadoCivil.equalsIgnoreCase("Viuvo") ||
                    estadoCivil.equalsIgnoreCase("Divorciado") ||
                    estadoCivil.equalsIgnoreCase("Solteira") ||
                    estadoCivil.equalsIgnoreCase("Casada") ||
                    estadoCivil.equalsIgnoreCase("Viuva") ||
                    estadoCivil.equalsIgnoreCase("Divorciada")) {
                infoValida = true;
            } else {
                System.out.println("Estado civil precisa ser 'Solteiro(a)', 'Casado(a)', 'Viuvo(a) ou  'Divorciado(a)' !");
            }
        } while (!infoValida);

        System.out.println("Confirme os dados coletados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);

    }
}
