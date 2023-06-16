import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double AREA_DE_COBERTURA = 6;
        final int LATA_DE_TINTA_EM_LITROS = 18;
        final double PRECO_DA_LATA = 80.0;
        final double GALAO_EM_LITROS = 3.6;
        final double PRECO_DO_GALAO = 25;
        final double FOLGA = 1.1;

        System.out.println("Digite o tamanho em metros quadrados da área que vai ser pintada");
        double areaDePintura = scan.nextDouble();

        double quantidadeDeLitros = Math.ceil(areaDePintura * FOLGA / AREA_DE_COBERTURA);

        // Quantidade de tintas ao comprar apenas latas de 18 litros
        int quantidadeDeLata = (int) Math.ceil(quantidadeDeLitros / LATA_DE_TINTA_EM_LITROS);
        double precoTotalEmLata = quantidadeDeLata * PRECO_DA_LATA;

        // Quantidade de tintas ao comprar apenas galões de 3.6 litros
        int quantidadeGalao = (int) Math.ceil(quantidadeDeLitros / GALAO_EM_LITROS);
        double precoTotalEmGalao = quantidadeGalao * PRECO_DO_GALAO;

        // Quantidade de tintas ao misturar latas e galões para obter o menor preço
        int quantidadeDeLataMisturada = (int) Math.ceil(quantidadeDeLitros / LATA_DE_TINTA_EM_LITROS);
        double litrosRestantes = quantidadeDeLitros - quantidadeDeLataMisturada * LATA_DE_TINTA_EM_LITROS;
        int quantidadeGalaoMisturado = (int) Math.ceil(litrosRestantes / GALAO_EM_LITROS);
        double precoTotalMisturado = quantidadeDeLataMisturada * PRECO_DA_LATA + quantidadeGalaoMisturado * PRECO_DO_GALAO;

        // Exibir as informações ao usuário
        System.out.printf("Quantidade de tintas a serem compradas:\n");
        System.out.printf("Apenas latas de 18 litros: %d lata(s) - R$ %.2f\n", quantidadeDeLata, precoTotalEmLata);
        System.out.printf("Apenas galões de 3.6 litros: %d galão(ões) - R$ %.2f\n", quantidadeGalao, precoTotalEmGalao);
        System.out.printf("Misturando latas e galões: %d lata(s) e %d galão(ões) - R$ %.2f\n",
                quantidadeDeLataMisturada, quantidadeGalaoMisturado, precoTotalMisturado);
    }
}