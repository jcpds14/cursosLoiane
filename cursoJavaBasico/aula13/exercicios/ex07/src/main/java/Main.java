import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o comprimento de um lado do quadrado");
        double comprimentolado = scan.nextDouble();
        double area = Math.pow(comprimentolado, 2);
        double dobroArea = area * 2;

        System.out.println("O dobro da área do seu quadrado é " + dobroArea);
    }
}