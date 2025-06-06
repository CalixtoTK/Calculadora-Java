package com.calculator.operations;

public class RaizNesima {
    public double calcular(double radicando, int indice) {
        if (indice == 0) {
            throw new IllegalArgumentException("Índice da raiz não pode ser zero.");
        }
        if (radicando < 0 && indice % 2 == 0) {
            throw new IllegalArgumentException("Não é possível calcular raiz par de número negativo (resultado não real).");
        }

        if (indice < 0) {
            if (radicando == 0) {
                 throw new IllegalArgumentException("Não é possível calcular raiz com índice negativo para radicando zero (divisão por zero).");
            }
            // x^(1/-n) = 1 / (x^(1/n))
            return 1.0 / Math.pow(radicando, 1.0 / Math.abs(indice));
        }

        return Math.pow(radicando, 1.0 / indice);
    }
}