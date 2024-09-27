package ExerAula13;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de metros em centimetros");
        System.out.println("Entre com um valor em metros:");
        double metros = scan.nextDouble();

        double centimetros =  metros * 100;
        System.out.println("O valor corresponde a " + centimetros + " centimentros.");

    }

}
