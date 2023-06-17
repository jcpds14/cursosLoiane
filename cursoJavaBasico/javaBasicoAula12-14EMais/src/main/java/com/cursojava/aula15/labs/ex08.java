package com.cursojava.aula15.labs;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da Maçã, da Pêra e da Uva");

        double maca = scan.nextDouble();
        double pera = scan.nextDouble();
        double uva = scan.nextDouble();

        String qualComprar = menorValor(maca, pera, uva);

        System.out.printf("A melhor opção é: %s", qualComprar);
    }
    public static String menorValor(double maca, double pera, double uva) {
        if (maca <= pera && maca <= uva) {
            return "Maçã";
        } else if (pera <= maca && pera <= uva) {
            return "Pêra";
        } else{
            return "Uva";
        }
    }
}