package com.cursojava.aula15.labs;

import javax.swing.*;

public class Ex19 {
    public static void main(String[] args) {
        //Faça um Programa que leia um número inteiro menor que 1000 e
        //imprima a quantidade de centenas, dezenas e unidades do mesmo.
        //o Observando os termos no plural a colocação do "e", da vírgula
        //entre outros. Exemplo:
        //o 326 = 3 centenas, 2 dezenas e 6 unidades
        //o 12 = 1 dezena e 2 unidades
        String input = JOptionPane.showInputDialog(null,"Digite um número até 1000");
        int number = Integer.parseInt(input);

        if(number >= 1000){
            JOptionPane.showMessageDialog(null, "O número deve ser até 1000");
            System.exit(0);
        }

        int centenas = number / 100;
        int dezenas = (number % 100)/10;
        int unidades = number % 10;

        String mensagem = "";

        if (centenas > 0){
            mensagem += centenas + "centena";
        }if(centenas > 1){
            mensagem += "s";
        }

        if (dezenas > 0){
            if (centenas > 0){
                mensagem += ", ";
            }
            mensagem += dezenas + " dezena";
            if(dezenas > 1){
                mensagem += "s";
            }
        }

        if(unidades > 0){
            if(centenas > 0 || dezenas > 0){
                mensagem += " e ";
            }
            mensagem += unidades + " unidade";
            if(unidades > 1){
                mensagem += "s";
            }
        }

        JOptionPane.showMessageDialog(null, mensagem);


    }
}