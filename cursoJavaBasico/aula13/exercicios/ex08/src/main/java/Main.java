import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calcule quanto se ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o salário do mês

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?");
        double horasPorMes = scan.nextDouble();
        double salario = valHora * horasPorMes;

        System.out.println("O seu salário desse mês é: " + salario);

    }
}