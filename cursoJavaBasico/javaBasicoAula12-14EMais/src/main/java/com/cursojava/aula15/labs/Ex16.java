package com.cursojava.aula15.labs;

import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Digite o valor de a");
        double a = Double.parseDouble(inputA);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "A equação não é do segundo grau. Encerrando o programa.");
            System.exit(0);
        }

        String inputB = JOptionPane.showInputDialog("Digite o valor de b");
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog("Digite o valor de c");
        double c = Double.parseDouble(inputC);

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais. Encerrando o programa.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }
    }
}