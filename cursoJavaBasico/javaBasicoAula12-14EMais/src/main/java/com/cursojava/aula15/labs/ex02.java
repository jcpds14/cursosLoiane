package com.cursojava.aula15.labs;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = scan.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }

        scan.close();
    }
}