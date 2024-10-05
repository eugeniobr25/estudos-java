package ExerAula17;

public class Exer30 {
    public static void main(String[] args) {
        System.out.println("O Preço do pão: R$ 0,18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i<= 50; i++){
            System.out.println(i + " - R$ " + (0.18*i));
        }
    }
}
