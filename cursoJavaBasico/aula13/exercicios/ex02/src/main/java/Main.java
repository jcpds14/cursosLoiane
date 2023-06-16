import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um Programa que peça um número e então mostre a mensgem "O numero informado foi [numero]"

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        System.out.println("O numero informado foi " + numero);
    }
}