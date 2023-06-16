import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Receba 4 notas bimestrais e mostre a média
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota da primeira unidade");
        double n1 = scan.nextDouble();
        System.out.println("Digite sua nota da segunda unidade");
        double n2 = scan.nextDouble();
        System.out.println("Digite sua nota da terceira unidade");
        double n3 = scan.nextDouble();
        System.out.println("Digite sua nota da quarta unidade");
        double n4 = scan.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A sua média foi " + media);
    }
}