package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diaDaSemana = 0;

        while (true) {
            System.out.println("Digite o dia da semana: 1-Domingo, 2-Segunda etc...");
            if (scan.hasNextInt()) {
                diaDaSemana = scan.nextInt();
                if (diaDaSemana >= 1 && diaDaSemana <= 7) {
                    break;
                } else {
                    System.out.println("Digite apenas de 1 -7");
                }
            } else {
                String entradaInvalida = scan.next();
                if (entradaInvalida.isEmpty()) {
                    continue;
                }
                System.out.println("Digite um número válido.");
            }
        }
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda-Feira!");
                break;
            case 3:
                System.out.println("Terça-Feira!");
                break;
            case 4:
                System.out.println("Quarta-Feira!");
                break;
            case 5:
                System.out.println("Quinta-Feira!");
                break;
            case 6:
                System.out.println("Sexta-Feira!");
                break;
            case 7:
                System.out.println("Sábado!");
                break;
        }
    }
}