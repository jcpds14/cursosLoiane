import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double IR = ( salarioBruto * 11)/100;
        double INSS = (salarioBruto * 8 )/100;
        double sindicato = (salarioBruto * 5 )/100;
        double totalDescontos = IR + INSS + sindicato;

        System.out.printf("Seu salário bruto é: R$ %.5s\n", salarioBruto);
        System.out.printf("O valor descontado do IR é: R$ %.5s\n", IR);
        System.out.printf("O valor descontado do INSS é: R$ %.5s\n", INSS);
        System.out.printf("O valor descontado do Sindicato é: R$ %.5s\n", sindicato);
        System.out.printf("Foi descontado do seu salário o valor de R$ %.5s Deixando um salário " +
                "líquido de R$ %.5s", totalDescontos, (salarioBruto - totalDescontos));


    }
}