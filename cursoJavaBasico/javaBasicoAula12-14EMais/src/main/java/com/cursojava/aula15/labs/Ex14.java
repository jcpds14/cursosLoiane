package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;

        while(true) {
            System.out.println("Digite suas duas notas parciais");
            if (scan.hasNextDouble()) {
                n1 = scan.nextDouble();
                n2 = scan.nextDouble();
                if (n1 > 0 && n1 < 10 && n2 > 0 && n2 < 10) {
                    break;
                } else {
                    System.out.println("Digite um número de 0.1 a 10");
                }
            }else{
                String entradaInvalida = scan.next();
                if (entradaInvalida.isEmpty()) {

                    continue;
                }
                System.out.println("Digite apenas números");
            }
        }

        double media = (n1+n2)/2;
        String nota = "";

        System.out.println("Primeira nota parcial " + n1 + ", Segunda nota parcial " + n2);

        if(media <= 10 && media >= 9){
            nota = "A";
            System.out.printf("Sua média é: %.2f Nota %s", media, nota);
        }else if(media < 9 && media >= 7.5){
            nota = "B";
            System.out.printf("Sua média é: %.2f Nota %s", media, nota);
        }else if(media < 7.5 && media >= 6){
            nota = "C";
            System.out.printf("Sua média é: %.2f Nota %s", media, nota);
        }else if(media < 6 && media >= 4){
            nota = "D";
            System.out.printf("Sua média é: %.2f Nota %s", media, nota);
        } else {
            nota = "E";
            System.out.printf("Sua média é: %.2f Nota %s", media, nota);
        }

        if(media >= 6){
            System.out.println("\nAPROVADO!");
        }else{
            System.out.println("\nREPROVADO!");
        }

    }
}