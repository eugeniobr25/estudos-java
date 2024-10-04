package ExerAula17;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nomeUser;
        String senha;

        do {
            System.out.println("Entre com o nome do usuário:");
            nomeUser = scan.next();

            System.out.println("Entre com o senha:");
            senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                System.out.println("Senha igual a usuário, digite novamente!");
            } else {
                infoValida = true;
                System.out.println("Informações validas.");
            }
        } while (!infoValida);
    }
}
