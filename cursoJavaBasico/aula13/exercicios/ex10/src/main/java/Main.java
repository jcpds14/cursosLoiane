import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Converta Celsius para Farenheit

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius");
        double tempCelsius = scan.nextDouble();
        double convertedCelsiusToFarenheit = tempCelsius * 9 / 5 + 32;
        System.out.printf("%s graus Celsius, equivale a %s graus Fahrenheit",
                tempCelsius, convertedCelsiusToFarenheit);
    }
}