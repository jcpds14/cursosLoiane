import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo e a velocidade de internet");
        double tamanhoDoArquivo = scan.nextDouble();
        double velocidadeDaInternet = scan.nextDouble();

        double tempoDeDownload = tamanhoDoArquivo / velocidadeDaInternet;

        int horas = (int) (tempoDeDownload / 3600);
        int minutos = (int) ((tempoDeDownload % 3600) / 60);
        int segundos = (int) (tempoDeDownload % 60);

        System.out.printf("O tempo estimado de download é de %d horas, %d minutos e %d segundos.\n",
                horas, minutos, segundos);
    }
}