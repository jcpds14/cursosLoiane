package com.cursojava.aula15.labs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        //As Organizações Tabajara resolveram dar um aumento de salário aos
        //seus colaboradores e lhe contraram para desenvolver o programa que
        //calculará os reajustes.
        //o Faça um programa que recebe o salário de um colaborador e o
        //reajuste segundo o seguinte critério, baseado no salário atual:
        //o salários até R$ 280,00 (incluindo) : aumento de 20%
        //o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        //o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        //o salários de R$ 1500,00 em diante : aumento de 5% Após o
        //aumento ser realizado, informe na tela:
        //o o salário antes do reajuste;
        //o o percentual de aumento aplicado;
        //o o valor do aumento;
        //o o novo salário, após o aumento.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário para obter o seu aumento");
        double salario = scan.nextDouble();

        double aumento = (salario * percentual(salario)) / 100;
        double novoSalario = salario + aumento;

        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Seu salário antigo era: " + formatadorMoeda.format(salario));
        System.out.printf("O percentual de aumento aplicado foi: %,.2f%%%n", percentual(salario));
        System.out.println("O valor do aumento: " + formatadorMoeda.format(aumento));
        System.out.println("Seu novo salário ficou em: " + formatadorMoeda.format(novoSalario));
    }
    public static double percentual(double valor){
        int porcentagem = 0;
        if(valor <= 280){
            porcentagem = 20;
        }else if(valor >280 && valor <= 700){
            porcentagem = 15;
        }else if(valor > 700 && valor <=1500){
            porcentagem = 10;
        }else{
            porcentagem = 5;
        }
        return porcentagem;
    }
}