package com.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scan.next(); //Armazena apenas a primeira palavra antes do espaço
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Sua idade é: " + idade + " e sua altura é: " + altura);*/

        System.out.println("Digite seu primeiro nome, sua idade e sua altura. Você tem bichinho de estimação?");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        String respTemBichinho = scan.next();
        boolean temBichinho;

        if(respTemBichinho.equalsIgnoreCase("sim")){
            temBichinho = true;
        }else{
            temBichinho = false;
        }
        String temBichinhoTexto = temBichinho ? "Sim" : "Não";

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho: " + temBichinhoTexto);

    }
}