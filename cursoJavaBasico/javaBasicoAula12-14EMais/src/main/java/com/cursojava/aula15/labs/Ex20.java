package com.cursojava.aula15.labs;

import javax.swing.*;
import java.text.DecimalFormat;

public class Ex20 {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog(null, "Digite a primeira nota parcial");
        String inputB = JOptionPane.showInputDialog(null, "Digite a segunda nota parcial");
        String inputC = JOptionPane.showInputDialog(null, "Digite a terceira nota parcial");

        DecimalFormat df = new DecimalFormat("0.00");
        double n1, n2, n3, media;

        while (true) {
            try {
                n1 = Math.min(Double.parseDouble(inputA), 10.0);
                n2 = Math.min(Double.parseDouble(inputB), 10.0);
                n3 = Math.min(Double.parseDouble(inputC), 10.0);
                media = (n1 + n2 + n3)/3;

                if (n1 > 0 && n2 > 0 && n3 > 0) {
                    double mediaFormated = Double.parseDouble(df.format(media));
                    if(media == 10){
                        JOptionPane.showMessageDialog(null,  "Sua " +
                                "média foi " + mediaFormated + " Aprovado com Distinção!");
                        break;
                    }else if(media >= 7){
                        JOptionPane.showMessageDialog(null,  "Sua " +
                                "média foi " + mediaFormated + " Aprovado!");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,  "Sua " +
                                "média foi " + mediaFormated + " Reprovado!");
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "É permitido apenas números maiores que zero");

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido");
            }
        }
    }
}