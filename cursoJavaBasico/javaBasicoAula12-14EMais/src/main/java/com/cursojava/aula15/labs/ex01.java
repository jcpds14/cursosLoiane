package com.cursojava.aula15.labs;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima o maior deles.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if(n1>n2){
            System.out.println("O maior valor é: " + n1);
        }else if(n2>n1){
            System.out.println("O maior valor é: " + n2);
        }else{
            System.out.println("Os valores são iguais");
        }
        scan.close();
    }
}