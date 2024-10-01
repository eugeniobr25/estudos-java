import java.util.Scanner;

public class Exer18 {

    // Função para verificar se a data é válida
    public static boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        // Meses com 30 dias: abril (4), junho (6), setembro (9), novembro (11)
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        }

        // Fevereiro: pode ter 28 ou 29 dias dependendo do ano
        if (mes == 2) {
            if (validarAnoBissexto(ano)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }

        // Todos os outros meses têm no máximo 31 dias
        if (dia > 31) {
            return false;
        }

        return true;
    }

    // Função para verificar se o ano é bissexto
    public static boolean validarAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Corrigido o nome da variável

        // Entrada de dados
        System.out.println("Entre com a data:");
        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();
        System.out.println("Digite o mes: ");
        int mes = scan.nextInt();
        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();


        if (validarData(dia, mes, ano)) {
            System.out.println("A data é válida!");
        } else {
            System.out.println("A data é inválida!");
        }
    }
}
