import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima a soma

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double n1 = scan.nextDouble();
        System.out.println("Digite outro número:");
        double n2 = scan.nextDouble();

        System.out.println("A soma de " + n1 + " com " + n2 + " é " + (n1+n2));
    }
}