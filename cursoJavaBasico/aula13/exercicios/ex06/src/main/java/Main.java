import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pegue o raio de um círculo, calcule e mostre sua área
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do raio do círculo?");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("O valor da área é: " + area);
    }
}