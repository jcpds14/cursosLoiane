package com.cursojava.aula15.labs;

import java.util.*;

public class Ex09 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre-os em ordem decrescente.
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 3 números");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.printf("Os números em ordem decrescente é: %s%n", numeros);

    }
}