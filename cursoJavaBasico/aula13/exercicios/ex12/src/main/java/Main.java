import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calcule o peso ideal (72.7*altura) - 58

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();
        double pesoIdeal = (72*altura) - 58;

        System.out.printf("Baseado na sua altura, seu peso ideal é %s", pesoIdeal);

    }
}