import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso do peixe");
        double pesoDoPeixe = scan.nextDouble();
        double pesoExcedente = pesoDoPeixe - 50;
        double multa;

        if(pesoExcedente > 0){
            multa = pesoExcedente * 4;
            System.out.printf("Peso excedente de %.5skg\n", pesoExcedente);
            System.out.printf("Multa de R$ %.5s", multa);
        }else {
            System.out.println("Peso dentro do limite, sem multa!");
        }
    }
}