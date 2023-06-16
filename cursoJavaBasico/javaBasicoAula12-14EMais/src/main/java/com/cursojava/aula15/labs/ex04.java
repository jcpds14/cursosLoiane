package com.cursojava.aula15.labs;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra apenas");
        String letra = scan.next();

        if(letra.length() == 1 && Character.isLetter(letra.charAt(0))){
            char letraMinuscula = Character.toLowerCase(letra.charAt(0));
            if("aeiou".contains(String.valueOf(letraMinuscula))){
                System.out.println("Sua letra é uma vogal");
            }else{
                System.out.println("Sua letra é uma consoante");
            }
        }else{
            System.out.println("Entrada inválida. Digite apenas uma letra");
        }
    }
}