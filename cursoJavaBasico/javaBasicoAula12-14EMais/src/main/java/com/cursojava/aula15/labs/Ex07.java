package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre o maior deles.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        int maiorNumero = encontrarMaiorNumero(n1, n2, n3);
        int menorNumero = encontrarMenorNumero(n1, n2, n3);

        System.out.printf("O maior número digitado é: %s\n", maiorNumero);
        System.out.printf("O menor número digitado é: %s\n", menorNumero);
    }

    public static int encontrarMaiorNumero(int n1, int n2, int n3) {
        int maior = n1;
        if (n2 >= maior) {
            maior = n2;
        }
        if (n3 >= maior) {
            maior = n3;
        }
        return maior;
    }
    public static int encontrarMenorNumero(int n1, int n2, int n3) {
        int menor = n1;
        if(n2<= menor){
            menor = n2;
        }
        if(n3<= menor){
            menor = n3;
        }
        return menor;
    }
}