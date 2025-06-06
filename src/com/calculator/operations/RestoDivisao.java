package com.calculator.operations;

public class RestoDivisao {
    public int calcular(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Erro: Divisão por zero não é permitida para obter o resto.");
        }
        return dividendo % divisor;
    }
}