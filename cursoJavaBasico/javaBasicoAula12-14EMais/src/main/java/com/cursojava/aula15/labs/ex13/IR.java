package com.cursojava.aula15.labs.ex13;

public class IR {
    public double impostoDeRenda(double valor){
        double porcentagem = 0;
        if (valor <= 900){
            return porcentagem;
        }else if (valor > 900 && valor <= 1500){
            porcentagem = 5;
        }else if (valor > 1500 && valor <= 2500){
            porcentagem = 10;
        }else{
            porcentagem = 20;
        }
        return porcentagem;
    }
}