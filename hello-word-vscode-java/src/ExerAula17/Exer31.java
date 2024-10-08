package ExerAula17;

import java.util.Scanner;

public class Exer31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco, total, valorPago, troco;
        String output;


        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scanner.next();

            if (continuarCompra.equalsIgnoreCase("S")) {

                output = "Lojas Tabajara\n";

                System.out.println("Digite a quantidade de produtos da compra:");
                qtdProdutos = scanner.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe preço do produto " + i + ":");
                    preco = scanner.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }
                output += "Total: R$ " + total + "\n";
                System.out.println("Total: R$ " + total);
                System.out.println("Entre com o valor pago:");
                valorPago = scanner.nextDouble();
                output += "Dinheiro: R$ " + valorPago + "\n";
                troco = total - valorPago;
                output += "Troco: R$ " + troco;
                System.out.println(output);
            } else {
                sair = true;
            }

        } while (!sair);
    }
}
