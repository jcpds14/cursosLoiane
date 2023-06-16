import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Converta Farenheit para Celsius

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit");
        double temperatureFarenheit = scan.nextDouble();

        double convertFarenheitToCelsius = (temperatureFarenheit - 32) * 5 / 9;

        System.out.println(temperatureFarenheit + "F em Celsius é: " + convertFarenheitToCelsius + "C");
        System.out.printf("%s graus Farenheit em Celsius é: %s graus Celsius", temperatureFarenheit,
                convertFarenheitToCelsius);
    }
}