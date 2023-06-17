package com.cursojava.aula15.labs.ex13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IR ir = new IR();

        final int INSS = 10;
        final int SINDICATO = 3;
        final int FGTS = 11;

        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

        System.out.println("Digite quanto você ganha por hora");
        double valorHora = scan.nextDouble();
        System.out.println("Agora, digite quantas horas você trabalha no mês");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoImpostoDeRenda = (salarioBruto * ir.impostoDeRenda(salarioBruto)) / 100;
        double descontoINSS = (salarioBruto * INSS) / 100;
        double descontoFGTS = (salarioBruto * FGTS) / 100;
        double descontoSindicato = (salarioBruto * SINDICATO) / 100;
        double totalDescontadoDoSalarioFuncionario = descontoImpostoDeRenda + descontoINSS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontadoDoSalarioFuncionario;

        System.out.println("Salário Bruto: " + formatadorMoeda.format(salarioBruto));
        System.out.println("(-) IR (" + ir.impostoDeRenda(salarioBruto) + "%) " + formatadorMoeda.format(descontoImpostoDeRenda));
        System.out.println("(-) INSS (" + INSS + "%) " + formatadorMoeda.format(descontoINSS));
        System.out.println("FGTS (" + FGTS + "%) " + formatadorMoeda.format(descontoFGTS) + " (Arcado pela empresa)");
        System.out.println("Desconto Sindicato (" + SINDICATO + "%) " + formatadorMoeda.format(descontoSindicato));
        System.out.println("Total de descontos: " + formatadorMoeda.format(totalDescontadoDoSalarioFuncionario));
        System.out.println("Salário Líquido: " + formatadorMoeda.format(salarioLiquido));
    }
}