package com.calculator.operations;

public class DivisaoInteira {
    public int calcular(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
}