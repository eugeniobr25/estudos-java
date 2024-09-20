package ExerAula13;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o peso do pescado:");
        double pesoPescado = scan.nextDouble();

        if (pesoPescado > 50) {
            double excende = pesoPescado - 50;
            double multa = excende * 4;
            System.out.println("Você excedeu " + excende + "kg e pagara uma multa no valor de R$ " + multa);
        } else {
            System.out.println("Seu pescado não execedeu a regulamentação");
        }
    }
}
