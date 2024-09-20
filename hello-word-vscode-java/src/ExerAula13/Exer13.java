package ExerAula13;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura:");
        double altura = scan.nextDouble();

        System.out.println("Entre com o peso:");
        double peso = scan.nextDouble();

        scan.nextLine();

        System.out.println("Entre com o sexo da pessoa:");
        String sexo = scan.nextLine();

        if(sexo.equalsIgnoreCase("homem")){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
            System.out.println("E seu peso real é: " + peso);
            if (peso == pesoIdeal) {
                System.out.println("Você esta dentro do peso.");                
            } if (peso < pesoIdeal){
                System.out.println("Você abaixo do seu peso ideal.");
            }if (peso > pesoIdeal) {
                System.out.println("Você acima do seu peso ideal.");
            }
        }if(sexo.equalsIgnoreCase("mulher")){
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
            System.out.println("E seu peso real é: " + peso);
            if (peso == pesoIdeal) {
                System.out.println("Você esta dentro do peso.");                
            } if (peso < pesoIdeal){
                System.out.println("Você abaixo do seu peso ideal.");
            }if (peso > pesoIdeal) {
                System.out.println("Você acima do seu peso ideal.");
            }
        }    

}
}
