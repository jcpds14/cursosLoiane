package com.cursojava.aula15.labs;

import javax.swing.*;

public class Ex18 {
    public static void main(String[] args) {
        String inputData = JOptionPane.showInputDialog(null, "Digite uma data no formato dd/mm/aaaa:");

        if (inputData.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite uma data válida");
            System.exit(0);
        }

        String[] dataSplit = inputData.split("/");
        int dia = Integer.parseInt(dataSplit[0]);
        int mes = Integer.parseInt(dataSplit[1]);
        int ano = Integer.parseInt(dataSplit[2]);

        boolean dataValida = true;

        if (dia < 1 || dia > 31) {
            dataValida = false;
        }

        if (mes < 1 || mes > 12) {
            dataValida = false;
        }
        if (ano < 0) {
            dataValida = false;
        }

        if (mes == 2) {
            if (anoBissexto(ano)) {
                if (dia > 29) {
                    dataValida = false;
                }
            } else {
                if (dia > 28) {
                    dataValida = false;
                }
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                dataValida = false;
            }
        }
        if (dataValida) {
            JOptionPane.showMessageDialog(null, "É uma data válida");
        } else {
            JOptionPane.showMessageDialog(null, "É uma data inválida");

        }
    }

    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 == 0) || (ano % 400 == 0);
    }
}