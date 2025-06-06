package com.calculator.operations;

public class Fatorial {
    public long calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }
        if (n > 20) { // Fatorial de 21 excede Long.MAX_VALUE
            throw new ArithmeticException("Estouro de fatorial: n > 20 resulta em um número muito grande.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}