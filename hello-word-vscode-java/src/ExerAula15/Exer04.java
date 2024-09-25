package ExerAula15;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra:");
        String letra = scan.next();

        // Com if

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida!");
        } else {
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) {
                System.out.println("É uma vogal");
            } else {
                System.out.println("É uma consoante");
            }
        }

        // Com switch 

        // if (letra.length() > 1) {
        //     System.out.println("Não é uma letra válida!");
        // } else {
        //     switch (letra) {
        //         case "a":
        //         case "A":
        //         case "e":
        //         case "E":
        //         case "i":
        //         case "I":
        //         case "o":
        //         case "O":
        //         case "u":
        //         case "U":
        //             System.out.println("É uma vogal");
        //             break;
        //         default:
        //             System.out.println("É uma consoante");
        //             break;
        //     }
        // }

    }

}
