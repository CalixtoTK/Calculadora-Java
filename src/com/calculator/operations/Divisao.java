package com.calculator.operations;

public class Divisao {
    public double calcular(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
}