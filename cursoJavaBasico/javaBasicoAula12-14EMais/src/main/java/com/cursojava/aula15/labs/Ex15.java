package com.cursojava.aula15.labs;

import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        //Faça um Programa que peça os 3 lados de um triângulo. O programa
        //deverá informar se os valores podem ser um triângulo. Indique, caso
        //os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
        //escaleno.

        double a = 0;
        double b = 0;
        double c = 0;

        while (true) {
            String inputA = JOptionPane.showInputDialog("Digite o primeiro número");
            String inputB = JOptionPane.showInputDialog("Digite o segundo número");
            String inputC = JOptionPane.showInputDialog("Digite o terceiro número");

            try {
                a = Double.parseDouble(inputA);
                b = Double.parseDouble(inputB);
                c = Double.parseDouble(inputC);

                if (a > 0 && b > 0 && c > 0) {
                    boolean isValidTriangle = isTriangleValid(a, b, c);

                    if (isValidTriangle) {
                        String triangleType = typeOfTriangle(a, b, c);
                        JOptionPane.showMessageDialog(null, "Os lados formam um triângulo " + triangleType);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Os valores não formam um triângulo válido. Digite novamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "É permitido apenas números maiores que zero");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite Números válidos");
            }
        }
    }

    public static boolean isTriangleValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String typeOfTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}