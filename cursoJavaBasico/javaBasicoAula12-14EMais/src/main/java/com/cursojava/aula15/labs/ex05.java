package com.cursojava.aula15.labs;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        //Faça um programa para a leitura de duas notas parciais de um aluno.
        //O programa deve calcular a média alcançada por aluno e apresentar:
        //o A mensagem "Aprovado", se a média alcançada for maior ou
        //igual a sete;
        //o A mensagem "Reprovado", se a média for menor do que sete;
        //o A mensagem "Aprovado com Distinção", se a média for igual a
        //dez.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas duas notas parciais");
        double n1 = Math.min(scan.nextDouble(), 10.0);
        double n2 = Math.min(scan.nextDouble(), 10.0);
        double media = (n1 + n2) / 2;

        if (media == 10) {
            System.out.printf("Sua média foi %s Aprovado com Distinção!", media);
        } else if (media >= 7) {
            System.out.printf("Sua média foi %s Aprovado!", media);
        } else {
            System.out.printf("Sua média foi %s Reprovado!", media);
        }
    }
}