import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Pegue dois numeros inteiros e um real
        Calcule e mostre
        a. O produto do dobro do primeiro com metade do segundo
        b. A soma do triplo do primeiro com o terceiro
        c. O terceiro elevado ao cubo
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números inteiros e um real");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        double n3 = scan.nextDouble();

        double questionA = (n1*2) * (n2/2);
        double questionB = (n1*3) + n3;
        double questionC = Math.pow(n3,3);

        System.out.printf("O produto do dobro de %d com metade de %d é: %s\n", n1, n2, questionA);
        System.out.printf("A soma do triplo de %d com %s é: %s\n", n1, n3, questionB);
        System.out.printf("%s elevado ao cubo é: %s\n", n3, questionC);

        scan.close();
    }
}