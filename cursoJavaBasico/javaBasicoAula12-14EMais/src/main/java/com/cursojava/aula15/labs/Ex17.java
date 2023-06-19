package com.cursojava.aula15.labs;

import javax.swing.*;

public class Ex17 {
    public static void main(String[] args) {
        String inputYear = JOptionPane.showInputDialog("Digite o ano: ");
        int year = Integer.parseInt(inputYear);

        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 == 0){
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            JOptionPane.showMessageDialog(null, year + " é um ano bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, year + " não é um ano bissexto.");
        }
    }
}