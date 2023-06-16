import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double AREA_DE_COBERTURA = 3;
        final int LATA_DE_TINTA_EM_LITROS = 18;
        final double PRECO_DA_LATA = 80.0;

        System.out.println("Digite o tamanho em metros quadrados da área que vai ser pintada");
        double areaDePintura = scan.nextDouble();

        double quantidadeDeLitros = Math.ceil(areaDePintura / AREA_DE_COBERTURA);
        int quantidadeDeLata = (int) Math.ceil(quantidadeDeLitros / LATA_DE_TINTA_EM_LITROS);
        double precoTotal = quantidadeDeLata * PRECO_DA_LATA;

        System.out.printf("Para cobrir uma área de %s, é necessário %s latas de tinta. \n" +
                "O que vai totalizar um valor de R$ %s", areaDePintura, quantidadeDeLata, precoTotal);

    }
}