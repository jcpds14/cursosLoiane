import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Converta metros para centímetros

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em metros para ser convertidos para centímetros");
        double valMetros = scan.nextDouble();
        double valMetrosEmCm = valMetros * 100;

        System.out.println(valMetros + " metros em centímetros é: " + valMetrosEmCm + "cm");
    }
}